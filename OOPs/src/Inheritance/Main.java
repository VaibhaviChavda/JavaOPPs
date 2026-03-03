/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Vaibhavi
 */
public class Main {
    public static void main(String[] args) {
        //calling Boxweight that is inherited from Box
        BoxWeight b3 = new BoxWeight();
        System.out.println( "Child class  " + b3.weight +  "  " + " Parents class" + b3.h);
        
        //now we can also acceess the parents properties
        BoxWeight b4 = new BoxWeight(3,5,7,2);
        
//        //call default constructor
//        Box b = new Box();
//        System.out.println(b.h);
//        System.out.println(b.l);
//        System.out.println(b.w); 
//        
//        //call parameterized constructor
//        Box b1 = new Box(6.0);
//        System.out.println(b1.h);
//        System.out.println(b1.l);
//        System.out.println(b1.w);
//        
//        //call the old constructor that accept box 
//        Box b2 = new Box(b1);
//        System.out.println(b2.h);
//        System.out.println(b2.l);
//        System.out.println(b2.w);
   }
   
}
