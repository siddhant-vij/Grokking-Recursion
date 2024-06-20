/*
 * Write a Recursive Solution to Generate Pascal's Triangle.
 * Pascal's Triangle is a triangular array of binomial coefficients, where each number is the sum of the two numbers directly above it.
 * 1 <= numRows <= 30
 */

package solutions.medium;

import core.Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle implements Solution {
  private List<List<Integer>> generatePascalTriangleIterative(int rows) {
    List<List<Integer>> triangle = new ArrayList<List<Integer>>();
    for (int i = 0; i < rows; i++) {
      List<Integer> row = new ArrayList<Integer>();
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          row.add(1);
        } else {
          row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
        }
      }
      triangle.add(row);
    }
    return triangle;
  }

  private List<List<Integer>> pascalsHelper(int rows, List<List<Integer>> triangle, int row, int col) {
    if (row == rows) {
      return triangle;
    }
    List<Integer> listRow = new ArrayList<Integer>();
    for (int i = 0; i <= col; i++) {
      if (i == 0 || i == col) {
        listRow.add(1);
      } else {
        listRow.add(triangle.get(row - 1).get(i - 1) + triangle.get(row - 1).get(i));
      }
    }
    triangle.add(listRow);
    return pascalsHelper(rows, triangle, row + 1, col + 1);
  }

  private List<List<Integer>> generatePascalTriangleRecursive(int rows) {
    return pascalsHelper(rows, new ArrayList<>(), 0, 0);
  }

  @Override
  public void solve() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number of rows: ");
      int rows = sc.nextInt();
      System.out.println(generatePascalTriangleIterative(rows));
      System.out.println(generatePascalTriangleRecursive(rows));
    }
  }
}
