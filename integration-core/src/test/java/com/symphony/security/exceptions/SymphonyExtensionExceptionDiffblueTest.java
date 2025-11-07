package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SymphonyExtensionExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link SymphonyExtensionException#SymphonyExtensionException(String)}
   */
  @Test
  public void testNewSymphonyExtensionException() {
    // Arrange and Act
    SymphonyExtensionException actualSymphonyExtensionException = new SymphonyExtensionException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonyExtensionException.getMessage());
    assertNull(actualSymphonyExtensionException.getCause());
    assertEquals(0, actualSymphonyExtensionException.getSuppressed().length);
  }
}
