/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Vaibhavi
 */
class boxes{
    static void greeting(){
        System.out.println("hey , i am in box, greeting");
    }
}
public class StaticKeyword extends boxes{
   
    //we can overide static method 
//    @Override - not allow
    
    //static method can be innherited but can not be overriden
   static void greeting(){
        System.out.println("hey , i am in box,  in static keyword");
    }
    public static void main(String[] args) {
            boxes box1 = new boxes();
            box1.greeting();
            
           //call parent class method
           //method of parent class always run no matter by whichobject you it 
           boxes b = new StaticKeyword();
           b.greeting();
    }
}
