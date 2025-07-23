package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserSearchExceptionDiffblueTest {
  /**
   * Test {@link UserSearchException#UserSearchException(String, Throwable, String[])}.
   *
   * <p>Method under test: {@link UserSearchException#UserSearchException(String, Throwable,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserSearchException.<init>(String, Throwable, String[])"})
  public void testNewUserSearchException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    UserSearchException actualUserSearchException =
        new UserSearchException("0123456789ABCDEF", cause, "0123456789ABCDEF");

    // Assert
    assertEquals(
        "\nComponent: User Provisioning\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\nStack trace: \n",
        actualUserSearchException.getLocalizedMessage());
    assertEquals(
        "\nComponent: User Provisioning\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\nStack trace: \n",
        actualUserSearchException.getMessage());
    assertSame(cause, actualUserSearchException.getCause());
  }

  /**
   * Test {@link UserSearchException#UserSearchException(String, Throwable, String[])}.
   *
   * <p>Method under test: {@link UserSearchException#UserSearchException(String, Throwable,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserSearchException.<init>(String, Throwable, String[])"})
  public void testNewUserSearchException2() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    UserSearchException actualUserSearchException =
        new UserSearchException("", cause, "0123456789ABCDEF");

    // Assert
    assertEquals(
        "\nComponent: User Provisioning\nMessage: None\nSolutions: \n0123456789ABCDEF\nStack trace: \n",
        actualUserSearchException.getLocalizedMessage());
    assertEquals(
        "\nComponent: User Provisioning\nMessage: None\nSolutions: \n0123456789ABCDEF\nStack trace: \n",
        actualUserSearchException.getMessage());
    assertSame(cause, actualUserSearchException.getCause());
  }

  /**
   * Test {@link UserSearchException#UserSearchException(String, String[])}.
   *
   * <p>Method under test: {@link UserSearchException#UserSearchException(String, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserSearchException.<init>(String, String[])"})
  public void testNewUserSearchException3() {
    // Arrange and Act
    UserSearchException actualUserSearchException =
        new UserSearchException("0123456789ABCDEF", "0123456789ABCDEF");

    // Assert
    assertEquals(
        "\nComponent: User Provisioning\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\n",
        actualUserSearchException.getLocalizedMessage());
    assertEquals(
        "\nComponent: User Provisioning\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\n",
        actualUserSearchException.getMessage());
    assertNull(actualUserSearchException.getCause());
    assertEquals(0, actualUserSearchException.getSuppressed().length);
  }

  /**
   * Test {@link UserSearchException#UserSearchException(String, String[])}.
   *
   * <p>Method under test: {@link UserSearchException#UserSearchException(String, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserSearchException.<init>(String, String[])"})
  public void testNewUserSearchException4() {
    // Arrange and Act
    UserSearchException actualUserSearchException = new UserSearchException("", "0123456789ABCDEF");

    // Assert
    assertEquals(
        "\nComponent: User Provisioning\nMessage: None\nSolutions: \n0123456789ABCDEF\n",
        actualUserSearchException.getLocalizedMessage());
    assertEquals(
        "\nComponent: User Provisioning\nMessage: None\nSolutions: \n0123456789ABCDEF\n",
        actualUserSearchException.getMessage());
    assertNull(actualUserSearchException.getCause());
    assertEquals(0, actualUserSearchException.getSuppressed().length);
  }

  /**
   * Test {@link UserSearchException#UserSearchException(String, String[])}.
   *
   * <ul>
   *   <li>Then return LocalizedMessage is a string.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchException#UserSearchException(String, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserSearchException.<init>(String, String[])"})
  public void testNewUserSearchException_thenReturnLocalizedMessageIsAString() {
    // Arrange and Act
    UserSearchException actualUserSearchException = new UserSearchException("0123456789ABCDEF");

    // Assert
    assertEquals(
        "\n"
            + "Component: User Provisioning\n"
            + "Message: 0123456789ABCDEF\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualUserSearchException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: User Provisioning\n"
            + "Message: 0123456789ABCDEF\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualUserSearchException.getMessage());
    assertNull(actualUserSearchException.getCause());
    assertEquals(0, actualUserSearchException.getSuppressed().length);
  }

  /**
   * Test {@link UserSearchException#UserSearchException(String, Throwable, String[])}.
   *
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.
   *   <li>Then return LocalizedMessage is a string.
   * </ul>
   *
   * <p>Method under test: {@link UserSearchException#UserSearchException(String, Throwable,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserSearchException.<init>(String, Throwable, String[])"})
  public void testNewUserSearchException_whenThrowable_thenReturnLocalizedMessageIsAString() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    UserSearchException actualUserSearchException =
        new UserSearchException("0123456789ABCDEF", cause);

    // Assert
    assertEquals(
        "\n"
            + "Component: User Provisioning\n"
            + "Message: 0123456789ABCDEF\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n"
            + "Stack trace: \n",
        actualUserSearchException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: User Provisioning\n"
            + "Message: 0123456789ABCDEF\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n"
            + "Stack trace: \n",
        actualUserSearchException.getMessage());
    assertSame(cause, actualUserSearchException.getCause());
  }
}
