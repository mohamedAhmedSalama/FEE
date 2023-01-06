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
public class Reservations extends ScheduledFlight {
    
    private LocalDateTime dateMAde;

    /*public Reservations(String airportName, String city, String country, String FlightFrom, String FlightTo, LocalDateTime FlightDeparture, LocalDateTime FlightArrival, int Capacity, LocalDateTime date) {
        super(airportName, city, country, FlightFrom, FlightTo, FlightDeparture, FlightArrival, Capacity, date);
    }*/
    
    public Reservations(int flightNo) {
        super(flightNo);
    }
    
    public Reservations(String airportName,String city,String country,String FlightFrom,String FlightTo,LocalDateTime FlightDeparture,LocalDateTime FlightArrival,int Capacity,LocalDateTime date,LocalDateTime dateMAde,int flightNo)
    {
        super(airportName,city,country,FlightFrom,FlightTo,FlightDeparture,FlightArrival,Capacity,date,flightNo);
        this.dateMAde = dateMAde;
    }
    
    public void setDateMAde(LocalDateTime dateMAde) {
        this.dateMAde = dateMAde;
    }

    public LocalDateTime getDateMAde() {
        return dateMAde;
    }

    
    
    
}
