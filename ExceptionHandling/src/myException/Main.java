/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myException;

/**
 *
 * @author Vaibhavi
 */
public class Main {
    public static void main(String[] args) {
        try{
            String name = "vaibhavi";
            if(name.equals("vaibhavi")){
                throw new MyException("name is vaibhavi");
            }
        }
        catch(MyException e  ){
            System.out.println(e.getMessage()); 
       }
    }
}
