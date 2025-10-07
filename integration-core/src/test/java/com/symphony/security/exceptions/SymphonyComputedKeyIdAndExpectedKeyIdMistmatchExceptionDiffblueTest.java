package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import org.junit.Test;

public class SymphonyComputedKeyIdAndExpectedKeyIdMistmatchExceptionDiffblueTest {
  /**
   * Test {@link
   * SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[],
   * byte[])}.
   *
   * <p>Method under test: {@link
   * SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[],
   * byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.<init>(byte[], byte[])"
  })
  public void testNewSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException()
      throws UnsupportedEncodingException {
    // Arrange and Act
    SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException =
            new SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(
                "AXAXAXAX".getBytes("UTF-8"), "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(
        "Theirs: [QVhBWEFYQVg=\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getLocalizedMessage());
    assertEquals(
        "Theirs: [QVhBWEFYQVg=\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getMessage());
    assertNull(actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getCause());
    assertEquals(
        0, actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getSuppressed().length);
  }

  /**
   * Test {@link
   * SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[],
   * byte[])}.
   *
   * <p>Method under test: {@link
   * SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[],
   * byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.<init>(byte[], byte[])"
  })
  public void testNewSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException2() {
    // Arrange and Act
    SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException =
            new SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(null, null);

    // Assert
    assertEquals(
        "Theirs: [null] Mine: [null]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getLocalizedMessage());
    assertEquals(
        "Theirs: [null] Mine: [null]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getMessage());
    assertNull(actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getCause());
    assertEquals(
        0, actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getSuppressed().length);
  }

  /**
   * Test {@link
   * SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[],
   * byte[])}.
   *
   * <p>Method under test: {@link
   * SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[],
   * byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.<init>(byte[], byte[])"
  })
  public void testNewSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException3()
      throws UnsupportedEncodingException {
    // Arrange and Act
    SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException =
            new SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(
                new byte[] {}, "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(
        "Theirs: [] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getLocalizedMessage());
    assertEquals(
        "Theirs: [] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getMessage());
    assertNull(actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getCause());
    assertEquals(
        0, actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getSuppressed().length);
  }

  /**
   * Test {@link
   * SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[],
   * byte[])}.
   *
   * <p>Method under test: {@link
   * SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[],
   * byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.<init>(byte[], byte[])"
  })
  public void testNewSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException4()
      throws UnsupportedEncodingException {
    // Arrange and Act
    SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException =
            new SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(
                "AXAXAXAXAXAXAXAX".getBytes("UTF-8"), "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(
        "Theirs: [QVhBWEFYQVhBWEFYQVhBWA==\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getLocalizedMessage());
    assertEquals(
        "Theirs: [QVhBWEFYQVhBWEFYQVhBWA==\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getMessage());
    assertNull(actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getCause());
    assertEquals(
        0, actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getSuppressed().length);
  }

  /**
   * Test {@link
   * SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[],
   * byte[])}.
   *
   * <p>Method under test: {@link
   * SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[],
   * byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.<init>(byte[], byte[])"
  })
  public void testNewSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException5()
      throws UnsupportedEncodingException {
    // Arrange and Act
    SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException =
            new SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(
                "AXAXAXAXAXAXAXAXAXAXAXAX".getBytes("UTF-8"), "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(
        "Theirs: [QVhBWEFYQVhBWEFYQVhBWEFYQVhBWEFY\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getLocalizedMessage());
    assertEquals(
        "Theirs: [QVhBWEFYQVhBWEFYQVhBWEFYQVhBWEFY\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getMessage());
    assertNull(actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getCause());
    assertEquals(
        0, actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getSuppressed().length);
  }

  /**
   * Test {@link
   * SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[],
   * byte[])}.
   *
   * <p>Method under test: {@link
   * SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException#SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(byte[],
   * byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.<init>(byte[], byte[])"
  })
  public void testNewSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException6()
      throws UnsupportedEncodingException {
    // Arrange and Act
    SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException =
            new SymphonyComputedKeyIdAndExpectedKeyIdMistmatchException(
                new byte[] {-1, 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(
        "Theirs: [/1hBWEFYQVg=\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getLocalizedMessage());
    assertEquals(
        "Theirs: [/1hBWEFYQVg=\r\n] Mine: [QVhBWEFYQVg=\r\n]",
        actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getMessage());
    assertNull(actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getCause());
    assertEquals(
        0, actualSymphonyComputedKeyIdAndExpectedKeyIdMistmatchException.getSuppressed().length);
  }
}
