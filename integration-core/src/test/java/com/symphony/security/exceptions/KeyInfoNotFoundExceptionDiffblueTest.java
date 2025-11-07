package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class KeyInfoNotFoundExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link KeyInfoNotFoundException#KeyInfoNotFoundException(String)}
   */
  @Test
  public void testNewKeyInfoNotFoundException() {
    // Arrange and Act
    KeyInfoNotFoundException actualKeyInfoNotFoundException = new KeyInfoNotFoundException("foo");

    // Assert
    assertEquals("foo", actualKeyInfoNotFoundException.getMessage());
    assertNull(actualKeyInfoNotFoundException.getCause());
    assertEquals(0, actualKeyInfoNotFoundException.getSuppressed().length);
  }
}
