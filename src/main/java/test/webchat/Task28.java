package test.webchat;

import java.util.Arrays;

public class Task28 {

  public static int[] transformArray(int[] a) {
    int[] b = new int[a.length];
    int aMin = Arrays.stream(a).min().orElse(Integer.MIN_VALUE);
    int aMax = Arrays.stream(a).max().orElse(Integer.MAX_VALUE);
    for (int i = 0; i < a.length; i++) {
      if (a[i] <= aMin) {
        b[i] = aMin;
      } else if (a[i] >= aMax) {
        b[i] = aMax;
      } else {
        b[i] = a[i];
      }
    }
    return b;
  }
}
