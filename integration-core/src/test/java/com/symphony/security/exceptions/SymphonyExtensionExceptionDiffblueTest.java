package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.utils.ValidateFactory;
import org.junit.Test;

public class SymphonyExtensionExceptionDiffblueTest {
  /**
   * Test {@link SymphonyExtensionException#SymphonyExtensionException(String)}.
   *
   * <p>Method under test: {@link SymphonyExtensionException#SymphonyExtensionException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyExtensionException.<init>(String)"})
  public void testNewSymphonyExtensionException() {
    // Arrange and Act
    SymphonyExtensionException actualSymphonyExtensionException =
        new SymphonyExtensionException(ValidateFactory.createNonNullString());

    // Assert
    assertEquals("validString", actualSymphonyExtensionException.getMessage());
    assertNull(actualSymphonyExtensionException.getCause());
    assertEquals(0, actualSymphonyExtensionException.getSuppressed().length);
  }
}
