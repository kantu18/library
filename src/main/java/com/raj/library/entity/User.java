package com.raj.library.entity;

import jakarta.persistence.Id;

public class User {
    @Id
    private String userName;
    private String password;
    private String name;
    private int age;
    private String id;
    private int dueBooks;
    private int assignedBooks;

    public User(String userName, String password, String name, int age, String id, int dueBooks, int assignedBooks) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.age = age;
        this.id = id;
        this.dueBooks = dueBooks;
        this.assignedBooks = assignedBooks;
    }
}
