package test.webchat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task13Test {

  @Test
  void testArithmeticProgressionPositive() {
    int[] inputArray = {2, 4, 6, 8, 10};

    boolean actual = Task13.isArithmeticProgression(inputArray);

    assertTrue(actual, "Array should be an arithmetic progression.");
  }

  @Test
  void testArithmeticProgressionNegative() {
    int[] inputArray = {3, 6, 10, 12};

    boolean actual = Task13.isArithmeticProgression(inputArray);

    assertFalse(actual, "Array should not be an arithmetic progression.");
  }

  @Test
  void testArithmeticProgressionPositiveWithNegativeNumbers() {
    int[] inputArray = {-10, -5, 0, 5, 10};

    boolean actual = Task13.isArithmeticProgression(inputArray);

    assertTrue(actual, "Array with negative numbers should be an arithmetic progression.");
  }

  @Test
  void testArithmeticProgressionPositiveSingleValue() {
    int[] inputArray = {5};

    boolean actual = Task13.isArithmeticProgression(inputArray);

    assertTrue(actual, "Single-element array should be an arithmetic progression.");
  }

  @Test
  void testArithmeticProgressionPositiveWithEqualElements() {
    int[] inputArray = {7, 7, 7, 7};

    boolean actual = Task13.isArithmeticProgression(inputArray);

    assertTrue(actual, "Array with equal elements should be an arithmetic progression.");
  }

  @Test
  void testArithmeticProgressionPositiveWithEmpty() {
    int[] inputArray = {};

    boolean actual = Task13.isArithmeticProgression(inputArray);

    assertTrue(actual, "Empty array should be considered an arithmetic progression.");
  }
}
