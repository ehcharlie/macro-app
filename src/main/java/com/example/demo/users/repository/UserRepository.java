package com.example.demo.users.repository;

import com.example.demo.users.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional <User> findByEmail(String email);
}
