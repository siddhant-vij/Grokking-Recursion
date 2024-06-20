/*
 * Write Recursive Approach to Implement Binary Search Algorithm.
 */

package solutions.medium;

import core.Solution;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch implements Solution {
  private int binarySearchIterative(int[] arr, int key) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (arr[mid] == key) {
        return mid;
      } else if (arr[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  private int binarySearchHelper(int[] arr, int key, int start, int end) {
    if (start > end) {
      return -1;
    }
    int mid = (start + end) / 2;
    if (arr[mid] == key) {
      return mid;
    } else if (arr[mid] < key) {
      return binarySearchHelper(arr, key, mid + 1, end);
    } else {
      return binarySearchHelper(arr, key, start, mid - 1);
    }
  }

  private int binarySearchRecursive(int[] arr, int key) {
    return binarySearchHelper(arr, key, 0, arr.length - 1);
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
      Arrays.sort(arr); // Sorting the array for binary search
      System.out.print("Enter the key element: ");
      int key = sc.nextInt();
      System.out.println(binarySearchIterative(arr, key));
      System.out.println(binarySearchRecursive(arr, key));
    }
  }
}
