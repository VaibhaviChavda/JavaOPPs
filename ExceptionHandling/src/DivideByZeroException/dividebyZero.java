/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DivideByZeroException;

/**
 *
 * @author Vaibhavi
 */
public class dividebyZero {
    public static void main(String[] args) {
        try{
            System.out.println(divide(30, 0)); // using throw and throws
            int m = 100;
            int n = 0;
            int k = m/n;
            System.out.println("K: " + k);
        }
        catch(ArithmeticException ae){
            System.out.println("can't divide by zero");
        }
        finally{
            System.out.println("it will alway executed");
        }
        
        
        
    }
    static int divide(int a, int b) throws ArithmeticException{
            if(b==0){
                throw new ArithmeticException("can not divide by zero");
            }
            return a/b;
        } 
}
