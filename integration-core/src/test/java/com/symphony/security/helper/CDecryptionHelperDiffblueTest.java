package com.symphony.security.helper;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CDecryptionHelperDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link CDecryptionHelper#encrypt(byte[], int, int, long)} with {@code byte[]}, {@code
   * int}, {@code int}, {@code long}.
   *
   * <p>Method under test: {@link CDecryptionHelper#encrypt(byte[], int, int, long)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CDecryptionHelper.encrypt(byte[], int, int, long)"})
  public void testEncryptWithByteIntIntLong()
      throws SymphonyEncryptionException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    new CDecryptionHelper("Room Key").encrypt("AXAXAXAX".getBytes("UTF-8"), 1, 1, 1L);
  }

  /**
   * Test {@link CDecryptionHelper#encrypt(byte[], int, int, long, byte)} with {@code byte[]},
   * {@code int}, {@code int}, {@code long}, {@code byte}.
   *
   * <ul>
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link CDecryptionHelper#encrypt(byte[], int, int, long, byte)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CDecryptionHelper.encrypt(byte[], int, int, long, byte)"})
  public void testEncryptWithByteIntIntLongByte_thenThrowSymphonyEncryptionException()
      throws SymphonyEncryptionException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    new CDecryptionHelper("Room Key").encrypt("AXAXAXAX".getBytes("UTF-8"), 1, 1, 1L, (byte) 1);
  }

  /**
   * Test {@link CDecryptionHelper#encrypt(String, int, int, long)} with {@code String}, {@code
   * int}, {@code int}, {@code long}.
   *
   * <p>Method under test: {@link CDecryptionHelper#encrypt(String, int, int, long)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String CDecryptionHelper.encrypt(String, int, int, long)"})
  public void testEncryptWithStringIntIntLong() throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    new CDecryptionHelper("Room Key").encrypt("Not all who wander are lost", 1, 1, 1L);
  }
}
