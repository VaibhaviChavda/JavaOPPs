/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Vaibhavi
 */ 
//when child class has same method name as parent class
//everything is same(parameter,return type) but just a body is different
//below  parent class Shapes has area method ,
//and we override that area() method in Circle
//using @Override notation

//type of method in overriding that is called that is depednd on what the type of object
public class Circle extends Shapes {
    void area(){
        System.out.println("area is pie * r * r ");
    }
}
