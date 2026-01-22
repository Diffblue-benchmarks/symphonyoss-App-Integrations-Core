package com.symphony.security.clientsdk.transport;

import com.diffblue.cover.annotations.InterestingTestFactory;
import com.symphony.security.exceptions.OnTheWireFormatException;

/**
 * Factory class for creating valid OnTheWireFormat instances for testing.
 */
public class OnTheWireFormatFactory {

  /**
   * Creates a valid OnTheWireFormat instance with sufficient data.
   *
   * @return a valid OnTheWireFormat instance
   * @throws OnTheWireFormatException if construction fails
   */
  @InterestingTestFactory
  public static OnTheWireFormat createOnTheWireFormat() throws OnTheWireFormatException {
    // Create valid instances using the multi-parameter constructor
    byte[] protocolVersion = new byte[] {1, 0, 0, 0, 0, 0, 0, 0}; // 8 bytes
    byte version = 1;
    byte options = 0;
    byte[] iv = new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // 16 bytes
    byte[] keyId = new byte[] {0, 1, 2, 3, 4, 5, 6, 7}; // 8 bytes
    byte[] ciphertext = new byte[] {10, 20, 30, 40, 50, 60, 70, 80}; // 8 bytes
    byte[] tag = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}; // 16 bytes

    return new OnTheWireFormat(protocolVersion, version, options, iv, keyId, ciphertext, tag);
  }
}
