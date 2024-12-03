package edu.gsu.common;

import java.util.ArrayList;

public class Reservation {
    private String reservationId;
    private Customer customer;
    private Flight flight;
    private String confirmationNumber;

    //list of reservations
    private static ArrayList<Reservation> reservationList = new ArrayList<>();

    //constructor reservation
    public Reservation(String reservationId,Customer customer, Flight flight){
        this.reservationId = reservationId;
        this.customer = customer;
        this.flight = flight;
    }
    //getter and setter
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
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

    public String getConfirmationNumber(){
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber){
        this.confirmationNumber = confirmationNumber;
    }

    //add a trip to account
    public static String addTrip (Customer customer, String confirmationNumber, String lastName, Flight flight){
        if (!customer.getLastname().equalsIgnoreCase(lastName)){
            return "Your last name or Confirmation Number does not match";
        }
        for (Reservation reservation : reservationList) {
            if (reservation.getcustomer().getUsername().equalsIgnoreCase(customer.getUsername()) &&
                    (reservation.getConfirmationNumber().equalsIgnoreCase(confirmationNumber) ||
                    reservation.getFlight().equals(flight))) {
                return "This trip is already added to your account";
            }
        }
        Reservation newReservation = new Reservation("R" + (reservationList.size() + 1), customer, flight);
        newReservation.setConfirmationNumber(confirmationNumber);
        reservationList.add(newReservation);
        return "Trip successfully added to your account";

    }

    public static String deleteTrip(Customer customer, String confirmationNumber) {
        for (Reservation reservation : reservationList) {
            if (reservation.getcustomer().getUsername().equalsIgnoreCase(customer.getUsername()) &&
                    reservation.getConfirmationNumber().equalsIgnoreCase(confirmationNumber)) {
                reservationList.remove(reservation);
                return "Trip successfully deleted from your account";
            }
        }
        return "No matching trip found to delete";
    }

}
    /**Be able to book a flight and add that to his account.
     7.3. Be able to delete a flight from his account.
     7.4. Customer should not be able to book same flight more than once**/

