package com.symphony.security.clientsdk.transport;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating valid CiphertextTransportV1 instances for testing.
 */
public class CiphertextTransportV1Factory {

  /**
   * Creates a valid CiphertextTransportV1 instance.
   *
   * @return a valid CiphertextTransportV1 instance
   */
  @InterestingTestFactory
  public static CiphertextTransportV1 createCiphertextTransportV1() {
    byte[] cipherText = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
    byte[] aad = new byte[] {10, 11, 12, 13, 14, 15, 16, 17};
    byte[] iv = new byte[] {20, 21, 22, 23, 24, 25, 26, 27};
    byte[] tag = new byte[] {30, 31, 32, 33, 34, 35, 36, 37};

    return new CiphertextTransportV1(cipherText, aad, iv, tag);
  }
}
