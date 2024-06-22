/*
 * Write a Recursive Approach to Calculate Power of Integer to N Pow(x,n).
 * Given an integer x and an integer n, write a recursive function to calculate the power of x to the nth power.
 * Constraints:
  * -100.0 < x < 100.0
  * -2^31 <= n <= 2^31-1
  * n is an integer.
  * Either x is not zero or n > 0.
  * -10^4 <= x^n <= 10^4
 */

package solutions.hard;

import core.Solution;
import java.util.Scanner;

public class PowXN implements Solution {
  private double powLinear(double number, int power) {
    if (power == 0) {
      return 1;
    }
    if (power < 0) {
      return 1 / powLinear(number, -power);
    }
    return number * powLinear(number, power - 1);
  }

  private double powDivideAndConquer(double number, int power) {
    if (power == 0) {
      return 1;
    }
    if (power < 0) {
      return 1 / powDivideAndConquer(number, -power);
    }
    if (power % 2 == 0) {
      return powDivideAndConquer(number * number, power / 2);
    } else {
      return number * powDivideAndConquer(number, power - 1);
    }
  }

  @Override
  public void solve() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number: ");
      double number = sc.nextDouble();
      System.out.print("Enter the power: ");
      int power = sc.nextInt();
      System.out.println(powLinear(number, power));
      System.out.println(powDivideAndConquer(number, power));
    }
  }
}
