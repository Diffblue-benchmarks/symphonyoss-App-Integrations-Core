package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class InvalidDataExceptionDiffblueTest {
  /**
   * Method under test: {@link InvalidDataException#InvalidDataException()}
   */
  @Test
  public void testNewInvalidDataException() {
    // Arrange and Act
    InvalidDataException actualInvalidDataException = new InvalidDataException();

    // Assert
    assertNull(actualInvalidDataException.getMessage());
    assertNull(actualInvalidDataException.getCause());
    assertEquals(0, actualInvalidDataException.getSuppressed().length);
  }

  /**
   * Method under test: {@link InvalidDataException#InvalidDataException(String)}
   */
  @Test
  public void testNewInvalidDataException2() {
    // Arrange and Act
    InvalidDataException actualInvalidDataException = new InvalidDataException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualInvalidDataException.getMessage());
    assertNull(actualInvalidDataException.getCause());
    assertEquals(0, actualInvalidDataException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link InvalidDataException#InvalidDataException(String, Throwable)}
   */
  @Test
  public void testNewInvalidDataException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    InvalidDataException actualInvalidDataException = new InvalidDataException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualInvalidDataException.getMessage());
    assertEquals(0, actualInvalidDataException.getSuppressed().length);
    assertSame(cause, actualInvalidDataException.getCause());
  }

  /**
   * Method under test:
   * {@link InvalidDataException#InvalidDataException(String, Throwable, boolean, boolean)}
   */
  @Test
  public void testNewInvalidDataException4() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    InvalidDataException actualInvalidDataException = new InvalidDataException("An error occurred", cause, true, true);

    // Assert
    assertEquals("An error occurred", actualInvalidDataException.getMessage());
    assertEquals(0, actualInvalidDataException.getSuppressed().length);
    assertSame(cause, actualInvalidDataException.getCause());
  }

  /**
   * Method under test:
   * {@link InvalidDataException#InvalidDataException(Throwable)}
   */
  @Test
  public void testNewInvalidDataException5() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    InvalidDataException actualInvalidDataException = new InvalidDataException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualInvalidDataException.getMessage());
    assertEquals(0, actualInvalidDataException.getSuppressed().length);
    assertSame(cause, actualInvalidDataException.getCause());
  }
}
