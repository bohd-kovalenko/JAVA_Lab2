package test.webchat;

public class Task13 {

  public static boolean isArithmeticProgression(int[] inputArray) {
    if (inputArray.length < 3) {
      return true;
    }
    int commonDifference = inputArray[1] - inputArray[0];
    for (int i = 2; i < inputArray.length; i++) {
      if (inputArray[i] - inputArray[i - 1] != commonDifference) {
        return false;
      }
    }
    return true;
  }
}
