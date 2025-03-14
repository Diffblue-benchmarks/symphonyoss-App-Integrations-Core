package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SHADiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link SHA#SHA2x256(byte[])}.
   * <p>
   * Method under test: {@link SHA#SHA2x256(byte[])}
   */
  @Test
  @MethodsUnderTest({"byte[] SHA.SHA2x256(byte[])"})
  public void testSHA2x256() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    SHA.SHA2x256(null);
  }
}
