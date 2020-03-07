package com.driveloop.rest.models.services;

import com.driveloop.rest.entities.Owner;
import com.driveloop.rest.models.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface OwnerI {
    Owner save(Owner entity);

    Iterable<Owner> findAll();

    Optional<Owner> findById(Long id);

    void delete(Long id);
}

@Service
public class OwnerService implements OwnerI {
    @Autowired
    public OwnerRepository repository;

    @Override
    public Owner save(Owner entity) {
        return repository.save(entity);
    }

    @Override
    public Iterable<Owner> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Owner> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}