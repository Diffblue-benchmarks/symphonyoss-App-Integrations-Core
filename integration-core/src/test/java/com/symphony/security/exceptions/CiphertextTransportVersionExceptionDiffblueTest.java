package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class CiphertextTransportVersionExceptionDiffblueTest {
  /**
   * Test {@link CiphertextTransportVersionException#CiphertextTransportVersionException(String)}.
   * <p>
   * Method under test: {@link CiphertextTransportVersionException#CiphertextTransportVersionException(String)}
   */
  @Test
  @MethodsUnderTest({"void CiphertextTransportVersionException.<init>(String)"})
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
