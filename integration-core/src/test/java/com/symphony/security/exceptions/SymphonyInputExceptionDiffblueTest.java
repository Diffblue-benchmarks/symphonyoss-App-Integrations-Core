package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class SymphonyInputExceptionDiffblueTest {
  /**
   * Test {@link SymphonyInputException#SymphonyInputException(String, Throwable)}.
   *
   * <ul>
   *   <li>Then return Message is {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyInputException#SymphonyInputException(String, Throwable)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyInputException.<init>()",
    "void SymphonyInputException.<init>(String)",
    "void SymphonyInputException.<init>(String, Throwable)",
    "void SymphonyInputException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyInputException.<init>(Throwable)"
  })
  public void testNewSymphonyInputException_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyInputException actualSymphonyInputException =
        new SymphonyInputException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualSymphonyInputException.getMessage());
    assertEquals(0, actualSymphonyInputException.getSuppressed().length);
    assertSame(cause, actualSymphonyInputException.getCause());
  }

  /**
   * Test {@link SymphonyInputException#SymphonyInputException()}.
   *
   * <ul>
   *   <li>Then return Message is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyInputException#SymphonyInputException()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyInputException.<init>()",
    "void SymphonyInputException.<init>(String)",
    "void SymphonyInputException.<init>(String, Throwable)",
    "void SymphonyInputException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyInputException.<init>(Throwable)"
  })
  public void testNewSymphonyInputException_thenReturnMessageIsNull() {
    // Arrange and Act
    SymphonyInputException actualSymphonyInputException = new SymphonyInputException();

    // Assert
    assertNull(actualSymphonyInputException.getMessage());
    assertNull(actualSymphonyInputException.getCause());
    assertEquals(0, actualSymphonyInputException.getSuppressed().length);
  }

  /**
   * Test {@link SymphonyInputException#SymphonyInputException(String)}.
   *
   * <ul>
   *   <li>When {@code An error occurred}.
   *   <li>Then return Cause is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyInputException#SymphonyInputException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyInputException.<init>()",
    "void SymphonyInputException.<init>(String)",
    "void SymphonyInputException.<init>(String, Throwable)",
    "void SymphonyInputException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyInputException.<init>(Throwable)"
  })
  public void testNewSymphonyInputException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    SymphonyInputException actualSymphonyInputException =
        new SymphonyInputException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonyInputException.getMessage());
    assertNull(actualSymphonyInputException.getCause());
    assertEquals(0, actualSymphonyInputException.getSuppressed().length);
  }

  /**
   * Test {@link SymphonyInputException#SymphonyInputException(Throwable)}.
   *
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.
   *   <li>Then return Message is {@code Throwable}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyInputException#SymphonyInputException(Throwable)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyInputException.<init>()",
    "void SymphonyInputException.<init>(String)",
    "void SymphonyInputException.<init>(String, Throwable)",
    "void SymphonyInputException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyInputException.<init>(Throwable)"
  })
  public void testNewSymphonyInputException_whenThrowable_thenReturnMessageIsJavaLangThrowable() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyInputException actualSymphonyInputException = new SymphonyInputException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualSymphonyInputException.getMessage());
    assertEquals(0, actualSymphonyInputException.getSuppressed().length);
    assertSame(cause, actualSymphonyInputException.getCause());
  }

  /**
   * Test {@link SymphonyInputException#SymphonyInputException(String, Throwable, boolean,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return Message is {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyInputException#SymphonyInputException(String, Throwable,
   * boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyInputException.<init>()",
    "void SymphonyInputException.<init>(String)",
    "void SymphonyInputException.<init>(String, Throwable)",
    "void SymphonyInputException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyInputException.<init>(Throwable)"
  })
  public void testNewSymphonyInputException_whenTrue_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyInputException actualSymphonyInputException =
        new SymphonyInputException("An error occurred", cause, true, true);

    // Assert
    assertEquals("An error occurred", actualSymphonyInputException.getMessage());
    assertEquals(0, actualSymphonyInputException.getSuppressed().length);
    assertSame(cause, actualSymphonyInputException.getCause());
  }
}
