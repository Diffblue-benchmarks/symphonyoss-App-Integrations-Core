package com.symphony.security.clientsdk.entity;

import com.diffblue.cover.annotations.InterestingTestFactory;
import java.util.Base64;

/**
 * Factory class for creating valid inputs for EntityCryptoHandler.decrypt method.
 */
public class EntityCryptoHandlerFactory {

  /**
   * Creates a valid entity string for EntityCryptoHandler.decrypt method.
   * The entity string must be formatted with version 1 to avoid InvalidDataException.
   * Format: "!" + version + ":" + base64-encoded data
   *
   * @return a valid entity string with version 1
   */
  @InterestingTestFactory
  public static String createEntityStringV1() {
    // Create a version 1 entity string to avoid "Expected version 1 but found 106" error
    // Format: "!" followed by version "1:" and then base64-encoded data
    // The data needs to be properly formatted for CiphertextTransportV1
    byte[] sampleData = new byte[64]; // Provide enough data for parsing
    for (int i = 0; i < sampleData.length; i++) {
      sampleData[i] = (byte) i;
    }
    String base64Data = Base64.getEncoder().encodeToString(sampleData);
    return "!1:" + base64Data;
  }

  /**
   * Creates a valid byte array for EntityCryptoHandler.decrypt method.
   *
   * @return a valid byte array
   */
  @InterestingTestFactory
  public static byte[] createDecryptByteArray() {
    // Provide a simple non-null byte array
    return new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
  }
}
