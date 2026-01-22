package com.symphony.security.clientsdk.entity;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.InvalidDataException;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import com.symphony.security.helper.CDecryptionHelperFactory;
import com.symphony.security.utils.ValidateFactory;
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
   *   <li>When createEntityStringV1.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#decrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.decrypt(String, byte[])"})
  public void testDecrypt_whenCreateEntityStringV1_thenThrowSymphonyEncryptionException()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.decrypt(
        EntityCryptoHandlerFactory.createEntityStringV1(), "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandlerV2#decrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#decrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.decrypt(String, byte[])"})
  public void testDecrypt_whenCreateNonNullString_thenThrowSymphonyEncryptionException()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.decrypt(
        ValidateFactory.createNonNullString(), "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandlerV2#decrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#decrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.decrypt(String, byte[])"})
  public void testDecrypt_whenCreateNonNullString_thenThrowSymphonyEncryptionException2()
      throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.decrypt(ValidateFactory.createNonNullString(), null);
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
   *   <li>When createEntityStringV1.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.encrypt(String, byte[])"})
  public void testEncrypt_whenCreateEntityStringV1_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt(
        EntityCryptoHandlerFactory.createEntityStringV1(), "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandlerV2#encrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.encrypt(String, byte[])"})
  public void testEncrypt_whenCreateNonNullString_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt(
        ValidateFactory.createNonNullString(), "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandlerV2#encrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#encrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.encrypt(String, byte[])"})
  public void testEncrypt_whenCreateNonNullString_thenThrowSymphonyEncryptionException2()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.encrypt(ValidateFactory.createNonNullString(), null);
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
   *   <li>When createDecryptStringInput.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.getTokenPrefix(String, byte[])"})
  public void testGetTokenPrefix_whenCreateDecryptStringInput()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          UnsupportedEncodingException, DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix(
        CDecryptionHelperFactory.createDecryptStringInput(), "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}.
   *
   * <ul>
   *   <li>When createEntityStringV1.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.getTokenPrefix(String, byte[])"})
  public void testGetTokenPrefix_whenCreateEntityStringV1_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          UnsupportedEncodingException, DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix(
        EntityCryptoHandlerFactory.createEntityStringV1(), "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandlerV2#getTokenPrefix(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandlerV2.getTokenPrefix(String, byte[])"})
  public void testGetTokenPrefix_whenCreateNonNullString_thenThrowSymphonyEncryptionException()
      throws InvalidDataException, SymphonyEncryptionException, SymphonyInputException,
          UnsupportedEncodingException, DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix(
        ValidateFactory.createNonNullString(), "AXAXAXAX".getBytes("UTF-8"));
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
          UnsupportedEncodingException, DecoderException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandlerV2.getTokenPrefix("", "AXAXAXAX".getBytes("UTF-8"));
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
    EntityCryptoHandlerV2.getTokenPrefix(ValidateFactory.createNonNullString(), null);
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
