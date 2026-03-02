/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticElement;

/**
 *
 * @author Vaibhavi
 */
public class Singleton {

    // you can constaructor call only  in this file
   private Singleton() {
       
    }
   private static Singleton instance;
   public static Singleton getinstance(){
       //check whether 1 obj only is created or not
       if(instance == null){
           instance = new Singleton();
       }
       return instance;
   }
    public static void main(String[] args) {
        //all three refrence variable  wil pointing  to the same object
        Singleton s1= new Singleton();
        Singleton s2= new Singleton();
        Singleton s3= new Singleton();
        
    }
    
}
