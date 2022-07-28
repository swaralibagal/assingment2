/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * Java Program to Check Whether a Number can be Express as Sum of Two Prime Numbers
 */
public class program32 {
     public static void main(String[] args) {
    int number = 34;
    boolean flag = false;
    for (int i = 2; i <= number / 2; ++i) {

      // condition for i to be a prime number
      if (checkPrime(i)) {

        // condition for n-i to be a prime number
        if (checkPrime(number - i)) {

          // n = primeNumber1 + primeNumber2
          System.out.printf("%d = %d + %d\n", number, i, number - i);
          flag = true;
        }

      }
    }

    if (!flag)
      System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
  }

  // Function to check prime number
  static boolean checkPrime(int num) {
    boolean isPrime = true;

    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }

    return isPrime;
  }
}
    

