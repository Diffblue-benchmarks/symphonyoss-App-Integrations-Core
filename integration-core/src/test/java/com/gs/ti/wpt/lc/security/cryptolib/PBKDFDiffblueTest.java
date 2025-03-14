package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PBKDFDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link PBKDF#PBKDF2_SHA256(byte[], byte[], int)}.
   * <ul>
   *   <li>When {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PBKDF#PBKDF2_SHA256(byte[], byte[], int)}
   */
  @Test
  @MethodsUnderTest({"byte[] PBKDF.PBKDF2_SHA256(byte[], byte[], int)"})
  public void testPBKDF2_SHA256_whenA() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    PBKDF.PBKDF2_SHA256(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, 0);
  }

  /**
   * Test {@link PBKDF#PBKDF2_SHA256(byte[], byte[], int)}.
   * <ul>
   *   <li>When {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PBKDF#PBKDF2_SHA256(byte[], byte[], int)}
   */
  @Test
  @MethodsUnderTest({"byte[] PBKDF.PBKDF2_SHA256(byte[], byte[], int)"})
  public void testPBKDF2_SHA256_whenA2() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    PBKDF.PBKDF2_SHA256(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, 0);
  }

  /**
   * Test {@link PBKDF#PBKDF2_SHA256(byte[], byte[], int)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PBKDF#PBKDF2_SHA256(byte[], byte[], int)}
   */
  @Test
  @MethodsUnderTest({"byte[] PBKDF.PBKDF2_SHA256(byte[], byte[], int)"})
  public void testPBKDF2_SHA256_whenNull() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    PBKDF.PBKDF2_SHA256(null, null, 0);
  }
}
