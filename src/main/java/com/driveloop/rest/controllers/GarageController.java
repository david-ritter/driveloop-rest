package com.driveloop.rest.controllers;

import com.driveloop.rest.models.Garage;
import com.driveloop.rest.services.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/garage")
public class GarageController {
    @Autowired
    private GarageService service;

    @GetMapping
    public Iterable<Garage> getCars() {
        return service.findAll();
    }

    @PostMapping
    public Garage saveCar(@RequestBody Garage car) {
        return service.save(car);
    }

    @GetMapping("{id}")
    public Optional<Garage> getCarById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteCar(@PathVariable("id") long id) {
        service.delete(id);
    }

    @GetMapping("count")
    public Long garageCount() {
        return service.count();
    }

    @PostMapping("find")
    public Iterable<Garage> getCarsById(@RequestBody Iterable<Long> idArray) {
        return service.findAllById(idArray);
    }

    @GetMapping("owner/{id}")
    public  Iterable<Garage> getCarsByOwnerId(@PathVariable("id") Long id) {
        return service.findByOwnerId(id);
    };
}
