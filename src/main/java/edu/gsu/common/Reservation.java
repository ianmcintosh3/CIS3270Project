package edu.gsu.common;

import java.util.ArrayList;

public class Reservation {
    private String reservationId;
    private Customer customer;
    private Flight flight;
    //list of reservations
    private static ArrayList<String> reservationList = new ArrayList<>();
    public Reservation(String reservationId,Customer customer, Flight flight){
        this.reservationId = reservationId;
        this.customer = customer;
        this.flight = flight;
    }
    //getter and setter
    public String getReservationId(){
        return reservationId;
    }
    public void setReservationId(String reservationId){
        this.reservationId = reservationId;
    }
    public Customer getcustomer(){
        return customer;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    public Flight getFlight(){
        return flight;
    }
    public void setFlight(Flight flight){
        this.flight = flight;
    }

}