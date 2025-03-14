package org.symphonyoss.integration.config.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class InitializationConfigExceptionDiffblueTest {
  /**
   * Test {@link InitializationConfigException#InitializationConfigException(String, Throwable, String)}.
   * <p>
   * Method under test: {@link InitializationConfigException#InitializationConfigException(String, Throwable, String)}
   */
  @Test
  @MethodsUnderTest({"void InitializationConfigException.<init>(String, Throwable, String)"})
  public void testNewInitializationConfigException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    InitializationConfigException actualInitializationConfigException = new InitializationConfigException(
        "An error occurred", cause, "Solution");

    // Assert
    assertEquals(
        "\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolution\nStack trace: \n",
        actualInitializationConfigException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolution\nStack trace: \n",
        actualInitializationConfigException.getMessage());
    assertEquals(0, actualInitializationConfigException.getSuppressed().length);
    assertSame(cause, actualInitializationConfigException.getCause());
  }
}
