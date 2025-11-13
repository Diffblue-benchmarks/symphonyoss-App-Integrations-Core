package com.symphony.security.clientsdk.entity;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.InvalidDataException;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EntityCryptoHandlerV2DiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link EntityCryptoHandlerV2#decrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code Cipher Text}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#decrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.decrypt(String, byte[])"})
  public void testDecrypt_whenCipherText_thenThrowSymphonyEncryptionException()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.decrypt("Cipher Text", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandlerV2#decrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code Cipher Text}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#decrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.decrypt(String, byte[])"})
  public void testDecrypt_whenCipherText_thenThrowSymphonyEncryptionException2()
      throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.decrypt("Cipher Text", null);
  }

  /**
   * Test {@link EntityCryptoHandlerV2#decrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#decrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.decrypt(String, byte[])"})
  public void testDecrypt_whenEmptyString_thenThrowSymphonyEncryptionException()
      throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.decrypt("", new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Test {@link EntityCryptoHandlerV2#decrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#decrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.decrypt(String, byte[])"})
  public void testDecrypt_whenNull_thenThrowSymphonyEncryptionException()
      throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.decrypt(null, new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Test {@link EntityCryptoHandlerV2#encrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.encrypt(String, byte[])"})
  public void testEncrypt_whenEmptyString_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt("", new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Test {@link EntityCryptoHandlerV2#encrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When {@link EntityCiphertextTransportV2#ENTITY_PREFIX}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.encrypt(String, byte[])"})
  public void testEncrypt_whenEntity_prefix_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt(
        EntityCiphertextTransportV2.ENTITY_PREFIX, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandlerV2#encrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.encrypt(String, byte[])"})
  public void testEncrypt_whenNull_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt(null, new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Test {@link EntityCryptoHandlerV2#encrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code Plain Text}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.encrypt(String, byte[])"})
  public void testEncrypt_whenPlainText_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt("Plain Text", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandlerV2#encrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code Plain Text}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.encrypt(String, byte[])"})
  public void testEncrypt_whenPlainText_thenThrowSymphonyEncryptionException2()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt("Plain Text", null);
  }

  /**
   * Test {@link EntityCryptoHandlerV2#encrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code ?}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.encrypt(String, byte[])"})
  public void testEncrypt_whenQuestionMark_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt("?", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.getTokenPrefix(String, byte[])"})
  public void testGetTokenPrefix_whenEmptyString_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix("", new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Test {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}.
   *
   * <ul>
   *   <li>When {@link EntityCiphertextTransportV2#ENTITY_PREFIX}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.getTokenPrefix(String, byte[])"})
  public void testGetTokenPrefix_whenEntity_prefix_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          UnsupportedEncodingException, DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix(
        EntityCiphertextTransportV2.ENTITY_PREFIX, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.getTokenPrefix(String, byte[])"})
  public void testGetTokenPrefix_whenNull_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix(null, new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Test {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code Plaintext}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.getTokenPrefix(String, byte[])"})
  public void testGetTokenPrefix_whenPlaintext_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          UnsupportedEncodingException, DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix("Plaintext", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code Plaintext}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.getTokenPrefix(String, byte[])"})
  public void testGetTokenPrefix_whenPlaintext_thenThrowSymphonyEncryptionException2()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix("Plaintext", null);
  }

  /**
   * Test {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code ?}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.getTokenPrefix(String, byte[])"})
  public void testGetTokenPrefix_whenQuestionMark_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          UnsupportedEncodingException, DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix("?", "AXAXAXAX".getBytes("UTF-8"));
  }
}
