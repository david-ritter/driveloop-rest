package com.driveloop.rest.controllers;

import com.driveloop.rest.models.CarRequest;
import com.driveloop.rest.services.CarRequestService;
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
@RequestMapping("/request")
public class CarRequestController {
    @Autowired
    private CarRequestService service;

    @GetMapping
    public Iterable<CarRequest> getRequests() {
        return service.findAll();
    }

    @PostMapping
    public CarRequest saveRequest(@RequestBody CarRequest request) {
        return service.save(request);
    }

    @GetMapping("{id}")
    public Optional<CarRequest> getRequestById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteRequest(@PathVariable("id") long id) {
        service.delete(id);
    }

    @GetMapping("count")
    public Long requestsCount() {
        return service.count();
    }

    @PostMapping("find")
    public Iterable<CarRequest> getRequestsById(@RequestBody Iterable<Long> idArray) {
        return service.findAllById(idArray);
    }
}
