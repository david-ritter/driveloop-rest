package com.driveloop.rest.services;

import com.driveloop.rest.models.Garage;
import com.driveloop.rest.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface GarageI {
    Garage save(Garage entity);

    Iterable<Garage> findAll();

    Optional<Garage> findById(Long id);

    void delete(Long id);
}

@Service
public class GarageService implements GarageI {
    @Autowired
    public GarageRepository repository;

    @Override
    public Garage save(Garage entity) {
        return repository.save(entity);
    }

    @Override
    public Iterable<Garage> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Garage> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Long count() {
        return repository.count();
    }

    public Iterable<Garage> findAllById(Iterable<Long> idArray) {
        return repository.findAllById(idArray);
    }

    public Iterable<Garage> findByOwnerId(Long ownerId) {
        return repository.findByOwnerOwnerId(ownerId);
    }
}