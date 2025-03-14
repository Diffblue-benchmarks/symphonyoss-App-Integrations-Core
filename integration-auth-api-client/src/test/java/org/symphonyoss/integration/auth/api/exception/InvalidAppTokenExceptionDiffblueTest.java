package org.symphonyoss.integration.auth.api.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class InvalidAppTokenExceptionDiffblueTest {
  /**
   * Test {@link InvalidAppTokenException#InvalidAppTokenException(String, Throwable, String[])}.
   * <p>
   * Method under test: {@link InvalidAppTokenException#InvalidAppTokenException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void InvalidAppTokenException.<init>(String, Throwable, String[])"})
  public void testNewInvalidAppTokenException() {
    // Arrange
    Throwable e = new Throwable();

    // Act
    InvalidAppTokenException actualInvalidAppTokenException = new InvalidAppTokenException("An error occurred", e,
        "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Authentication Proxy\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualInvalidAppTokenException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Authentication Proxy\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualInvalidAppTokenException.getMessage());
    assertEquals(0, actualInvalidAppTokenException.getSuppressed().length);
    assertSame(e, actualInvalidAppTokenException.getCause());
  }
}
