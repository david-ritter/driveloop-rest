package com.driveloop.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer {
    @Id @Column(name = "customer_id")
    public long customerID;

    @Column(name = "user_id")
    public long userID;

    @Column(name = "firstname")
    public String firstName;

    @Column(name = "lastname")
    public String lastName;

    @Column(name = "phone")
    public String phone;

    @Column(name = "dui")
    public String dui;

    @Column(name = "licence")
    public String licence;

    @Column(name = "birthdate")
    public Date birthDate;

    @Column(name = "city")
    public String city;

    @Column(name = "location")
    public String location;
}
