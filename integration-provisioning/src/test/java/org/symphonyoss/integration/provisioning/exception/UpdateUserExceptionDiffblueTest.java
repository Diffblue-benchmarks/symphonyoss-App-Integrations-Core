package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UpdateUserExceptionDiffblueTest {
  /**
   * Test {@link UpdateUserException#UpdateUserException(String, Throwable, String[])}.
   * <p>
   * Method under test: {@link UpdateUserException#UpdateUserException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void UpdateUserException.<init>(String, Throwable, String[])"})
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
    assertSame(cause, actualUpdateUserException.getCause());
  }

  /**
   * Test {@link UpdateUserException#UpdateUserException(String, Throwable, String[])}.
   * <ul>
   *   <li>Then return LocalizedMessage is a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link UpdateUserException#UpdateUserException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void UpdateUserException.<init>(String, Throwable, String[])"})
  public void testNewUpdateUserException_thenReturnLocalizedMessageIsAString() {
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
    assertSame(cause, actualUpdateUserException.getCause());
  }

  /**
   * Test {@link UpdateUserException#UpdateUserException(String, Throwable, String[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UpdateUserException#UpdateUserException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void UpdateUserException.<init>(String, Throwable, String[])"})
  public void testNewUpdateUserException_whenNull_thenReturnCauseIsNull() {
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
}
