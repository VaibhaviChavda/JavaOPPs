/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Vaibhavi
 */
public class A implements B{
    //static interface methods should have body
    //call via the interface 
    static void greeting(){
        System.out.println("I am static method");
    }
    
    public static void main(String[] args) {
        A obj = new A();
        B.greeting();
    }
}
