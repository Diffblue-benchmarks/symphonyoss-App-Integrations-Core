package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class SymphonyPEMFormatExceptionDiffblueTest {
  /**
   * Test {@link SymphonyPEMFormatException#SymphonyPEMFormatException(String, Throwable)}.
   *
   * <ul>
   *   <li>Then return Message is {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyPEMFormatException#SymphonyPEMFormatException(String,
   * Throwable)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyPEMFormatException.<init>()",
    "void SymphonyPEMFormatException.<init>(String)",
    "void SymphonyPEMFormatException.<init>(String, Throwable)",
    "void SymphonyPEMFormatException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyPEMFormatException.<init>(Throwable)"
  })
  public void testNewSymphonyPEMFormatException_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyPEMFormatException actualSymphonyPEMFormatException =
        new SymphonyPEMFormatException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualSymphonyPEMFormatException.getMessage());
    assertEquals(0, actualSymphonyPEMFormatException.getSuppressed().length);
    assertSame(cause, actualSymphonyPEMFormatException.getCause());
  }

  /**
   * Test {@link SymphonyPEMFormatException#SymphonyPEMFormatException(Throwable)}.
   *
   * <ul>
   *   <li>Then return Message is {@code Throwable}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyPEMFormatException#SymphonyPEMFormatException(Throwable)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyPEMFormatException.<init>()",
    "void SymphonyPEMFormatException.<init>(String)",
    "void SymphonyPEMFormatException.<init>(String, Throwable)",
    "void SymphonyPEMFormatException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyPEMFormatException.<init>(Throwable)"
  })
  public void testNewSymphonyPEMFormatException_thenReturnMessageIsJavaLangThrowable() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyPEMFormatException actualSymphonyPEMFormatException =
        new SymphonyPEMFormatException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualSymphonyPEMFormatException.getMessage());
    assertEquals(0, actualSymphonyPEMFormatException.getSuppressed().length);
    assertSame(cause, actualSymphonyPEMFormatException.getCause());
  }

  /**
   * Test {@link SymphonyPEMFormatException#SymphonyPEMFormatException()}.
   *
   * <ul>
   *   <li>Then return Message is {@code PEM string IOException}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyPEMFormatException#SymphonyPEMFormatException()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyPEMFormatException.<init>()",
    "void SymphonyPEMFormatException.<init>(String)",
    "void SymphonyPEMFormatException.<init>(String, Throwable)",
    "void SymphonyPEMFormatException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyPEMFormatException.<init>(Throwable)"
  })
  public void testNewSymphonyPEMFormatException_thenReturnMessageIsPemStringIOException() {
    // Arrange and Act
    SymphonyPEMFormatException actualSymphonyPEMFormatException = new SymphonyPEMFormatException();

    // Assert
    assertEquals("PEM string IOException", actualSymphonyPEMFormatException.getMessage());
    assertNull(actualSymphonyPEMFormatException.getCause());
    assertEquals(0, actualSymphonyPEMFormatException.getSuppressed().length);
  }

  /**
   * Test {@link SymphonyPEMFormatException#SymphonyPEMFormatException(String)}.
   *
   * <ul>
   *   <li>When {@code An error occurred}.
   *   <li>Then return Cause is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyPEMFormatException#SymphonyPEMFormatException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyPEMFormatException.<init>()",
    "void SymphonyPEMFormatException.<init>(String)",
    "void SymphonyPEMFormatException.<init>(String, Throwable)",
    "void SymphonyPEMFormatException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyPEMFormatException.<init>(Throwable)"
  })
  public void testNewSymphonyPEMFormatException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    SymphonyPEMFormatException actualSymphonyPEMFormatException =
        new SymphonyPEMFormatException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualSymphonyPEMFormatException.getMessage());
    assertNull(actualSymphonyPEMFormatException.getCause());
    assertEquals(0, actualSymphonyPEMFormatException.getSuppressed().length);
  }

  /**
   * Test {@link SymphonyPEMFormatException#SymphonyPEMFormatException(String, Throwable, boolean,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return Message is {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link SymphonyPEMFormatException#SymphonyPEMFormatException(String,
   * Throwable, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SymphonyPEMFormatException.<init>()",
    "void SymphonyPEMFormatException.<init>(String)",
    "void SymphonyPEMFormatException.<init>(String, Throwable)",
    "void SymphonyPEMFormatException.<init>(String, Throwable, boolean, boolean)",
    "void SymphonyPEMFormatException.<init>(Throwable)"
  })
  public void testNewSymphonyPEMFormatException_whenTrue_thenReturnMessageIsAnErrorOccurred() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    SymphonyPEMFormatException actualSymphonyPEMFormatException =
        new SymphonyPEMFormatException("An error occurred", cause, true, true);

    // Assert
    assertEquals("An error occurred", actualSymphonyPEMFormatException.getMessage());
    assertEquals(0, actualSymphonyPEMFormatException.getSuppressed().length);
    assertSame(cause, actualSymphonyPEMFormatException.getCause());
  }
}
