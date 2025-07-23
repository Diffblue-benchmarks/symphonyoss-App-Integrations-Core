package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class ConfigurationProvisioningExceptionDiffblueTest {
  /**
   * Test {@link ConfigurationProvisioningException#ConfigurationProvisioningException(String,
   * Throwable, String[])}.
   *
   * <p>Method under test: {@link
   * ConfigurationProvisioningException#ConfigurationProvisioningException(String, Throwable,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ConfigurationProvisioningException.<init>(String, Throwable, String[])"})
  public void testNewConfigurationProvisioningException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    ConfigurationProvisioningException actualConfigurationProvisioningException =
        new ConfigurationProvisioningException("An error occurred", cause, "Solutions");

    // Assert
    assertEquals(
        "\n"
            + "Component: Configuration Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "Solutions\n"
            + "Stack trace: \n",
        actualConfigurationProvisioningException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Configuration Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "Solutions\n"
            + "Stack trace: \n",
        actualConfigurationProvisioningException.getMessage());
    assertSame(cause, actualConfigurationProvisioningException.getCause());
  }

  /**
   * Test {@link ConfigurationProvisioningException#ConfigurationProvisioningException(String,
   * Throwable, String[])}.
   *
   * <p>Method under test: {@link
   * ConfigurationProvisioningException#ConfigurationProvisioningException(String, Throwable,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ConfigurationProvisioningException.<init>(String, Throwable, String[])"})
  public void testNewConfigurationProvisioningException2() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    ConfigurationProvisioningException actualConfigurationProvisioningException =
        new ConfigurationProvisioningException("", cause, "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Configuration Provisioning\nMessage: None\nSolutions: \nSolutions\nStack trace: \n",
        actualConfigurationProvisioningException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Configuration Provisioning\nMessage: None\nSolutions: \nSolutions\nStack trace: \n",
        actualConfigurationProvisioningException.getMessage());
    assertSame(cause, actualConfigurationProvisioningException.getCause());
  }

  /**
   * Test {@link ConfigurationProvisioningException#ConfigurationProvisioningException(String,
   * Throwable, String[])}.
   *
   * <p>Method under test: {@link
   * ConfigurationProvisioningException#ConfigurationProvisioningException(String, Throwable,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ConfigurationProvisioningException.<init>(String, Throwable, String[])"})
  public void testNewConfigurationProvisioningException3() {
    // Arrange and Act
    ConfigurationProvisioningException actualConfigurationProvisioningException =
        new ConfigurationProvisioningException("An error occurred", null, "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Configuration Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualConfigurationProvisioningException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Configuration Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualConfigurationProvisioningException.getMessage());
    assertNull(actualConfigurationProvisioningException.getCause());
    assertEquals(0, actualConfigurationProvisioningException.getSuppressed().length);
  }

  /**
   * Test {@link ConfigurationProvisioningException#ConfigurationProvisioningException(String,
   * Throwable, String[])}.
   *
   * <ul>
   *   <li>Then return LocalizedMessage is a string.
   * </ul>
   *
   * <p>Method under test: {@link
   * ConfigurationProvisioningException#ConfigurationProvisioningException(String, Throwable,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ConfigurationProvisioningException.<init>(String, Throwable, String[])"})
  public void testNewConfigurationProvisioningException_thenReturnLocalizedMessageIsAString() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    ConfigurationProvisioningException actualConfigurationProvisioningException =
        new ConfigurationProvisioningException("An error occurred", cause);

    // Assert
    assertEquals(
        "\n"
            + "Component: Configuration Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n"
            + "Stack trace: \n",
        actualConfigurationProvisioningException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Configuration Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n"
            + "Stack trace: \n",
        actualConfigurationProvisioningException.getMessage());
    assertSame(cause, actualConfigurationProvisioningException.getCause());
  }
}
