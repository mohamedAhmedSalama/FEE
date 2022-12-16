/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Soft Laptop
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String line;
        int String_len , i , j = 0 ;
        System.out.println("Enter string:");
        Scanner input = new Scanner(System.in);
        line=input.nextLine();
        String_len = line.length();
        //System.out.print(line.charAt(0));
        char []Arr= new char [String_len];
        for(i = 0 ; i < String_len ; i++)
        {
            if(line.charAt(i) != ',')
            {
               Arr[j]=line.charAt(i);
               j++;
            }
        }
        for( i = 0 ; i < j ; i++)
        {
           System.out.print(Arr[i]); 
        }
        System.out.println(); 
    }
    
}
