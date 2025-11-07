package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class KeyNotFoundExceptionDiffblueTest {
  /**
   * Method under test: {@link KeyNotFoundException#KeyNotFoundException(String)}
   */
  @Test
  public void testNewKeyNotFoundException() {
    // Arrange and Act
    KeyNotFoundException actualKeyNotFoundException = new KeyNotFoundException("foo");

    // Assert
    assertEquals("foo", actualKeyNotFoundException.getMessage());
    assertNull(actualKeyNotFoundException.getCause());
    assertEquals(0, actualKeyNotFoundException.getSuppressed().length);
  }
}
