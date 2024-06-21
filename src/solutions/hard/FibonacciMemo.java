/*
 * Print Fibonacci Series Using Memoization and Recursion.
 * Given a positive integer n, print the Fibonacci series up to the nth term using memoization and recursion.
 */

package solutions.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import core.Solution;

public class FibonacciMemo implements Solution {
  private Map<Integer, Integer> memoTable = new HashMap<>();

  private int fibonacci(int number) {
    if (number == 0 || number == 1) {
      return number;
    }
    if (memoTable.containsKey(number)) {
      return memoTable.get(number);
    }
    int result = fibonacci(number - 1) + fibonacci(number - 2);
    memoTable.put(number, result);
    return result;
  }

  private List<Integer> generateFibonacciSeries(int number) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i <= number; i++) {
      result.add(fibonacci(i));
    }
    return result;
  }

  @Override
  public void solve() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      System.out.println(generateFibonacciSeries(number));
    }
  }
}
