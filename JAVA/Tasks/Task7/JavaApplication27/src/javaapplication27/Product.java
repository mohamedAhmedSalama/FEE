/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author Soft Laptop
 */
public interface Product {
    
    public double get_price();
}

class Book implements Product{
    double price;

    public Book(double price) {
        this.price = price;
    }
    
    
    public double get_price()
    {
        return this.price *  0.5 ;
    }
} 
class Cartoon extends Book{

    public Cartoon(double price) {
        super(price);
    }
    
    @Override
    public double get_price()
    {
        return this.price *  0.6 ;
    }
}