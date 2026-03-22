/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generic;

import java.util.ArrayList;

/**
 *
 * @author Vaibhavi
 */
public class CustomGenericArrayList<T> {
    private T[] data;
    private static int DEFAULT_SIZE = 10;
    public int size =0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
        
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    
    private boolean isFull(){
        return size == data.length;
    }
    
    private void resize(){
        int[] temp = new int[data.length * 2];
        //copy the current items in new array
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    
    public int remove(){
        int remove = data[--size];
        return remove;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index] = value;
    }


    
    
    public static void main(String[] args) {
       
        
       
    }
}
