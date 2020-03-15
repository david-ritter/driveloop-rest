package com.driveloop.rest.services;

import com.driveloop.rest.models.CustomerReview;
import com.driveloop.rest.repository.CustomerReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface CustomerReviewI {
    CustomerReview save(CustomerReview entity);

    Iterable<CustomerReview> findAll();

    Optional<CustomerReview> findById(Long id);

    void delete(Long id);
}

@Service
public class CustomerReviewService implements CustomerReviewI {
    @Autowired
    public CustomerReviewRepository repository;

    @Override
    public CustomerReview save(CustomerReview entity) {
        return repository.save(entity);
    }

    @Override
    public Iterable<CustomerReview> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CustomerReview> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Long count() {
        return repository.count();
    }

    public Iterable<CustomerReview> findAllById(Iterable<Long> idArray) {
        return repository.findAllById(idArray);
    }
}