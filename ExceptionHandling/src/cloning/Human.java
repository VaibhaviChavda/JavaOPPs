/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cloning;

/**
 *
 * @author Vaibhavi
 */
public class Human implements Cloneable{
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
  
    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }
    
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
}
