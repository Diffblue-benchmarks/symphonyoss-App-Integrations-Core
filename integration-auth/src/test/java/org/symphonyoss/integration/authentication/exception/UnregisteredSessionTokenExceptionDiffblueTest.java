package org.symphonyoss.integration.authentication.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UnregisteredSessionTokenExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link UnregisteredSessionTokenException#UnregisteredSessionTokenException(String, String[])}
   */
  @Test
  public void testNewUnregisteredSessionTokenException() {
    // Arrange and Act
    UnregisteredSessionTokenException actualUnregisteredSessionTokenException = new UnregisteredSessionTokenException(
        "An error occurred", "Solutions");

    // Assert
    assertEquals("\nComponent: Authentication Proxy\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualUnregisteredSessionTokenException.getLocalizedMessage());
    assertEquals("\nComponent: Authentication Proxy\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualUnregisteredSessionTokenException.getMessage());
    assertNull(actualUnregisteredSessionTokenException.getCause());
    assertEquals(0, actualUnregisteredSessionTokenException.getSuppressed().length);
  }
}
