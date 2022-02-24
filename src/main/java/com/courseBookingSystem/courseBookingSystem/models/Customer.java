package com.courseBookingSystem.courseBookingSystem.models;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private Long id;

    private String name;

    private String hometown;

    private int age;

    private List<Booking> bookings;

    public Customer(String name, String hometown, int age) {
        this.name = name;
        this.hometown = hometown;
        this.age = age;
        this.bookings = new ArrayList<>();
    }

    public Customer(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
