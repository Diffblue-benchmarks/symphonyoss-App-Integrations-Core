package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class KeyStoreExceptionDiffblueTest {
  /**
   * Test {@link KeyStoreException#KeyStoreException(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyStoreException#KeyStoreException(String)}
   */
  @Test
  @MethodsUnderTest({"void KeyStoreException.<init>(String)", "void KeyStoreException.<init>(String, Throwable)",
      "void KeyStoreException.<init>(Throwable)"})
  public void testNewKeyStoreException_whenFoo_thenReturnCauseIsNull() {
    // Arrange and Act
    KeyStoreException actualKeyStoreException = new KeyStoreException("foo");

    // Assert
    assertEquals("foo", actualKeyStoreException.getMessage());
    assertNull(actualKeyStoreException.getCause());
    assertEquals(0, actualKeyStoreException.getSuppressed().length);
  }

  /**
   * Test {@link KeyStoreException#KeyStoreException(String, Throwable)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return Message is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyStoreException#KeyStoreException(String, Throwable)}
   */
  @Test
  @MethodsUnderTest({"void KeyStoreException.<init>(String)", "void KeyStoreException.<init>(String, Throwable)",
      "void KeyStoreException.<init>(Throwable)"})
  public void testNewKeyStoreException_whenFoo_thenReturnMessageIsFoo() {
    // Arrange
    Throwable t = new Throwable();

    // Act
    KeyStoreException actualKeyStoreException = new KeyStoreException("foo", t);

    // Assert
    assertEquals("foo", actualKeyStoreException.getMessage());
    assertEquals(0, actualKeyStoreException.getSuppressed().length);
    assertSame(t, actualKeyStoreException.getCause());
  }

  /**
   * Test {@link KeyStoreException#KeyStoreException(Throwable)}.
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.</li>
   *   <li>Then return Message is {@code Throwable}.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeyStoreException#KeyStoreException(Throwable)}
   */
  @Test
  @MethodsUnderTest({"void KeyStoreException.<init>(String)", "void KeyStoreException.<init>(String, Throwable)",
      "void KeyStoreException.<init>(Throwable)"})
  public void testNewKeyStoreException_whenThrowable_thenReturnMessageIsJavaLangThrowable() {
    // Arrange
    Throwable t = new Throwable();

    // Act
    KeyStoreException actualKeyStoreException = new KeyStoreException(t);

    // Assert
    assertEquals("java.lang.Throwable", actualKeyStoreException.getMessage());
    assertEquals(0, actualKeyStoreException.getSuppressed().length);
    assertSame(t, actualKeyStoreException.getCause());
  }
}
