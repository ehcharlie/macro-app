package com.example.macro.user.service;

import com.example.macro.user.document.User;
import com.example.macro.user.exception.DuplicateUserException;
import com.example.macro.user.exception.UserNotFoundException;
import com.example.macro.user.repository.UserRepository;
import com.example.macro.service.GenericService;
import com.example.macro.user.utils.EmailValidation;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends GenericService<User, String> {

    private final BCryptPasswordEncoder passwordEncoder;

    private final UserRepository userRepository;



    public UserService(BCryptPasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        if (existingUser(user.getEmail())) {
            throw new DuplicateUserException("Record with email " + user.getUserName() + " Already Exists");
        }

        if (EmailValidation.isEmailValid(user.getEmail())) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return userRepository.save(user);
        }
        return new User();
    }

    @Override
    public void delete(String email) {
        userRepository.deleteUserByEmail(email);
    }

    @Override
    public User update(String email, User user) {
        if (existingUser(email)) {

            if (!user.getPassword().isBlank()) {
                user.setPassword(passwordEncoder.encode(user.getPassword()));
                return userRepository.save(user);
            } else {
                throw new RuntimeException("Password cannot be null");
            }

        } else {
            throw new UserNotFoundException("User with email " + email + "not found");
        }

    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User findById(String email) {
        if (existingUser(email)) {
            return userRepository.findByEmail(email).orElse(null);
        } else {
        throw new UserNotFoundException("User with email " + email + "not found");
        }
    }

    private boolean existingUser(String email) {
        Optional<User> userByEmail = userRepository.findByEmail(email);

        return userByEmail.isPresent();
    }
}