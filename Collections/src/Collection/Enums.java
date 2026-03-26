/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author Vaibhavi
 */
public class Enums {
    enum week{
            //type is week
            //these arew enum constants
            //public , static and final
            //since it's final you can not create child enums 
            monday,tuesday,wednesday,thursday,friday,saturday;
            week(){
                System.out.println("constaructor called for " + this.toString()); 
           }
            //this is not public or protected only private or default
        }
    public static void main(String[] args) {
        week w;
        w = week.monday;
        System.out.println(w);
        for(week day : week.values()){
            System.out.println(day);
        }
        System.out.println(w.ordinal());
    }
}
