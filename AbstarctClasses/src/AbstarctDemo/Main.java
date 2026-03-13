/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstarctDemo;

/**
 *
 * @author Vaibhavi
 */

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        son.career();
        Daughter d = new Daughter(19);
        d.career();
        
        //you can't create object of  abstract class
        // Parent p = new Parent();
        
        //but you can use parent class as a reference variable
        Parent daughter = new Daughter(20);
        daughter.career();
        
        //we can call static methods using class
       Parent.box();
        
        
    }
}
