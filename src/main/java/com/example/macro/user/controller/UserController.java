package com.example.macro.user.controller;

import com.example.macro.user.document.User;
import com.example.macro.user.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping(value = "/user/{email}")
    public User getUser(@PathVariable String email) {
        return userService.getUser(email);
    }

    @DeleteMapping(value = "/user/{email}")
    public void deleteUser(@PathVariable String email) {
        userService.deleteUser(email);
    }

    @PutMapping(value = "/user/{email}")
    public User updateUser(@PathVariable String email, @RequestBody User updatedUser) {
        return userService.updateUser(email, updatedUser);
    }
}