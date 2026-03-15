/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Vaibhavi
 */

//below the customarraylist one problem is that we can only add integer type data
//to solve this problem we have to use generics that allows to add different data type
public class CustomArrayList {
    private int[] data;
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
        CustomArrayList list = new CustomArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.get(3));//5
        for(int i = 0;i<list.size;i++){
            System.out.println(list.get(i));
        }
        
        ArrayList l = new ArrayList();
        
       
    }
}
