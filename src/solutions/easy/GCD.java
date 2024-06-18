/*
 * Write recursive code to calculate the Greatest Common Divisor (GCD) of Two Positive Numbers.
 * The greatest common divisor (GCD) of two positive integers A and B is the largest positive integer that divides both A and B without leaving a remainder.
 */

package solutions.easy;

import core.Solution;
import java.util.Scanner;

public class GCD implements Solution {
  private int calculateGCD(int number1, int number2) {
    if (number2 == 0) {
      return number1;
    }
    return calculateGCD(number2, number1 % number2);
  }

  @Override
  public void solve() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter two numbers: ");
      int number1 = sc.nextInt();
      int number2 = sc.nextInt();
      System.out.println(calculateGCD(number1, number2));
    }
  }
}
