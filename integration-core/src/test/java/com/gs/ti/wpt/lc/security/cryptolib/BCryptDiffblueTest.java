package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BCryptDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link BCrypt#checkPassword(String, String)}.
   * <ul>
   *   <li>When {@code iloveyou}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BCrypt#checkPassword(String, String)}
   */
  @Test
  @MethodsUnderTest({"boolean BCrypt.checkPassword(String, String)"})
  public void testCheckPassword_whenIloveyou()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    BCrypt.checkPassword("iloveyou", null);
  }

  /**
   * Test {@link BCrypt#checkPassword(String, String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BCrypt#checkPassword(String, String)}
   */
  @Test
  @MethodsUnderTest({"boolean BCrypt.checkPassword(String, String)"})
  public void testCheckPassword_whenNull()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    BCrypt.checkPassword(null, null);
  }

  /**
   * Test {@link BCrypt#hash(int, String)}.
   * <p>
   * Method under test: {@link BCrypt#hash(int, String)}
   */
  @Test
  @MethodsUnderTest({"String BCrypt.hash(int, String)"})
  public void testHash() throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    BCrypt.hash(3, null);
  }
}
