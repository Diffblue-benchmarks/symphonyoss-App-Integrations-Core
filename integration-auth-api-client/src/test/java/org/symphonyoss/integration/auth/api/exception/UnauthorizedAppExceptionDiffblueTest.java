package org.symphonyoss.integration.auth.api.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UnauthorizedAppExceptionDiffblueTest {
  /**
   * Test {@link UnauthorizedAppException#UnauthorizedAppException(String, Throwable, String[])}.
   * <p>
   * Method under test: {@link UnauthorizedAppException#UnauthorizedAppException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void UnauthorizedAppException.<init>(String, Throwable, String[])"})
  public void testNewUnauthorizedAppException() {
    // Arrange
    Throwable e = new Throwable();

    // Act
    UnauthorizedAppException actualUnauthorizedAppException = new UnauthorizedAppException("An error occurred", e,
        "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Authentication Proxy\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualUnauthorizedAppException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Authentication Proxy\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualUnauthorizedAppException.getMessage());
    assertEquals(0, actualUnauthorizedAppException.getSuppressed().length);
    assertSame(e, actualUnauthorizedAppException.getCause());
  }
}
