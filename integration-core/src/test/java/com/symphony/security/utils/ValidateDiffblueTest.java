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
    // Arrange
    byte[] object = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Validate.isCorrectLength(object, 3, ValidateFactory.createNonNullString());
  }

  /**
   * Test {@link Validate#isCorrectLength(byte[], int, String)}.
   *
   * <ul>
   *   <li>When eight.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Validate#isCorrectLength(byte[], int, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Validate.isCorrectLength(byte[], int, String)"})
  public void testIsCorrectLength_whenEight_thenDoesNotThrow() throws UnsupportedEncodingException {
    // Arrange
    byte[] object = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    Validate.isCorrectLength(object, 8, ValidateFactory.createNonNullString());
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
    Validate.isTrue(false, ValidateFactory.createNonNullString(), "Args");
  }

  /**
   * Test {@link Validate#isTrue(boolean, String, Object[])}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Validate#isTrue(boolean, String, Object[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Validate.isTrue(boolean, String, Object[])"})
  public void testIsTrue_whenTrue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    Validate.isTrue(true, ValidateFactory.createNonNullString(), "Args");
  }
}
