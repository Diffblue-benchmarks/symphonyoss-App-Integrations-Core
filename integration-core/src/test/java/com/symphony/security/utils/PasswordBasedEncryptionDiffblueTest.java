package com.symphony.security.utils;

import static org.junit.Assert.assertEquals;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PasswordBasedEncryptionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link PasswordBasedEncryption#decrypt(char[], String)}
   */
  @Test
  public void testDecrypt() throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    PasswordBasedEncryption.decrypt("AZAZ".toCharArray(), "Encrypted Text");
  }

  /**
   * Method under test: {@link PasswordBasedEncryption#decrypt(char[], String)}
   */
  @Test
  public void testDecrypt2() throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    PasswordBasedEncryption.decrypt("AZAZ".toCharArray(), PasswordBasedEncryption.AES_CBC_PKCS5_PADDING);
  }

  /**
   * Method under test: {@link PasswordBasedEncryption#encrypt(char[], String)}
   */
  @Test
  public void testEncrypt() throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PasswordBasedEncryption.encrypt(null, null);
  }

  /**
   * Method under test: {@link PasswordBasedEncryption#encrypt(char[], String)}
   */
  @Test
  public void testEncrypt2() throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PasswordBasedEncryption.encrypt(new char[]{'A', 'Z', 'A', 'Z'}, null);
  }

  /**
   * Method under test: {@link PasswordBasedEncryption#randomBytes(int)}
   */
  @Test
  public void testRandomBytes() {
    // Arrange, Act and Assert
    assertEquals(3, PasswordBasedEncryption.randomBytes(3).length);
  }
}
