package org.symphonyoss.integration.config.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class SaveInstanceExceptionDiffblueTest {
  /**
   * Test {@link SaveInstanceException#SaveInstanceException(String, Throwable, String[])}.
   * <p>
   * Method under test: {@link SaveInstanceException#SaveInstanceException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void SaveInstanceException.<init>(String, Throwable, String[])"})
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
