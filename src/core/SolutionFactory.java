package core;

import solutions.HelloWorld;
import solutions.easy.BasicSum;
import solutions.easy.Factorial;

public class SolutionFactory {
  public static Solution getSolution(int solutionNumber) {
    switch (solutionNumber) {
      case 0:
        return new HelloWorld();
      case 1:
        return new BasicSum();
      case 2:
        return new Factorial();
      default:
        return null;
    }
  }
}
