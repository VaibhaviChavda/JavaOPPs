/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Vaibhavi
 */
//parent class (base class)
public class Box {
    double l;
    double h;
    double w;
    
    //private member
    private double b;
    
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
        this.b = -1;
    }
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    public void Displayinfo(){
        System.out.println("Running the box" );
    } 
}
