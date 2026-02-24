/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author Vaibhavi
 */
public class First {
    public static void main(String[] args) {
        //when we not give value
        Student s = new Student();
        System.out.println(s.rno); // 0
        System.out.println(s.name); //null
        System.out.println(s.marks); //0.0
        
        Student s1 = new Student();
        s1.rno = 101;
        s1.name = "vaibhavi";
        s1.marks = 89.9;
        System.out.println(s1.rno + " " + s1.name + "  " + s1.marks);
    }

}
//create class
//for every single student

class Student {

    int rno;
    String name;
    double marks;
}

