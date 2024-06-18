/*
 * Calculate the Sum of the First N Natural Numbers Using a Recursive Approach.
 * The sum of first N natural numbers is equal to N + (N-1) + (N-2) + ... + (3) + (2) + (1).
*/

package solutions.easy;

import core.Solution;
import java.util.Scanner;

public class BasicSum implements Solution {
  private int calculateSum(int n) {
    if (n == 0) {
      return 0;
    }
    return n + calculateSum(n - 1);
  }

  @Override
  public void solve() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      System.out.println(calculateSum(number));
    }
  }
}
