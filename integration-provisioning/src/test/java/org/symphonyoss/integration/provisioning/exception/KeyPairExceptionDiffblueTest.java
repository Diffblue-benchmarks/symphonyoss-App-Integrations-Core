package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class KeyPairExceptionDiffblueTest {
  /**
   * Test {@link KeyPairException#KeyPairException(String, Throwable, String[])}.
   *
   * <p>Method under test: {@link KeyPairException#KeyPairException(String, Throwable, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeyPairException.<init>(String, Throwable, String[])"})
  public void testNewKeyPairException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    KeyPairException actualKeyPairException =
        new KeyPairException("An error occurred", cause, "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Key Pair Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualKeyPairException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Key Pair Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualKeyPairException.getMessage());
    assertSame(cause, actualKeyPairException.getCause());
  }

  /**
   * Test {@link KeyPairException#KeyPairException(String, Throwable, String[])}.
   *
   * <p>Method under test: {@link KeyPairException#KeyPairException(String, Throwable, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeyPairException.<init>(String, Throwable, String[])"})
  public void testNewKeyPairException2() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    KeyPairException actualKeyPairException = new KeyPairException("", cause, "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Key Pair Provisioning\nMessage: None\nSolutions: \nSolutions\nStack trace: \n",
        actualKeyPairException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Key Pair Provisioning\nMessage: None\nSolutions: \nSolutions\nStack trace: \n",
        actualKeyPairException.getMessage());
    assertSame(cause, actualKeyPairException.getCause());
  }

  /**
   * Test {@link KeyPairException#KeyPairException(String, String[])}.
   *
   * <p>Method under test: {@link KeyPairException#KeyPairException(String, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeyPairException.<init>(String, String[])"})
  public void testNewKeyPairException3() {
    // Arrange and Act
    KeyPairException actualKeyPairException =
        new KeyPairException("An error occurred", "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Key Pair Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualKeyPairException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Key Pair Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualKeyPairException.getMessage());
    assertNull(actualKeyPairException.getCause());
    assertEquals(0, actualKeyPairException.getSuppressed().length);
  }

  /**
   * Test {@link KeyPairException#KeyPairException(String, String[])}.
   *
   * <p>Method under test: {@link KeyPairException#KeyPairException(String, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeyPairException.<init>(String, String[])"})
  public void testNewKeyPairException4() {
    // Arrange and Act
    KeyPairException actualKeyPairException = new KeyPairException("", "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Key Pair Provisioning\nMessage: None\nSolutions: \nSolutions\n",
        actualKeyPairException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Key Pair Provisioning\nMessage: None\nSolutions: \nSolutions\n",
        actualKeyPairException.getMessage());
    assertNull(actualKeyPairException.getCause());
    assertEquals(0, actualKeyPairException.getSuppressed().length);
  }

  /**
   * Test {@link KeyPairException#KeyPairException(String, Throwable, String[])}.
   *
   * <ul>
   *   <li>When {@code An error occurred}.
   *   <li>Then return LocalizedMessage is a string.
   * </ul>
   *
   * <p>Method under test: {@link KeyPairException#KeyPairException(String, Throwable, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeyPairException.<init>(String, Throwable, String[])"})
  public void testNewKeyPairException_whenAnErrorOccurred_thenReturnLocalizedMessageIsAString() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    KeyPairException actualKeyPairException = new KeyPairException("An error occurred", cause);

    // Assert
    assertEquals(
        "\n"
            + "Component: Key Pair Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n"
            + "Stack trace: \n",
        actualKeyPairException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Key Pair Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n"
            + "Stack trace: \n",
        actualKeyPairException.getMessage());
    assertSame(cause, actualKeyPairException.getCause());
  }

  /**
   * Test {@link KeyPairException#KeyPairException(String, String[])}.
   *
   * <ul>
   *   <li>When {@code An error occurred}.
   *   <li>Then return LocalizedMessage is a string.
   * </ul>
   *
   * <p>Method under test: {@link KeyPairException#KeyPairException(String, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void KeyPairException.<init>(String, String[])"})
  public void testNewKeyPairException_whenAnErrorOccurred_thenReturnLocalizedMessageIsAString2() {
    // Arrange and Act
    KeyPairException actualKeyPairException = new KeyPairException("An error occurred");

    // Assert
    assertEquals(
        "\n"
            + "Component: Key Pair Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualKeyPairException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Key Pair Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualKeyPairException.getMessage());
    assertNull(actualKeyPairException.getCause());
    assertEquals(0, actualKeyPairException.getSuppressed().length);
  }
}
