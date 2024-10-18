package test.webchat;

public class Task18 {

  public static void displayIntervalDistribution(int[] a, int[] b) {
    for (int value : a) {
      boolean inInterval = false;
      for (int i = 1; i < b.length; i++) {
        if (value >= b[0] && value <= b[i]) {
          System.out.println("Interval " + b[0] + " - " + b[i] + " : " + value);
          inInterval = true;
          break;
        }
      }
      if (!inInterval) {
        System.out.println("Outside the intervals - " + value);
      }
    }
  }
}
