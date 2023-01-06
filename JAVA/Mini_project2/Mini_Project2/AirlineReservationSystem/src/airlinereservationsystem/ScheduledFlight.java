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
public class ScheduledFlight extends FlightDescription{
    
    private LocalDateTime date;
    
    public ScheduledFlight(int flightNo) {
        super(flightNo);
    }
    
    
    public ScheduledFlight(String airportName,String city,String country,String FlightFrom,String FlightTo,LocalDateTime FlightDeparture,LocalDateTime FlightArrival,int Capacity,LocalDateTime date,int flightNo)
    {
        super(airportName,city,country,FlightFrom,FlightTo,FlightDeparture,FlightArrival,Capacity,flightNo);
        this.date = date;
    }
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return " ScheduledFlight{" + "date=" + date + "}, " + super.toString();
    }
    
    
    
}
