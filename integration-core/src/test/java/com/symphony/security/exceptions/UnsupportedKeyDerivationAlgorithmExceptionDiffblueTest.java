package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UnsupportedKeyDerivationAlgorithmExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link UnsupportedKeyDerivationAlgorithmException#UnsupportedKeyDerivationAlgorithmException(String)}
   */
  @Test
  public void testNewUnsupportedKeyDerivationAlgorithmException() {
    // Arrange and Act
    UnsupportedKeyDerivationAlgorithmException actualUnsupportedKeyDerivationAlgorithmException = new UnsupportedKeyDerivationAlgorithmException(
        "foo");

    // Assert
    assertEquals("foo", actualUnsupportedKeyDerivationAlgorithmException.getMessage());
    assertNull(actualUnsupportedKeyDerivationAlgorithmException.getCause());
    assertEquals(0, actualUnsupportedKeyDerivationAlgorithmException.getSuppressed().length);
  }
}
