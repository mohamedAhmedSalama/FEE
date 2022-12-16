/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Soft Laptop
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rad , l1 , l2 , height , base ;
        Circle my_circle = new Circle();
        Triangle my_triangle = new Triangle();
        System.out.print("Enter circle Radius:");
        Scanner input = new Scanner(System.in);
        rad = input.nextInt();
        my_circle.Set_Radius(rad);
        my_circle.Get_Area();
        my_circle.Get_circumference();
        System.out.print("Enter triangle L1:");
        l1 = input.nextInt();
        System.out.print("Enter triangle L2:");
        l2 = input.nextInt();
        System.out.print("Enter triangle Base:");
        base = input.nextInt();
        System.out.print("Enter triangle Height:");
        height = input.nextInt();
        my_triangle.Set_TriangleData(l1, l2, base, height);
        my_triangle.Get_Area();
        my_triangle.Get_circumference(); 
    }
     
}
