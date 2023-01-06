/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursemanagementsystem;

/**
 *
 * @author Soft Laptop
 */
public class Instructor extends Person{
    
    private static int number = 2000;
    private  int ID;
    private String courseName;
    // need some data

    public Instructor() {
        
        this.ID = this.number;
        this.number++;
    }

    public Instructor(String courseName, String name, String address, String gendre, int age) {
        super(name, address, gendre, age);
        this.courseName = courseName;
        this.ID = this.number;
        this.number++;
    }
    
    @Override
    public String getName()
    {
        return "Dr: "+this.name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
   
    
    public int getID() {
        return this.ID;
    }
    
    @Override
    public String toString() {
        return super.toString()+ ",  Instructor{" + "ID=" + ID + ", courseName=" + courseName + '}';
    }
    
    
    
    
    
}
