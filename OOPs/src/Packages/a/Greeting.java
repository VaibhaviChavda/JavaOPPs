/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages.a;

//import message method from a package where myMeg method is written
import static Packages.a.Message.myMeg;

/**
 *
 * @author Vaibhavi
 */
public class Greeting {
    public static void main(String[] args) {
        System.out.println("we can create same file with different use case in different packages");
       myMeg();
    }
}

