/*
 * Write a Recursive Solution to Count occurrences of an Element in an Array.
 */

package solutions.easy;

import core.Solution;
import java.util.Scanner;

public class NumberFrequency implements Solution {
  private int count(int[] arr, int key, int index) {
    if (index == arr.length) {
      return 0;
    }
    if (arr[index] == key) {
      return 1 + count(arr, key, index + 1);
    }
    return count(arr, key, index + 1);
  }

  private int countOccurrences(int[] arr, int key) {
    return count(arr, key, 0);
  }

  @Override
  public void solve() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the array size: ");
      int number = sc.nextInt();
      int[] arr = new int[number];
      System.out.print("Enter the array elements: ");
      for (int i = 0; i < number; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.print("Enter the key element: ");
      int key = sc.nextInt();
      System.out.println(countOccurrences(arr, key));
    }
  }
}
