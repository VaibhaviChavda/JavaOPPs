/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Vaibhavi
 */

//you can use interface to acieve multiple inheritance
//we have override all the methods because all are abstract
public class Car implements Engine,Break,Media{

    @Override
    public void start() {
        System.out.println("I start  engine like a normal car"); 
   }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car"); 
   }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }

    @Override
    public void brk() {
        System.out.println("I break like normal class");
    }
    public static void main(String[] args) {
        
    }
}
