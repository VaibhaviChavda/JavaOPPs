/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author Vaibhavi
 */
class Temp{
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    Temp(){
        this(5);
        System.out.println("The default constructor");
    }
    // parameterized constructor 2
    Temp(int x ){
        this(5,25);
        System.out.println(x);
    }
    // parameterized constructor 3
    Temp(int x , int y){
        System.out.println(x*y); 
   }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        // invokes default constructor first
        new Temp();
    }
}
