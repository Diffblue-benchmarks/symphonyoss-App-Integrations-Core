package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class IntegrationProvisioningAuthExceptionDiffblueTest {
  /**
   * Test {@link IntegrationProvisioningAuthException#IntegrationProvisioningAuthException(String, Throwable, String[])}.
   * <p>
   * Method under test: {@link IntegrationProvisioningAuthException#IntegrationProvisioningAuthException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void IntegrationProvisioningAuthException.<init>(String, Throwable, String[])"})
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
    assertSame(cause, actualIntegrationProvisioningAuthException.getCause());
  }

  /**
   * Test {@link IntegrationProvisioningAuthException#IntegrationProvisioningAuthException(String, Throwable, String[])}.
   * <ul>
   *   <li>Then return LocalizedMessage is a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link IntegrationProvisioningAuthException#IntegrationProvisioningAuthException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void IntegrationProvisioningAuthException.<init>(String, Throwable, String[])"})
  public void testNewIntegrationProvisioningAuthException_thenReturnLocalizedMessageIsAString() {
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
    assertSame(cause, actualIntegrationProvisioningAuthException.getCause());
  }

  /**
   * Test {@link IntegrationProvisioningAuthException#IntegrationProvisioningAuthException(String, Throwable, String[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IntegrationProvisioningAuthException#IntegrationProvisioningAuthException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void IntegrationProvisioningAuthException.<init>(String, Throwable, String[])"})
  public void testNewIntegrationProvisioningAuthException_whenNull_thenReturnCauseIsNull() {
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
}
