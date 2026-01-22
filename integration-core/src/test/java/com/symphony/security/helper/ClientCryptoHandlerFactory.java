package com.symphony.security.helper;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating valid ClientCryptoHandler instances and related test data.
 */
public class ClientCryptoHandlerFactory {

  /**
   * Creates a valid AES-256 key for encryption/decryption operations.
   * AES requires key lengths of 16, 24, or 32 bytes.
   *
   * @return a valid 32-byte (256-bit) AES key
   */
  @InterestingTestFactory
  public static byte[] createValidAesKey() {
    // Create a 32-byte (256-bit) key for AES-256
    return new byte[] {
      1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
      17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32
    };
  }

  /**
   * Creates a valid encrypted message byte array for decryptMsg method.
   * The byte array represents a properly formatted CiphertextTransport (version 1).
   *
   * @return a valid encrypted message byte array
   */
  @InterestingTestFactory
  public static byte[] createValidEncryptedMessage() {
    // Create a byte array that represents a valid CiphertextTransport
    // Version 1 is indicated by the first byte being 1
    // This needs to be a properly serialized CiphertextTransport object
    byte[] cipherText = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
    byte[] aad = new byte[] {10, 11, 12, 13, 14, 15, 16, 17};
    byte[] iv = new byte[] {20, 21, 22, 23, 24, 25, 26, 27};
    byte[] tag = new byte[] {30, 31, 32, 33, 34, 35, 36, 37};

    // Create a CiphertextTransportV1 and serialize it to bytes
    com.symphony.security.clientsdk.transport.CiphertextTransportV1 transport =
        new com.symphony.security.clientsdk.transport.CiphertextTransportV1(cipherText, aad, iv, tag);

    return transport.getRawData();
  }

  /**
   * Creates a valid ClientCryptoHandler instance.
   *
   * @return a valid ClientCryptoHandler instance
   */
  @InterestingTestFactory
  public static ClientCryptoHandler createClientCryptoHandler() {
    return new ClientCryptoHandler();
  }
}
