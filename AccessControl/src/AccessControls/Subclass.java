/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccessControls;

/**
 *
 * @author Vaibhavi
 */
public class Subclass extends A {
    
    public Subclass(int num, String name) {
        super(num, name);
    }
    
    public static void main(String[] args) {
        Subclass obj = new Subclass(44,"vaibhavi");
        obj.getNum();
        obj.setNum(20);
        
        //we can access in same package protected members
        //but outside of the package we can't access (only subclass can access in different package)
        //also in  outside sub class we can't access
        obj.age = 90;
        System.out.println(obj.age);
        
    }
    
}
