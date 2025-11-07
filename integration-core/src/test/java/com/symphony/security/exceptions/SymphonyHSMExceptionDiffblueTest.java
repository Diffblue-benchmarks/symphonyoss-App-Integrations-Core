package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SymphonyHSMExceptionDiffblueTest {
  /**
   * Method under test: {@link SymphonyHSMException#SymphonyHSMException()}
   */
  @Test
  public void testNewSymphonyHSMException() {
    // Arrange and Act
    SymphonyHSMException actualSymphonyHSMException = new SymphonyHSMException();

    // Assert
    assertNull(actualSymphonyHSMException.getMessage());
    assertNull(actualSymphonyHSMException.getCause());
    assertEquals(0, actualSymphonyHSMException.getSuppressed().length);
  }

  /**
   * Method under test: {@link SymphonyHSMException#SymphonyHSMException(String)}
   */
  @Test
  public void testNewSymphonyHSMException2() {
    // Arrange and Act
    SymphonyHSMException actualSymphonyHSMException = new SymphonyHSMException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonyHSMException.getMessage());
    assertNull(actualSymphonyHSMException.getCause());
    assertEquals(0, actualSymphonyHSMException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link SymphonyHSMException#SymphonyHSMException(String, Throwable)}
   */
  @Test
  public void testNewSymphonyHSMException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyHSMException actualSymphonyHSMException = new SymphonyHSMException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualSymphonyHSMException.getMessage());
    assertEquals(0, actualSymphonyHSMException.getSuppressed().length);
    assertSame(cause, actualSymphonyHSMException.getCause());
  }

  /**
   * Method under test:
   * {@link SymphonyHSMException#SymphonyHSMException(String, Throwable, boolean, boolean)}
   */
  @Test
  public void testNewSymphonyHSMException4() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyHSMException actualSymphonyHSMException = new SymphonyHSMException("An error occurred", cause, true, true);

    // Assert
    assertEquals("An error occurred", actualSymphonyHSMException.getMessage());
    assertEquals(0, actualSymphonyHSMException.getSuppressed().length);
    assertSame(cause, actualSymphonyHSMException.getCause());
  }

  /**
   * Method under test:
   * {@link SymphonyHSMException#SymphonyHSMException(Throwable)}
   */
  @Test
  public void testNewSymphonyHSMException5() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyHSMException actualSymphonyHSMException = new SymphonyHSMException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualSymphonyHSMException.getMessage());
    assertEquals(0, actualSymphonyHSMException.getSuppressed().length);
    assertSame(cause, actualSymphonyHSMException.getCause());
  }
}
