/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Vaibhavi
 */
//types of polymorphism :
//1 - compile time polymorphism(static)
//achieved via method overloading


//method overloading : class has multiple methods of same name but,
//but the number, type of parameter, and return type can be different(ex: multiple constructor)
//java determites which method or constructor  will be called at compile time

//2 - runtime polymorphism(dynamic)
//achieved by method overriding

//when child class has same method name as parent class
//everything is same(parameter,return type) but just a body is different
public class Shapes {
    void area(){
        System.out.println("I am in Shapes"); 
   }
}
