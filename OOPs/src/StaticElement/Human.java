/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticElement;

/**
 *
 * @author Vaibhavi
 */

//when a memeber is declared is static it can be accessed before
//any of the object of class has been created and without refrencing to the object
// you can declare both methds and variable as static

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    //static : such properties that are not directly related to
    //object are called static (object independent)
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
    
       
}
