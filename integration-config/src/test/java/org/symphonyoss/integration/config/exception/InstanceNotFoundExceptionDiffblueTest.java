package org.symphonyoss.integration.config.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class InstanceNotFoundExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link InstanceNotFoundException#InstanceNotFoundException(String, String[])}
   */
  @Test
  public void testNewInstanceNotFoundException() {
    // Arrange and Act
    InstanceNotFoundException actualInstanceNotFoundException = new InstanceNotFoundException("An error occurred",
        "Solutions");

    // Assert
    assertEquals("\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualInstanceNotFoundException.getLocalizedMessage());
    assertEquals("\nComponent: Configuration Service\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualInstanceNotFoundException.getMessage());
    assertNull(actualInstanceNotFoundException.getCause());
    assertEquals(0, actualInstanceNotFoundException.getSuppressed().length);
  }
}
