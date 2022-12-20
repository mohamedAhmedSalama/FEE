/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author Soft Laptop
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String data;
        Car obj1 = new Car("red","2022");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Model:");
        data = input.nextLine();
        obj1.Set_Model(data);
        System.out.print("Enter Make Year:");
        data = input.nextLine();
        obj1.Set_Makeyear(data);
        System.out.print("Enter Color:");
        data = input.nextLine();
        obj1.Set_Color(data);
        obj1.Get_CarInfo();
    }
    
}
