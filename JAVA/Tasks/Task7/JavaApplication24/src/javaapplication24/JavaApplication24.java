/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;
/**
 *
 * @author Soft Laptop
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle obj1 = new Circle();
        Circle obj2 = new Circle(3.0);
        Circle obj3 = new Circle(3.0 , " white");
        Cylinder obj4 = new Cylinder();
        Cylinder obj5 = new Cylinder(2.0);
        Cylinder obj6 = new Cylinder(3.0 , 2.0);
        Cylinder obj7 = new Cylinder(4.0 , 5.0 , "green");
        obj1.setRadius(2.3);
        obj1.setColor("blue");
        obj4.setRadius(1.5);
        obj4.setColor("purple");
        obj4.setHeight(5);
        System.out.println("circle area = "+obj3.getArea());
        obj1.toString();
        obj4.setHeight(4.0);
        obj7.toString();
        System.out.println("circle area = "+obj6.getVolume());  
    }
    
}
