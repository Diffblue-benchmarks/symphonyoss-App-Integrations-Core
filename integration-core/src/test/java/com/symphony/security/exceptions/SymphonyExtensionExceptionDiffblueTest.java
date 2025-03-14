package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class SymphonyExtensionExceptionDiffblueTest {
  /**
   * Test {@link SymphonyExtensionException#SymphonyExtensionException(String)}.
   * <p>
   * Method under test: {@link SymphonyExtensionException#SymphonyExtensionException(String)}
   */
  @Test
  @MethodsUnderTest({"void SymphonyExtensionException.<init>(String)"})
  public void testNewSymphonyExtensionException() {
    // Arrange and Act
    SymphonyExtensionException actualSymphonyExtensionException = new SymphonyExtensionException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonyExtensionException.getMessage());
    assertNull(actualSymphonyExtensionException.getCause());
    assertEquals(0, actualSymphonyExtensionException.getSuppressed().length);
  }
}
