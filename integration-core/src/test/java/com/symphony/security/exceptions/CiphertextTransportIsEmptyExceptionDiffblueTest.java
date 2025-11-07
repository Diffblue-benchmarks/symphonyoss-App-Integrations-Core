package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class CiphertextTransportIsEmptyExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link CiphertextTransportIsEmptyException#CiphertextTransportIsEmptyException(String)}
   */
  @Test
  public void testNewCiphertextTransportIsEmptyException() {
    // Arrange and Act
    CiphertextTransportIsEmptyException actualCiphertextTransportIsEmptyException = new CiphertextTransportIsEmptyException(
        "Msg");

    // Assert
    assertEquals("Msg", actualCiphertextTransportIsEmptyException.getMessage());
    assertNull(actualCiphertextTransportIsEmptyException.getCause());
    assertEquals(0, actualCiphertextTransportIsEmptyException.getSuppressed().length);
  }
}
