package org.symphonyoss.integration.config.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SaveConfigurationExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link SaveConfigurationException#SaveConfigurationException(String, Throwable, String[])}
   */
  @Test
  public void testNewSaveConfigurationException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SaveConfigurationException actualSaveConfigurationException = new SaveConfigurationException("An error occurred",
        cause, "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualSaveConfigurationException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolutions\nStack trace: \n",
        actualSaveConfigurationException.getMessage());
    assertEquals(0, actualSaveConfigurationException.getSuppressed().length);
    assertSame(cause, actualSaveConfigurationException.getCause());
  }
}
