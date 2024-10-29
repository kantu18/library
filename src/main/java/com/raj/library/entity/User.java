package com.raj.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private String userName;
    private String password;
    private String name;
    private int age;
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private int dueBooks;
    private int assignedBooks;
    private String phoneNumber;
    private String emailId;

    public User(){

    }
    public User(String userName, String password, String name, int age, String id, int dueBooks, int assignedBooks, String phoneNumber, String emailId) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.age = age;
        this.id = id;
        this.dueBooks = dueBooks;
        this.assignedBooks = assignedBooks;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDueBooks() {
        return dueBooks;
    }

    public void setDueBooks(int dueBooks) {
        this.dueBooks = dueBooks;
    }

    public int getAssignedBooks() {
        return assignedBooks;
    }

    public void setAssignedBooks(int assignedBooks) {
        this.assignedBooks = assignedBooks;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
