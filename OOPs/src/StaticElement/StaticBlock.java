/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticElement;

/**
 *
 * @author Vaibhavi
 */
public class StaticBlock {
    static int a =6;
    static int b;
    
    //will only runs once when first obj is created ex, when the class is loaded for first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a  + "  " + StaticBlock.b);
        StaticBlock.b += 3;
        
        StaticBlock obj2 = new StaticBlock();
         System.out.println(StaticBlock.a  + "  " + StaticBlock.b);
    }
}
