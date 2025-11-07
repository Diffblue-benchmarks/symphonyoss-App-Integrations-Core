package com.symphony.security.clientsdk.entity;

import com.symphony.security.exceptions.InvalidDataException;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EntityCryptoHandlerV2DiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link EntityCryptoHandlerV2#decrypt(String, byte[])}
   */
  @Test
  public void testDecrypt() throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.decrypt("Cipher Text", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test: {@link EntityCryptoHandlerV2#decrypt(String, byte[])}
   */
  @Test
  public void testDecrypt2() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.decrypt(null, null);
  }

  /**
   * Method under test: {@link EntityCryptoHandlerV2#decrypt(String, byte[])}
   */
  @Test
  public void testDecrypt3() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.decrypt("Cipher Text", null);
  }

  /**
   * Method under test: {@link EntityCryptoHandlerV2#decrypt(String, byte[])}
   */
  @Test
  public void testDecrypt4() throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.decrypt("", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  public void testEncrypt()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt("Plain Text", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  public void testEncrypt2() throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt(null, null);
  }

  /**
   * Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  public void testEncrypt3() throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt("Plain Text", null);
  }

  /**
   * Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  public void testEncrypt4()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt("?", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  public void testEncrypt5()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt(EntityCiphertextTransportV2.ENTITY_PREFIX, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  public void testEncrypt6()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt("", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test:
   * {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  public void testGetTokenPrefix() throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
      UnsupportedEncodingException, DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix("Plaintext", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test:
   * {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  public void testGetTokenPrefix2()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException, DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix(null, null);
  }

  /**
   * Method under test:
   * {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  public void testGetTokenPrefix3()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException, DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix("Plaintext", null);
  }

  /**
   * Method under test:
   * {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  public void testGetTokenPrefix4() throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
      UnsupportedEncodingException, DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix("?", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test:
   * {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  public void testGetTokenPrefix5() throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
      UnsupportedEncodingException, DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix(EntityCiphertextTransportV2.ENTITY_PREFIX, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test:
   * {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  public void testGetTokenPrefix6() throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
      UnsupportedEncodingException, DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix("", "AXAXAXAX".getBytes("UTF-8"));
  }
}
