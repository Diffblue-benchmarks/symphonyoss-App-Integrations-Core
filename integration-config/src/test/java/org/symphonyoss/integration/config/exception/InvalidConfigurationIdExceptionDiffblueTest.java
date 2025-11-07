package org.symphonyoss.integration.config.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class InvalidConfigurationIdExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link InvalidConfigurationIdException#InvalidConfigurationIdException(String, String)}
   */
  @Test
  public void testNewInvalidConfigurationIdException() {
    // Arrange and Act
    InvalidConfigurationIdException actualInvalidConfigurationIdException = new InvalidConfigurationIdException(
        "An error occurred", "Solution");

    // Assert
    assertEquals("\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolution\n",
        actualInvalidConfigurationIdException.getLocalizedMessage());
    assertEquals("\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolution\n",
        actualInvalidConfigurationIdException.getMessage());
    assertNull(actualInvalidConfigurationIdException.getCause());
    assertEquals(0, actualInvalidConfigurationIdException.getSuppressed().length);
  }
}
