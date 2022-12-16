/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author Soft Laptop
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter 2 numbers : ");
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        int sum1=1 ,sum2=1 , sum3=1 ;
        for(int i = n ; i > 0 ; i--)
        {
            sum1*=i;
        }
        for(int i = r ; i > 0 ; i--)
        {
            sum2*=i;
        }
        for(int i=(n-r) ; i > 0 ; i--)
        {
            sum3*=i;
        }
        System.out.println("nCr= "+(sum1/sum3));
        System.out.println("nPr= "+(sum1/(sum2*sum3)));
    }
    
}
