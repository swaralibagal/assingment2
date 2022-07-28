/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program7;

/**
 *
Java Program to Find Largest Number Among Three Numbers
 */
public class program7  {
     public static void main(String[] args){
         int a,b,c;
         a=10;
         b=20;
         c=4;
         if(a>b )
         {
             if(a>c)
             {
                   System.out.println(+a+" is greater!!!");
             }
             else
             {
             System.out.println(+c+" is greater!!!");
             }
         }
         else if(b>c)
             {
                System.out.println(+b+" is greater!!!");  
             }
             else{
                     System.out.println(+c+" is greater!!!");   
                  }
     }
    
}

    

