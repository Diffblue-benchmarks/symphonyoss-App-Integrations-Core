package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.utils.ValidateFactory;
import org.junit.Test;

public class KeyManagerExceptionDiffblueTest {
  /**
   * Test {@link KeyManagerException#KeyManagerException(String)}.
   *
   * <p>Method under test: {@link KeyManagerException#KeyManagerException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeyManagerException.<init>(String)"})
  public void testNewKeyManagerException() {
    // Arrange and Act
    KeyManagerException actualKeyManagerException =
        new KeyManagerException(ValidateFactory.createNonNullString());

    // Assert
    assertEquals("validString", actualKeyManagerException.getMessage());
    assertNull(actualKeyManagerException.getCause());
    assertEquals(0, actualKeyManagerException.getSuppressed().length);
  }
}
