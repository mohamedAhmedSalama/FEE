/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;
import java.util.Scanner;
/**
 *
 * @author Soft Laptop
 */
public class JavaApplication7 {

    public static void Get_Max(int Copy_Arr[] , int Copy_Size)
    {
        int i , max =  Copy_Arr[0];
        for(i = 0 ; i < Copy_Size ; i++)
       {
           if(Copy_Arr[i] > max)
               max=Copy_Arr[i];
       }
        System.out.println("Max Number is: "+ max);
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       
       int ElementNo , i ;
       System.out.print("Enter number of elements :");
       Scanner input = new Scanner(System.in);
       ElementNo=input.nextInt();
       int[] Arr = new int[ElementNo];
       System.out.println("Enter elements :");
       for(i = 0 ; i < ElementNo ; i++)
       {
           Arr[i]=input.nextInt(); 
       }
       
        Get_Max(Arr, ElementNo);  
       
      
       
          
    
    }
    
}
