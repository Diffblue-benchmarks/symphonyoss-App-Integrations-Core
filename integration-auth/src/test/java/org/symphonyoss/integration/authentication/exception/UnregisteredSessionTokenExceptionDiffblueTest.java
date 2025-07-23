package org.symphonyoss.integration.authentication.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UnregisteredSessionTokenExceptionDiffblueTest {
  /**
   * Test {@link UnregisteredSessionTokenException#UnregisteredSessionTokenException(String,
   * String[])}.
   *
   * <p>Method under test: {@link
   * UnregisteredSessionTokenException#UnregisteredSessionTokenException(String, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnregisteredSessionTokenException.<init>(String, String[])"})
  public void testNewUnregisteredSessionTokenException() {
    // Arrange and Act
    UnregisteredSessionTokenException actualUnregisteredSessionTokenException =
        new UnregisteredSessionTokenException("An error occurred", "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Authentication Proxy\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualUnregisteredSessionTokenException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Authentication Proxy\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualUnregisteredSessionTokenException.getMessage());
    assertNull(actualUnregisteredSessionTokenException.getCause());
    assertEquals(0, actualUnregisteredSessionTokenException.getSuppressed().length);
  }
}
