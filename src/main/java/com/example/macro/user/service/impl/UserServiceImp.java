package com.example.macro.user.service.impl;

import com.example.macro.user.document.User;
import com.example.macro.user.repository.UserRepository;
import com.example.macro.user.service.UserService;
import com.example.macro.user.utils.EmailValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        EmailValidation validation = new EmailValidation(user.getEmail());
        validation.isEmailValid();

        Optional<User> userByEmail = userRepository.findByEmail(user.getEmail());
        if (userByEmail.isPresent()) {
            throw new RuntimeException("Record Already Exists");
        }

        if (validation.isEmailValid()) {
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
    public void deleteUser(String id) {

    }
}
