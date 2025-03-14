package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class SymphonyHSMExceptionDiffblueTest {
  /**
   * Test {@link SymphonyHSMException#SymphonyHSMException(String, Throwable)}.
   * <ul>
   *   <li>Then return Message is {@code An error occurred}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyHSMException#SymphonyHSMException(String, Throwable)}
   */
  @Test
  @MethodsUnderTest({"void SymphonyHSMException.<init>()", "void SymphonyHSMException.<init>(String)",
      "void SymphonyHSMException.<init>(String, Throwable)",
      "void SymphonyHSMException.<init>(String, Throwable, boolean, boolean)",
      "void SymphonyHSMException.<init>(Throwable)"})
  public void testNewSymphonyHSMException_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyHSMException actualSymphonyHSMException = new SymphonyHSMException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualSymphonyHSMException.getMessage());
    assertEquals(0, actualSymphonyHSMException.getSuppressed().length);
    assertSame(cause, actualSymphonyHSMException.getCause());
  }

  /**
   * Test {@link SymphonyHSMException#SymphonyHSMException()}.
   * <ul>
   *   <li>Then return Message is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyHSMException#SymphonyHSMException()}
   */
  @Test
  @MethodsUnderTest({"void SymphonyHSMException.<init>()", "void SymphonyHSMException.<init>(String)",
      "void SymphonyHSMException.<init>(String, Throwable)",
      "void SymphonyHSMException.<init>(String, Throwable, boolean, boolean)",
      "void SymphonyHSMException.<init>(Throwable)"})
  public void testNewSymphonyHSMException_thenReturnMessageIsNull() {
    // Arrange and Act
    SymphonyHSMException actualSymphonyHSMException = new SymphonyHSMException();

    // Assert
    assertNull(actualSymphonyHSMException.getMessage());
    assertNull(actualSymphonyHSMException.getCause());
    assertEquals(0, actualSymphonyHSMException.getSuppressed().length);
  }

  /**
   * Test {@link SymphonyHSMException#SymphonyHSMException(String)}.
   * <ul>
   *   <li>When {@code An error occurred}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyHSMException#SymphonyHSMException(String)}
   */
  @Test
  @MethodsUnderTest({"void SymphonyHSMException.<init>()", "void SymphonyHSMException.<init>(String)",
      "void SymphonyHSMException.<init>(String, Throwable)",
      "void SymphonyHSMException.<init>(String, Throwable, boolean, boolean)",
      "void SymphonyHSMException.<init>(Throwable)"})
  public void testNewSymphonyHSMException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    SymphonyHSMException actualSymphonyHSMException = new SymphonyHSMException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonyHSMException.getMessage());
    assertNull(actualSymphonyHSMException.getCause());
    assertEquals(0, actualSymphonyHSMException.getSuppressed().length);
  }

  /**
   * Test {@link SymphonyHSMException#SymphonyHSMException(Throwable)}.
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.</li>
   *   <li>Then return Message is {@code Throwable}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyHSMException#SymphonyHSMException(Throwable)}
   */
  @Test
  @MethodsUnderTest({"void SymphonyHSMException.<init>()", "void SymphonyHSMException.<init>(String)",
      "void SymphonyHSMException.<init>(String, Throwable)",
      "void SymphonyHSMException.<init>(String, Throwable, boolean, boolean)",
      "void SymphonyHSMException.<init>(Throwable)"})
  public void testNewSymphonyHSMException_whenThrowable_thenReturnMessageIsJavaLangThrowable() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyHSMException actualSymphonyHSMException = new SymphonyHSMException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualSymphonyHSMException.getMessage());
    assertEquals(0, actualSymphonyHSMException.getSuppressed().length);
    assertSame(cause, actualSymphonyHSMException.getCause());
  }

  /**
   * Test {@link SymphonyHSMException#SymphonyHSMException(String, Throwable, boolean, boolean)}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return Message is {@code An error occurred}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyHSMException#SymphonyHSMException(String, Throwable, boolean, boolean)}
   */
  @Test
  @MethodsUnderTest({"void SymphonyHSMException.<init>()", "void SymphonyHSMException.<init>(String)",
      "void SymphonyHSMException.<init>(String, Throwable)",
      "void SymphonyHSMException.<init>(String, Throwable, boolean, boolean)",
      "void SymphonyHSMException.<init>(Throwable)"})
  public void testNewSymphonyHSMException_whenTrue_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyHSMException actualSymphonyHSMException = new SymphonyHSMException("An error occurred", cause, true, true);

    // Assert
    assertEquals("An error occurred", actualSymphonyHSMException.getMessage());
    assertEquals(0, actualSymphonyHSMException.getSuppressed().length);
    assertSame(cause, actualSymphonyHSMException.getCause());
  }
}
