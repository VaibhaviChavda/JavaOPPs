/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;
/**
 *
 * @author Vaibhavi
 */
class A{
    final int num = 10;
    String name ;
    
    public A(String name){
        System.out.println("Object is created ");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
    
    
}
//Objects are created in the heap memory.
//When no live reference points to an object, it becomes eligible for garbage collection.
//The Garbage Collector (GC) reclaims that memory so it can be reused.
public class GarbageColletion {
    public static void main(String[] args) {
        A obj;
        for(int i = 0;i<1000000;i++){
            obj  = new A("Random name");
        }
        
    }
}

