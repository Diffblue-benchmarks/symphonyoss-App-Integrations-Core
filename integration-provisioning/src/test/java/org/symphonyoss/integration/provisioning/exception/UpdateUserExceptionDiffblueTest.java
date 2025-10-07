package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UpdateUserExceptionDiffblueTest {
  /**
   * Test {@link UpdateUserException#UpdateUserException(String, Throwable, String[])}.
   *
   * <p>Method under test: {@link UpdateUserException#UpdateUserException(String, Throwable,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UpdateUserException.<init>(String, Throwable, String[])"})
  public void testNewUpdateUserException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    UpdateUserException actualUpdateUserException =
        new UpdateUserException("An error occurred", cause, "Solution");

    // Assert
    assertEquals(
        "\nComponent: User Provisioning\nMessage: An error occurred\nSolutions: \nSolution\nStack trace: \n",
        actualUpdateUserException.getLocalizedMessage());
    assertEquals(
        "\nComponent: User Provisioning\nMessage: An error occurred\nSolutions: \nSolution\nStack trace: \n",
        actualUpdateUserException.getMessage());
    assertSame(cause, actualUpdateUserException.getCause());
  }

  /**
   * Test {@link UpdateUserException#UpdateUserException(String, Throwable, String[])}.
   *
   * <p>Method under test: {@link UpdateUserException#UpdateUserException(String, Throwable,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UpdateUserException.<init>(String, Throwable, String[])"})
  public void testNewUpdateUserException2() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    UpdateUserException actualUpdateUserException = new UpdateUserException("", cause, "Solution");

    // Assert
    assertEquals(
        "\nComponent: User Provisioning\nMessage: None\nSolutions: \nSolution\nStack trace: \n",
        actualUpdateUserException.getLocalizedMessage());
    assertEquals(
        "\nComponent: User Provisioning\nMessage: None\nSolutions: \nSolution\nStack trace: \n",
        actualUpdateUserException.getMessage());
    assertSame(cause, actualUpdateUserException.getCause());
  }

  /**
   * Test {@link UpdateUserException#UpdateUserException(String, Throwable, String[])}.
   *
   * <p>Method under test: {@link UpdateUserException#UpdateUserException(String, Throwable,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UpdateUserException.<init>(String, Throwable, String[])"})
  public void testNewUpdateUserException3() {
    // Arrange and Act
    UpdateUserException actualUpdateUserException =
        new UpdateUserException("An error occurred", null, "Solution");

    // Assert
    assertEquals(
        "\nComponent: User Provisioning\nMessage: An error occurred\nSolutions: \nSolution\n",
        actualUpdateUserException.getLocalizedMessage());
    assertEquals(
        "\nComponent: User Provisioning\nMessage: An error occurred\nSolutions: \nSolution\n",
        actualUpdateUserException.getMessage());
    assertNull(actualUpdateUserException.getCause());
    assertEquals(0, actualUpdateUserException.getSuppressed().length);
  }

  /**
   * Test {@link UpdateUserException#UpdateUserException(String, Throwable, String[])}.
   *
   * <ul>
   *   <li>Then return LocalizedMessage is a string.
   * </ul>
   *
   * <p>Method under test: {@link UpdateUserException#UpdateUserException(String, Throwable,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UpdateUserException.<init>(String, Throwable, String[])"})
  public void testNewUpdateUserException_thenReturnLocalizedMessageIsAString() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    UpdateUserException actualUpdateUserException =
        new UpdateUserException("An error occurred", cause);

    // Assert
    assertEquals(
        "\n"
            + "Component: User Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n"
            + "Stack trace: \n",
        actualUpdateUserException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: User Provisioning\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n"
            + "Stack trace: \n",
        actualUpdateUserException.getMessage());
    assertSame(cause, actualUpdateUserException.getCause());
  }
}
