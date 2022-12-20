/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author Soft Laptop
 */
class Circle {
    private double radius = (double)1.0;
    private String color  = "red";

    public Circle() {
        System.out.println("this is circle");
    }
    public Circle(double radius){
         this.radius = radius;
    }
    public Circle(double radius ,String color ){
         this.radius = radius;
         this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    public double getArea(){
        return (double)3.14 *  this.radius * this.radius;
    }
    
}
