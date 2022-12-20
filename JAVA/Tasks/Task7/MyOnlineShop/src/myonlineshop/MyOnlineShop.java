/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myonlineshop;

/**
 *
 * @author Soft Laptop
 */
public class MyOnlineShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product[] arr = new Product[3] ;
        arr[1] = new Book();
        arr[1].setPrice(70);
        arr[2] = new ChildrenBook();
        arr[2].setPrice(80);
        System.out.println("obj1 Price : " + arr[1].get_price());
        System.out.println("obj2 Price : " + arr[2].get_price());
    }
    
}
