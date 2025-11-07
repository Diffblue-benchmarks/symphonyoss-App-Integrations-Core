package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class OnTheWireFormatExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link OnTheWireFormatException#OnTheWireFormatException(String)}
   */
  @Test
  public void testNewOnTheWireFormatException() {
    // Arrange and Act
    OnTheWireFormatException actualOnTheWireFormatException = new OnTheWireFormatException("foo");

    // Assert
    assertEquals("foo", actualOnTheWireFormatException.getMessage());
    assertNull(actualOnTheWireFormatException.getCause());
    assertEquals(0, actualOnTheWireFormatException.getSuppressed().length);
  }
}
