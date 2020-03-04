package com.driveloop.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "garage")
public class Garage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long carId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

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

    @Column(name = "image")
    private String image;

    @Column(name = "fare")
    private float fare;

    @Column(name = "status")
    private String carStatus;
}
