package core;

import solutions.*;
import solutions.easy.*;
import solutions.medium.*;
import solutions.hard.*;

public class SolutionFactory {
  public static Solution getSolution(int solutionNumber) {
    switch (solutionNumber) {
      case 0:
        return new HelloWorld();
      case 1:
        return new BasicSum();
      case 2:
        return new Factorial();
      case 3:
        return new GCD();
      case 4:
        return new DecimalToBinary();
      case 5:
        return new CheckPrime();
      case 6:
        return new PerfectSquare();
      case 7:
        return new NumberFrequency();
      case 8:
        return new PascalsTriangle();
      case 9:
        return new BinarySearch();
      case 10:
        return new BSTInsertion();
      case 11:
        return new MergeSort();
      case 12:
        return new QuickSort();
      case 13:
        return new RemoveLLNodes();
      case 14:
        return new FibonacciMemo();
      case 15:
        return new GoodNumber();
      case 16:
        return new SplitBST();
      case 17:
        return new PowXN();
      default:
        return null;
    }
  }
}
