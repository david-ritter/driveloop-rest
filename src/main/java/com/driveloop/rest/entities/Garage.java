package com.driveloop.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "garage")
public class Garage {
    @Id @Column(name = "car_id")
    private long carID;

    @Column(name = "owner_id")
    private long ownerID;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "class")
    private String carClass;

    @Column(name = "year")
    private String year;

    @Column(name = "capacity")
    private byte capacity;

    @Column(name = "fuel")
    private String fuel;

    @Column(name = "transmission")
    private String transmission;

    @Column(name = "plate")
    private String plate;

    @Column(name = "fare")
    private float fare;

    @Column(name = "status")
    private String carStatus;
}
