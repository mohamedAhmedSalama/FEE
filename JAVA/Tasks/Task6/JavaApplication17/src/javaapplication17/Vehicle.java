/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author Soft Laptop
 */
public class Vehicle {
    protected String color ;
    protected String MakeYear;
    public Vehicle (String co , String year)
    {
        this.color= co;
        this.MakeYear=year;
        System.out.println("Vehicle Colour"+color+"and Make year is "+MakeYear);
    }
}

class Car extends Vehicle{
    String model;
    
    public Car (String co , String year)
    {
        super( co , year);
    }
    public void Set_Color(String Copy_color)
    {
        color = Copy_color ;
    }
    public void Set_Makeyear(String Copy_MakeYear)
    {
       MakeYear = Copy_MakeYear ; 
    }
    public void Set_Model(String Copy_model)
    {
       model = Copy_model; 
    }
    public void Get_CarInfo()
    {
       System.out.println("Car model is "+model);
       System.out.println("Car Make year "+MakeYear);
       System.out.println("Car Color "+color);
    }
}
