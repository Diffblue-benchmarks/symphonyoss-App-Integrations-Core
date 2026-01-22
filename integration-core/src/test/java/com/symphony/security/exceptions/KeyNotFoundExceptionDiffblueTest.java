package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.utils.ValidateFactory;
import org.junit.Test;

public class KeyNotFoundExceptionDiffblueTest {
  /**
   * Test {@link KeyNotFoundException#KeyNotFoundException(String)}.
   *
   * <p>Method under test: {@link KeyNotFoundException#KeyNotFoundException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeyNotFoundException.<init>(String)"})
  public void testNewKeyNotFoundException() {
    // Arrange and Act
    KeyNotFoundException actualKeyNotFoundException =
        new KeyNotFoundException(ValidateFactory.createNonNullString());

    // Assert
    assertEquals("validString", actualKeyNotFoundException.getMessage());
    assertNull(actualKeyNotFoundException.getCause());
    assertEquals(0, actualKeyNotFoundException.getSuppressed().length);
  }
}
