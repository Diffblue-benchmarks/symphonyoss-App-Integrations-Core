package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.utils.ValidateFactory;
import org.junit.Test;

public class OnTheWireFormatExceptionDiffblueTest {
  /**
   * Test {@link OnTheWireFormatException#OnTheWireFormatException(String)}.
   *
   * <p>Method under test: {@link OnTheWireFormatException#OnTheWireFormatException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnTheWireFormatException.<init>(String)"})
  public void testNewOnTheWireFormatException() {
    // Arrange and Act
    OnTheWireFormatException actualOnTheWireFormatException =
        new OnTheWireFormatException(ValidateFactory.createNonNullString());

    // Assert
    assertEquals("validString", actualOnTheWireFormatException.getMessage());
    assertNull(actualOnTheWireFormatException.getCause());
    assertEquals(0, actualOnTheWireFormatException.getSuppressed().length);
  }
}
