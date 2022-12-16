/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Soft Laptop
 */
public class JavaApplication8 {

    /**
     */
    public static void Trnaspose_Func(int CopyArr[][] , int Copy_Row , int Copy_Col)
    {
      int i , j ;
      int [][] trans_arr = new int [Copy_Col][Copy_Row];
      for(i = 0 ; i < Copy_Row ; i++)
      {
          for(j = 0 ;  j < Copy_Col ; j++ )
              trans_arr[j][i] = CopyArr[i][j];
      }
      System.out.println("Transpose Martrix : "); 
      for( i = 0 ; i < Copy_Col ; i++)
        {
            for( j = 0 ; j < Copy_Row ; j++)
              System.out.print(trans_arr[i][j] + " ");
            System.out.println();    
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int row , col , i , j ;
        System.out.print("Enter num of rows:");
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        System.out.print("Enter num of Cols:");
        col = input.nextInt();
        int [][] Arr = new int [row][col];
        System.out.println("Enter "+row+"*"+col+" matrix");
        for(i = 0 ; i < row ; i++)
        {
            for(j = 0 ; j < col ; j++)
               Arr[i][j] = input.nextInt();
        }
         System.out.println("Original Martrix : ");
        for(i = 0 ; i < row ; i++)
        {
            for(j = 0 ; j < col ; j++)
               System.out.print(Arr[i][j]+" " );
             System.out.println();
        }
        Trnaspose_Func(Arr , row , col );
    } 
    
}
