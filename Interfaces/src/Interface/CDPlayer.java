/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Vaibhavi
 */
public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Music start"); 
   }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
    
}
