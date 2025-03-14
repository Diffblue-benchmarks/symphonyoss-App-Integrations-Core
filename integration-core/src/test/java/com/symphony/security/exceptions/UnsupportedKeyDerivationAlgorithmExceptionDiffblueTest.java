package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UnsupportedKeyDerivationAlgorithmExceptionDiffblueTest {
  /**
   * Test {@link UnsupportedKeyDerivationAlgorithmException#UnsupportedKeyDerivationAlgorithmException(String)}.
   * <p>
   * Method under test: {@link UnsupportedKeyDerivationAlgorithmException#UnsupportedKeyDerivationAlgorithmException(String)}
   */
  @Test
  @MethodsUnderTest({"void UnsupportedKeyDerivationAlgorithmException.<init>(String)"})
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
