/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem;

/**
 *
 * @author Soft Laptop
 */
public class Passenger extends Person{
    private int flightNo;
    private static int number = 100;
    final  int ID;

    
    
    
    public Passenger(String city , String country , String name, int flightNo) {
        super(city , country , name);
        this.number++;
        this.ID = this.number;
        this.flightNo = flightNo;
    }

    public static int getNumber() {
        return number;
    }

    public int getId() {
        return this.ID;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }
    
    @Override
    public  String getName()
    {
        return this.name;
    }

    

    @Override
    public String toString() {
        return super.toString()+ "Passenger{" + "flightNo=" + flightNo + ", ID=" + ID + '}';
    }
    
    
    
 
}
