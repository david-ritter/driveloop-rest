package com.driveloop.rest.models.repository;

import com.driveloop.rest.entities.OwnerReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerReviewRepository extends CrudRepository<OwnerReview, Long> {
}
