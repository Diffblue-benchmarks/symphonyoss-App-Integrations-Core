package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class AppRepositoryClientExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link AppRepositoryClientException#AppRepositoryClientException(String)}
   */
  @Test
  public void testNewAppRepositoryClientException() {
    // Arrange and Act
    AppRepositoryClientException actualAppRepositoryClientException = new AppRepositoryClientException(
        "An error occurred");

    // Assert
    assertEquals("An error occurred", actualAppRepositoryClientException.getMessage());
    assertNull(actualAppRepositoryClientException.getCause());
    assertEquals(0, actualAppRepositoryClientException.getSuppressed().length);
  }
}
