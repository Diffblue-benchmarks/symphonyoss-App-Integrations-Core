package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class KeyManagerExceptionDiffblueTest {
  /**
   * Test {@link KeyManagerException#KeyManagerException(String)}.
   * <p>
   * Method under test: {@link KeyManagerException#KeyManagerException(String)}
   */
  @Test
  @MethodsUnderTest({"void KeyManagerException.<init>(String)"})
  public void testNewKeyManagerException() {
    // Arrange and Act
    KeyManagerException actualKeyManagerException = new KeyManagerException("foo");

    // Assert
    assertEquals("foo", actualKeyManagerException.getMessage());
    assertNull(actualKeyManagerException.getCause());
    assertEquals(0, actualKeyManagerException.getSuppressed().length);
  }
}
