package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SymphonyInputExceptionDiffblueTest {
  /**
   * Method under test: {@link SymphonyInputException#SymphonyInputException()}
   */
  @Test
  public void testNewSymphonyInputException() {
    // Arrange and Act
    SymphonyInputException actualSymphonyInputException = new SymphonyInputException();

    // Assert
    assertNull(actualSymphonyInputException.getMessage());
    assertNull(actualSymphonyInputException.getCause());
    assertEquals(0, actualSymphonyInputException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyInputException#SymphonyInputException(String)}
   */
  @Test
  public void testNewSymphonyInputException2() {
    // Arrange and Act
    SymphonyInputException actualSymphonyInputException = new SymphonyInputException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonyInputException.getMessage());
    assertNull(actualSymphonyInputException.getCause());
    assertEquals(0, actualSymphonyInputException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyInputException#SymphonyInputException(String, Throwable)}
   */
  @Test
  public void testNewSymphonyInputException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyInputException actualSymphonyInputException = new SymphonyInputException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualSymphonyInputException.getMessage());
    assertEquals(0, actualSymphonyInputException.getSuppressed().length);
    assertSame(cause, actualSymphonyInputException.getCause());
  }

  /**
   * Method under test:
   * {@link SymphonyInputException#SymphonyInputException(String, Throwable, boolean, boolean)}
   */
  @Test
  public void testNewSymphonyInputException4() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyInputException actualSymphonyInputException = new SymphonyInputException("An error occurred", cause, true,
        true);

    // Assert
    assertEquals("An error occurred", actualSymphonyInputException.getMessage());
    assertEquals(0, actualSymphonyInputException.getSuppressed().length);
    assertSame(cause, actualSymphonyInputException.getCause());
  }

  /**
   * Method under test:
   * {@link SymphonyInputException#SymphonyInputException(Throwable)}
   */
  @Test
  public void testNewSymphonyInputException5() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyInputException actualSymphonyInputException = new SymphonyInputException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualSymphonyInputException.getMessage());
    assertEquals(0, actualSymphonyInputException.getSuppressed().length);
    assertSame(cause, actualSymphonyInputException.getCause());
  }
}
