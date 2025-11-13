package org.symphonyoss.integration.web.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class IntegrationBridgeUnavailableExceptionDiffblueTest {
  /**
   * Test {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String,
   * String[])}.
   *
   * <p>Method under test: {@link
   * IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void IntegrationBridgeUnavailableException.<init>(String, String[])"})
  public void testNewIntegrationBridgeUnavailableException() {
    // Arrange and Act
    IntegrationBridgeUnavailableException actualIntegrationBridgeUnavailableException =
        new IntegrationBridgeUnavailableException("An error occurred", "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Integration Bridge\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualIntegrationBridgeUnavailableException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Integration Bridge\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualIntegrationBridgeUnavailableException.getMessage());
    assertNull(actualIntegrationBridgeUnavailableException.getCause());
    assertEquals(0, actualIntegrationBridgeUnavailableException.getSuppressed().length);
  }

  /**
   * Test {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String,
   * String[])}.
   *
   * <p>Method under test: {@link
   * IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void IntegrationBridgeUnavailableException.<init>(String, String[])"})
  public void testNewIntegrationBridgeUnavailableException2() {
    // Arrange and Act
    IntegrationBridgeUnavailableException actualIntegrationBridgeUnavailableException =
        new IntegrationBridgeUnavailableException("", "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Integration Bridge\nMessage: None\nSolutions: \nSolutions\n",
        actualIntegrationBridgeUnavailableException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Integration Bridge\nMessage: None\nSolutions: \nSolutions\n",
        actualIntegrationBridgeUnavailableException.getMessage());
    assertNull(actualIntegrationBridgeUnavailableException.getCause());
    assertEquals(0, actualIntegrationBridgeUnavailableException.getSuppressed().length);
  }

  /**
   * Test {@link IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String,
   * String[])}.
   *
   * <ul>
   *   <li>Then return LocalizedMessage is a string.
   * </ul>
   *
   * <p>Method under test: {@link
   * IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String, String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void IntegrationBridgeUnavailableException.<init>(String, String[])"})
  public void testNewIntegrationBridgeUnavailableException_thenReturnLocalizedMessageIsAString() {
    // Arrange and Act
    IntegrationBridgeUnavailableException actualIntegrationBridgeUnavailableException =
        new IntegrationBridgeUnavailableException("An error occurred", new String[] {});

    // Assert
    assertEquals(
        "\n"
            + "Component: Integration Bridge\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Integration Bridge\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getMessage());
    assertNull(actualIntegrationBridgeUnavailableException.getCause());
    assertEquals(0, actualIntegrationBridgeUnavailableException.getSuppressed().length);
  }

  /**
   * Test {@link
   * IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String)}.
   *
   * <ul>
   *   <li>When {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link
   * IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void IntegrationBridgeUnavailableException.<init>(String)"})
  public void testNewIntegrationBridgeUnavailableException_whenAnErrorOccurred() {
    // Arrange and Act
    IntegrationBridgeUnavailableException actualIntegrationBridgeUnavailableException =
        new IntegrationBridgeUnavailableException("An error occurred");

    // Assert
    assertEquals(
        "\n"
            + "Component: Integration Bridge\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Integration Bridge\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getMessage());
    assertNull(actualIntegrationBridgeUnavailableException.getCause());
    assertEquals(0, actualIntegrationBridgeUnavailableException.getSuppressed().length);
  }

  /**
   * Test {@link
   * IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String)}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link
   * IntegrationBridgeUnavailableException#IntegrationBridgeUnavailableException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void IntegrationBridgeUnavailableException.<init>(String)"})
  public void testNewIntegrationBridgeUnavailableException_whenEmptyString() {
    // Arrange and Act
    IntegrationBridgeUnavailableException actualIntegrationBridgeUnavailableException =
        new IntegrationBridgeUnavailableException("");

    // Assert
    assertEquals(
        "\n"
            + "Component: Integration Bridge\n"
            + "Message: None\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Integration Bridge\n"
            + "Message: None\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualIntegrationBridgeUnavailableException.getMessage());
    assertNull(actualIntegrationBridgeUnavailableException.getCause());
    assertEquals(0, actualIntegrationBridgeUnavailableException.getSuppressed().length);
  }
}
