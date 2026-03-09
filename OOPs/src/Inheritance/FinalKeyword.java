/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import Polymorphism.Shapes;

/**
 *
 * @author Vaibhavi
 */
//if we declare class as final , so implicitly it will declare all methods final
final class sh{
    void area(){
        System.out.println("i am in shape class");
   }
    
}


//it will not allow to inherite sh class because it is final class
//public class FinalKeyword  extends sh{
//    
//}
