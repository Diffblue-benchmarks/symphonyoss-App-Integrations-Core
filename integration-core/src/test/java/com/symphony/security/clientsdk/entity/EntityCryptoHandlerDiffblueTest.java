package com.symphony.security.clientsdk.entity;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EntityCryptoHandlerDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link EntityCryptoHandler#encrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code Plain Text}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandler#encrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandler.encrypt(String, byte[])"})
  public void testEncrypt_whenPlainText_thenThrowSymphonyEncryptionException()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException,
          NoSuchAlgorithmException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandler.encrypt("Plain Text", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandler#encrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code ?}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandler#encrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandler.encrypt(String, byte[])"})
  public void testEncrypt_whenQuestionMark_thenThrowSymphonyEncryptionException()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException,
          NoSuchAlgorithmException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandler.encrypt("?", "AXAXAXAX".getBytes("UTF-8"));
  }
}
