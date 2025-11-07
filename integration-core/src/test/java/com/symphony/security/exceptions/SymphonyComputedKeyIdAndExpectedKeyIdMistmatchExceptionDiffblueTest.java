package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.io.UnsupportedEncodingException;
import org.junit.Test;

public class SymphonyComputedKeyIdAndExpectedKeyIdMistmatchExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[], byte[])}
   */
  @Test
  public void testNewSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException() throws UnsupportedEncodingException {
    // Arrange
    byte[] theirs = "AXAXAXAX".getBytes("UTF-8");

    // Act
    SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException = new SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(
        theirs, "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals("Theirs: [QVhBWEFYQVg=\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getLocalizedMessage());
    assertEquals("Theirs: [QVhBWEFYQVg=\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getMessage());
    assertNull(actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getCause());
    assertEquals(0, actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[], byte[])}
   */
  @Test
  public void testNewSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException2() {
    // Arrange and Act
    SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException = new SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(
        null, null);

    // Assert
    assertEquals("Theirs: [null] Mine: [null]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getLocalizedMessage());
    assertEquals("Theirs: [null] Mine: [null]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getMessage());
    assertNull(actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getCause());
    assertEquals(0, actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[], byte[])}
   */
  @Test
  public void testNewSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException3() throws UnsupportedEncodingException {
    // Arrange and Act
    SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException = new SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(
        new byte[]{-1, 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals("Theirs: [/1hBWEFYQVg=\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getLocalizedMessage());
    assertEquals("Theirs: [/1hBWEFYQVg=\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getMessage());
    assertNull(actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getCause());
    assertEquals(0, actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[], byte[])}
   */
  @Test
  public void testNewSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException4() throws UnsupportedEncodingException {
    // Arrange and Act
    SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException = new SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(
        new byte[]{}, "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals("Theirs: [] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getLocalizedMessage());
    assertEquals("Theirs: [] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getMessage());
    assertNull(actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getCause());
    assertEquals(0, actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[], byte[])}
   */
  @Test
  public void testNewSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException5() throws UnsupportedEncodingException {
    // Arrange
    byte[] theirs = "AXAXAXAXAXAXAXAX".getBytes("UTF-8");

    // Act
    SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException = new SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(
        theirs, "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals("Theirs: [QVhBWEFYQVhBWEFYQVhBWA==\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getLocalizedMessage());
    assertEquals("Theirs: [QVhBWEFYQVhBWEFYQVhBWA==\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getMessage());
    assertNull(actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getCause());
    assertEquals(0, actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[], byte[])}
   */
  @Test
  public void testNewSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException6() throws UnsupportedEncodingException {
    // Arrange
    byte[] theirs = "AXAXAXAXAXAXAXAXAXAXAXAX".getBytes("UTF-8");

    // Act
    SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException = new SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(
        theirs, "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals("Theirs: [QVhBWEFYQVhBWEFYQVhBWEFYQVhBWEFY\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getLocalizedMessage());
    assertEquals("Theirs: [QVhBWEFYQVhBWEFYQVhBWEFYQVhBWEFY\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getMessage());
    assertNull(actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getCause());
    assertEquals(0, actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getSuppressed().length);
  }
}
