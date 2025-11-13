package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BCryptDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link BCrypt#checkPassword(String, String)}.
   *
   * <ul>
   *   <li>When {@code iloveyou}.
   *   <li>Then throw {@link SymphonyInputException}.
   * </ul>
   *
   * <p>Method under test: {@link BCrypt#checkPassword(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BCrypt.checkPassword(String, String)"})
  public void testCheckPassword_whenIloveyou_thenThrowSymphonyInputException()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    BCrypt.checkPassword("iloveyou", null);
  }

  /**
   * Test {@link BCrypt#checkPassword(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyInputException}.
   * </ul>
   *
   * <p>Method under test: {@link BCrypt#checkPassword(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BCrypt.checkPassword(String, String)"})
  public void testCheckPassword_whenNull_thenThrowSymphonyInputException()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    BCrypt.checkPassword(null, "Hash");
  }

  /**
   * Test {@link BCrypt#hash(int, String)}.
   *
   * <p>Method under test: {@link BCrypt#hash(int, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String BCrypt.hash(int, String)"})
  public void testHash()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    BCrypt.hash(3, null);
  }
}
