package com.driveloop.rest.services;

import com.driveloop.rest.models.CarRequest;
import com.driveloop.rest.repository.CarRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface CarRequestI {
    CarRequest save(CarRequest entity);

    Iterable<CarRequest> findAll();

    Optional<CarRequest> findById(Long id);

    void delete(Long id);
}

@Service
public class CarRequestService implements CarRequestI {
    @Autowired
    public CarRequestRepository repository;

    @Override
    public CarRequest save(CarRequest entity) {
        return repository.save(entity);
    }

    @Override
    public Iterable<CarRequest> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CarRequest> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}