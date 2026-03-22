/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cloning;

/**
 *
 * @author Vaibhavi
 */

public class Main {
    public static void main(String[] args)throws CloneNotSupportedException {
        //clone is the method in object class 
       //that can be used to make this copies
        Human v = new Human(4,"vaibhavi");
        Human twin  = new Human(v);
        System.out.println(twin.name + " " + twin.age);
        
        Human twin2 = (Human)v.clone();
        System.out.println(twin2.name + " " + twin2.age);
        
    }
}
