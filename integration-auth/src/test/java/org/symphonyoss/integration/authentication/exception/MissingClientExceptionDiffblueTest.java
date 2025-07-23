package org.symphonyoss.integration.authentication.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;

public class MissingClientExceptionDiffblueTest {
  /**
   * Test {@link MissingClientException#MissingClientException(String, ServiceName)}.
   *
   * <ul>
   *   <li>When {@code Component}.
   * </ul>
   *
   * <p>Method under test: {@link MissingClientException#MissingClientException(String,
   * ServiceName)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void MissingClientException.<init>(String, ServiceName)"})
  public void testNewMissingClientException_whenComponent() {
    // Arrange and Act
    MissingClientException actualMissingClientException =
        new MissingClientException("Component", ServiceName.POD_SESSION_MANAGER);

    // Assert
    assertEquals(
        "\n"
            + "Component: Component\n"
            + "Message: Missing POD_SESSION_MANAGER client configuration\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingClientException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Component\n"
            + "Message: Missing POD_SESSION_MANAGER client configuration\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingClientException.getMessage());
    assertNull(actualMissingClientException.getCause());
    assertEquals(0, actualMissingClientException.getSuppressed().length);
  }

  /**
   * Test {@link MissingClientException#MissingClientException(String, ServiceName)}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link MissingClientException#MissingClientException(String,
   * ServiceName)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void MissingClientException.<init>(String, ServiceName)"})
  public void testNewMissingClientException_whenEmptyString() {
    // Arrange and Act
    MissingClientException actualMissingClientException =
        new MissingClientException("", ServiceName.POD_SESSION_MANAGER);

    // Assert
    assertEquals(
        "\n"
            + "Component: Unknown\n"
            + "Message: Missing POD_SESSION_MANAGER client configuration\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingClientException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Unknown\n"
            + "Message: Missing POD_SESSION_MANAGER client configuration\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingClientException.getMessage());
    assertNull(actualMissingClientException.getCause());
    assertEquals(0, actualMissingClientException.getSuppressed().length);
  }
}
