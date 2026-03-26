/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Vaibhavi
 */
public class Main {
    public static void main(String[] args) {
      List<Integer> l = new ArrayList<Integer>();
      List<Integer> list = new LinkedList<Integer>();
      l.add(2);
      l.add(3);
      
      list.add(4);
      list.add(6);
      
        System.out.println( list.get(0));
        System.out.println( l.get(0));
    }
}
