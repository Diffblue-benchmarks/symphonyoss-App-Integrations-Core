package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SymphonySignatureExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link SymphonySignatureException#SymphonySignatureException()}
   */
  @Test
  public void testNewSymphonySignatureException() {
    // Arrange and Act
    SymphonySignatureException actualSymphonySignatureException = new SymphonySignatureException();

    // Assert
    assertNull(actualSymphonySignatureException.getMessage());
    assertNull(actualSymphonySignatureException.getCause());
    assertEquals(0, actualSymphonySignatureException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonySignatureException#SymphonySignatureException(String)}
   */
  @Test
  public void testNewSymphonySignatureException2() {
    // Arrange and Act
    SymphonySignatureException actualSymphonySignatureException = new SymphonySignatureException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonySignatureException.getMessage());
    assertNull(actualSymphonySignatureException.getCause());
    assertEquals(0, actualSymphonySignatureException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonySignatureException#SymphonySignatureException(String, Throwable)}
   */
  @Test
  public void testNewSymphonySignatureException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonySignatureException actualSymphonySignatureException = new SymphonySignatureException("An error occurred",
        cause);

    // Assert
    assertEquals("An error occurred", actualSymphonySignatureException.getMessage());
    assertEquals(0, actualSymphonySignatureException.getSuppressed().length);
    assertSame(cause, actualSymphonySignatureException.getCause());
  }

  /**
   * Method under test:
   * {@link SymphonySignatureException#SymphonySignatureException(String, Throwable, boolean, boolean)}
   */
  @Test
  public void testNewSymphonySignatureException4() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonySignatureException actualSymphonySignatureException = new SymphonySignatureException("An error occurred",
        cause, true, true);

    // Assert
    assertEquals("An error occurred", actualSymphonySignatureException.getMessage());
    assertEquals(0, actualSymphonySignatureException.getSuppressed().length);
    assertSame(cause, actualSymphonySignatureException.getCause());
  }

  /**
   * Method under test:
   * {@link SymphonySignatureException#SymphonySignatureException(Throwable)}
   */
  @Test
  public void testNewSymphonySignatureException5() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonySignatureException actualSymphonySignatureException = new SymphonySignatureException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualSymphonySignatureException.getMessage());
    assertEquals(0, actualSymphonySignatureException.getSuppressed().length);
    assertSame(cause, actualSymphonySignatureException.getCause());
  }
}
