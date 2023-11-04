package com.yunusbagriyanik.java14.model;


import java.util.UUID;

/**
 * First previewed in Java 14 and permanent in Java 16
 * Record is a simple, immutable, and lightweight data structure typically used for data transportation.
 * it automatically generates equals(), hashCode(), and toString() methods.
 * The use of records is particularly suitable for data transportation purposes, such as representing JSON data or carrying results from a database.
 * Advantages:
 * - Code Conciseness and Readability
 * - Immutability
 */
public record User(String id, String firstName, String lastName, int age) {
    // compact constructor
    public User {
        if (firstName.isBlank()) throw new IllegalArgumentException("First name cannot be blank.");
        if (lastName != null)
            lastName = lastName.toUpperCase();
    }

    public User(String firstName, int age) {
        this(UUID.randomUUID().toString(), firstName, null, age);
    }

    public void getFullName() {
        if (lastName == null)
            System.out.println(firstName());
        else
            System.out.println(firstName() + " " + lastName());
    }
}
