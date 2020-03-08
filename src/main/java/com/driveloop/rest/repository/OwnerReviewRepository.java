package com.driveloop.rest.repository;

import com.driveloop.rest.models.OwnerReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerReviewRepository extends CrudRepository<OwnerReview, Long> {
}
