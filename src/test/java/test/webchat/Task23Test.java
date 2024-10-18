package test.webchat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task23Test {

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
  void testFindDuplicateElementsWithDuplicates() {
    int[] inputArray = {1, 2, 3, 2, 4, 5, 1};
    String expectedOutput = "Duplicate: 1 is found under indexes: 0 and 6\r\n" +
        "Duplicate: 2 is found under indexes: 1 and 3";

    Task23.findDuplicateElements(inputArray);

    assertEquals(expectedOutput.trim(), outContent.toString().trim());
  }

  @Test
  void testFindDuplicateElementsWithoutDuplicates() {
    int[] inputArray = {1, 2, 3, 4, 5};
    String expectedOutput = "Duplicates has not been found";

    Task23.findDuplicateElements(inputArray);

    assertEquals(expectedOutput.trim(), outContent.toString().trim());
  }

  @Test
  void testFindDuplicateElementsWithEmptyArray() {
    int[] inputArray = {};
    String expectedOutput = "Duplicates has not been found";

    Task23.findDuplicateElements(inputArray);

    assertEquals(expectedOutput.trim(), outContent.toString().trim());
  }

  @Test
  void testFindDuplicateElementsWithSingleElement() {
    int[] inputArray = {10};
    String expectedOutput = "Duplicates has not been found";

    Task23.findDuplicateElements(inputArray);

    assertEquals(expectedOutput.trim(), outContent.toString().trim());
  }

}
