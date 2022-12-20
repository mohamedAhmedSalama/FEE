/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author Soft Laptop
 */
public class Cylinder extends Circle{
    
    private double height = (double)1.0;

    public Cylinder() {
        super();
         System.out.println("this is Cylinder");
    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double height , double radius){
        super(radius);
        this.height = height;
    }
    public Cylinder(double height , double radius , String color){
        super(radius , color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + '}';
    }
    
    public double getVolume(){
        return this.getArea() * this.height ;
    }
}

