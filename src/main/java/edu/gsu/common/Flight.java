package edu.gsu.common;

public class Flight {

    private String flightNumber;
    private String flightDepartureCity;
    private String flightDestinationCity;
    private String flightDate;
    private String flightDepartureTime;
    private String flightArrivalTime;


    public void setFlightNumber(String fn) {
        this.flightNumber = flightNumber;
    }
    public String getFlightNumber(String fn){
        return fn;
    }
    public void setFlightDepartureCity(String fdc){
        this.flightDepartureCity = flightDepartureCity;
    }
    public String getFlightDepartureCity(String fdc){
        return fdc ;
    }
    public void setFlightDestinationCity(String fdc){
        this.flightDestinationCity = flightDestinationCity;
    }
    public String getflightDestinationCity(String fdc){
        return fdc ;
    }
    public void setFlightDate(String fd){
        this.flightDate = flightDate;
    }
    public String getFlightDate(String fd){
        return fd;
    }
    public void flightDepartureTime(String fdt){
        this.flightDepartureTime = flightDepartureTime;
    }
    public String getFlightDepartureTime(String fdt){
        return fdt;
    }
    public void setFlightArrivalTime(String fat){
        this.flightArrivalTime = flightArrivalTime;
    }
    public String getFlightArrivalTime(String fat){
        return fat;
    }
}