/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Vaibhavi
 */
public class PowerEngine implements  Engine{

    @Override
    public void start() {
        System.out.println("power engine start");
    }

    @Override
    public void stop() {
System.out.println("power engine stop");    }

    @Override
    public void acc() {
System.out.println("power engine acc");    }
    
}
