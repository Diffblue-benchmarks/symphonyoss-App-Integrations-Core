package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class ApplicationProvisioningExceptionDiffblueTest {
  /**
   * Test {@link ApplicationProvisioningException#ApplicationProvisioningException(String, Throwable, String[])}.
   * <p>
   * Method under test: {@link ApplicationProvisioningException#ApplicationProvisioningException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void ApplicationProvisioningException.<init>(String, Throwable, String[])"})
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
    assertSame(cause, actualApplicationProvisioningException.getCause());
  }

  /**
   * Test {@link ApplicationProvisioningException#ApplicationProvisioningException(String, String[])}.
   * <p>
   * Method under test: {@link ApplicationProvisioningException#ApplicationProvisioningException(String, String[])}
   */
  @Test
  @MethodsUnderTest({"void ApplicationProvisioningException.<init>(String, String[])"})
  public void testNewApplicationProvisioningException2() {
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
   * Test {@link ApplicationProvisioningException#ApplicationProvisioningException(String, Throwable, String[])}.
   * <ul>
   *   <li>Then return LocalizedMessage is a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationProvisioningException#ApplicationProvisioningException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void ApplicationProvisioningException.<init>(String, Throwable, String[])"})
  public void testNewApplicationProvisioningException_thenReturnLocalizedMessageIsAString() {
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
    assertSame(cause, actualApplicationProvisioningException.getCause());
  }

  /**
   * Test {@link ApplicationProvisioningException#ApplicationProvisioningException(String, String[])}.
   * <ul>
   *   <li>Then return LocalizedMessage is a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationProvisioningException#ApplicationProvisioningException(String, String[])}
   */
  @Test
  @MethodsUnderTest({"void ApplicationProvisioningException.<init>(String, String[])"})
  public void testNewApplicationProvisioningException_thenReturnLocalizedMessageIsAString2() {
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

  /**
   * Test {@link ApplicationProvisioningException#ApplicationProvisioningException(String, String[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationProvisioningException#ApplicationProvisioningException(String, String[])}
   */
  @Test
  @MethodsUnderTest({"void ApplicationProvisioningException.<init>(String, String[])"})
  public void testNewApplicationProvisioningException_whenNull() {
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
   * Test {@link ApplicationProvisioningException#ApplicationProvisioningException(String, Throwable, String[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationProvisioningException#ApplicationProvisioningException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void ApplicationProvisioningException.<init>(String, Throwable, String[])"})
  public void testNewApplicationProvisioningException_whenNull_thenReturnCauseIsNull() {
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
}
