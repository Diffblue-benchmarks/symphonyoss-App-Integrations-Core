package com.symphony.security.clientsdk.transport;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating valid CiphertextTransportV3 instances for testing.
 */
public class CiphertextTransportV3Factory {

  /**
   * Creates a valid CiphertextTransportV3 instance with properly sized byte arrays
   * to avoid ArrayIndexOutOfBoundsException in getRawData().
   *
   * @return a valid CiphertextTransportV3 instance
   */
  @InterestingTestFactory
  public static CiphertextTransportV3 createCiphertextTransportV3() {
    // Create byte arrays with sufficient size to avoid ArrayIndexOutOfBoundsException
    // The getRawData() method appears to access specific indices, so we need adequate length
    byte[] cipherText = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    byte[] aad = new byte[] {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    byte[] iv = new byte[] {20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};
    byte[] tag = new byte[] {30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};
    int podId = 1;
    long rotationId = 1L;
    byte[] keyId = new byte[] {40, 41, 42, 43, 44, 45, 46, 47};
    byte encryptionMode = 1;

    return new CiphertextTransportV3(cipherText, aad, iv, tag, podId, rotationId, keyId, encryptionMode);
  }
}
