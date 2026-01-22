package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating test input strings for PrettyPrint methods.
 * These methods call native code which is not available during testing.
 */
public class PrettyPrintFactory {

  /**
   * Creates a null string for prettyPrintCrl to avoid UnsatisfiedLinkError.
   * Since the native method will fail regardless, returning null allows the test
   * to proceed to the native call and document the behavior.
   *
   * @return null to indicate no valid test input exists
   */
  @InterestingTestFactory
  public static String createPrettyPrintCrlInput() {
    // Native method will throw UnsatisfiedLinkError regardless of input
    // Return null to allow test generation to proceed
    return null;
  }

  /**
   * Creates a null string for prettyPrintReq to avoid UnsatisfiedLinkError.
   * Since the native method will fail regardless, returning null allows the test
   * to proceed to the native call and document the behavior.
   *
   * @return null to indicate no valid test input exists
   */
  @InterestingTestFactory
  public static String createPrettyPrintReqInput() {
    // Native method will throw UnsatisfiedLinkError regardless of input
    // Return null to allow test generation to proceed
    return null;
  }
}
