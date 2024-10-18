package test.webchat;

import java.util.Arrays;
import java.util.Locale;

public class Task8 {
  public static void calculateDifferences(int[] a) {
    double average = Arrays.stream(a).average().orElse(0);
    double maxDifference = 0;
    double minDifference = Double.MAX_VALUE;
    for (int value : a) {
      double difference = Math.abs(value - average);
      if (difference > maxDifference) {
        maxDifference = difference;
      }
      if (difference < minDifference) {
        minDifference = difference;
      }
    }
    System.out.printf(Locale.US, "Average value: %e%n", average);
    System.out.printf(Locale.US, "Maximum absolute difference: %e%n", maxDifference);
    System.out.printf(Locale.US, "Minimum absolute difference: %e%n", minDifference);
  }
}
