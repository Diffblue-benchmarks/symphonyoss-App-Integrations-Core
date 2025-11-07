package org.symphonyoss.integration.authentication.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MissingServiceConfigurationExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link MissingServiceConfigurationException#MissingServiceConfigurationException(String, String, String[])}
   */
  @Test
  public void testNewMissingServiceConfigurationException() {
    // Arrange and Act
    MissingServiceConfigurationException actualMissingServiceConfigurationException = new MissingServiceConfigurationException(
        "Component", "An error occurred", "Solutions");

    // Assert
    assertEquals("\nComponent: Component\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualMissingServiceConfigurationException.getLocalizedMessage());
    assertEquals("\nComponent: Component\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualMissingServiceConfigurationException.getMessage());
    assertNull(actualMissingServiceConfigurationException.getCause());
    assertEquals(0, actualMissingServiceConfigurationException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link MissingServiceConfigurationException#MissingServiceConfigurationException(String, String, String[])}
   */
  @Test
  public void testNewMissingServiceConfigurationException2() {
    // Arrange and Act
    MissingServiceConfigurationException actualMissingServiceConfigurationException = new MissingServiceConfigurationException(
        null, null, null);

    // Assert
    assertEquals(
        "\n" + "Component: Unknown\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingServiceConfigurationException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Unknown\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingServiceConfigurationException.getMessage());
    assertNull(actualMissingServiceConfigurationException.getCause());
    assertEquals(0, actualMissingServiceConfigurationException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link MissingServiceConfigurationException#MissingServiceConfigurationException(String, String, String[])}
   */
  @Test
  public void testNewMissingServiceConfigurationException3() {
    // Arrange and Act
    MissingServiceConfigurationException actualMissingServiceConfigurationException = new MissingServiceConfigurationException(
        "Component", "An error occurred");

    // Assert
    assertEquals(
        "\n" + "Component: Component\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingServiceConfigurationException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Component\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingServiceConfigurationException.getMessage());
    assertNull(actualMissingServiceConfigurationException.getCause());
    assertEquals(0, actualMissingServiceConfigurationException.getSuppressed().length);
  }
}
