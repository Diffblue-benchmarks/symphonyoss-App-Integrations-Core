package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class ConfigurationProvisioningExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link ConfigurationProvisioningException#ConfigurationProvisioningException(String, Throwable, String[])}
   */
  @Test
  public void testNewConfigurationProvisioningException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    ConfigurationProvisioningException actualConfigurationProvisioningException = new ConfigurationProvisioningException(
        "An error occurred", cause, "Solutions");

    // Assert
    assertEquals("\n" + "Component: Configuration Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
        + "Solutions\n" + "Stack trace: \n", actualConfigurationProvisioningException.getLocalizedMessage());
    assertEquals("\n" + "Component: Configuration Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
        + "Solutions\n" + "Stack trace: \n", actualConfigurationProvisioningException.getMessage());
    assertEquals(0, actualConfigurationProvisioningException.getSuppressed().length);
    assertSame(cause, actualConfigurationProvisioningException.getCause());
  }

  /**
   * Method under test:
   * {@link ConfigurationProvisioningException#ConfigurationProvisioningException(String, Throwable, String[])}
   */
  @Test
  public void testNewConfigurationProvisioningException2() {
    // Arrange and Act
    ConfigurationProvisioningException actualConfigurationProvisioningException = new ConfigurationProvisioningException(
        null, null, null);

    // Assert
    assertEquals(
        "\n" + "Component: Configuration Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualConfigurationProvisioningException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Configuration Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualConfigurationProvisioningException.getMessage());
    assertNull(actualConfigurationProvisioningException.getCause());
    assertEquals(0, actualConfigurationProvisioningException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link ConfigurationProvisioningException#ConfigurationProvisioningException(String, Throwable, String[])}
   */
  @Test
  public void testNewConfigurationProvisioningException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    ConfigurationProvisioningException actualConfigurationProvisioningException = new ConfigurationProvisioningException(
        "An error occurred", cause);

    // Assert
    assertEquals(
        "\n" + "Component: Configuration Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualConfigurationProvisioningException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Configuration Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualConfigurationProvisioningException.getMessage());
    assertEquals(0, actualConfigurationProvisioningException.getSuppressed().length);
    assertSame(cause, actualConfigurationProvisioningException.getCause());
  }
}
