/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccessControls;

/**
 *
 * @author Vaibhavi
 */
public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"vaibhavi");
        //we can't access because num is private
         // obj.num;
         //we can access it by getter and setter
        obj.getNum();
        obj.setNum(12);
        String name = obj.name;
        System.out.println(name); 
   }
}
