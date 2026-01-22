package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.utils.ValidateFactory;
import org.junit.Test;

public class SymphonyRevokedCertExceptionDiffblueTest {
  /**
   * Test {@link SymphonyRevokedCertException#SymphonyRevokedCertException(String)}.
   *
   * <p>Method under test: {@link SymphonyRevokedCertException#SymphonyRevokedCertException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void SymphonyRevokedCertException.<init>(String)"})
  public void testNewSymphonyRevokedCertException() {
    // Arrange and Act
    SymphonyRevokedCertException actualSymphonyRevokedCertException =
        new SymphonyRevokedCertException(ValidateFactory.createNonNullString());

    // Assert
    assertEquals("validString", actualSymphonyRevokedCertException.getMessage());
    assertNull(actualSymphonyRevokedCertException.getCause());
    assertEquals(0, actualSymphonyRevokedCertException.getSuppressed().length);
  }
}
