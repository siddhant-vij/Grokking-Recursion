/*
 * Write a Recursive Solution to Check if a Given Number is a Prime Number or Not.
 * A prime number is a number greater than 1 that has no positive divisors other than 1 and the number itself.
 */

package solutions.easy;

import core.Solution;
import java.util.Scanner;

public class CheckPrime implements Solution {
  private boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }
    if (number == 2) {
      return true;
    }
    if (number % 2 == 0) {
      return false;
    }
    return checkDivisors(number, 3);
  }

  private boolean checkDivisors(int number, int divisor) {
    if (divisor * divisor > number) {
      return true;
    }
    if (number % divisor == 0) {
      return false;
    }
    return checkDivisors(number, divisor + 2);
  }

  @Override
  public void solve() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      System.out.println(isPrime(number));
    }
  }
}
