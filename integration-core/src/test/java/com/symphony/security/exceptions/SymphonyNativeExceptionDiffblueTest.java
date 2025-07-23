package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class SymphonyNativeExceptionDiffblueTest {
  /**
   * Test {@link SymphonyNativeException#SymphonyNativeException(String, Throwable)}.
   *
   * <ul>
   *   <li>Then return Message is {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyNativeException#SymphonyNativeException(String,
   * Throwable)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyNativeException.<init>()",
    "void SymphonyNativeException.<init>(String)",
    "void SymphonyNativeException.<init>(String, Throwable)",
    "void SymphonyNativeException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyNativeException.<init>(Throwable)"
  })
  public void testNewSymphonyNativeException_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyNativeException actualSymphonyNativeException =
        new SymphonyNativeException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualSymphonyNativeException.getMessage());
    assertEquals(0, actualSymphonyNativeException.getSuppressed().length);
    assertSame(cause, actualSymphonyNativeException.getCause());
  }

  /**
   * Test {@link SymphonyNativeException#SymphonyNativeException(Throwable)}.
   *
   * <ul>
   *   <li>Then return Message is {@code Throwable}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyNativeException#SymphonyNativeException(Throwable)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyNativeException.<init>()",
    "void SymphonyNativeException.<init>(String)",
    "void SymphonyNativeException.<init>(String, Throwable)",
    "void SymphonyNativeException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyNativeException.<init>(Throwable)"
  })
  public void testNewSymphonyNativeException_thenReturnMessageIsJavaLangThrowable() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyNativeException actualSymphonyNativeException = new SymphonyNativeException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualSymphonyNativeException.getMessage());
    assertEquals(0, actualSymphonyNativeException.getSuppressed().length);
    assertSame(cause, actualSymphonyNativeException.getCause());
  }

  /**
   * Test {@link SymphonyNativeException#SymphonyNativeException()}.
   *
   * <ul>
   *   <li>Then return Message is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyNativeException#SymphonyNativeException()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyNativeException.<init>()",
    "void SymphonyNativeException.<init>(String)",
    "void SymphonyNativeException.<init>(String, Throwable)",
    "void SymphonyNativeException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyNativeException.<init>(Throwable)"
  })
  public void testNewSymphonyNativeException_thenReturnMessageIsNull() {
    // Arrange and Act
    SymphonyNativeException actualSymphonyNativeException = new SymphonyNativeException();

    // Assert
    assertNull(actualSymphonyNativeException.getMessage());
    assertNull(actualSymphonyNativeException.getCause());
    assertEquals(0, actualSymphonyNativeException.getSuppressed().length);
  }

  /**
   * Test {@link SymphonyNativeException#SymphonyNativeException(String)}.
   *
   * <ul>
   *   <li>When {@code An error occurred}.
   *   <li>Then return Cause is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyNativeException#SymphonyNativeException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyNativeException.<init>()",
    "void SymphonyNativeException.<init>(String)",
    "void SymphonyNativeException.<init>(String, Throwable)",
    "void SymphonyNativeException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyNativeException.<init>(Throwable)"
  })
  public void testNewSymphonyNativeException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    SymphonyNativeException actualSymphonyNativeException =
        new SymphonyNativeException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonyNativeException.getMessage());
    assertNull(actualSymphonyNativeException.getCause());
    assertEquals(0, actualSymphonyNativeException.getSuppressed().length);
  }

  /**
   * Test {@link SymphonyNativeException#SymphonyNativeException(String, Throwable, boolean,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return Message is {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyNativeException#SymphonyNativeException(String, Throwable,
   * boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyNativeException.<init>()",
    "void SymphonyNativeException.<init>(String)",
    "void SymphonyNativeException.<init>(String, Throwable)",
    "void SymphonyNativeException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyNativeException.<init>(Throwable)"
  })
  public void testNewSymphonyNativeException_whenTrue_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyNativeException actualSymphonyNativeException =
        new SymphonyNativeException("An error occurred", cause, true, true);

    // Assert
    assertEquals("An error occurred", actualSymphonyNativeException.getMessage());
    assertEquals(0, actualSymphonyNativeException.getSuppressed().length);
    assertSame(cause, actualSymphonyNativeException.getCause());
  }
}
