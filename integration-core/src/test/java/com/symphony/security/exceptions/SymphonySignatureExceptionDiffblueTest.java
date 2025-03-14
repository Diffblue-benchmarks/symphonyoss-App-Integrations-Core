package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class SymphonySignatureExceptionDiffblueTest {
  /**
   * Test {@link SymphonySignatureException#SymphonySignatureException(String, Throwable)}.
   * <ul>
   *   <li>Then return Message is {@code An error occurred}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonySignatureException#SymphonySignatureException(String, Throwable)}
   */
  @Test
  @MethodsUnderTest({"void SymphonySignatureException.<init>()", "void SymphonySignatureException.<init>(String)",
      "void SymphonySignatureException.<init>(String, Throwable)",
      "void SymphonySignatureException.<init>(String, Throwable, boolean, boolean)",
      "void SymphonySignatureException.<init>(Throwable)"})
  public void testNewSymphonySignatureException_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonySignatureException actualSymphonySignatureException = new SymphonySignatureException("An error occurred",
        cause);

    // Assert
    assertEquals("An error occurred", actualSymphonySignatureException.getMessage());
    assertEquals(0, actualSymphonySignatureException.getSuppressed().length);
    assertSame(cause, actualSymphonySignatureException.getCause());
  }

  /**
   * Test {@link SymphonySignatureException#SymphonySignatureException(Throwable)}.
   * <ul>
   *   <li>Then return Message is {@code Throwable}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonySignatureException#SymphonySignatureException(Throwable)}
   */
  @Test
  @MethodsUnderTest({"void SymphonySignatureException.<init>()", "void SymphonySignatureException.<init>(String)",
      "void SymphonySignatureException.<init>(String, Throwable)",
      "void SymphonySignatureException.<init>(String, Throwable, boolean, boolean)",
      "void SymphonySignatureException.<init>(Throwable)"})
  public void testNewSymphonySignatureException_thenReturnMessageIsJavaLangThrowable() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonySignatureException actualSymphonySignatureException = new SymphonySignatureException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualSymphonySignatureException.getMessage());
    assertEquals(0, actualSymphonySignatureException.getSuppressed().length);
    assertSame(cause, actualSymphonySignatureException.getCause());
  }

  /**
   * Test {@link SymphonySignatureException#SymphonySignatureException()}.
   * <ul>
   *   <li>Then return Message is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonySignatureException#SymphonySignatureException()}
   */
  @Test
  @MethodsUnderTest({"void SymphonySignatureException.<init>()", "void SymphonySignatureException.<init>(String)",
      "void SymphonySignatureException.<init>(String, Throwable)",
      "void SymphonySignatureException.<init>(String, Throwable, boolean, boolean)",
      "void SymphonySignatureException.<init>(Throwable)"})
  public void testNewSymphonySignatureException_thenReturnMessageIsNull() {
    // Arrange and Act
    SymphonySignatureException actualSymphonySignatureException = new SymphonySignatureException();

    // Assert
    assertNull(actualSymphonySignatureException.getMessage());
    assertNull(actualSymphonySignatureException.getCause());
    assertEquals(0, actualSymphonySignatureException.getSuppressed().length);
  }

  /**
   * Test {@link SymphonySignatureException#SymphonySignatureException(String)}.
   * <ul>
   *   <li>When {@code An error occurred}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonySignatureException#SymphonySignatureException(String)}
   */
  @Test
  @MethodsUnderTest({"void SymphonySignatureException.<init>()", "void SymphonySignatureException.<init>(String)",
      "void SymphonySignatureException.<init>(String, Throwable)",
      "void SymphonySignatureException.<init>(String, Throwable, boolean, boolean)",
      "void SymphonySignatureException.<init>(Throwable)"})
  public void testNewSymphonySignatureException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    SymphonySignatureException actualSymphonySignatureException = new SymphonySignatureException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonySignatureException.getMessage());
    assertNull(actualSymphonySignatureException.getCause());
    assertEquals(0, actualSymphonySignatureException.getSuppressed().length);
  }

  /**
   * Test {@link SymphonySignatureException#SymphonySignatureException(String, Throwable, boolean, boolean)}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return Message is {@code An error occurred}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonySignatureException#SymphonySignatureException(String, Throwable, boolean, boolean)}
   */
  @Test
  @MethodsUnderTest({"void SymphonySignatureException.<init>()", "void SymphonySignatureException.<init>(String)",
      "void SymphonySignatureException.<init>(String, Throwable)",
      "void SymphonySignatureException.<init>(String, Throwable, boolean, boolean)",
      "void SymphonySignatureException.<init>(Throwable)"})
  public void testNewSymphonySignatureException_whenTrue_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonySignatureException actualSymphonySignatureException = new SymphonySignatureException("An error occurred",
        cause, true, true);

    // Assert
    assertEquals("An error occurred", actualSymphonySignatureException.getMessage());
    assertEquals(0, actualSymphonySignatureException.getSuppressed().length);
    assertSame(cause, actualSymphonySignatureException.getCause());
  }
}
