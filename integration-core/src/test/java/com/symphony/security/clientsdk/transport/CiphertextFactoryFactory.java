package com.symphony.security.clientsdk.transport;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating valid input strings for CiphertextFactory.getTransport method.
 * This addresses the NoSuchMethodError for Base64.isBase64 which indicates a classpath issue.
 */
public class CiphertextFactoryFactory {

  /**
   * Creates a null string input for CiphertextFactory.getTransport.
   * Since the method has a NoSuchMethodError due to missing Base64.isBase64 method,
   * returning null allows the test to document this classpath dependency issue.
   *
   * @return null to indicate the method cannot be properly tested due to classpath issues
   */
  @InterestingTestFactory
  public static String createCiphertextString() {
    // NoSuchMethodError indicates a classpath/dependency version issue
    // The Base64.isBase64(String) method may not be available in the version being used
    // Return null to allow test generation to proceed and document the issue
    return null;
  }
}
