/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * Increment ++ and Decrement -- Operator Overloading in Java Programming
 */
public class program18 {
    public static void main(String[] args){
          System.out.println("********Increment Opertaion*******");
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;
        d = a++;
        c++;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("d = " +d);
        
        System.out.println("********Decrement Opertaion*******"); 
        int t = 1;
        int o= 2;
        int z;
        int y;
        z = --o;
        y = t--;
        z--;
        System.out.println("t = " +t);
        System.out.println("o = " +o);
        System.out.println("z = " +z);
        System.out.println("y = " +y);
        
    }
    
}
