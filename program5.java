/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program5;

/**
 *
 * Java Program to Check Whether Number is Even or Odd
 */
import java.util.Scanner;
public class program5 {
     public static void main(String[] args){
         Scanner read = new Scanner(System.in);  
         int x;
         System.out.println("Enter the value:");
         x=read.nextInt();
         if(x%2==0)
         {
              System.out.println(x+"is even!!!"); 
         }
         else
         {
               System.out.println(x+"is odd!!!");
         }
     }
}
