package test.webchat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task18Test {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeEach
  void setUp() {
    System.setOut(new PrintStream(outContent));
  }

  @AfterEach
  void tearDown() {
    System.setOut(originalOut);
  }

  @Test
  void testDisplayIntervalDistributionWithinIntervals() {
    int[] a = {3, 6, 9};
    int[] b = {1, 5, 10};
    String expectedOutput = "Interval 1 - 5 : 3\r\n" +
        "Interval 1 - 10 : 6\r\n" +
        "Interval 1 - 10 : 9";

    Task18.displayIntervalDistribution(a, b);

    assertEquals(expectedOutput.trim(), outContent.toString().trim());
  }

  @Test
  void testDisplayIntervalDistributionOutOfIntervals() {
    int[] a = {12, 0};
    int[] b = {1, 5, 10};
    String expectedOutput = "Outside the intervals - 12\r\n" +
        "Outside the intervals - 0";

    Task18.displayIntervalDistribution(a, b);

    assertEquals(expectedOutput.trim(), outContent.toString().trim());
  }

  @Test
  void testDisplayIntervalDistributionMixedIntervals() {
    int[] a = {3, 7, 12};
    int[] b = {1, 5, 10};
    String expectedOutput = "Interval 1 - 5 : 3\r\n" +
        "Interval 1 - 10 : 7\r\n" +
        "Outside the intervals - 12";

    Task18.displayIntervalDistribution(a, b);

    assertEquals(expectedOutput.trim(), outContent.toString().trim());
  }

  @Test
  void testDisplayIntervalDistributionWithEmptyArrayA() {
    int[] a = {};
    int[] b = {1, 5, 10};
    String expectedOutput = "";

    Task18.displayIntervalDistribution(a, b);

    assertEquals(expectedOutput.trim(), outContent.toString().trim());
  }
}
