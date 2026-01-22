package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.utils.ValidateFactory;
import org.junit.Test;

public class CertificateAuthorityExceptionDiffblueTest {
  /**
   * Test {@link CertificateAuthorityException#CertificateAuthorityException(String)}.
   *
   * <p>Method under test: {@link
   * CertificateAuthorityException#CertificateAuthorityException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CertificateAuthorityException.<init>(String)"})
  public void testNewCertificateAuthorityException() {
    // Arrange and Act
    CertificateAuthorityException actualCertificateAuthorityException =
        new CertificateAuthorityException(ValidateFactory.createNonNullString());

    // Assert
    assertEquals("validString", actualCertificateAuthorityException.getMessage());
    assertNull(actualCertificateAuthorityException.getCause());
    assertEquals(0, actualCertificateAuthorityException.getSuppressed().length);
  }
}
