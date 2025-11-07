package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class CiphertextTransportVersionExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link CiphertextTransportVersionException#CiphertextTransportVersionException(String)}
   */
  @Test
  public void testNewCiphertextTransportVersionException() {
    // Arrange and Act
    CiphertextTransportVersionException actualCiphertextTransportVersionException = new CiphertextTransportVersionException(
        "Msg");

    // Assert
    assertEquals("Msg", actualCiphertextTransportVersionException.getMessage());
    assertNull(actualCiphertextTransportVersionException.getCause());
    assertEquals(0, actualCiphertextTransportVersionException.getSuppressed().length);
  }
}
