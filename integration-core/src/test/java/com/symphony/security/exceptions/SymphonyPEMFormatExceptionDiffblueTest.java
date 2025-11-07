package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SymphonyPEMFormatExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link SymphonyPEMFormatException#SymphonyPEMFormatException()}
   */
  @Test
  public void testNewSymphonyPEMFormatException() {
    // Arrange and Act
    SymphonyPEMFormatException actualSymphonyPEMFormatException = new SymphonyPEMFormatException();

    // Assert
    assertEquals("PEM string IOException", actualSymphonyPEMFormatException.getMessage());
    assertNull(actualSymphonyPEMFormatException.getCause());
    assertEquals(0, actualSymphonyPEMFormatException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyPEMFormatException#SymphonyPEMFormatException(String)}
   */
  @Test
  public void testNewSymphonyPEMFormatException2() {
    // Arrange and Act
    SymphonyPEMFormatException actualSymphonyPEMFormatException = new SymphonyPEMFormatException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonyPEMFormatException.getMessage());
    assertNull(actualSymphonyPEMFormatException.getCause());
    assertEquals(0, actualSymphonyPEMFormatException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyPEMFormatException#SymphonyPEMFormatException(String, Throwable)}
   */
  @Test
  public void testNewSymphonyPEMFormatException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyPEMFormatException actualSymphonyPEMFormatException = new SymphonyPEMFormatException("An error occurred",
        cause);

    // Assert
    assertEquals("An error occurred", actualSymphonyPEMFormatException.getMessage());
    assertEquals(0, actualSymphonyPEMFormatException.getSuppressed().length);
    assertSame(cause, actualSymphonyPEMFormatException.getCause());
  }

  /**
   * Method under test:
   * {@link SymphonyPEMFormatException#SymphonyPEMFormatException(String, Throwable, boolean, boolean)}
   */
  @Test
  public void testNewSymphonyPEMFormatException4() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyPEMFormatException actualSymphonyPEMFormatException = new SymphonyPEMFormatException("An error occurred",
        cause, true, true);

    // Assert
    assertEquals("An error occurred", actualSymphonyPEMFormatException.getMessage());
    assertEquals(0, actualSymphonyPEMFormatException.getSuppressed().length);
    assertSame(cause, actualSymphonyPEMFormatException.getCause());
  }

  /**
   * Method under test:
   * {@link SymphonyPEMFormatException#SymphonyPEMFormatException(Throwable)}
   */
  @Test
  public void testNewSymphonyPEMFormatException5() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyPEMFormatException actualSymphonyPEMFormatException = new SymphonyPEMFormatException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualSymphonyPEMFormatException.getMessage());
    assertEquals(0, actualSymphonyPEMFormatException.getSuppressed().length);
    assertSame(cause, actualSymphonyPEMFormatException.getCause());
  }
}
