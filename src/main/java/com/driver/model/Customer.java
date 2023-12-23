package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int customerId;
    String mobile;
    String password;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<TripBooking> tripBookingList=new ArrayList<>();

    public Customer() {
    }

    public Customer(String mobile, String password, List<TripBooking> tripBookingList) {
        this.mobile = mobile;
        this.password = password;
        this.tripBookingList = tripBookingList;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}