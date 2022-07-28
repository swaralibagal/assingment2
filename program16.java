/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * Java Program to Reverse a Number
 */
public class program16 {

    public static void main(String[] args){
        int rev=0,no=123,rem;
        while(no>0)
        {
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
         System.out.println(+rev+" is the reverse number!!!");
    }
}
