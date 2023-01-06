/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursemanagementsystem;

/**
 *
 * @author Soft Laptop
 */
public abstract class Person {
    
    String name;
    String address;
    String gendre;
    int age;

    public Person() {
    }

    public Person(String name, String address, String gendre, int age) {
        this.name = name;
        this.address = address;
        this.gendre = gendre;
        this.age = age;
    }
    
    

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGendre(String gendre) {
        this.gendre = gendre;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public abstract String getName();
    
    public  String getAddress()
    {
        return this.address;
    }
    
    public  String getGendre()
    {
        return this.gendre;
    }
    
    public  int getAge()
    {
        return this.age;  
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", gendre=" + gendre + ", age=" + age + '}';
    }
    
    
    
    
}
