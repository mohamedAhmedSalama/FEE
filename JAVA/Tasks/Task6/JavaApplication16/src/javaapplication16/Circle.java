/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author Soft Laptop
 */
public class Circle {
    double Radius ;
    private double Circle_Area;
    Circle()
    {
        System.out.println("Here is Circle !");
    }
    public void SetCircle_Radius(double Copy_Radius)
    {
        Radius = Copy_Radius;
    }
    public void GetCircle_Area()
    {
        Circle_Area = 3.14 * Radius * Radius ;
        System.out.println("Area= "+Circle_Area);
    }
}

 class Clinder extends Circle{

    double height ;
    double Clinder_Area;   
    Clinder()
    {
        super();
        System.out.println("Here is Clinder");
    }
    public void SetClinder_Height(double Copy_Height)
    {
        height = Copy_Height;
    }
    public void GetClinder_Area()
    {
       Clinder_Area =  3.14 * Radius * Radius * height ;
       System.out.println("Area= "+Clinder_Area);
    }
}
