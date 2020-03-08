package com.driveloop.rest.repository;

import com.driveloop.rest.models.CustomerReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReviewRepository extends CrudRepository<CustomerReview, Long> {
}
