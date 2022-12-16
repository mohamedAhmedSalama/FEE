/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author Soft Laptop
 */
public class Circle {
    int Radius;
    float Area;
    float circumference;
    public void Set_Radius(int Copy_Radius)
    {
        Radius = Copy_Radius;
    }
    public void Get_Area()
    {
        Area = (float)Radius * (float)3.14 * (float)Radius ;
        System.out.println("Circle Area = "+Area);
    }
    public void Get_circumference()
    {
        circumference = (float)Radius * (float)3.14 * (float)2 ;
        System.out.println("Circle circumference = "+circumference);
    }
    
}
