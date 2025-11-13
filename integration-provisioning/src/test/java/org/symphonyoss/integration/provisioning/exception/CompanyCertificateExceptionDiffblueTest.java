package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class CompanyCertificateExceptionDiffblueTest {
  /**
   * Test {@link CompanyCertificateException#CompanyCertificateException(String, Throwable,
   * String[])}.
   *
   * <p>Method under test: {@link CompanyCertificateException#CompanyCertificateException(String,
   * Throwable, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompanyCertificateException.<init>(String, Throwable, String[])"})
  public void testNewCompanyCertificateException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    CompanyCertificateException actualCompanyCertificateException =
        new CompanyCertificateException("", cause, "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Company Certificate Provisioning\nMessage: None\nSolutions: \nSolutions\nStack trace: \n",
        actualCompanyCertificateException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Company Certificate Provisioning\nMessage: None\nSolutions: \nSolutions\nStack trace: \n",
        actualCompanyCertificateException.getMessage());
    assertSame(cause, actualCompanyCertificateException.getCause());
  }

  /**
   * Test {@link CompanyCertificateException#CompanyCertificateException(String, String[])}.
   *
   * <p>Method under test: {@link CompanyCertificateException#CompanyCertificateException(String,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompanyCertificateException.<init>(String, String[])"})
  public void testNewCompanyCertificateException2() {
    // Arrange and Act
    CompanyCertificateException actualCompanyCertificateException =
        new CompanyCertificateException("An error occurred", "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Company Certificate Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualCompanyCertificateException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Company Certificate Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualCompanyCertificateException.getMessage());
    assertNull(actualCompanyCertificateException.getCause());
    assertEquals(0, actualCompanyCertificateException.getSuppressed().length);
  }

  /**
   * Test {@link CompanyCertificateException#CompanyCertificateException(String, String[])}.
   *
   * <p>Method under test: {@link CompanyCertificateException#CompanyCertificateException(String,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompanyCertificateException.<init>(String, String[])"})
  public void testNewCompanyCertificateException3() {
    // Arrange and Act
    CompanyCertificateException actualCompanyCertificateException =
        new CompanyCertificateException("", "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Company Certificate Provisioning\nMessage: None\nSolutions: \nSolutions\n",
        actualCompanyCertificateException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Company Certificate Provisioning\nMessage: None\nSolutions: \nSolutions\n",
        actualCompanyCertificateException.getMessage());
    assertNull(actualCompanyCertificateException.getCause());
    assertEquals(0, actualCompanyCertificateException.getSuppressed().length);
  }

  /**
   * Test {@link CompanyCertificateException#CompanyCertificateException(String, Throwable,
   * String[])}.
   *
   * <ul>
   *   <li>Then return LocalizedMessage is a string.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertificateException#CompanyCertificateException(String,
   * Throwable, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompanyCertificateException.<init>(String, Throwable, String[])"})
  public void testNewCompanyCertificateException_thenReturnLocalizedMessageIsAString() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    CompanyCertificateException actualCompanyCertificateException =
        new CompanyCertificateException("An error occurred", cause, "Solutions");

    // Assert
    assertEquals(
        "\n"
            + "Component: Company Certificate Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "Solutions\n"
            + "Stack trace: \n",
        actualCompanyCertificateException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Company Certificate Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "Solutions\n"
            + "Stack trace: \n",
        actualCompanyCertificateException.getMessage());
    assertSame(cause, actualCompanyCertificateException.getCause());
  }

  /**
   * Test {@link CompanyCertificateException#CompanyCertificateException(String, Throwable,
   * String[])}.
   *
   * <ul>
   *   <li>Then return LocalizedMessage is a string.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertificateException#CompanyCertificateException(String,
   * Throwable, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompanyCertificateException.<init>(String, Throwable, String[])"})
  public void testNewCompanyCertificateException_thenReturnLocalizedMessageIsAString2() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    CompanyCertificateException actualCompanyCertificateException =
        new CompanyCertificateException("An error occurred", cause);

    // Assert
    assertEquals(
        "\n"
            + "Component: Company Certificate Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n"
            + "Stack trace: \n",
        actualCompanyCertificateException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Company Certificate Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n"
            + "Stack trace: \n",
        actualCompanyCertificateException.getMessage());
    assertSame(cause, actualCompanyCertificateException.getCause());
  }

  /**
   * Test {@link CompanyCertificateException#CompanyCertificateException(String, String[])}.
   *
   * <ul>
   *   <li>Then return LocalizedMessage is a string.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertificateException#CompanyCertificateException(String,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CompanyCertificateException.<init>(String, String[])"})
  public void testNewCompanyCertificateException_thenReturnLocalizedMessageIsAString3() {
    // Arrange and Act
    CompanyCertificateException actualCompanyCertificateException =
        new CompanyCertificateException("An error occurred");

    // Assert
    assertEquals(
        "\n"
            + "Component: Company Certificate Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualCompanyCertificateException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Company Certificate Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualCompanyCertificateException.getMessage());
    assertNull(actualCompanyCertificateException.getCause());
    assertEquals(0, actualCompanyCertificateException.getSuppressed().length);
  }
}
