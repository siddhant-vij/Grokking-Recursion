/*
 * Write Recursive Approach for Merge Sort.
 */

package solutions.medium;

import core.Solution;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort implements Solution {
  private int[] merge(int[] left, int[] right) {
    int[] result = new int[left.length + right.length];
    int i = 0, j = 0, k = 0;
    while (i < left.length && j < right.length) {
      if (left[i] < right[j]) {
        result[k++] = left[i++];
      } else {
        result[k++] = right[j++];
      }
    }
    while (i < left.length) {
      result[k++] = left[i++];
    }
    while (j < right.length) {
      result[k++] = right[j++];
    }
    return result;
  }

  private int[] mergeSort(int[] arr) {
    if (arr.length <= 1) {
      return arr;
    }
    int mid = arr.length / 2;
    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
    return merge(left, right);
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
      System.out.println("Sorted array: " + Arrays.toString(mergeSort(arr)));
    }
  }
}
