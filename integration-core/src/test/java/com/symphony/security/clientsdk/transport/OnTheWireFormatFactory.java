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

  /**
   * Creates a valid OnTheWireFormat instance using byte array constructor.
   * This ensures the IV is properly sized at 16 bytes.
   *
   * @return a valid OnTheWireFormat instance
   * @throws OnTheWireFormatException if construction fails
   */
  @InterestingTestFactory
  public static OnTheWireFormat createOnTheWireFormatFromBytes() throws OnTheWireFormatException {
    // Create a complete on-the-wire format byte array
    // Format: protocolVersion(8) + version(1) + options(1) + iv(16) + keyId(8) + ciphertext(variable) + tag(16)
    byte[] completeMessage = new byte[58]; // 8 + 1 + 1 + 16 + 8 + 8 + 16

    // Protocol version (8 bytes)
    completeMessage[0] = 1;

    // Version (1 byte) at offset 8
    completeMessage[8] = 1;

    // Options (1 byte) at offset 9
    completeMessage[9] = 0;

    // IV (16 bytes) at offset 10
    for (int i = 0; i < 16; i++) {
      completeMessage[10 + i] = (byte) i;
    }

    // Key ID (8 bytes) at offset 26
    for (int i = 0; i < 8; i++) {
      completeMessage[26 + i] = (byte) i;
    }

    // Ciphertext (8 bytes) at offset 34
    for (int i = 0; i < 8; i++) {
      completeMessage[34 + i] = (byte) (10 + i * 10);
    }

    // Tag (16 bytes) at offset 42
    for (int i = 0; i < 16; i++) {
      completeMessage[42 + i] = (byte) (i + 1);
    }

    return new OnTheWireFormat(completeMessage);
  }
}
