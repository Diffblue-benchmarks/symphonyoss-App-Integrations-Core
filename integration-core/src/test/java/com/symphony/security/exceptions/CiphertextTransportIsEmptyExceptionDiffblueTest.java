package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class CiphertextTransportIsEmptyExceptionDiffblueTest {
  /**
   * Test {@link CiphertextTransportIsEmptyException#CiphertextTransportIsEmptyException(String)}.
   * <p>
   * Method under test: {@link CiphertextTransportIsEmptyException#CiphertextTransportIsEmptyException(String)}
   */
  @Test
  @MethodsUnderTest({"void CiphertextTransportIsEmptyException.<init>(String)"})
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
