package com.driveloop.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "car_request")
public class CarRequest {
    @Id @Column(name = "request_id")
    private long requestID;

    @Column(name = "owner_id")
    private long ownerID;

    @Column(name = "customer_id")
    private long customerID;

    @Column(name = "car_id")
    private long carID;

    @Column(name = "days")
    private byte days;

    @Column(name = "request_status")
    private String requestStatus;

    @Column(name = "request_time")
    private Date requestTime;
}
