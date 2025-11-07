package org.symphonyoss.integration.authentication.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MissingServiceConfigurationExceptionDiffblueTest {
  /**
   * Test {@link MissingServiceConfigurationException#MissingServiceConfigurationException(String, String, String[])}.
   * <p>
   * Method under test: {@link MissingServiceConfigurationException#MissingServiceConfigurationException(String, String, String[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void MissingServiceConfigurationException.<init>(String, String, String[])"})
  public void testNewMissingServiceConfigurationException() {
    // Arrange and Act
    MissingServiceConfigurationException actualMissingServiceConfigurationException = new MissingServiceConfigurationException(
        "Component", "An error occurred", "Solutions");

    // Assert
    assertEquals("\nComponent: Component\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualMissingServiceConfigurationException.getLocalizedMessage());
    assertEquals("\nComponent: Component\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualMissingServiceConfigurationException.getMessage());
    assertNull(actualMissingServiceConfigurationException.getCause());
    assertEquals(0, actualMissingServiceConfigurationException.getSuppressed().length);
  }

  /**
   * Test {@link MissingServiceConfigurationException#MissingServiceConfigurationException(String, String, String[])}.
   * <ul>
   *   <li>Then return LocalizedMessage is a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link MissingServiceConfigurationException#MissingServiceConfigurationException(String, String, String[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void MissingServiceConfigurationException.<init>(String, String, String[])"})
  public void testNewMissingServiceConfigurationException_thenReturnLocalizedMessageIsAString() {
    // Arrange and Act
    MissingServiceConfigurationException actualMissingServiceConfigurationException = new MissingServiceConfigurationException(
        "Component", "An error occurred");

    // Assert
    assertEquals(
        "\n" + "Component: Component\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingServiceConfigurationException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Component\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingServiceConfigurationException.getMessage());
    assertNull(actualMissingServiceConfigurationException.getCause());
    assertEquals(0, actualMissingServiceConfigurationException.getSuppressed().length);
  }

  /**
   * Test {@link MissingServiceConfigurationException#MissingServiceConfigurationException(String, String, String[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MissingServiceConfigurationException#MissingServiceConfigurationException(String, String, String[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void MissingServiceConfigurationException.<init>(String, String, String[])"})
  public void testNewMissingServiceConfigurationException_whenNull() {
    // Arrange and Act
    MissingServiceConfigurationException actualMissingServiceConfigurationException = new MissingServiceConfigurationException(
        null, null, null);

    // Assert
    assertEquals(
        "\n" + "Component: Unknown\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingServiceConfigurationException.getLocalizedMessage());
    assertEquals(
        "\n" + "Component: Unknown\n" + "Message: None\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualMissingServiceConfigurationException.getMessage());
    assertNull(actualMissingServiceConfigurationException.getCause());
    assertEquals(0, actualMissingServiceConfigurationException.getSuppressed().length);
  }
}
