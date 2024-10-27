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

    public Admin(String userName, String password, String name, int age, String phoneNumber, String emailId) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }
}
