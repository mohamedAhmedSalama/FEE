/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem;

/**
 *
 * @author Soft Laptop
 */
public class Airports extends Address{
    private String airportName;

     Airports() {
    }
    
    
    Airports(String airportName ,String city , String country)
    {
        super(city, country);
        this.airportName = airportName;
    }
    
    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    @Override
    public String toString() {
        return " Airports{" + "airportName=" + airportName + "}, " + super.toString();
    }
    
}
