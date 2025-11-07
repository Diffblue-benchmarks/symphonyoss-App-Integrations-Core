package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SymphonyEncryptionExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link SymphonyEncryptionException#SymphonyEncryptionException()}
   */
  @Test
  public void testNewSymphonyEncryptionException() {
    // Arrange and Act
    SymphonyEncryptionException actualSymphonyEncryptionException = new SymphonyEncryptionException();

    // Assert
    assertNull(actualSymphonyEncryptionException.getMessage());
    assertNull(actualSymphonyEncryptionException.getCause());
    assertEquals(0, actualSymphonyEncryptionException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyEncryptionException#SymphonyEncryptionException(String)}
   */
  @Test
  public void testNewSymphonyEncryptionException2() {
    // Arrange and Act
    SymphonyEncryptionException actualSymphonyEncryptionException = new SymphonyEncryptionException(
        "An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonyEncryptionException.getMessage());
    assertNull(actualSymphonyEncryptionException.getCause());
    assertEquals(0, actualSymphonyEncryptionException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyEncryptionException#SymphonyEncryptionException(String, Throwable)}
   */
  @Test
  public void testNewSymphonyEncryptionException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyEncryptionException actualSymphonyEncryptionException = new SymphonyEncryptionException("An error occurred",
        cause);

    // Assert
    assertEquals("An error occurred", actualSymphonyEncryptionException.getMessage());
    assertEquals(0, actualSymphonyEncryptionException.getSuppressed().length);
    assertSame(cause, actualSymphonyEncryptionException.getCause());
  }

  /**
   * Method under test:
   * {@link SymphonyEncryptionException#SymphonyEncryptionException(String, Throwable, boolean, boolean)}
   */
  @Test
  public void testNewSymphonyEncryptionException4() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyEncryptionException actualSymphonyEncryptionException = new SymphonyEncryptionException("An error occurred",
        cause, true, true);

    // Assert
    assertEquals("An error occurred", actualSymphonyEncryptionException.getMessage());
    assertEquals(0, actualSymphonyEncryptionException.getSuppressed().length);
    assertSame(cause, actualSymphonyEncryptionException.getCause());
  }

  /**
   * Method under test:
   * {@link SymphonyEncryptionException#SymphonyEncryptionException(Throwable)}
   */
  @Test
  public void testNewSymphonyEncryptionException5() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyEncryptionException actualSymphonyEncryptionException = new SymphonyEncryptionException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualSymphonyEncryptionException.getMessage());
    assertEquals(0, actualSymphonyEncryptionException.getSuppressed().length);
    assertSame(cause, actualSymphonyEncryptionException.getCause());
  }
}
