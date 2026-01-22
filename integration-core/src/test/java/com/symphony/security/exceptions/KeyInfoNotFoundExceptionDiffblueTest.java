package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.utils.ValidateFactory;
import org.junit.Test;

public class KeyInfoNotFoundExceptionDiffblueTest {
  /**
   * Test {@link KeyInfoNotFoundException#KeyInfoNotFoundException(String)}.
   *
   * <p>Method under test: {@link KeyInfoNotFoundException#KeyInfoNotFoundException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeyInfoNotFoundException.<init>(String)"})
  public void testNewKeyInfoNotFoundException() {
    // Arrange and Act
    KeyInfoNotFoundException actualKeyInfoNotFoundException =
        new KeyInfoNotFoundException(ValidateFactory.createNonNullString());

    // Assert
    assertEquals("validString", actualKeyInfoNotFoundException.getMessage());
    assertNull(actualKeyInfoNotFoundException.getCause());
    assertEquals(0, actualKeyInfoNotFoundException.getSuppressed().length);
  }
}
