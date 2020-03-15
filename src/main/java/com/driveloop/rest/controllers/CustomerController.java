package com.driveloop.rest.controllers;

import com.driveloop.rest.models.Customer;
import com.driveloop.rest.services.CustomerService;
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
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping
    public Iterable<Customer> getCustomers() {
        return service.findAll();
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return service.save(customer);
    }

    @GetMapping("{id}")
    public Optional<Customer> getCustomerById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable("id") long id) {
        service.delete(id);
    }

    @GetMapping("count")
    public Long customersCount() {
        return service.count();
    }

    @PostMapping("find")
    public Iterable<Customer> getCustomersById(@RequestBody Iterable<Long> idArray) {
        return service.findAllById(idArray);
    }
}
