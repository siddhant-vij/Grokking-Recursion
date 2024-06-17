package core;

import solutions.HelloWorld;

public class SolutionFactory {
  public static Solution getSolution(int solutionNumber) {
    switch (solutionNumber) {
      case 0:
        return new HelloWorld();
      default:
        return null;
    }
  }
}
