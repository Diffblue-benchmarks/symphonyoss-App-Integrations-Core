package com.symphony.security.helper;

import com.symphony.security.exceptions.SymphonyEncryptionException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CDecryptionHelperDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link CDecryptionHelper#encrypt(String, int, int, long)}
   */
  @Test
  public void testEncrypt() throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    (new CDecryptionHelper("Room Key")).encrypt("Not all who wander are lost", 1, 1, 1L);
  }

  /**
   * Method under test: {@link CDecryptionHelper#encrypt(byte[], int, int, long)}
   */
  @Test
  public void testEncrypt2() throws SymphonyEncryptionException, UnsupportedEncodingException {
    // Arrange
    CDecryptionHelper cDecryptionHelper = new CDecryptionHelper("Room Key");

    // Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    cDecryptionHelper.encrypt("AXAXAXAX".getBytes("UTF-8"), 1, 1, 1L);
  }

  /**
   * Method under test:
   * {@link CDecryptionHelper#encrypt(byte[], int, int, long, byte)}
   */
  @Test
  public void testEncrypt3() throws SymphonyEncryptionException, UnsupportedEncodingException {
    // Arrange
    CDecryptionHelper cDecryptionHelper = new CDecryptionHelper("Room Key");

    // Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    cDecryptionHelper.encrypt("AXAXAXAX".getBytes("UTF-8"), 1, 1, 1L, (byte) 1);
  }
}
