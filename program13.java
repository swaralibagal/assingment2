/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program13;

/**
 *
 * Java Program to Display Fibonacci Series
 */
public class program13 {
     public static void main(String[] args){
         int first=0, second=1,third,no=5,i;
           System.out.println("Fibbonanacii series:"+first+" "+second+"   ");
           for(i=2;i<no;i++)
           {
                third =first + second;
                first= second;
               second = third;
                
               System.out.println(+third+" ");
              
               
           }
     }
    
}
