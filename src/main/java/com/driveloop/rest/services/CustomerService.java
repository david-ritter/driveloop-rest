package com.driveloop.rest.services;

import com.driveloop.rest.models.Customer;
import com.driveloop.rest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface CustomerI {
    Customer save(Customer entity);

    Iterable<Customer> findAll();

    Optional<Customer> findById(Long id);

    void delete(Long id);
}

@Service
public class CustomerService implements CustomerI {
    @Autowired
    public CustomerRepository repository;

    @Override
    public Customer save(Customer entity) {
        return repository.save(entity);
    }

    @Override
    public Iterable<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Long count() {
        return repository.count();
    }

    public Iterable<Customer> findAllById(Iterable<Long> idArray) {
        return repository.findAllById(idArray);
    }
}