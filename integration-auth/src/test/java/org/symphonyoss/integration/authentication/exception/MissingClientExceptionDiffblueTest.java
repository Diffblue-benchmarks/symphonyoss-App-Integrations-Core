package org.symphonyoss.integration.authentication.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;

public class MissingClientExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link MissingClientException#MissingClientException(String, ServiceName)}
   */
  @Test
  public void testNewMissingClientException() {
    // Arrange and Act
    MissingClientException actualMissingClientException = new MissingClientException("Component",
        ServiceName.POD_SESSION_MANAGER);

    // Assert
    assertEquals(
        "\n" + "Component: Component\n" + "Message: Missing POD_SESSION_MANAGER client configuration\n"
            + "Solutions: \n" + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingClientException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Component\n" + "Message: Missing POD_SESSION_MANAGER client configuration\n"
            + "Solutions: \n" + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingClientException.getMessage());
    assertNull(actualMissingClientException.getCause());
    assertEquals(0, actualMissingClientException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link MissingClientException#MissingClientException(String, ServiceName)}
   */
  @Test
  public void testNewMissingClientException2() {
    // Arrange and Act
    MissingClientException actualMissingClientException = new MissingClientException(null,
        ServiceName.POD_SESSION_MANAGER);

    // Assert
    assertEquals(
        "\n" + "Component: Unknown\n" + "Message: Missing POD_SESSION_MANAGER client configuration\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingClientException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Unknown\n" + "Message: Missing POD_SESSION_MANAGER client configuration\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingClientException.getMessage());
    assertNull(actualMissingClientException.getCause());
    assertEquals(0, actualMissingClientException.getSuppressed().length);
  }
}
