package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UsernameMismatchExceptionDiffblueTest {
  /**
   * Test {@link UsernameMismatchException#UsernameMismatchException(String, String[])}.
   *
   * <p>Method under test: {@link UsernameMismatchException#UsernameMismatchException(String,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UsernameMismatchException.<init>(String, String[])"})
  public void testNewUsernameMismatchException() {
    // Arrange and Act
    UsernameMismatchException actualUsernameMismatchException =
        new UsernameMismatchException("0123456789ABCDEF", "0123456789ABCDEF");

    // Assert
    assertEquals(
        "\nComponent: Provisioning tool\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\n",
        actualUsernameMismatchException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Provisioning tool\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\n",
        actualUsernameMismatchException.getMessage());
    assertNull(actualUsernameMismatchException.getCause());
    assertEquals(0, actualUsernameMismatchException.getSuppressed().length);
  }

  /**
   * Test {@link UsernameMismatchException#UsernameMismatchException(String, String[])}.
   *
   * <p>Method under test: {@link UsernameMismatchException#UsernameMismatchException(String,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UsernameMismatchException.<init>(String, String[])"})
  public void testNewUsernameMismatchException2() {
    // Arrange and Act
    UsernameMismatchException actualUsernameMismatchException =
        new UsernameMismatchException("", "0123456789ABCDEF");

    // Assert
    assertEquals(
        "\nComponent: Provisioning tool\nMessage: None\nSolutions: \n0123456789ABCDEF\n",
        actualUsernameMismatchException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Provisioning tool\nMessage: None\nSolutions: \n0123456789ABCDEF\n",
        actualUsernameMismatchException.getMessage());
    assertNull(actualUsernameMismatchException.getCause());
    assertEquals(0, actualUsernameMismatchException.getSuppressed().length);
  }

  /**
   * Test {@link UsernameMismatchException#UsernameMismatchException(String, String[])}.
   *
   * <ul>
   *   <li>Then return LocalizedMessage is a string.
   * </ul>
   *
   * <p>Method under test: {@link UsernameMismatchException#UsernameMismatchException(String,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UsernameMismatchException.<init>(String, String[])"})
  public void testNewUsernameMismatchException_thenReturnLocalizedMessageIsAString() {
    // Arrange and Act
    UsernameMismatchException actualUsernameMismatchException =
        new UsernameMismatchException("0123456789ABCDEF");

    // Assert
    assertEquals(
        "\n"
            + "Component: Provisioning tool\n"
            + "Message: 0123456789ABCDEF\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualUsernameMismatchException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Provisioning tool\n"
            + "Message: 0123456789ABCDEF\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualUsernameMismatchException.getMessage());
    assertNull(actualUsernameMismatchException.getCause());
    assertEquals(0, actualUsernameMismatchException.getSuppressed().length);
  }
}
