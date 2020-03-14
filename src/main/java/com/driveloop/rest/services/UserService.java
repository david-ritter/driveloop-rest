package com.driveloop.rest.services;

import com.driveloop.rest.models.User;
import com.driveloop.rest.repository.UserRepository;
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

    public Long count() {
        return repository.count();
    }

    public Iterable<User> findAllById(Iterable<Long> idArray) {
        return repository.findAllById(idArray);
    }
}
