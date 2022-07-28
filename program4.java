/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program4;

/**
 *Java Program to Swap Two Numbers
 *
 */
public class program4 {
      public static void main(String[] args){
          int x=10;
          int y=20;
          int temp;
          
          System.out.println("Before swapping value of X:" +x+ "  Y:" +y);
          temp=x;
          x=y;
          y=temp;
            System.out.println("After swapping value of X:" +x+ "  Y:" +y);
      }
    
}
