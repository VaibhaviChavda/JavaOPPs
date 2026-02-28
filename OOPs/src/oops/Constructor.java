/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author Vaibhavi
 */
class Students{
    int rno;
    String name;
    double marks;
    
    // constructor : special type of function inside class (automatically call when class object is create)
    // it will run when you create an object, and used to assign value to instance variable
    // same name as class
    // this keyword : is a reference variable that refers to the current object. It is used
    //within an instance method or a constructor to refer to the current object 
    //default constructor:
    
    Students(){
        this.rno = 13;
        this.name = "vaibhavi";
        this.marks = 89;
    }
    
   //Parametrized constructor
    Students(int rno,String name,double marks){
        this.rno = rno;
        this.name = name;
       
    }
    
    //method
    void greeting(){
        System.out.println("Hello " + name);
    }
    
    Students (Students other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks =other.marks;
    } 
    
}
public class Constructor {
    public static void main(String[] args) {
        
        Students s1  = new Students();
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        
        Students s2 = new Students(101,"riya",88);
        System.out.println(s2.rno);
        System.out.println(s2.name);
        System.out.println(s2.marks);
        
        Students random = new Students(s1);
        System.out.println(random.name);
        System.out.println(random.rno);
        System.out.println(random.marks); 
       
        //calling method
        s1.greeting();
        s2.greeting();
    }
}
