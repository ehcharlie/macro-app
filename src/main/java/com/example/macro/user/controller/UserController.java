package com.example.macro.user.controller;

import com.example.macro.user.document.User;
import com.example.macro.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping(value = "/user/{email}")
    public User getUser(@PathVariable String email) {
        return userService.getUser(email);
    }
}
