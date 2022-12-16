/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Soft Laptop
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Enter Asci :");
        Scanner input = new Scanner (System.in);
        int asci = input.nextInt();
        char ch = (char) asci;
        System.out.println(ch);
        System.out.format("%c",asci);
    }
    
}
