package core;

import solutions.HelloWorld;
import solutions.easy.BasicSum;
import solutions.easy.Factorial;
import solutions.easy.GCD;
import solutions.easy.DecimalToBinary;
import solutions.easy.CheckPrime;
import solutions.easy.PerfectSquare;

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
      default:
        return null;
    }
  }
}
