package com.driveloop.rest.controllers;

import com.driveloop.rest.models.User;
import com.driveloop.rest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public Iterable<User> getUsers() {
        return service.findAll();
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return service.save(user);
    }

    @GetMapping("{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable("id") long id) {
        service.delete(id);
    }

    @GetMapping("count")
    public Long usersCount() {
        return service.count();
    }

    @PostMapping("find")
    public Iterable<User> getUsersById(@RequestBody Iterable<Long> idArray) {
        return service.findAllById(idArray);
    }
}
