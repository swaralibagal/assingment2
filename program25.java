/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * Java Program to Check Armstrong Numberr
 */
public class program25 {
    public static void main(String[] args){
          int sum=0,no=153,rem;
          int temp=no;
        while(no>0)
        {
            rem=no%10;
            sum=(int) (sum + Math.pow(rem,3));
            no=no/10;
        }
        // System.out.println(+sum+" is the reverse number!!!");
         
        if(temp==sum)
        {
                System.out.println(+temp+" is the Armstrong number!!!"); 
        }
        else
        {
            
                System.out.println(+temp+" is not Armstrong number!!!"); 
        }
        
    }
    
}
