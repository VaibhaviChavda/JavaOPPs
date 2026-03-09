/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;
/**
 *
 * @author Vaibhavi
 */
class shape{
    //final keyword used to prevent overriding
    //final used to prevent inheritance
     final void area(){
        System.out.println("i am in shape");
    }
}
public class ObjectPrint extends shape{
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }
    
  //early binding  
    //it will give an error we can not override final method
//    @Override
//    void area(){
//        System.out.println("sdfgh"); 
//   }
    
    @Override
    public String toString(){
        return "ObjectPrint{" + "num=" + num + '}';
    }
    
    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(6);
        System.out.println(obj);
        
    }
}
