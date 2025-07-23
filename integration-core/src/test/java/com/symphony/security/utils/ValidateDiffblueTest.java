package com.symphony.security.utils;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ValidateDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link Validate#isCorrectLength(byte[], int, String)}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Validate#isCorrectLength(byte[], int, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Validate.isCorrectLength(byte[], int, String)"})
  public void testIsCorrectLength_whenAxaxaxaxBytesIsUtf8_thenThrowIllegalArgumentException()
      throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Validate.isCorrectLength("AXAXAXAX".getBytes("UTF-8"), 3, "Name");
  }

  /**
   * Test {@link Validate#isTrue(boolean, String, Object[])}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Validate#isTrue(boolean, String, Object[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Validate.isTrue(boolean, String, Object[])"})
  public void testIsTrue_whenFalse_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Validate.isTrue(false, "Msg", "Args");
  }
}
