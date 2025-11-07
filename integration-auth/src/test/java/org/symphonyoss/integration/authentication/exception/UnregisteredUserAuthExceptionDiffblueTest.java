package org.symphonyoss.integration.authentication.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnregisteredUserAuthExceptionDiffblueTest {
  /**
   * Test {@link UnregisteredUserAuthException#UnregisteredUserAuthException(String, String[])}.
   * <p>
   * Method under test: {@link UnregisteredUserAuthException#UnregisteredUserAuthException(String, String[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void UnregisteredUserAuthException.<init>(String, String[])"})
  public void testNewUnregisteredUserAuthException() {
    // Arrange and Act
    UnregisteredUserAuthException actualUnregisteredUserAuthException = new UnregisteredUserAuthException(
        "0123456789ABCDEF", "0123456789ABCDEF");

    // Assert
    assertEquals("\nComponent: Authentication Proxy\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\n",
        actualUnregisteredUserAuthException.getLocalizedMessage());
    assertEquals("\nComponent: Authentication Proxy\nMessage: 0123456789ABCDEF\nSolutions: \n0123456789ABCDEF\n",
        actualUnregisteredUserAuthException.getMessage());
    assertNull(actualUnregisteredUserAuthException.getCause());
    assertEquals(0, actualUnregisteredUserAuthException.getSuppressed().length);
  }
}
