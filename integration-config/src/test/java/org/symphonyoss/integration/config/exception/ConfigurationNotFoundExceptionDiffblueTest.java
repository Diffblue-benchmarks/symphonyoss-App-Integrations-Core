package org.symphonyoss.integration.config.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigurationNotFoundExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link ConfigurationNotFoundException#ConfigurationNotFoundException(String, String)}
   */
  @Test
  public void testNewConfigurationNotFoundException() {
    // Arrange and Act
    ConfigurationNotFoundException actualConfigurationNotFoundException = new ConfigurationNotFoundException(
        "An error occurred", "Solution");

    // Assert
    assertEquals("\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolution\n",
        actualConfigurationNotFoundException.getLocalizedMessage());
    assertEquals("\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolution\n",
        actualConfigurationNotFoundException.getMessage());
    assertNull(actualConfigurationNotFoundException.getCause());
    assertEquals(0, actualConfigurationNotFoundException.getSuppressed().length);
  }
}
