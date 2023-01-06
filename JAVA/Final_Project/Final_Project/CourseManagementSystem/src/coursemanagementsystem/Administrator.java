/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursemanagementsystem;

/**
 *
 * @author Soft Laptop
 */
public class Administrator extends Person {
    
    private static int number = 1000;
    private final int ID;
    private String login;
    // need some data

    public Administrator() {
        
        this.ID = this.number;
        this.number++;
    }

    public Administrator(String login, String name, String address, String gendre, int age) {
        super(name, address, gendre, age);
        this.login = login;
        this.ID = this.number;
        this.number++;
    }
    
    @Override
    public String getName()
    {
        return "Mr: "+this.name;
    }
    
    
    public int getID() {
        return this.ID;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
    

    @Override
    public String toString() {
        return super.toString() + ", Administrator{" + "ID=" + ID + ", login=" + login + '}';
    }
    
    
     
   
}
