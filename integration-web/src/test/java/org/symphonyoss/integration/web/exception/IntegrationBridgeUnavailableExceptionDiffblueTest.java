package org.symphonyoss.integration.web.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class IntegrationBridgeUnavailableExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String)}
   */
  @Test
  public void testNewIntegrationBridgeUnavailableException() {
    // Arrange and Act
    IntegrationBridgeUnavailableException actualIntegrationBridgeUnavailableException = new IntegrationBridgeUnavailableException(
        "An error occurred");

    // Assert
    assertEquals(
        "\n" + "Component: Integration Bridge\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Integration Bridge\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getMessage());
    assertNull(actualIntegrationBridgeUnavailableException.getCause());
    assertEquals(0, actualIntegrationBridgeUnavailableException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String)}
   */
  @Test
  public void testNewIntegrationBridgeUnavailableException2() {
    // Arrange and Act
    IntegrationBridgeUnavailableException actualIntegrationBridgeUnavailableException = new IntegrationBridgeUnavailableException(
        null);

    // Assert
    assertEquals(
        "\n" + "Component: Integration Bridge\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Integration Bridge\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getMessage());
    assertNull(actualIntegrationBridgeUnavailableException.getCause());
    assertEquals(0, actualIntegrationBridgeUnavailableException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String, String[])}
   */
  @Test
  public void testNewIntegrationBridgeUnavailableException3() {
    // Arrange and Act
    IntegrationBridgeUnavailableException actualIntegrationBridgeUnavailableException = new IntegrationBridgeUnavailableException(
        "An error occurred", "Solutions");

    // Assert
    assertEquals("\nComponent: Integration Bridge\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualIntegrationBridgeUnavailableException.getLocalizedMessage());
    assertEquals("\nComponent: Integration Bridge\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualIntegrationBridgeUnavailableException.getMessage());
    assertNull(actualIntegrationBridgeUnavailableException.getCause());
    assertEquals(0, actualIntegrationBridgeUnavailableException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String, String[])}
   */
  @Test
  public void testNewIntegrationBridgeUnavailableException4() {
    // Arrange and Act
    IntegrationBridgeUnavailableException actualIntegrationBridgeUnavailableException = new IntegrationBridgeUnavailableException(
        null, null);

    // Assert
    assertEquals(
        "\n" + "Component: Integration Bridge\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Integration Bridge\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getMessage());
    assertNull(actualIntegrationBridgeUnavailableException.getCause());
    assertEquals(0, actualIntegrationBridgeUnavailableException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String, String[])}
   */
  @Test
  public void testNewIntegrationBridgeUnavailableException5() {
    // Arrange and Act
    IntegrationBridgeUnavailableException actualIntegrationBridgeUnavailableException = new IntegrationBridgeUnavailableException(
        "An error occurred");

    // Assert
    assertEquals(
        "\n" + "Component: Integration Bridge\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Integration Bridge\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getMessage());
    assertNull(actualIntegrationBridgeUnavailableException.getCause());
    assertEquals(0, actualIntegrationBridgeUnavailableException.getSuppressed().length);
  }
}
