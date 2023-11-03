package com.example.macro.user.service;

import com.example.macro.user.entities.User;

public interface UserService {

    User createUser(User user);

    User getUser(String email);

    void deleteUser(String id);
}