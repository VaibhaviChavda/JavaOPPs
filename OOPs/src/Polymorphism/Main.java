/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Vaibhavi
 */
//polymorphism : act of representing same thing in multiple ways
//below area() method is example that 
//in all different class it is working differently
public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        shape.area();
        circle.area();
        square.area();
        
    }
}
