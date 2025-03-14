package org.symphonyoss.integration.config.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class InvalidInstanceIdExceptionDiffblueTest {
  /**
   * Test {@link InvalidInstanceIdException#InvalidInstanceIdException(String, String[])}.
   * <p>
   * Method under test: {@link InvalidInstanceIdException#InvalidInstanceIdException(String, String[])}
   */
  @Test
  @MethodsUnderTest({"void InvalidInstanceIdException.<init>(String, String[])"})
  public void testNewInvalidInstanceIdException() {
    // Arrange and Act
    InvalidInstanceIdException actualInvalidInstanceIdException = new InvalidInstanceIdException("An error occurred",
        "Solutions");

    // Assert
    assertEquals("\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualInvalidInstanceIdException.getLocalizedMessage());
    assertEquals("\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualInvalidInstanceIdException.getMessage());
    assertNull(actualInvalidInstanceIdException.getCause());
    assertEquals(0, actualInvalidInstanceIdException.getSuppressed().length);
  }
}
