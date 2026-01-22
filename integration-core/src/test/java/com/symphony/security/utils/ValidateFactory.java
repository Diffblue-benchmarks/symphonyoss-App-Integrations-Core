package com.symphony.security.utils;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating valid test data for Validate methods.
 */
public class ValidateFactory {

  /**
   * Creates a valid non-null Object for Validate.notNull testing.
   * This avoids NullPointerException by providing a valid object reference.
   *
   * @return a valid non-null Object
   */
  @InterestingTestFactory
  public static Object createNonNullObject() {
    return new Object();
  }

  /**
   * Creates a valid non-null String for Validate.notNull testing.
   * This avoids NullPointerException by providing a valid string.
   *
   * @return a valid non-null String
   */
  @InterestingTestFactory
  public static String createNonNullString() {
    return "validString";
  }

  /**
   * Creates a valid format string array for Validate.notNull.
   * This provides the format arguments expected by the method.
   *
   * @return a valid format arguments array
   */
  @InterestingTestFactory
  public static Object[] createValidFormatArgs() {
    return new Object[] {"arg1", "arg2"};
  }
}
