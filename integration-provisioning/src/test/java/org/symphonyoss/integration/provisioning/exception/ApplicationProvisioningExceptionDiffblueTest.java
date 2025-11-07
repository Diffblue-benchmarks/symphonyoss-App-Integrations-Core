package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class ApplicationProvisioningExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link ApplicationProvisioningException#ApplicationProvisioningException(String, Throwable, String[])}
   */
  @Test
  public void testNewApplicationProvisioningException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    ApplicationProvisioningException actualApplicationProvisioningException = new ApplicationProvisioningException(
        "An error occurred", cause, "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Application Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualApplicationProvisioningException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Application Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualApplicationProvisioningException.getMessage());
    assertEquals(0, actualApplicationProvisioningException.getSuppressed().length);
    assertSame(cause, actualApplicationProvisioningException.getCause());
  }

  /**
   * Method under test:
   * {@link ApplicationProvisioningException#ApplicationProvisioningException(String, Throwable, String[])}
   */
  @Test
  public void testNewApplicationProvisioningException2() {
    // Arrange and Act
    ApplicationProvisioningException actualApplicationProvisioningException = new ApplicationProvisioningException(null,
        null, null);

    // Assert
    assertEquals(
        "\n" + "Component: Application Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualApplicationProvisioningException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Application Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualApplicationProvisioningException.getMessage());
    assertNull(actualApplicationProvisioningException.getCause());
    assertEquals(0, actualApplicationProvisioningException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link ApplicationProvisioningException#ApplicationProvisioningException(String, Throwable, String[])}
   */
  @Test
  public void testNewApplicationProvisioningException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    ApplicationProvisioningException actualApplicationProvisioningException = new ApplicationProvisioningException(
        "An error occurred", cause);

    // Assert
    assertEquals(
        "\n" + "Component: Application Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualApplicationProvisioningException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Application Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualApplicationProvisioningException.getMessage());
    assertEquals(0, actualApplicationProvisioningException.getSuppressed().length);
    assertSame(cause, actualApplicationProvisioningException.getCause());
  }

  /**
   * Method under test:
   * {@link ApplicationProvisioningException#ApplicationProvisioningException(String, String[])}
   */
  @Test
  public void testNewApplicationProvisioningException4() {
    // Arrange and Act
    ApplicationProvisioningException actualApplicationProvisioningException = new ApplicationProvisioningException(
        "An error occurred", "Solutions");

    // Assert
    assertEquals("\nComponent: Application Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualApplicationProvisioningException.getLocalizedMessage());
    assertEquals("\nComponent: Application Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualApplicationProvisioningException.getMessage());
    assertNull(actualApplicationProvisioningException.getCause());
    assertEquals(0, actualApplicationProvisioningException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link ApplicationProvisioningException#ApplicationProvisioningException(String, String[])}
   */
  @Test
  public void testNewApplicationProvisioningException5() {
    // Arrange and Act
    ApplicationProvisioningException actualApplicationProvisioningException = new ApplicationProvisioningException(null,
        null);

    // Assert
    assertEquals(
        "\n" + "Component: Application Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualApplicationProvisioningException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Application Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualApplicationProvisioningException.getMessage());
    assertNull(actualApplicationProvisioningException.getCause());
    assertEquals(0, actualApplicationProvisioningException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link ApplicationProvisioningException#ApplicationProvisioningException(String, String[])}
   */
  @Test
  public void testNewApplicationProvisioningException6() {
    // Arrange and Act
    ApplicationProvisioningException actualApplicationProvisioningException = new ApplicationProvisioningException(
        "An error occurred");

    // Assert
    assertEquals(
        "\n" + "Component: Application Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualApplicationProvisioningException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Application Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualApplicationProvisioningException.getMessage());
    assertNull(actualApplicationProvisioningException.getCause());
    assertEquals(0, actualApplicationProvisioningException.getSuppressed().length);
  }
}
