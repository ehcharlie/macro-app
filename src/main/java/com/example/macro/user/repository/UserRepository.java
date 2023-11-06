package com.example.macro.user.repository;

import com.example.macro.service.CrudService;
import com.example.macro.user.document.User;

import java.util.Optional;

public interface UserRepository extends CrudService<User, String> {

    Optional<User> findByEmail(String email);

    Optional<User> deleteUserByEmail(String email);
}