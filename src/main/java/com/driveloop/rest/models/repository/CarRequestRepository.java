package com.driveloop.rest.models.repository;

import com.driveloop.rest.entities.CarRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRequestRepository extends CrudRepository<CarRequest, Long> {
}
