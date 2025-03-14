package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class CompanyCertificateExceptionDiffblueTest {
  /**
   * Test {@link CompanyCertificateException#CompanyCertificateException(String, String[])}.
   * <p>
   * Method under test: {@link CompanyCertificateException#CompanyCertificateException(String, String[])}
   */
  @Test
  @MethodsUnderTest({"void CompanyCertificateException.<init>(String, String[])"})
  public void testNewCompanyCertificateException() {
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
   * Test {@link CompanyCertificateException#CompanyCertificateException(String, Throwable, String[])}.
   * <ul>
   *   <li>Then return Cause is {@link Throwable#Throwable()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertificateException#CompanyCertificateException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void CompanyCertificateException.<init>(String, Throwable, String[])"})
  public void testNewCompanyCertificateException_thenReturnCauseIsThrowable() {
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
    assertSame(cause, actualCompanyCertificateException.getCause());
  }

  /**
   * Test {@link CompanyCertificateException#CompanyCertificateException(String, String[])}.
   * <ul>
   *   <li>Then return LocalizedMessage is a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertificateException#CompanyCertificateException(String, String[])}
   */
  @Test
  @MethodsUnderTest({"void CompanyCertificateException.<init>(String, String[])"})
  public void testNewCompanyCertificateException_thenReturnLocalizedMessageIsAString() {
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

  /**
   * Test {@link CompanyCertificateException#CompanyCertificateException(String, Throwable, String[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertificateException#CompanyCertificateException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void CompanyCertificateException.<init>(String, Throwable, String[])"})
  public void testNewCompanyCertificateException_whenNull_thenReturnCauseIsNull() {
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
   * Test {@link CompanyCertificateException#CompanyCertificateException(String, String[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return LocalizedMessage is a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertificateException#CompanyCertificateException(String, String[])}
   */
  @Test
  @MethodsUnderTest({"void CompanyCertificateException.<init>(String, String[])"})
  public void testNewCompanyCertificateException_whenNull_thenReturnLocalizedMessageIsAString() {
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
   * Test {@link CompanyCertificateException#CompanyCertificateException(String, Throwable, String[])}.
   * <ul>
   *   <li>When {@code Solutions}.</li>
   *   <li>Then return Cause is {@link Throwable#Throwable()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertificateException#CompanyCertificateException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void CompanyCertificateException.<init>(String, Throwable, String[])"})
  public void testNewCompanyCertificateException_whenSolutions_thenReturnCauseIsThrowable() {
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
    assertSame(cause, actualCompanyCertificateException.getCause());
  }
}
