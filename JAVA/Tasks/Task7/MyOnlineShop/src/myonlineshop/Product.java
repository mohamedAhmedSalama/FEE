/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myonlineshop;

/**
 *
 * @author Soft Laptop
 */
public abstract class Product {
    double price = 0;

    public void setPrice(double price) {
        this.price = price;
    }
    abstract double get_price();
}
class Book extends Product{
    String Book_name ;
    String Colour;

    public Book() {
    }  
    
    
    public Book(String Book_name, String Colour) {
        this.Book_name = Book_name;
        this.Colour = Colour;
    }
    
    @Override
    double get_price() {
        return price * 0.5;
    }
    
} 
class ChildrenBook extends Book{
    String type; 

    public ChildrenBook() {
    }

    public ChildrenBook(String type, String Book_name, String Colour) {
        super(Book_name, Colour);
        this.type = type;
    }
    
    double get_price() { 
        return price * 0.6;
    }
}

