package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class CertificateAuthorityExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link CertificateAuthorityException#CertificateAuthorityException(String)}
   */
  @Test
  public void testNewCertificateAuthorityException() {
    // Arrange and Act
    CertificateAuthorityException actualCertificateAuthorityException = new CertificateAuthorityException("Msg");

    // Assert
    assertEquals("Msg", actualCertificateAuthorityException.getMessage());
    assertNull(actualCertificateAuthorityException.getCause());
    assertEquals(0, actualCertificateAuthorityException.getSuppressed().length);
  }
}
