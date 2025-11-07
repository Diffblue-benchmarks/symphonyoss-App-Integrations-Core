package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SymphonyRevokedCertExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link SymphonyRevokedCertException#SymphonyRevokedCertException(String)}
   */
  @Test
  public void testNewSymphonyRevokedCertException() {
    // Arrange and Act
    SymphonyRevokedCertException actualSymphonyRevokedCertException = new SymphonyRevokedCertException(
        "An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonyRevokedCertException.getMessage());
    assertNull(actualSymphonyRevokedCertException.getCause());
    assertEquals(0, actualSymphonyRevokedCertException.getSuppressed().length);
  }
}
