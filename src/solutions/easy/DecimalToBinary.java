/*
 * Write a Recursive Procedure to Convert a Decimal Number to a Binary Equivalent.
 * Constraints: 0 <= n <= 10^9
 */

package solutions.easy;

import core.Solution;
import java.util.Scanner;

public class DecimalToBinary implements Solution {
  private String decimalToBinary(int number) {
    if (number == 0) {
      return "0";
    }
    if (number == 1) {
      return "1";
    }
    return decimalToBinary(number / 2) + (number % 2);
  }

  @Override
  public void solve() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      System.out.println(decimalToBinary(number));
    }
  }
}
