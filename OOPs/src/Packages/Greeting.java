/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;
// we can import in outside the a package when we have public method
// we can't use private methods outside packages 
import static Packages.a.Message.myMeg;

/**
 *
 * @author Vaibhavi
 */
//package is a container of classes and interface

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello world");
        myMeg();
                
    }
}

