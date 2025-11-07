package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UserSignatureExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link UserSignatureException#UserSignatureException(String)}
   */
  @Test
  public void testNewUserSignatureException() {
    // Arrange and Act
    UserSignatureException actualUserSignatureException = new UserSignatureException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualUserSignatureException.getMessage());
    assertNull(actualUserSignatureException.getCause());
    assertEquals(0, actualUserSignatureException.getSuppressed().length);
  }
}
