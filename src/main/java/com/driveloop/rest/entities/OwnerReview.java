package com.driveloop.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "owner_review")
public class OwnerReview {
    @Column(name = "request_id")
    private long requestID;

    @Column(name = "trust_rate")
    private byte serviceRate;

    @Column(name = "recommend_rate")
    private byte qualityRate;

    @Column(name = "comment")
    private String comment;

    @Column(name = "review_time")
    private Date reviewTime;
}