package com.driveloop.rest.models.repository;

import com.driveloop.rest.entities.CustomerReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReviewRepository extends CrudRepository<CustomerReview, Long> {
}
