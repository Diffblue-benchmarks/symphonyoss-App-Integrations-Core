package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class KeyRotationExceptionDiffblueTest {
  /**
   * Method under test: {@link KeyRotationException#KeyRotationException(String)}
   */
  @Test
  public void testNewKeyRotationException() {
    // Arrange and Act
    KeyRotationException actualKeyRotationException = new KeyRotationException("foo");

    // Assert
    assertEquals("foo", actualKeyRotationException.getMessage());
    assertNull(actualKeyRotationException.getCause());
    assertEquals(0, actualKeyRotationException.getSuppressed().length);
  }
}
