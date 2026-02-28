/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author Vaibhavi
 */
class Message{
    Message(String name){
        System.out.println("Constructor with one argument " + name);
    }
    Message(String name,int age){
        System.out.println("Constructor with two arguments :  " + name + " " + age);
    }
    Message(long id){
        System.out.println("Constuctor with argument " + " long " + id);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Message m1 = new Message("Vaibhavi");
        Message m2 = new Message("Vaibhavi",2);
        Message m3 = new Message(23456789);
        
        
        
    }
}
