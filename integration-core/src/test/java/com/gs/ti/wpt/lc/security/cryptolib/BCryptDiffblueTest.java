package com.gs.ti.wpt.lc.security.cryptolib;

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
   * Method under test: {@link BCrypt#checkPassword(String, String)}
   */
  @Test
  public void testCheckPassword()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    BCrypt.checkPassword(null, null);
  }

  /**
   * Method under test: {@link BCrypt#checkPassword(String, String)}
   */
  @Test
  public void testCheckPassword2()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    BCrypt.checkPassword("iloveyou", null);
  }

  /**
   * Method under test: {@link BCrypt#hash(int, String)}
   */
  @Test
  public void testHash() throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    BCrypt.hash(3, null);
  }
}
