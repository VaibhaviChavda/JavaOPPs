/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstarction;

/**
 *
 * @author Vaibhavi
 */
//Showing only the essential deatils of an object and hinding unnecessary internal details
abstract class Vehicle{
    Vehicle(){
        System.out.println("Vehicle created");
    }
    abstract void start();
    void stop(){
        System.out.println("vehicle stop");
    }
}class car extends Vehicle{
    car(){
        super();
    }
    void start(){
        System.out.println("car start with key"); 
   }
}
class bike extends Vehicle{
    bike(){
        super();
    }
    void start(){
        System.out.println("bike start with slef start button");
    }
}
public class Demo {
    public static void main(String[] args) {
        Vehicle v = new car(); 
       v.start();
        v.stop();
        System.out.println();
        Vehicle v1 = new car(); 
        v1.start();
        v1.stop();
        
    }
}
