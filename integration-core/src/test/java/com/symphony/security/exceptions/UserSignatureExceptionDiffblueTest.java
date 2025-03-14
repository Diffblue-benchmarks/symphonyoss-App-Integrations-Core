package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserSignatureExceptionDiffblueTest {
  /**
   * Test {@link UserSignatureException#UserSignatureException(String)}.
   * <p>
   * Method under test: {@link UserSignatureException#UserSignatureException(String)}
   */
  @Test
  @MethodsUnderTest({"void UserSignatureException.<init>(String)"})
  public void testNewUserSignatureException() {
    // Arrange and Act
    UserSignatureException actualUserSignatureException = new UserSignatureException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualUserSignatureException.getMessage());
    assertNull(actualUserSignatureException.getCause());
    assertEquals(0, actualUserSignatureException.getSuppressed().length);
  }
}
