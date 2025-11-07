package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class IntegrationProvisioningAuthExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link IntegrationProvisioningAuthException#IntegrationProvisioningAuthException(String, Throwable, String[])}
   */
  @Test
  public void testNewIntegrationProvisioningAuthException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    IntegrationProvisioningAuthException actualIntegrationProvisioningAuthException = new IntegrationProvisioningAuthException(
        "0123456789ABCDEF", cause, "0123456789ABCDEF");

    // Assert
    assertEquals(
        "\nComponent: Auth Provisioning\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\nStack trace: \n",
        actualIntegrationProvisioningAuthException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Auth Provisioning\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\nStack trace: \n",
        actualIntegrationProvisioningAuthException.getMessage());
    assertEquals(0, actualIntegrationProvisioningAuthException.getSuppressed().length);
    assertSame(cause, actualIntegrationProvisioningAuthException.getCause());
  }

  /**
   * Method under test:
   * {@link IntegrationProvisioningAuthException#IntegrationProvisioningAuthException(String, Throwable, String[])}
   */
  @Test
  public void testNewIntegrationProvisioningAuthException2() {
    // Arrange and Act
    IntegrationProvisioningAuthException actualIntegrationProvisioningAuthException = new IntegrationProvisioningAuthException(
        null, null, null);

    // Assert
    assertEquals(
        "\n" + "Component: Auth Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationProvisioningAuthException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Auth Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationProvisioningAuthException.getMessage());
    assertNull(actualIntegrationProvisioningAuthException.getCause());
    assertEquals(0, actualIntegrationProvisioningAuthException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link IntegrationProvisioningAuthException#IntegrationProvisioningAuthException(String, Throwable, String[])}
   */
  @Test
  public void testNewIntegrationProvisioningAuthException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    IntegrationProvisioningAuthException actualIntegrationProvisioningAuthException = new IntegrationProvisioningAuthException(
        "0123456789ABCDEF", cause);

    // Assert
    assertEquals(
        "\n" + "Component: Auth Provisioning\n" + "Message: 0123456789ABCDEF\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualIntegrationProvisioningAuthException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Auth Provisioning\n" + "Message: 0123456789ABCDEF\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualIntegrationProvisioningAuthException.getMessage());
    assertEquals(0, actualIntegrationProvisioningAuthException.getSuppressed().length);
    assertSame(cause, actualIntegrationProvisioningAuthException.getCause());
  }
}
