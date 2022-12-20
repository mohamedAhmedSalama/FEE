/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author Soft Laptop
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product []arr = new Product[2];
        arr[0] = new Book(60);
        arr[1] = new Cartoon(50);
        System.out.println("obj1 Price : " + arr[0].get_price());
        System.out.println("obj2 Price : " + arr[1].get_price()); 
        
    }
    
}
