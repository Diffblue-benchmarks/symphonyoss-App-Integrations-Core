package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class CertificateAuthorityExceptionDiffblueTest {
  /**
   * Test {@link CertificateAuthorityException#CertificateAuthorityException(String)}.
   * <p>
   * Method under test: {@link CertificateAuthorityException#CertificateAuthorityException(String)}
   */
  @Test
  @MethodsUnderTest({"void CertificateAuthorityException.<init>(String)"})
  public void testNewCertificateAuthorityException() {
    // Arrange and Act
    CertificateAuthorityException actualCertificateAuthorityException = new CertificateAuthorityException("Msg");

    // Assert
    assertEquals("Msg", actualCertificateAuthorityException.getMessage());
    assertNull(actualCertificateAuthorityException.getCause());
    assertEquals(0, actualCertificateAuthorityException.getSuppressed().length);
  }
}
