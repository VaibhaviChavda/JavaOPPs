/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Vaibhavi
 */

//multilevel inheritance BoxPrice is inherited from BoxWeight
//that BoxWeight is also inherited from Box class 

//multiple inheritance : one class is extending more than one class ( we can do it by  interfaces) 
//multiple inheritance not supported by java 
// because If two parent classes have the same method,
//the child class will get confused about which method to use.



public class MultilevelInheritance {
    public static void main(String[] args) {
        BoxPrice box = new BoxPrice(5,8,200);
        System.out.println(box.weight);
        System.out.println(box.cost);
        
    }
}
