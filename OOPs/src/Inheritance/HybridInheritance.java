/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Vaibhavi
 */
//combination of two or more types of inheritance
//Java does not support hybrid inheritance using
//classes but it can be implemented using interfaces.

interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("From B");
    }
}

class C implements A {
    public void show() {
        System.out.println("From C");
    }
}

class D extends B {
    void display() {
        System.out.println("From D");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
        obj.display();
    }
}
