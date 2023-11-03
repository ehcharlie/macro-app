package com.example.demo.users.service;

import com.example.demo.users.entities.User;

public interface UserService {

    User createUser(User user);

    User getUser(String email);

    void deleteUser(String id);
}
