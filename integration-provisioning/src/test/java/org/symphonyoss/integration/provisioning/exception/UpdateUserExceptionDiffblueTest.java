package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class UpdateUserExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link UpdateUserException#UpdateUserException(String, Throwable, String[])}
   */
  @Test
  public void testNewUpdateUserException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    UpdateUserException actualUpdateUserException = new UpdateUserException("An error occurred", cause, "Solution");

    // Assert
    assertEquals("\nComponent: User Provisioning\nMessage: An error occurred\nSolutions: \nSolution\nStack trace: \n",
        actualUpdateUserException.getLocalizedMessage());
    assertEquals("\nComponent: User Provisioning\nMessage: An error occurred\nSolutions: \nSolution\nStack trace: \n",
        actualUpdateUserException.getMessage());
    assertEquals(0, actualUpdateUserException.getSuppressed().length);
    assertSame(cause, actualUpdateUserException.getCause());
  }

  /**
   * Method under test:
   * {@link UpdateUserException#UpdateUserException(String, Throwable, String[])}
   */
  @Test
  public void testNewUpdateUserException2() {
    // Arrange and Act
    UpdateUserException actualUpdateUserException = new UpdateUserException(null, null, null);

    // Assert
    assertEquals(
        "\n" + "Component: User Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualUpdateUserException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: User Provisioning\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualUpdateUserException.getMessage());
    assertNull(actualUpdateUserException.getCause());
    assertEquals(0, actualUpdateUserException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link UpdateUserException#UpdateUserException(String, Throwable, String[])}
   */
  @Test
  public void testNewUpdateUserException3() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    UpdateUserException actualUpdateUserException = new UpdateUserException("An error occurred", cause);

    // Assert
    assertEquals(
        "\n" + "Component: User Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualUpdateUserException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: User Provisioning\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n" + "Stack trace: \n",
        actualUpdateUserException.getMessage());
    assertEquals(0, actualUpdateUserException.getSuppressed().length);
    assertSame(cause, actualUpdateUserException.getCause());
  }
}
