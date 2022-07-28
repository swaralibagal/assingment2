/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program11;

/**
 *
 *  * 
Java Program to Find Factorial
 */
public class program11{
    public static void main(String[] args){
          int fact=1,no=5,i;
          for(i=1;i<=no;i++)
          {
               fact=fact*i;
          }
            System.out.println(+fact+" is the factorial of the given number!!!!");
      }
}
