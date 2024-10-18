package test.webchat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task8Test {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outContent));
  }

  @AfterEach
  public void tearDown() {
    System.setOut(originalOut);
  }

  @Test
  void testCalculateDifferencesWithValidArray() {
    int[] inputArray = {10, 20, 30, 40, 50};
    double average = Arrays.stream(inputArray).average().orElse(0);
    double maxDifference = Math.abs(50 - average);
    double minDifference = Math.abs(30 - average);
    String expectedOutput = String.format(Locale.US,
        "Average value: %e%nMaximum absolute difference: %e%nMinimum absolute difference: %e%n",
        average, maxDifference, minDifference
    );

    Task8.calculateDifferences(inputArray);

    assertEquals(expectedOutput.trim(), outContent.toString().trim());
  }

  @Test
  void testCalculateDifferencesWithSingleElementArray() {
    int[] inputArray = {100};
    double average = 100;
    double maxDifference = 0;
    double minDifference = 0;
    String expectedOutput = String.format(Locale.US,
        "Average value: %e%nMaximum absolute difference: %e%nMinimum absolute difference: %e%n",
        average, maxDifference, minDifference
    );

    Task8.calculateDifferences(inputArray);

    assertEquals(expectedOutput.trim(), outContent.toString().trim());
  }

  @Test
  void testCalculateDifferencesWithEmptyArray() {
    int[] inputArray = {};
    double average = 0;
    double maxDifference = 0;
    double minDifference = Double.MAX_VALUE;
    String expectedOutput = String.format(Locale.US,
        "Average value: %e%nMaximum absolute difference: %e%nMinimum absolute difference: %e%n",
        average, maxDifference, minDifference
    );

    Task8.calculateDifferences(inputArray);

    assertEquals(expectedOutput.trim(), outContent.toString().trim());
  }
}
