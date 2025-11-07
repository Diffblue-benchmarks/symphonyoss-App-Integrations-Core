package com.symphony.security.utils;

import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ValidateDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link Validate#isCorrectLength(byte[], int, String)}
   */
  @Test
  public void testIsCorrectLength() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Validate.isCorrectLength("AXAXAXAX".getBytes("UTF-8"), 3, "Name");
  }

  /**
   * Method under test: {@link Validate#isTrue(boolean, String, Object[])}
   */
  @Test
  public void testIsTrue() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Validate.isTrue(false, "Msg", "Args");
  }
}
