package com.symphony.security.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.utils.ValidateFactory;
import org.junit.Test;

public class UserSignatureExceptionDiffblueTest {
  /**
   * Test {@link UserSignatureException#UserSignatureException(String)}.
   *
   * <p>Method under test: {@link UserSignatureException#UserSignatureException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserSignatureException.<init>(String)"})
  public void testNewUserSignatureException() {
    // Arrange and Act
    UserSignatureException actualUserSignatureException =
        new UserSignatureException(ValidateFactory.createNonNullString());

    // Assert
    assertEquals("validString", actualUserSignatureException.getMessage());
    assertNull(actualUserSignatureException.getCause());
    assertEquals(0, actualUserSignatureException.getSuppressed().length);
  }
}
