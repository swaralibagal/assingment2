/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 *Java Program to Remove all Characters in a String Except Alphabets.
 */
public class program52
{
	// Remove all characters other than alphabets from string
	public void removeNonAlphabets(String text)
	{
		// Get the length
		int n = text.length();
		if (n == 0)
		{
			return;
		}
		String result = "";
		int i = 0;
		while (i < n)
		{
			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z' || 
                (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'))
			{
				// When alphabets character
				result = result + text.charAt(i);
			}
			i++;
		}
		System.out.println(" Given text : " + text);
		System.out.println(" Result     : " + result);
	}
	public static void main(String[] args)
	{
		program52 task = new program52();
		// Test
		task.removeNonAlphabets("!*&3M'?an/<go_,j#u$$ic^e(&)");
		task.removeNonAlphabets("5@23A23B.C");
	}
}
      

