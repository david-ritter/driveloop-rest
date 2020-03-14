package com.driveloop.rest.services;

import com.driveloop.rest.models.Owner;
import com.driveloop.rest.repository.OwnerRepository;
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

    public Long count() {
        return repository.count();
    }

    public Iterable<Owner> findAllById(Iterable<Long> idArray) {
        return repository.findAllById(idArray);
    }
}