package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class ClientCertExceptionDiffblueTest {
  /**
   * Test {@link ClientCertException#ClientCertException(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then return Cause is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientCertException#ClientCertException(String)}
   */
  @Test
  @MethodsUnderTest({"void ClientCertException.<init>(String)", "void ClientCertException.<init>(String, Throwable)"})
  public void testNewClientCertException_whenFoo_thenReturnCauseIsNull() {
    // Arrange and Act
    ClientCertException actualClientCertException = new ClientCertException("foo");

    // Assert
    assertEquals("foo", actualClientCertException.getMessage());
    assertNull(actualClientCertException.getCause());
    assertEquals(0, actualClientCertException.getSuppressed().length);
  }

  /**
   * Test {@link ClientCertException#ClientCertException(String, Throwable)}.
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.</li>
   *   <li>Then return Cause is {@link Throwable#Throwable()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientCertException#ClientCertException(String, Throwable)}
   */
  @Test
  @MethodsUnderTest({"void ClientCertException.<init>(String)", "void ClientCertException.<init>(String, Throwable)"})
  public void testNewClientCertException_whenThrowable_thenReturnCauseIsThrowable() {
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
