package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class UserSearchExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link UserSearchException#UserSearchException(String, Throwable, String[])}
   */
  @Test
  public void testNewUserSearchException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    UserSearchException actualUserSearchException = new UserSearchException("0123456789ABCDEF", cause,
        "0123456789ABCDEF");

    // Assert
    assertEquals(
        "\nComponent: User Provisioning\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\nStack trace: \n",
        actualUserSearchException.getLocalizedMessage());
    assertEquals(
        "\nComponent: User Provisioning\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\nStack trace: \n",
        actualUserSearchException.getMessage());
    assertEquals(0, actualUserSearchException.getSuppressed().length);
    assertSame(cause, actualUserSearchException.getCause());
  }

  /**
   * Method under test:
   * {@link UserSearchException#UserSearchException(String, Throwable, String[])}
   */
  @Test
  public void testNewUserSearchException2() {
    // Arrange and Act
    UserSearchException actualUserSearchException = new UserSearchException(null, null, null);

    // Assert
    assertEquals(
        "\n" + "Component: User Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualUserSearchException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: User Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualUserSearchException.getMessage());
    assertNull(actualUserSearchException.getCause());
    assertEquals(0, actualUserSearchException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link UserSearchException#UserSearchException(String, Throwable, String[])}
   */
  @Test
  public void testNewUserSearchException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    UserSearchException actualUserSearchException = new UserSearchException("0123456789ABCDEF", cause);

    // Assert
    assertEquals(
        "\n" + "Component: User Provisioning\n" + "Message: 0123456789ABCDEF\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualUserSearchException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: User Provisioning\n" + "Message: 0123456789ABCDEF\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualUserSearchException.getMessage());
    assertEquals(0, actualUserSearchException.getSuppressed().length);
    assertSame(cause, actualUserSearchException.getCause());
  }

  /**
   * Method under test:
   * {@link UserSearchException#UserSearchException(String, String[])}
   */
  @Test
  public void testNewUserSearchException4() {
    // Arrange and Act
    UserSearchException actualUserSearchException = new UserSearchException("0123456789ABCDEF", "0123456789ABCDEF");

    // Assert
    assertEquals("\nComponent: User Provisioning\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\n",
        actualUserSearchException.getLocalizedMessage());
    assertEquals("\nComponent: User Provisioning\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\n",
        actualUserSearchException.getMessage());
    assertNull(actualUserSearchException.getCause());
    assertEquals(0, actualUserSearchException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link UserSearchException#UserSearchException(String, String[])}
   */
  @Test
  public void testNewUserSearchException5() {
    // Arrange and Act
    UserSearchException actualUserSearchException = new UserSearchException(null, null);

    // Assert
    assertEquals(
        "\n" + "Component: User Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualUserSearchException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: User Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualUserSearchException.getMessage());
    assertNull(actualUserSearchException.getCause());
    assertEquals(0, actualUserSearchException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link UserSearchException#UserSearchException(String, String[])}
   */
  @Test
  public void testNewUserSearchException6() {
    // Arrange and Act
    UserSearchException actualUserSearchException = new UserSearchException("0123456789ABCDEF");

    // Assert
    assertEquals(
        "\n" + "Component: User Provisioning\n" + "Message: 0123456789ABCDEF\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualUserSearchException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: User Provisioning\n" + "Message: 0123456789ABCDEF\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualUserSearchException.getMessage());
    assertNull(actualUserSearchException.getCause());
    assertEquals(0, actualUserSearchException.getSuppressed().length);
  }
}
