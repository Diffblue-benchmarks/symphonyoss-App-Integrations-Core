package com.symphony.security.clientsdk.entity;

import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EntityCryptoHandlerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link EntityCryptoHandler#encrypt(String, byte[])}
   */
  @Test
  public void testEncrypt() throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException,
      NoSuchAlgorithmException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandler.encrypt("Plain Text", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test: {@link EntityCryptoHandler#encrypt(String, byte[])}
   */
  @Test
  public void testEncrypt2() throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException,
      NoSuchAlgorithmException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandler.encrypt("?", "AXAXAXAX".getBytes("UTF-8"));
  }
}
