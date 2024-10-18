package test.webchat;

public class Task23 {

  public static void findDuplicateElements(int[] array) {
    boolean hasDuplicates = false;
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] == array[j]) {
          System.out.println("Duplicate: " + array[i] + " is found under indexes: " + i + " and " + j);
          hasDuplicates = true;
        }
      }
    }
    if (!hasDuplicates) {
      System.out.println("Duplicates has not been found");
    }
  }
}
