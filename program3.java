/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program3;

/**
 *
 *Java Program to Find Size of int, float, double and char in Your System
 */
public class program3 {
     public static void main(String[] args){
   System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
  System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
  System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
  System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
  System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
     } 
}
