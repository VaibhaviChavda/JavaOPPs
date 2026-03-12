/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccessControls;

/**
 *
 * @author Vaibhavi
 */
public class A {
    //private memeber - you can it anywhere in this file
    private int num;
    
    //to access it we have to use getter and setter
    //but this method is public so we can access it from aywhere
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
        System.out.println(num); 
   }
    
    //public member - means you can access it anywhere
    public String name;
    
    //protected member 
    protected int age;
    
    //when you not specify is called default 
    //it will allow only in same package
    //in different package it will not allow
    int[] arr;
    
    public A(int num,String name){
        this.num = num;
        this.name =  name;
        this.arr = new int[num];
    }
    
}
