package com.driveloop.rest.models.repository;

import com.driveloop.rest.entities.Garage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarageRepository extends CrudRepository<Garage, Long> {
}
