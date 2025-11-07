package org.symphonyoss.integration.config.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SaveInstanceExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link SaveInstanceException#SaveInstanceException(String, Throwable, String[])}
   */
  @Test
  public void testNewSaveInstanceException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SaveInstanceException actualSaveInstanceException = new SaveInstanceException("An error occurred", cause,
        "Solution");

    // Assert
    assertEquals(
        "\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolution\nStack trace: \n",
        actualSaveInstanceException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolution\nStack trace: \n",
        actualSaveInstanceException.getMessage());
    assertEquals(0, actualSaveInstanceException.getSuppressed().length);
    assertSame(cause, actualSaveInstanceException.getCause());
  }
}
