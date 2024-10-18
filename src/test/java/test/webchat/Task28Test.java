package test.webchat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

  @Test
  void testTransformArrayWithAllSameElements() {
    int[] inputArray = {1, 2, 3, 4, 5};
    int[] expectedOutput = {1, 2, 3, 4, 5};

    int[] result = Task28.transformArray(inputArray);

    assertArrayEquals(expectedOutput, result);
  }

  @Test
  void testTransformArrayWithCalculatingMinAndMax() {
    int[] inputArray = {-10, -5, 4, 3, 0};
    int aMin = Arrays.stream(inputArray).min().orElse(Integer.MIN_VALUE);
    int aMax = Arrays.stream(inputArray).max().orElse(Integer.MAX_VALUE);
    int[] expectedOutput = {aMin, -5, aMax, 3, 0};

    int[] result = Task28.transformArray(inputArray);

    assertArrayEquals(expectedOutput, result);
  }

  @Test
  void testTransformArrayWithEmptyArray() {
    int[] inputArray = {};
    int[] expectedOutput = {};

    int[] result = Task28.transformArray(inputArray);

    assertArrayEquals(expectedOutput, result);
  }

  @Test
  void testTransformArrayWithSingleElement() {
    int[] inputArray = {5};
    int[] expectedOutput = {5};

    int[] result = Task28.transformArray(inputArray);

    assertArrayEquals(expectedOutput, result);
  }
}
