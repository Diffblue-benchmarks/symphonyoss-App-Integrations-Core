package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class CompanyCertificateExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link CompanyCertificateException#CompanyCertificateException(String, Throwable, String[])}
   */
  @Test
  public void testNewCompanyCertificateException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    CompanyCertificateException actualCompanyCertificateException = new CompanyCertificateException("An error occurred",
        cause, "Solutions");

    // Assert
    assertEquals("\n" + "Component: Company Certificate Provisioning\n" + "Message: An error occurred\n"
        + "Solutions: \n" + "Solutions\n" + "Stack trace: \n", actualCompanyCertificateException.getLocalizedMessage());
    assertEquals("\n" + "Component: Company Certificate Provisioning\n" + "Message: An error occurred\n"
        + "Solutions: \n" + "Solutions\n" + "Stack trace: \n", actualCompanyCertificateException.getMessage());
    assertEquals(0, actualCompanyCertificateException.getSuppressed().length);
    assertSame(cause, actualCompanyCertificateException.getCause());
  }

  /**
   * Method under test:
   * {@link CompanyCertificateException#CompanyCertificateException(String, Throwable, String[])}
   */
  @Test
  public void testNewCompanyCertificateException2() {
    // Arrange and Act
    CompanyCertificateException actualCompanyCertificateException = new CompanyCertificateException(null, null, null);

    // Assert
    assertEquals(
        "\n" + "Component: Company Certificate Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualCompanyCertificateException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Company Certificate Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualCompanyCertificateException.getMessage());
    assertNull(actualCompanyCertificateException.getCause());
    assertEquals(0, actualCompanyCertificateException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link CompanyCertificateException#CompanyCertificateException(String, Throwable, String[])}
   */
  @Test
  public void testNewCompanyCertificateException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    CompanyCertificateException actualCompanyCertificateException = new CompanyCertificateException("An error occurred",
        cause);

    // Assert
    assertEquals(
        "\n" + "Component: Company Certificate Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualCompanyCertificateException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Company Certificate Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualCompanyCertificateException.getMessage());
    assertEquals(0, actualCompanyCertificateException.getSuppressed().length);
    assertSame(cause, actualCompanyCertificateException.getCause());
  }

  /**
   * Method under test:
   * {@link CompanyCertificateException#CompanyCertificateException(String, String[])}
   */
  @Test
  public void testNewCompanyCertificateException4() {
    // Arrange and Act
    CompanyCertificateException actualCompanyCertificateException = new CompanyCertificateException("An error occurred",
        "Solutions");

    // Assert
    assertEquals("\nComponent: Company Certificate Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualCompanyCertificateException.getLocalizedMessage());
    assertEquals("\nComponent: Company Certificate Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualCompanyCertificateException.getMessage());
    assertNull(actualCompanyCertificateException.getCause());
    assertEquals(0, actualCompanyCertificateException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link CompanyCertificateException#CompanyCertificateException(String, String[])}
   */
  @Test
  public void testNewCompanyCertificateException5() {
    // Arrange and Act
    CompanyCertificateException actualCompanyCertificateException = new CompanyCertificateException(null, null);

    // Assert
    assertEquals(
        "\n" + "Component: Company Certificate Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualCompanyCertificateException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Company Certificate Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualCompanyCertificateException.getMessage());
    assertNull(actualCompanyCertificateException.getCause());
    assertEquals(0, actualCompanyCertificateException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link CompanyCertificateException#CompanyCertificateException(String, String[])}
   */
  @Test
  public void testNewCompanyCertificateException6() {
    // Arrange and Act
    CompanyCertificateException actualCompanyCertificateException = new CompanyCertificateException(
        "An error occurred");

    // Assert
    assertEquals(
        "\n" + "Component: Company Certificate Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualCompanyCertificateException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Company Certificate Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualCompanyCertificateException.getMessage());
    assertNull(actualCompanyCertificateException.getCause());
    assertEquals(0, actualCompanyCertificateException.getSuppressed().length);
  }
}
