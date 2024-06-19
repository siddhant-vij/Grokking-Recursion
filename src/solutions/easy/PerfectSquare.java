/*
 * Write a Recursive Solution to Check if a Given Number is a Perfect Square or Not.
 * A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
 */

package solutions.easy;

import core.Solution;
import java.util.Scanner;

public class PerfectSquare implements Solution {
  private boolean isPerfectLinear(int number, int divisor) {
    if (divisor * divisor > number) {
      return false;
    }
    if (number % divisor == 0 && number / divisor == divisor) {
      return true;
    }
    return isPerfectLinear(number, divisor + 1);
  }

  private boolean isPerfectSquareLinear(int number) {
    return isPerfectLinear(number, 1);
  }

  private boolean isPerfectBinary(int number, int left, int right) {
    if (left > right) {
      return false;
    }
    int mid = left + (right - left) / 2;
    if ((long) mid * mid == number) {
      return true;
    }
    if ((long) mid * mid > number) {
      return isPerfectBinary(number, left, mid - 1);
    }
    return isPerfectBinary(number, mid + 1, right);
  }

  private boolean isPerfectSquareBinary(int number) {
    return isPerfectBinary(number, 0, number);
  }

  @Override
  public void solve() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      System.out.println(isPerfectSquareLinear(number)); // Chances of stack overflow
      System.out.println(isPerfectSquareBinary(number));
    }
  }
}
