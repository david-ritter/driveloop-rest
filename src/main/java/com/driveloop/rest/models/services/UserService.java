package com.driveloop.rest.models.services;

import com.driveloop.rest.entities.User;
import com.driveloop.rest.models.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface UserI {
    Iterable<User> findAll();

    User save(User entity);

    Optional<User> findById(Long id);

    void delete(Long id);
}

@Service
public class UserService implements UserI {
    @Autowired
    public UserRepository repository;

    @Override
    public Iterable<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User save(User entity) {
        return repository.save(entity);
    }

    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
