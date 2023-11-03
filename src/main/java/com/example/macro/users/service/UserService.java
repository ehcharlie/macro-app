package com.example.macro.users.service;

import com.example.macro.users.entities.User;

public interface UserService {

    User createUser(User user);

    User getUser(String email);

    void deleteUser(String id);
}
