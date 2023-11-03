package com.example.macro.users.controller;

import com.example.macro.users.entities.User;
import com.example.macro.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
