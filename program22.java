/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * Java Program to Check Whether a Number is Palindrome or Not
 */
public class program22 {
        public static void main(String[] args){
            int rev=0,no=454,rem;
            int temp=no;
        while(no>0)
        {
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
         System.out.println(+rev+" is the reverse number!!!");
           
        
         if(temp == rev)
        {
               System.out.println(+temp+" is palindrome!!!!!!");
        }
        else
        {
             System.out.println(+temp+" is not palindrome!!!!!!");
            
        }
     }
}
  
 

