/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program6;

/**
 *
 *Java Program to Check Whether a character is Vowel or Consonant.
 */
import java.util.Scanner;
public class program6 {
          public static void main(String[] args){

        Scanner read = new Scanner(System.in); 
        char x;
        System.out.print("Enter the character:");
        x=read.next().charAt(0);  
       if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A'|| x=='E'|| x=='I'|| x=='O' || x=='U')
       {
           System.out.print("Character is vowel!!!");  
       }
     else
     {
         System.out.print("Character is not vowel!!!");  
     }
          }
}