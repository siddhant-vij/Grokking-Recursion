/*
 * Write a Recursive Approach to Check if a Given Digit String Represents a Good Number.
 * A digit string is good if the digits (0-indexed) at even indices are even and the digits at odd indices are prime ((2, 3, 5, or 7).
 */

package solutions.hard;

import java.util.Scanner;
import core.Solution;

public class GoodNumber implements Solution {

  private boolean isEvenDigit(int number) {
    return number % 2 == 0;
  }

  private boolean isPrimeDigit(int number) {
    return number == 2 || number == 3 || number == 5 || number == 7;
  }

  private boolean helper(String number, int index) {
    if (index == number.length()) {
      return true;
    }
    int digit = number.charAt(index) - '0';
    if (index % 2 == 0 && !isEvenDigit(digit)) {
      return false;
    }
    if (index % 2 == 1 && !isPrimeDigit(digit)) {
      return false;
    }
    return helper(number, index + 1);
  }

  private boolean isGoodNumber(String number) {
    return helper(number, 0);
  }

  @Override
  public void solve() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      String number = sc.next();
      System.out.println(isGoodNumber(number));
    }
  }
}
