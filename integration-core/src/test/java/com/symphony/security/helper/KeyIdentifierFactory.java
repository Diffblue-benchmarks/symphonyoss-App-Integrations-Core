package com.symphony.security.helper;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating valid KeyIdentifier instances for testing.
 */
public class KeyIdentifierFactory {

  /**
   * Creates a valid KeyIdentifier instance with 3 parameters.
   *
   * @return a valid KeyIdentifier instance
   */
  @InterestingTestFactory
  public static KeyIdentifier createKeyIdentifier() {
    byte[] keyId = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    Long podId = 1L;
    Long rotationId = 0L;
    return new KeyIdentifier(keyId, podId, rotationId);
  }

  /**
   * Creates a valid KeyIdentifier instance with 4 parameters.
   * This avoids the Base64.isBase64 NoSuchMethodError by not passing a String parameter
   * that would trigger CiphertextFactory.getTransport.
   *
   * @return a valid KeyIdentifier instance
   */
  @InterestingTestFactory
  public static KeyIdentifier createKeyIdentifierWithFourParams() {
    try {
      byte[] keyId = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
      Long podId = 1L;
      String encryptedKey = null;  // Using null to avoid triggering CiphertextFactory
      Boolean isPodEncryptionKey = false;
      return new KeyIdentifier(keyId, podId, encryptedKey, isPodEncryptionKey);
    } catch (Exception e) {
      throw new RuntimeException("Failed to create KeyIdentifier", e);
    }
  }
}
