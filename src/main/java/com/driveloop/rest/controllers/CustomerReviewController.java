package com.driveloop.rest.controllers;

import com.driveloop.rest.models.CustomerReview;
import com.driveloop.rest.services.CustomerReviewService;
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
@RequestMapping("/customer/review")
public class CustomerReviewController {
    @Autowired
    private CustomerReviewService service;

    @GetMapping
    public Iterable<CustomerReview> getReviews() {
        return service.findAll();
    }

    @PostMapping
    public CustomerReview saveReview(@RequestBody CustomerReview review) {
        return service.save(review);
    }

    @GetMapping("{id}")
    public Optional<CustomerReview> getReviewById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteReview(@PathVariable("id") long id) {
        service.delete(id);
    }

    @GetMapping("count")
    public Long reviewsCount() {
        return service.count();
    }

    @PostMapping("find")
    public Iterable<CustomerReview> getReviewsById(@RequestBody Iterable<Long> idArray) {
        return service.findAllById(idArray);
    }
}
