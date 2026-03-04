/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Vaibhavi
 */
//multilevel inheritance : - a class is derived from another derived class,
public class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice() {
        super();
        this.cost = -1;
    }

     BoxPrice(BoxPrice other){
       this.cost = other.cost;
    }

    public BoxPrice(double cost, double l, double h, double w, double weight) {
        super(l, h, w, weight);
        this.cost = cost;
    }
    public BoxPrice(double side, double weight,double cost) {
        super(side,weight);
        this.cost = cost;
    }

   
     
}
