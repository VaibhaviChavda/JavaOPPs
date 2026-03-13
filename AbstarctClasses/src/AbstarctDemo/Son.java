/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstarctDemo;

/**
 *
 * @author Vaibhavi
 */

//the child class have to override all the abstract methods of parent class
public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    //we can override normal methods also
    @Override
    void normal() {
        super.normal(); 
    }
        
    @Override
    void career() {
        System.out.println("i am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("good partner" );
    }
    
    
}
