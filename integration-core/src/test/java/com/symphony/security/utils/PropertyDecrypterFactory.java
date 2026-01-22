package com.symphony.security.utils;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating valid PropertyDecrypter test data.
 */
public class PropertyDecrypterFactory {

  /**
   * Creates a valid password string for PropertyDecrypter.encryptProperty.
   * This avoids the "password is a required parameter" exception.
   *
   * @return a valid password string
   */
  @InterestingTestFactory
  public static String createValidPassword() {
    return "testPassword123";
  }

  /**
   * Creates a valid UserInput instance that provides password and property values.
   * This avoids the "Console is not available" exception by providing a mock implementation.
   *
   * @return a valid UserInput instance
   */
  @InterestingTestFactory
  public static PropertyDecrypter.UserInput createValidUserInput() {
    return new PropertyDecrypter.UserInput() {
      private int callCount = 0;

      @Override
      public char[] getSecret(String prompt) {
        // First call is for password, second call is for property value
        callCount++;
        if (callCount == 1) {
          return "testPassword123".toCharArray();
        } else {
          return "testPropertyValue".toCharArray();
        }
      }
    };
  }

  /**
   * Creates a valid char array password for PropertyDecrypter.encryptPropertyViaPrompt(char[]).
   * This avoids the "Console is not available" exception.
   *
   * @return a valid password char array
   */
  @InterestingTestFactory
  public static char[] createValidPasswordCharArray() {
    return "testPassword123".toCharArray();
  }
}
