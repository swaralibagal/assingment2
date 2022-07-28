/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * Java Program to Make a Simple Calculator to Add, Subtract, Multiply or Divide Using switch...case
 */
import java.util.Scanner;
public class program29 {
      public static void main(String[] args){
          int a=10,b=5,c;
          char ch='b';
          System.out.println("A.Addition");
          System.out.println("B.Subtraction");
          System.out.println("C.Multiplication");
          System.out.println("D.Division");
          switch(ch)
          {
             
               case 'a': c=a+b;
                     System.out.println(+c+" is the addition of two number!!!");
                     break;
               
                case 'b': c=a-b;
                     System.out.println(+c+" is the subtraction of two number!!!");
                     break;
                 
                case 'c': c=a*b;
                     System.out.println(+c+" is the multiplication of two number!!!");
                     break;
                   
                case 'd': c=a/b;
                     System.out.println(+c+" is the divisionof two number!!!");
                     break;
          }
      }
    
}
