/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Vaibhavi
 */
//1 - compile time polymorphism(static)
//achieved via method overloading
public class Numbers {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Numbers n = new Numbers();
        n.sum(3,3);
        n.sum(4, 6, 6);
        
    }
}
