package com.example.macro.user.service.impl;

import com.example.macro.user.document.User;
import com.example.macro.user.exception.DuplicateUser;
import com.example.macro.user.exception.UserNotFoundException;
import com.example.macro.user.repository.UserRepository;
import com.example.macro.user.service.UserService;
import com.example.macro.user.utils.EmailValidation;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    private final BCryptPasswordEncoder passwordEncoder;

    private final UserRepository userRepository;

    public UserServiceImp(BCryptPasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {

        if (existingUser(user.getEmail())) {
            throw new DuplicateUser("Record with email " + user.getUserName() + " Already Exists");
        }

        if (EmailValidation.isEmailValid(user.getEmail())) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return userRepository.save(user);
        }

        return new User();
    }

    @Override
    public User getUser(String email) {
        Optional<User> newUser = userRepository.findByEmail(email);
        return newUser.orElse(null);
    }

    @Override
    public void deleteUser(String email) {
        userRepository.deleteUserByEmail(email);
    }

    @Override
    public User updateUser(String email, User user) {
        if (existingUser(email)) {
            return userRepository.save(user);
        } else {
            throw new UserNotFoundException("User with email " + email + "not found");
        }
    }

    private boolean existingUser(String email) {
        Optional<User> userByEmail = userRepository.findByEmail(email);

        return userByEmail.isPresent();
    }
}