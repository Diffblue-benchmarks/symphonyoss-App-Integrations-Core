package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SymphonyNativeExceptionDiffblueTest {
  /**
   * Method under test: {@link SymphonyNativeException#SymphonyNativeException()}
   */
  @Test
  public void testNewSymphonyNativeException() {
    // Arrange and Act
    SymphonyNativeException actualSymphonyNativeException = new SymphonyNativeException();

    // Assert
    assertNull(actualSymphonyNativeException.getMessage());
    assertNull(actualSymphonyNativeException.getCause());
    assertEquals(0, actualSymphonyNativeException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyNativeException#SymphonyNativeException(String)}
   */
  @Test
  public void testNewSymphonyNativeException2() {
    // Arrange and Act
    SymphonyNativeException actualSymphonyNativeException = new SymphonyNativeException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonyNativeException.getMessage());
    assertNull(actualSymphonyNativeException.getCause());
    assertEquals(0, actualSymphonyNativeException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyNativeException#SymphonyNativeException(String, Throwable)}
   */
  @Test
  public void testNewSymphonyNativeException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyNativeException actualSymphonyNativeException = new SymphonyNativeException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualSymphonyNativeException.getMessage());
    assertEquals(0, actualSymphonyNativeException.getSuppressed().length);
    assertSame(cause, actualSymphonyNativeException.getCause());
  }

  /**
   * Method under test:
   * {@link SymphonyNativeException#SymphonyNativeException(String, Throwable, boolean, boolean)}
   */
  @Test
  public void testNewSymphonyNativeException4() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyNativeException actualSymphonyNativeException = new SymphonyNativeException("An error occurred", cause,
        true, true);

    // Assert
    assertEquals("An error occurred", actualSymphonyNativeException.getMessage());
    assertEquals(0, actualSymphonyNativeException.getSuppressed().length);
    assertSame(cause, actualSymphonyNativeException.getCause());
  }

  /**
   * Method under test:
   * {@link SymphonyNativeException#SymphonyNativeException(Throwable)}
   */
  @Test
  public void testNewSymphonyNativeException5() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyNativeException actualSymphonyNativeException = new SymphonyNativeException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualSymphonyNativeException.getMessage());
    assertEquals(0, actualSymphonyNativeException.getSuppressed().length);
    assertSame(cause, actualSymphonyNativeException.getCause());
  }
}
