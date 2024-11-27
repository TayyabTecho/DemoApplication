package com.example.demoApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class User {
    @Id
    private Long userId;
    private String uaerName;

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;
    private String phoneNumber;

   // public String getEmail(){return email;}
}
