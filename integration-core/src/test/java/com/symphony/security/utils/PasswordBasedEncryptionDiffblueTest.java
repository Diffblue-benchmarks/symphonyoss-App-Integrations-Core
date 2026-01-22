package com.symphony.security.utils;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PasswordBasedEncryptionDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link PasswordBasedEncryption#decrypt(char[], String)}.
   *
   * <ul>
   *   <li>When {@link PasswordBasedEncryption#AES_CBC_PKCS5_PADDING}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link PasswordBasedEncryption#decrypt(char[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PasswordBasedEncryption.decrypt(char[], String)"})
  public void testDecrypt_whenAes_cbc_pkcs5_padding_thenThrowSymphonyEncryptionException()
      throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    PasswordBasedEncryption.decrypt(
        "AZAZ".toCharArray(), PasswordBasedEncryption.AES_CBC_PKCS5_PADDING);
  }

  /**
   * Test {@link PasswordBasedEncryption#decrypt(char[], String)}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link PasswordBasedEncryption#decrypt(char[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PasswordBasedEncryption.decrypt(char[], String)"})
  public void testDecrypt_whenCreateNonNullString_thenThrowSymphonyEncryptionException()
      throws SymphonyEncryptionException {
    // Arrange
    char[] password = "AZAZ".toCharArray();

    // Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    PasswordBasedEncryption.decrypt(password, ValidateFactory.createNonNullString());
  }

  /**
   * Test {@link PasswordBasedEncryption#decrypt(char[], String)}.
   *
   * <ul>
   *   <li>When createValidX509CertificateString.
   * </ul>
   *
   * <p>Method under test: {@link PasswordBasedEncryption#decrypt(char[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PasswordBasedEncryption.decrypt(char[], String)"})
  public void testDecrypt_whenCreateValidX509CertificateString()
      throws SymphonyEncryptionException {
    // Arrange
    char[] password = "AZAZ".toCharArray();

    // Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    PasswordBasedEncryption.decrypt(
        password, SecurityKeyUtilsFactory.createValidX509CertificateString());
  }

  /**
   * Test {@link PasswordBasedEncryption#decrypt(char[], String)}.
   *
   * <ul>
   *   <li>When {@code Encrypted Text}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link PasswordBasedEncryption#decrypt(char[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PasswordBasedEncryption.decrypt(char[], String)"})
  public void testDecrypt_whenEncryptedText_thenThrowSymphonyEncryptionException()
      throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    PasswordBasedEncryption.decrypt("AZAZ".toCharArray(), "Encrypted Text");
  }

  /**
   * Test {@link PasswordBasedEncryption#encrypt(char[], String)}.
   *
   * <ul>
   *   <li>When array of {@code char} with {@code A} and {@code Z}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PasswordBasedEncryption#encrypt(char[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PasswordBasedEncryption.encrypt(char[], String)"})
  public void testEncrypt_whenArrayOfCharWithAAndZ_thenThrowIllegalArgumentException()
      throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PasswordBasedEncryption.encrypt(new char[] {'A', 'Z', 'A', 'Z'}, null);
  }

  /**
   * Test {@link PasswordBasedEncryption#encrypt(char[], String)}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link PasswordBasedEncryption#encrypt(char[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PasswordBasedEncryption.encrypt(char[], String)"})
  public void testEncrypt_whenCreateNonNullString_thenDoesNotThrow()
      throws SymphonyEncryptionException {
    // Arrange
    char[] password = "AZAZ".toCharArray();

    // Act
    PasswordBasedEncryption.encrypt(password, ValidateFactory.createNonNullString());
  }

  /**
   * Test {@link PasswordBasedEncryption#encrypt(char[], String)}.
   *
   * <ul>
   *   <li>When createValidX509CertificateString.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link PasswordBasedEncryption#encrypt(char[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PasswordBasedEncryption.encrypt(char[], String)"})
  public void testEncrypt_whenCreateValidX509CertificateString_thenDoesNotThrow()
      throws SymphonyEncryptionException {
    // Arrange
    char[] password = "AZAZ".toCharArray();

    // Act
    PasswordBasedEncryption.encrypt(
        password, SecurityKeyUtilsFactory.createValidX509CertificateString());
  }

  /**
   * Test {@link PasswordBasedEncryption#encrypt(char[], String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PasswordBasedEncryption#encrypt(char[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PasswordBasedEncryption.encrypt(char[], String)"})
  public void testEncrypt_whenNull_thenThrowIllegalArgumentException()
      throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PasswordBasedEncryption.encrypt(null, ValidateFactory.createNonNullString());
  }

  /**
   * Test {@link PasswordBasedEncryption#encrypt(char[], String)}.
   *
   * <ul>
   *   <li>When {@link PasswordBasedEncryption#PBKDF_2_WITH_HMAC_SHA_1}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link PasswordBasedEncryption#encrypt(char[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PasswordBasedEncryption.encrypt(char[], String)"})
  public void testEncrypt_whenPbkdf_2_with_hmac_sha_1_thenDoesNotThrow()
      throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    PasswordBasedEncryption.encrypt(
        "AZAZ".toCharArray(), PasswordBasedEncryption.PBKDF_2_WITH_HMAC_SHA_1);
  }
}
