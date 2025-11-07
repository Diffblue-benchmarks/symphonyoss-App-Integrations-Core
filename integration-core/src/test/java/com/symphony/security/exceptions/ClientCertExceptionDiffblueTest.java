package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class ClientCertExceptionDiffblueTest {
  /**
   * Method under test: {@link ClientCertException#ClientCertException(String)}
   */
  @Test
  public void testNewClientCertException() {
    // Arrange and Act
    ClientCertException actualClientCertException = new ClientCertException("foo");

    // Assert
    assertEquals("foo", actualClientCertException.getMessage());
    assertNull(actualClientCertException.getCause());
    assertEquals(0, actualClientCertException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link ClientCertException#ClientCertException(String, Throwable)}
   */
  @Test
  public void testNewClientCertException2() {
    // Arrange
    Throwable t = new Throwable();

    // Act
    ClientCertException actualClientCertException = new ClientCertException("foo", t);

    // Assert
    assertEquals("foo", actualClientCertException.getMessage());
    assertEquals(0, actualClientCertException.getSuppressed().length);
    assertSame(t, actualClientCertException.getCause());
  }
}
