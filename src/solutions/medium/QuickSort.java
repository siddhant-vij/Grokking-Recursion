/*
 * Write Recursive Approach for Quick Sort.
 */

package solutions.medium;

import core.Solution;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort implements Solution {
  private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  private int partition(int[] arr, int start, int end) {
    int pivot = arr[end];
    int i = start - 1;
    for (int j = start; j < end; j++) {
      if (arr[j] <= pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, end);
    return i + 1;
  }

  private void quickSort(int[] arr, int start, int end) {
    if (start < end) {
      int p = partition(arr, start, end);
      quickSort(arr, start, p - 1);
      quickSort(arr, p + 1, end);
    }
  }

  private int[] quickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
    return arr;
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
      System.out.println("Sorted array: " + Arrays.toString(quickSort(arr)));
    }
  }
}
