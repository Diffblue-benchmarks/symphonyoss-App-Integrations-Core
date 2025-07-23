package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class SymphonyEncryptionExceptionDiffblueTest {
  /**
   * Test {@link SymphonyEncryptionException#SymphonyEncryptionException(String, Throwable)}.
   *
   * <ul>
   *   <li>Then return Message is {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyEncryptionException#SymphonyEncryptionException(String,
   * Throwable)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyEncryptionException.<init>()",
    "void SymphonyEncryptionException.<init>(String)",
    "void SymphonyEncryptionException.<init>(String, Throwable)",
    "void SymphonyEncryptionException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyEncryptionException.<init>(Throwable)"
  })
  public void testNewSymphonyEncryptionException_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyEncryptionException actualSymphonyEncryptionException =
        new SymphonyEncryptionException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualSymphonyEncryptionException.getMessage());
    assertEquals(0, actualSymphonyEncryptionException.getSuppressed().length);
    assertSame(cause, actualSymphonyEncryptionException.getCause());
  }

  /**
   * Test {@link SymphonyEncryptionException#SymphonyEncryptionException(Throwable)}.
   *
   * <ul>
   *   <li>Then return Message is {@code Throwable}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SymphonyEncryptionException#SymphonyEncryptionException(Throwable)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyEncryptionException.<init>()",
    "void SymphonyEncryptionException.<init>(String)",
    "void SymphonyEncryptionException.<init>(String, Throwable)",
    "void SymphonyEncryptionException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyEncryptionException.<init>(Throwable)"
  })
  public void testNewSymphonyEncryptionException_thenReturnMessageIsJavaLangThrowable() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyEncryptionException actualSymphonyEncryptionException =
        new SymphonyEncryptionException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualSymphonyEncryptionException.getMessage());
    assertEquals(0, actualSymphonyEncryptionException.getSuppressed().length);
    assertSame(cause, actualSymphonyEncryptionException.getCause());
  }

  /**
   * Test {@link SymphonyEncryptionException#SymphonyEncryptionException()}.
   *
   * <ul>
   *   <li>Then return Message is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyEncryptionException#SymphonyEncryptionException()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyEncryptionException.<init>()",
    "void SymphonyEncryptionException.<init>(String)",
    "void SymphonyEncryptionException.<init>(String, Throwable)",
    "void SymphonyEncryptionException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyEncryptionException.<init>(Throwable)"
  })
  public void testNewSymphonyEncryptionException_thenReturnMessageIsNull() {
    // Arrange and Act
    SymphonyEncryptionException actualSymphonyEncryptionException =
        new SymphonyEncryptionException();

    // Assert
    assertNull(actualSymphonyEncryptionException.getMessage());
    assertNull(actualSymphonyEncryptionException.getCause());
    assertEquals(0, actualSymphonyEncryptionException.getSuppressed().length);
  }

  /**
   * Test {@link SymphonyEncryptionException#SymphonyEncryptionException(String)}.
   *
   * <ul>
   *   <li>When {@code An error occurred}.
   *   <li>Then return Cause is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyEncryptionException#SymphonyEncryptionException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyEncryptionException.<init>()",
    "void SymphonyEncryptionException.<init>(String)",
    "void SymphonyEncryptionException.<init>(String, Throwable)",
    "void SymphonyEncryptionException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyEncryptionException.<init>(Throwable)"
  })
  public void testNewSymphonyEncryptionException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    SymphonyEncryptionException actualSymphonyEncryptionException =
        new SymphonyEncryptionException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonyEncryptionException.getMessage());
    assertNull(actualSymphonyEncryptionException.getCause());
    assertEquals(0, actualSymphonyEncryptionException.getSuppressed().length);
  }

  /**
   * Test {@link SymphonyEncryptionException#SymphonyEncryptionException(String, Throwable, boolean,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return Message is {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyEncryptionException#SymphonyEncryptionException(String,
   * Throwable, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyEncryptionException.<init>()",
    "void SymphonyEncryptionException.<init>(String)",
    "void SymphonyEncryptionException.<init>(String, Throwable)",
    "void SymphonyEncryptionException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyEncryptionException.<init>(Throwable)"
  })
  public void testNewSymphonyEncryptionException_whenTrue_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyEncryptionException actualSymphonyEncryptionException =
        new SymphonyEncryptionException("An error occurred", cause, true, true);

    // Assert
    assertEquals("An error occurred", actualSymphonyEncryptionException.getMessage());
    assertEquals(0, actualSymphonyEncryptionException.getSuppressed().length);
    assertSame(cause, actualSymphonyEncryptionException.getCause());
  }
}
