package org.symphonyoss.integration.authentication.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class MissingServiceConfigurationExceptionDiffblueTest {
  /**
   * Test {@link MissingServiceConfigurationException#MissingServiceConfigurationException(String,
   * String, String[])}.
   *
   * <p>Method under test: {@link
   * MissingServiceConfigurationException#MissingServiceConfigurationException(String, String,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void MissingServiceConfigurationException.<init>(String, String, String[])"})
  public void testNewMissingServiceConfigurationException() {
    // Arrange and Act
    MissingServiceConfigurationException actualMissingServiceConfigurationException =
        new MissingServiceConfigurationException("Component", "An error occurred", "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Component\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualMissingServiceConfigurationException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Component\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualMissingServiceConfigurationException.getMessage());
    assertNull(actualMissingServiceConfigurationException.getCause());
    assertEquals(0, actualMissingServiceConfigurationException.getSuppressed().length);
  }

  /**
   * Test {@link MissingServiceConfigurationException#MissingServiceConfigurationException(String,
   * String, String[])}.
   *
   * <p>Method under test: {@link
   * MissingServiceConfigurationException#MissingServiceConfigurationException(String, String,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void MissingServiceConfigurationException.<init>(String, String, String[])"})
  public void testNewMissingServiceConfigurationException2() {
    // Arrange and Act
    MissingServiceConfigurationException actualMissingServiceConfigurationException =
        new MissingServiceConfigurationException("", "An error occurred", "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Unknown\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualMissingServiceConfigurationException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Unknown\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualMissingServiceConfigurationException.getMessage());
    assertNull(actualMissingServiceConfigurationException.getCause());
    assertEquals(0, actualMissingServiceConfigurationException.getSuppressed().length);
  }

  /**
   * Test {@link MissingServiceConfigurationException#MissingServiceConfigurationException(String,
   * String, String[])}.
   *
   * <p>Method under test: {@link
   * MissingServiceConfigurationException#MissingServiceConfigurationException(String, String,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void MissingServiceConfigurationException.<init>(String, String, String[])"})
  public void testNewMissingServiceConfigurationException3() {
    // Arrange and Act
    MissingServiceConfigurationException actualMissingServiceConfigurationException =
        new MissingServiceConfigurationException("Component", "", "Solutions");

    // Assert
    assertEquals(
        "\nComponent: Component\nMessage: None\nSolutions: \nSolutions\n",
        actualMissingServiceConfigurationException.getLocalizedMessage());
    assertEquals(
        "\nComponent: Component\nMessage: None\nSolutions: \nSolutions\n",
        actualMissingServiceConfigurationException.getMessage());
    assertNull(actualMissingServiceConfigurationException.getCause());
    assertEquals(0, actualMissingServiceConfigurationException.getSuppressed().length);
  }

  /**
   * Test {@link MissingServiceConfigurationException#MissingServiceConfigurationException(String,
   * String, String[])}.
   *
   * <ul>
   *   <li>Then return LocalizedMessage is a string.
   * </ul>
   *
   * <p>Method under test: {@link
   * MissingServiceConfigurationException#MissingServiceConfigurationException(String, String,
   * String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void MissingServiceConfigurationException.<init>(String, String, String[])"})
  public void testNewMissingServiceConfigurationException_thenReturnLocalizedMessageIsAString() {
    // Arrange and Act
    MissingServiceConfigurationException actualMissingServiceConfigurationException =
        new MissingServiceConfigurationException("Component", "An error occurred");

    // Assert
    assertEquals(
        "\n"
            + "Component: Component\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingServiceConfigurationException.getLocalizedMessage());
    assertEquals(
        "\n"
            + "Component: Component\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingServiceConfigurationException.getMessage());
    assertNull(actualMissingServiceConfigurationException.getCause());
    assertEquals(0, actualMissingServiceConfigurationException.getSuppressed().length);
  }
}
