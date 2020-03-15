package com.driveloop.rest.repository;

import com.driveloop.rest.models.Garage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarageRepository extends CrudRepository<Garage, Long> {

    Iterable<Garage> findByOwnerOwnerId(Long ownerId);

}
