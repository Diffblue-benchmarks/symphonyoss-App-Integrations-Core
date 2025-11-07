package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class KeyStoreExceptionDiffblueTest {
  /**
   * Method under test: {@link KeyStoreException#KeyStoreException(String)}
   */
  @Test
  public void testNewKeyStoreException() {
    // Arrange and Act
    KeyStoreException actualKeyStoreException = new KeyStoreException("foo");

    // Assert
    assertEquals("foo", actualKeyStoreException.getMessage());
    assertNull(actualKeyStoreException.getCause());
    assertEquals(0, actualKeyStoreException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link KeyStoreException#KeyStoreException(String, Throwable)}
   */
  @Test
  public void testNewKeyStoreException2() {
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
   * Method under test: {@link KeyStoreException#KeyStoreException(Throwable)}
   */
  @Test
  public void testNewKeyStoreException3() {
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
