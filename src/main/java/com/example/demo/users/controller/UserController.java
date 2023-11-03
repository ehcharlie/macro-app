package com.example.demo.users.controller;

import com.example.demo.users.entities.User;
import com.example.demo.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(value = "/createUser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }


    @GetMapping(value = "/getUser/{email}")
    public User getUser(@PathVariable("email") String email) {
        return userService.getUser(email);
    }
}
