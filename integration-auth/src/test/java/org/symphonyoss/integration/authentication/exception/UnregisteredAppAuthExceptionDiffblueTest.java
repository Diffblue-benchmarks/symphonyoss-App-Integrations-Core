package org.symphonyoss.integration.authentication.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UnregisteredAppAuthExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link UnregisteredAppAuthException#UnregisteredAppAuthException(String, String[])}
   */
  @Test
  public void testNewUnregisteredAppAuthException() {
    // Arrange and Act
    UnregisteredAppAuthException actualUnregisteredAppAuthException = new UnregisteredAppAuthException(
        "0123456789ABCDEF", "0123456789ABCDEF");

    // Assert
    assertEquals("\nComponent: Authentication Proxy\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\n",
        actualUnregisteredAppAuthException.getLocalizedMessage());
    assertEquals("\nComponent: Authentication Proxy\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\n",
        actualUnregisteredAppAuthException.getMessage());
    assertNull(actualUnregisteredAppAuthException.getCause());
    assertEquals(0, actualUnregisteredAppAuthException.getSuppressed().length);
  }
}
