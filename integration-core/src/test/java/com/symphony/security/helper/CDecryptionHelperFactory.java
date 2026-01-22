package com.symphony.security.helper;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating valid inputs for CDecryptionHelper.decrypt methods.
 */
public class CDecryptionHelperFactory {

  /**
   * Creates a null string input for CDecryptionHelper.decrypt(String) method.
   * The method encounters NoSuchMethodError for Base64.isBase64, indicating a classpath issue.
   * Returning null allows test generation to document this dependency problem.
   *
   * @return null to indicate classpath dependency issue
   */
  @InterestingTestFactory
  public static String createDecryptStringInput() {
    // NoSuchMethodError for Base64.isBase64(String) indicates version mismatch
    // Return null to allow test generation to proceed and document the issue
    return null;
  }

  /**
   * Creates a valid byte array with version 1 prefix for CDecryptionHelper.decrypt(byte[]) method.
   * The error message shows "Version 65 of CiphertextTransport is not supported", where 65 is ASCII 'A'.
   * This means the input started with 'A' instead of a proper version byte.
   * Valid versions are 1, 2, or 3.
   *
   * @return a byte array with valid version prefix
   */
  @InterestingTestFactory
  public static byte[] createDecryptByteArrayInput() {
    // Create a byte array with version 1 prefix followed by data
    // Version byte should be 1, 2, or 3 (not 65 which is ASCII 'A')
    byte[] data = new byte[64];
    data[0] = 1; // Version 1
    // Fill rest with sample data
    for (int i = 1; i < data.length; i++) {
      data[i] = (byte) i;
    }
    return data;
  }
}
