/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author Soft Laptop
 */
public class Triangle {
    int L1;
    int L2;
    int Base;
    int Height;
    float Area;
    int circumference;
    
    public void Set_TriangleData(int Copy_L1 ,int Copy_L2 ,int Copy_Base ,int Copy_Height)
    {
        L1 = Copy_L1;
        L2 = Copy_L2;
        Base = Copy_Base;
        Height = Copy_Height;
    }
    
    public void Get_Area()
    {
        Area = (float)0.5 * (float)Base * (float)Height;
        System.out.println("Triangle Area = "+Area);
    }
    
    public void Get_circumference()
    {
        circumference = L1 + L2 + Base ;
        System.out.println("Triangle circumference = "+circumference);
    }
}
