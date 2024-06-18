package core;

import solutions.HelloWorld;
import solutions.easy.BasicSum;

public class SolutionFactory {
  public static Solution getSolution(int solutionNumber) {
    switch (solutionNumber) {
      case 0:
        return new HelloWorld();
      case 1:
        return new BasicSum();
      default:
        return null;
    }
  }
}
