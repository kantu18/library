package com.raj.library.entity;

import jakarta.persistence.Id;

public class Admin {
    @Id
    private String userName;
    private String password;
    private String name;
    private int age;
    private String phoneNumber;
    private String emailId;
}
