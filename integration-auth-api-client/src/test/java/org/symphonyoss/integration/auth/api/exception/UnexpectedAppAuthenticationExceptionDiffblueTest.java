package org.symphonyoss.integration.auth.api.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnexpectedAppAuthenticationExceptionDiffblueTest {
  /**
   * Test {@link UnexpectedAppAuthenticationException#UnexpectedAppAuthenticationException(String, Throwable, String[])}.
   * <p>
   * Method under test: {@link UnexpectedAppAuthenticationException#UnexpectedAppAuthenticationException(String, Throwable, String[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void UnexpectedAppAuthenticationException.<init>(String, Throwable, String[])"})
  public void testNewUnexpectedAppAuthenticationException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    UnexpectedAppAuthenticationException actualUnexpectedAppAuthenticationException = new UnexpectedAppAuthenticationException(
        "An error occurred", cause, "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Authentication Proxy\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualUnexpectedAppAuthenticationException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Authentication Proxy\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualUnexpectedAppAuthenticationException.getMessage());
    assertEquals(0, actualUnexpectedAppAuthenticationException.getSuppressed().length);
    assertSame(cause, actualUnexpectedAppAuthenticationException.getCause());
  }
}
