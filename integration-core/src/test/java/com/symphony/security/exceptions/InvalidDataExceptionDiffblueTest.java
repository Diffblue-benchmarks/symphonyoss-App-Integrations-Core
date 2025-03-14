package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class InvalidDataExceptionDiffblueTest {
  /**
   * Test {@link InvalidDataException#InvalidDataException(String, Throwable)}.
   * <ul>
   *   <li>Then return Message is {@code An error occurred}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InvalidDataException#InvalidDataException(String, Throwable)}
   */
  @Test
  @MethodsUnderTest({"void InvalidDataException.<init>()", "void InvalidDataException.<init>(String)",
      "void InvalidDataException.<init>(String, Throwable)",
      "void InvalidDataException.<init>(String, Throwable, boolean, boolean)",
      "void InvalidDataException.<init>(Throwable)"})
  public void testNewInvalidDataException_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    InvalidDataException actualInvalidDataException = new InvalidDataException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualInvalidDataException.getMessage());
    assertEquals(0, actualInvalidDataException.getSuppressed().length);
    assertSame(cause, actualInvalidDataException.getCause());
  }

  /**
   * Test {@link InvalidDataException#InvalidDataException()}.
   * <ul>
   *   <li>Then return Message is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InvalidDataException#InvalidDataException()}
   */
  @Test
  @MethodsUnderTest({"void InvalidDataException.<init>()", "void InvalidDataException.<init>(String)",
      "void InvalidDataException.<init>(String, Throwable)",
      "void InvalidDataException.<init>(String, Throwable, boolean, boolean)",
      "void InvalidDataException.<init>(Throwable)"})
  public void testNewInvalidDataException_thenReturnMessageIsNull() {
    // Arrange and Act
    InvalidDataException actualInvalidDataException = new InvalidDataException();

    // Assert
    assertNull(actualInvalidDataException.getMessage());
    assertNull(actualInvalidDataException.getCause());
    assertEquals(0, actualInvalidDataException.getSuppressed().length);
  }

  /**
   * Test {@link InvalidDataException#InvalidDataException(String)}.
   * <ul>
   *   <li>When {@code An error occurred}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InvalidDataException#InvalidDataException(String)}
   */
  @Test
  @MethodsUnderTest({"void InvalidDataException.<init>()", "void InvalidDataException.<init>(String)",
      "void InvalidDataException.<init>(String, Throwable)",
      "void InvalidDataException.<init>(String, Throwable, boolean, boolean)",
      "void InvalidDataException.<init>(Throwable)"})
  public void testNewInvalidDataException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    InvalidDataException actualInvalidDataException = new InvalidDataException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualInvalidDataException.getMessage());
    assertNull(actualInvalidDataException.getCause());
    assertEquals(0, actualInvalidDataException.getSuppressed().length);
  }

  /**
   * Test {@link InvalidDataException#InvalidDataException(Throwable)}.
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.</li>
   *   <li>Then return Message is {@code Throwable}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InvalidDataException#InvalidDataException(Throwable)}
   */
  @Test
  @MethodsUnderTest({"void InvalidDataException.<init>()", "void InvalidDataException.<init>(String)",
      "void InvalidDataException.<init>(String, Throwable)",
      "void InvalidDataException.<init>(String, Throwable, boolean, boolean)",
      "void InvalidDataException.<init>(Throwable)"})
  public void testNewInvalidDataException_whenThrowable_thenReturnMessageIsJavaLangThrowable() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    InvalidDataException actualInvalidDataException = new InvalidDataException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualInvalidDataException.getMessage());
    assertEquals(0, actualInvalidDataException.getSuppressed().length);
    assertSame(cause, actualInvalidDataException.getCause());
  }

  /**
   * Test {@link InvalidDataException#InvalidDataException(String, Throwable, boolean, boolean)}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return Message is {@code An error occurred}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InvalidDataException#InvalidDataException(String, Throwable, boolean, boolean)}
   */
  @Test
  @MethodsUnderTest({"void InvalidDataException.<init>()", "void InvalidDataException.<init>(String)",
      "void InvalidDataException.<init>(String, Throwable)",
      "void InvalidDataException.<init>(String, Throwable, boolean, boolean)",
      "void InvalidDataException.<init>(Throwable)"})
  public void testNewInvalidDataException_whenTrue_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    InvalidDataException actualInvalidDataException = new InvalidDataException("An error occurred", cause, true, true);

    // Assert
    assertEquals("An error occurred", actualInvalidDataException.getMessage());
    assertEquals(0, actualInvalidDataException.getSuppressed().length);
    assertSame(cause, actualInvalidDataException.getCause());
  }
}
