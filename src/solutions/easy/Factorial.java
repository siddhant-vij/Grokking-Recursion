/*
 * Calculate the Factorial of a Positive Number Using Recursion.
 * The factorial of a non-negative integer N, denoted as N!, is the product of all positive integers less than or equal to N. The factorial of 0 is defined as 1.
*/

package solutions.easy;

import core.Solution;
import java.util.Scanner;

public class Factorial implements Solution {
  private int calculateFactorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * calculateFactorial(n - 1);
  }

  @Override
  public void solve() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      System.out.println(calculateFactorial(number));
    }
  }
}
