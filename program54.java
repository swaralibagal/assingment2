/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 *Java Program to Concatenate Two Strings
 */
import java.util.*;
public class program54 {
    public static void main(String args[])
	{
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st string");
	 	str1=sc.nextLine();
		System.out.println("Enter the 2nd string");
	 	str2=sc.nextLine();
  		System.out.println("Concatenated String is ");
  		System.out.println(str1.concat(str2));
	}
}

