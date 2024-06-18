package core;

import solutions.HelloWorld;
import solutions.easy.BasicSum;
import solutions.easy.Factorial;
import solutions.easy.GCD;

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
      default:
        return null;
    }
  }
}
