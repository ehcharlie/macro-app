package com.example.macro.user.controller;

import com.example.macro.user.document.User;
import com.example.macro.user.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService service) {
        this.userService = service;
    }

    @PostMapping()
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping(value = "/user/{email}")
    public User getUser(@PathVariable String email) {
        return userService.findById(email);
    }

    @DeleteMapping(value = "/user/{email}")
    public void deleteUser(@PathVariable String email) {
        userService.delete(email);
    }

    @PutMapping(value = "/user/{email}")
    public User updateUser(@PathVariable String email, @RequestBody User updatedUser) {
        return userService.update(email, updatedUser);
    }
}