/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Vaibhavi
 */
//example of single inheritance ( one class extends another class) 
//extends is used to inherite the parent class
//child class (sub class)
public class BoxWeight extends Box {
    double weight;
    public BoxWeight(){
         this.weight = -1;
    }
    //super keyword is used to call constructor of super class
    public BoxWeight(double l, double h,double w,double weight){
        //used to initialize values of parent class
        
        //but we can't access private memebers of parents class(it will not allow)
//        super.b = b; // give an error
        super.l = l;
        super.h = h;
        super.w = w;
        this.weight = weight;
    }

    public BoxWeight(double weight, double side) {
        super(side);
        this.weight = weight;
    }
    
    
}
