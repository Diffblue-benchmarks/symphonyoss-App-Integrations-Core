package org.symphonyoss.integration.web.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class IntegrationBridgeUnavailableExceptionDiffblueTest {
  /**
   * Test {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String, String[])}.
   * <p>
   * Method under test: {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String, String[])}
   */
  @Test
  @MethodsUnderTest({"void IntegrationBridgeUnavailableException.<init>(String, String[])"})
  public void testNewIntegrationBridgeUnavailableException() {
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
   * Test {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String, String[])}.
   * <ul>
   *   <li>Then return LocalizedMessage is a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String, String[])}
   */
  @Test
  @MethodsUnderTest({"void IntegrationBridgeUnavailableException.<init>(String, String[])"})
  public void testNewIntegrationBridgeUnavailableException_thenReturnLocalizedMessageIsAString() {
    // Arrange and Act
    IntegrationBridgeUnavailableException actualIntegrationBridgeUnavailableException = new IntegrationBridgeUnavailableException(
        "An error occurred", new String[]{});

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
   * Test {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String)}.
   * <ul>
   *   <li>When {@code An error occurred}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String)}
   */
  @Test
  @MethodsUnderTest({"void IntegrationBridgeUnavailableException.<init>(String)"})
  public void testNewIntegrationBridgeUnavailableException_whenAnErrorOccurred() {
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
   * Test {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String)}
   */
  @Test
  @MethodsUnderTest({"void IntegrationBridgeUnavailableException.<init>(String)"})
  public void testNewIntegrationBridgeUnavailableException_whenNull() {
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
   * Test {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String, String[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String, String[])}
   */
  @Test
  @MethodsUnderTest({"void IntegrationBridgeUnavailableException.<init>(String, String[])"})
  public void testNewIntegrationBridgeUnavailableException_whenNull2() {
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
}
