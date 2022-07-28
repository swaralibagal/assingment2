/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 *Java Program to Calculate Average of Numbers Using Arrays
 */
public class program41 {
    public static void main(String[] args) {
 
        double[] arr = {19, 12.89, 16.5, 200, 13.7};
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }


        /* arr.length returns the number of elements 
         * present in the array
         */
        double average = total / arr.length;
        
        /* This is used for displaying the formatted output
         * if you give %.4f then the output would have 4 digits
         * after decimal point.
         */
        System.out.format("The average is: %.3f", average);
    }
}
    

