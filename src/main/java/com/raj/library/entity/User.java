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

}
