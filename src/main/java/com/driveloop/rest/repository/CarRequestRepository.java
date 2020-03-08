package com.driveloop.rest.repository;

import com.driveloop.rest.models.CarRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRequestRepository extends CrudRepository<CarRequest, Long> {
}
