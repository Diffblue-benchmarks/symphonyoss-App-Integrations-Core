package org.symphonyoss.integration.config.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class ConfigurationNotFoundExceptionDiffblueTest {
  /**
   * Test {@link ConfigurationNotFoundException#ConfigurationNotFoundException(String, String)}.
   *
   * <p>Method under test: {@link
   * ConfigurationNotFoundException#ConfigurationNotFoundException(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ConfigurationNotFoundException.<init>(String, String)"})
  public void testNewConfigurationNotFoundException() {
    // Arrange and Act
    ConfigurationNotFoundException actualConfigurationNotFoundException =
        new ConfigurationNotFoundException("An error occurred", "Solution");

    // Assert
    assertEquals(
        "\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolution\n",
        actualConfigurationNotFoundException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolution\n",
        actualConfigurationNotFoundException.getMessage());
    assertNull(actualConfigurationNotFoundException.getCause());
    assertEquals(0, actualConfigurationNotFoundException.getSuppressed().length);
  }
}
