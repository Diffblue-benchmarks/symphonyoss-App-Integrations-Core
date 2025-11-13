package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class KeyRotationExceptionDiffblueTest {
  /**
   * Test {@link KeyRotationException#KeyRotationException(String)}.
   *
   * <p>Method under test: {@link KeyRotationException#KeyRotationException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeyRotationException.<init>(String)"})
  public void testNewKeyRotationException() {
    // Arrange and Act
    KeyRotationException actualKeyRotationException = new KeyRotationException("foo");

    // Assert
    assertEquals("foo", actualKeyRotationException.getMessage());
    assertNull(actualKeyRotationException.getCause());
    assertEquals(0, actualKeyRotationException.getSuppressed().length);
  }
}
