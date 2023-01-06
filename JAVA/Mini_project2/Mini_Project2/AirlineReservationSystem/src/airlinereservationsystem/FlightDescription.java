/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem;

import java.time.LocalDateTime;

/**
 *
 * @author Soft Laptop
 */
public class FlightDescription extends Airports {
    private String FlightFrom;
    private String FlightTo;
    private LocalDateTime FlightDeparture;
    private LocalDateTime FlightArrival;
    private int Capacity;
    private int flightNo ;
    
    

    public FlightDescription(int flightNo) {
        this.flightNo = flightNo;
    }

    public FlightDescription(String airportName,String city,String country,String FlightFrom,String FlightTo,LocalDateTime FlightDeparture,LocalDateTime FlightArrival,int Capacity , int flightNo) {
        super(airportName,city,country);
        this.FlightFrom = FlightFrom;
        this.FlightTo = FlightTo;
        this.FlightArrival = FlightArrival;
        this.FlightDeparture = FlightDeparture;
        this.Capacity = Capacity;
        this.flightNo = flightNo;
        
    }
    
    
    public String getFlightFrom() {
        return FlightFrom;
    }

    public void setFlightFrom(String FlightFrom) {
        this.FlightFrom = FlightFrom;
    }

    public String getFlightTo() {
        return FlightTo;
    }

    public void setFlightTo(String FlightTo) {
        this.FlightTo = FlightTo;
    }

    public LocalDateTime getFlightDeparture() {
        return FlightDeparture;
    }

    public void setFlightDeparture(LocalDateTime FlightDeparture) {
        this.FlightDeparture = FlightDeparture;
    }

    public LocalDateTime getFlightArrival() {
        return FlightArrival;
    }

    public void setFlightArrival(LocalDateTime FlightArrival) {
        this.FlightArrival = FlightArrival;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public int getFlightNo() {
        return flightNo;
    }

    @Override
    public String toString() {
        return super.toString() + "FlightDescription{" + "FlightFrom=" + FlightFrom + ", FlightTo=" + FlightTo + ", FlightDeparture=" + FlightDeparture + ", FlightArrival=" + FlightArrival + ", Capacity=" + Capacity + ", flightNo=" + flightNo + '}';
    }

    

    
    
    
    
}
