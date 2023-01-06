/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem;

/**
 *
 * @author Soft Laptop
 */
public abstract class Person extends Address{
     String name=null;
    // String address;
     public Person(String city , String country , String name)
     {
         super(city,country);
         this.name = name;
     }
    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }
    
    

   
    @Override
    public String toString() {
        return " Person{" + "name=" + name + "}, " + super.toString();
    }
    
    
    
}
