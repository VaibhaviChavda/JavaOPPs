/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstarctDemo;

/**
 *
 * @author Vaibhavi
 */

//why we use abstract class: 
//when we  know that methods in the parent class needs to be overriden 
//then we have to make it abstract

//when we have more than one abstract method in classs
//then we have to declare that class abstarct 
//abstract method do not have any body just a declaration

//you can't final abstract class because abstract class hould be inherite
//but final class not allow it
abstract public class Parent {
    int age;

    //constructor of abstract class
    public Parent(int age) {
        this.age = age;
    }
    
    //we can not create abstract constructors
   // abstract Parent();
    
    //we can't create sbstract static methods
   //because abstract class need to be overriden but static method can not be overriden
   // abstract static box();
    
    //but we can create static methods in abstract classes
    static void box(){
        System.out.println("this is static method inside abstract class");
    }
    
    //you can create normal methods
    void normal(){
        System.out.println("this is normal methods"); 
   }
    abstract void career();
    abstract void partner();
    
}
