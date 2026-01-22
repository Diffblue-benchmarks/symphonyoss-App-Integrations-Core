package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for Version.get() method testing.
 * The Version class has a private constructor and calls native code which is not available during testing.
 * Since Version.get() is a static method, no instance is needed.
 */
public class VersionFactory {

  /**
   * Creates a null return value since Version.get() is static and doesn't require an instance.
   * The get() method calls native code which will throw UnsatisfiedLinkError regardless.
   * This factory allows test generation to proceed and document the native method behavior.
   *
   * @return null (no instance needed for static method)
   */
  @InterestingTestFactory
  public static String createVersionString() {
    // Version.get() is static and will throw UnsatisfiedLinkError when called
    // Return null to indicate no valid test input exists for this native method
    return null;
  }
}
