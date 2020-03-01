package com.driveloop.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "customer_review")
public class CustomerReview {
    @Column(name = "request_id")
    private long requestID;

    @Column(name = "trust_rate")
    private byte trustRate;

    @Column(name = "recommend_rate")
    private byte recommendRate;

    @Column(name = "comment")
    private String comment;

    @Column(name = "review_time")
    private Date reviewTime;
}
