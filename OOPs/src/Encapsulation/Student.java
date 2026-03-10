/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author Vaibhavi
 */

//wrapping up the implementation of data members and the methods inside class
class std{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age>0 && age<=120){
            this.age = age;
        }
        else{
            System.out.println("invalid age");
        }
    }
    public int getAge(){
        return age;
    }
}
public class Student {
    public static void main(String[] args) {
        std s = new std();
        s.setName("vaibhavi");
        s.setAge(20);
        System.out.println(s.getAge());
        System.out.println(s.getName());
   }
    
}
