package com.driveloop.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id @Column(name = "user_id")
    private long userID;

    @Column(name = "user")
    private String user;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "created_at")
    private Date createdAt;
}
