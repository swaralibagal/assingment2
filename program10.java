/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program10;

/**
 *
 *Java Program to Check Leap Year
 */
public class program10 {
     public static void main(String[] args){
         
    int year=2024;
    if(year %4==0)
    {
         System.out.println(+year+" is a leap year!!!!");
    }
    else
    {
           System.out.println(+year+" is not a leap year!!!!");  
    }
 }
}