/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 *Java Program to Find G.C.D Using Recursion
 */
public class program35 {
    
    public static void main(String[] args) {
        int n1 = 60, n2 = 6;
        int hcf = hcf(n1, n2);

        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
    }

    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
}

