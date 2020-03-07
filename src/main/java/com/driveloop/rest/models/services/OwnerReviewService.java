package com.driveloop.rest.models.services;

import com.driveloop.rest.entities.OwnerReview;
import com.driveloop.rest.models.repository.OwnerReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface OwnerReviewI {
    OwnerReview save(OwnerReview entity);

    Iterable<OwnerReview> findAll();

    Optional<OwnerReview> findById(Long id);

    void delete(Long id);
}

@Service
public class OwnerReviewService implements OwnerReviewI {
    @Autowired
    public OwnerReviewRepository repository;

    @Override
    public OwnerReview save(OwnerReview entity) {
        return repository.save(entity);
    }

    @Override
    public Iterable<OwnerReview> findAll() {
        return findAll();
    }

    @Override
    public Optional<OwnerReview> findById(Long id) {
        return findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}


