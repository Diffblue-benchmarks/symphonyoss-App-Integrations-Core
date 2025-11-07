package org.symphonyoss.integration.auth.api.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class UnexpectedAppAuthenticationExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link UnexpectedAppAuthenticationException#UnexpectedAppAuthenticationException(String, Throwable, String[])}
   */
  @Test
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
