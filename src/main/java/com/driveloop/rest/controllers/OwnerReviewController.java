package com.driveloop.rest.controllers;

import com.driveloop.rest.models.OwnerReview;
import com.driveloop.rest.services.OwnerReviewService;
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
@RequestMapping("/owner/review")
public class OwnerReviewController {
    @Autowired
    private OwnerReviewService service;

    @GetMapping
    public Iterable<OwnerReview> getReviews() {
        return service.findAll();
    }

    @PostMapping
    public OwnerReview saveReview(@RequestBody OwnerReview review) {
        return service.save(review);
    }

    @GetMapping("{id}")
    public Optional<OwnerReview> getReviewById(@PathVariable("id") Long id) {
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
    public Iterable<OwnerReview> getReviewsById(@RequestBody Iterable<Long> idArray) {
        return service.findAllById(idArray);
    }
}
