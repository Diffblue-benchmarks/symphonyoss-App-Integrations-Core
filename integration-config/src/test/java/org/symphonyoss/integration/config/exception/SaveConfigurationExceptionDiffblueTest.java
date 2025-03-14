package org.symphonyoss.integration.config.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class SaveConfigurationExceptionDiffblueTest {
  /**
   * Test {@link SaveConfigurationException#SaveConfigurationException(String, Throwable, String[])}.
   * <p>
   * Method under test: {@link SaveConfigurationException#SaveConfigurationException(String, Throwable, String[])}
   */
  @Test
  @MethodsUnderTest({"void SaveConfigurationException.<init>(String, Throwable, String[])"})
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
