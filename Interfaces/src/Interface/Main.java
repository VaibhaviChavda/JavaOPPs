/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Vaibhavi
 */
//interface is a reference type that defines a contract
//(a set of abstract methods, constants, and default/static methods) 
//that a class must implement.
//It is used to achieve abstraction and multiple inheritance.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        car.acc();
        car.brk();
        
        //we can take parent class as reference variable but
        Engine c = new Car();
        
       
        
        //but we can't accees parent class memebers
       // c.a;
       
        //because which one to access is depend on type of the object 
       
        System.out.println();
        System.out.println("Nice car example"); 
       Media carMedia = new Car();
        carMedia.stop();
        
        NiceCar nicecar = new NiceCar();
        nicecar.start();
        nicecar.startMusic();
        
        System.out.println("now it will upgrade to electric engine"); 
       nicecar.upgradeEngine();
        nicecar.start();
     
        
       
        
    }
}
