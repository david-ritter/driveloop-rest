package com.driveloop.rest.controllers;

import com.driveloop.rest.models.Owner;
import com.driveloop.rest.services.OwnerService;
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
@RequestMapping("/owner")
public class OwnerController {
    @Autowired
    private OwnerService service;

    @GetMapping
    public Iterable<Owner> getOwners() {
        return service.findAll();
    }

    @PostMapping
    public Owner saveOwner(@RequestBody Owner owner) {
        return service.save(owner);
    }

    @GetMapping("{id}")
    public Optional<Owner> getOwnerById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteOwner(@PathVariable("id") long id) {
        service.delete(id);
    }

    @GetMapping("count")
    public Long ownersCount() {
        return service.count();
    }

    @PostMapping("find")
    public Iterable<Owner> getOwnersById(@RequestBody Iterable<Long> idArray) {
        return service.findAllById(idArray);
    }
}
