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

  /**
   * Creates a valid KeyIdentifier instance with rotation ID.
   * This factory method uses the 3-parameter constructor to completely avoid
   * the CiphertextFactory.getTransport path that causes NoSuchMethodError.
   *
   * @return a valid KeyIdentifier instance
   */
  @InterestingTestFactory
  public static KeyIdentifier createKeyIdentifierWithRotation() {
    byte[] keyId = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    Long podId = 2L;
    Long rotationId = 1L;
    return new KeyIdentifier(keyId, podId, rotationId);
  }

  /**
   * Creates another valid KeyIdentifier instance with different values.
   * This provides variety for equals() testing while avoiding the problematic constructor.
   *
   * @return a valid KeyIdentifier instance
   */
  @InterestingTestFactory
  public static KeyIdentifier createKeyIdentifierAlternate() {
    byte[] keyId = new byte[] {16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    Long podId = 3L;
    Long rotationId = 2L;
    return new KeyIdentifier(keyId, podId, rotationId);
  }
}
