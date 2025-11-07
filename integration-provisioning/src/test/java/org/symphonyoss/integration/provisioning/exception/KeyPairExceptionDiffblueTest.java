package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class KeyPairExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link KeyPairException#KeyPairException(String, Throwable, String[])}
   */
  @Test
  public void testNewKeyPairException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    KeyPairException actualKeyPairException = new KeyPairException("An error occurred", cause, "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Key Pair Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualKeyPairException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Key Pair Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualKeyPairException.getMessage());
    assertEquals(0, actualKeyPairException.getSuppressed().length);
    assertSame(cause, actualKeyPairException.getCause());
  }

  /**
   * Method under test:
   * {@link KeyPairException#KeyPairException(String, Throwable, String[])}
   */
  @Test
  public void testNewKeyPairException2() {
    // Arrange and Act
    KeyPairException actualKeyPairException = new KeyPairException(null, null, null);

    // Assert
    assertEquals(
        "\n" + "Component: Key Pair Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualKeyPairException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Key Pair Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualKeyPairException.getMessage());
    assertNull(actualKeyPairException.getCause());
    assertEquals(0, actualKeyPairException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link KeyPairException#KeyPairException(String, Throwable, String[])}
   */
  @Test
  public void testNewKeyPairException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    KeyPairException actualKeyPairException = new KeyPairException("An error occurred", cause);

    // Assert
    assertEquals(
        "\n" + "Component: Key Pair Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualKeyPairException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Key Pair Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualKeyPairException.getMessage());
    assertEquals(0, actualKeyPairException.getSuppressed().length);
    assertSame(cause, actualKeyPairException.getCause());
  }

  /**
   * Method under test:
   * {@link KeyPairException#KeyPairException(String, String[])}
   */
  @Test
  public void testNewKeyPairException4() {
    // Arrange and Act
    KeyPairException actualKeyPairException = new KeyPairException("An error occurred", "Solutions");

    // Assert
    assertEquals("\nComponent: Key Pair Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualKeyPairException.getLocalizedMessage());
    assertEquals("\nComponent: Key Pair Provisioning\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualKeyPairException.getMessage());
    assertNull(actualKeyPairException.getCause());
    assertEquals(0, actualKeyPairException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link KeyPairException#KeyPairException(String, String[])}
   */
  @Test
  public void testNewKeyPairException5() {
    // Arrange and Act
    KeyPairException actualKeyPairException = new KeyPairException(null, null);

    // Assert
    assertEquals(
        "\n" + "Component: Key Pair Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualKeyPairException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Key Pair Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualKeyPairException.getMessage());
    assertNull(actualKeyPairException.getCause());
    assertEquals(0, actualKeyPairException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link KeyPairException#KeyPairException(String, String[])}
   */
  @Test
  public void testNewKeyPairException6() {
    // Arrange and Act
    KeyPairException actualKeyPairException = new KeyPairException("An error occurred");

    // Assert
    assertEquals(
        "\n" + "Component: Key Pair Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualKeyPairException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Key Pair Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualKeyPairException.getMessage());
    assertNull(actualKeyPairException.getCause());
    assertEquals(0, actualKeyPairException.getSuppressed().length);
  }
}
