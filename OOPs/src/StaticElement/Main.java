/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticElement;


/**
 *
 * @author Vaibhavi
 */
public class Main {
    public static void main(String[] args) {
        Human v = new Human(22,"vaibhavi",25000,false);
        Human r = new Human(34,"Rahul",14000,false);
       // we can directly access static variable by class name (so it's not dependent on objects)
       // use it by class name 
        System.out.println(Human.population +  "  by class name"); 
        
        //not by object of class 
       System.out.println(v.population);//static variable of class
        System.out.println(r.population);//static variable of class
        
        
        //we can't access non - static method in static methd
        //because non-static belongs to the object
        //greeting() it will give an error
        
        //we can access static method in 
        //so static method can only access static data can't access static data
        greetings();
     
    }
     
    void greeting(){
        System.out.println("Hello");
        //but it allows static member in non static
        greetings();
    }
    static void greetings(){
        System.out.println("Hello"); 
   }
}
