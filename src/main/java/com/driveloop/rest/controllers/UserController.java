package com.driveloop.rest.controllers;

import com.driveloop.rest.models.User;
import com.driveloop.rest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public Iterable<User> getUsers() {
        return service.findAll();
    }
}
