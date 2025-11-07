package com.gs.ti.wpt.lc.security.cryptolib;

import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PBKDFDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link PBKDF#PBKDF2_SHA256(byte[], byte[], int)}
   */
  @Test
  public void testPBKDF2_SHA256() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    PBKDF.PBKDF2_SHA256(null, null, 0);
  }

  /**
   * Method under test: {@link PBKDF#PBKDF2_SHA256(byte[], byte[], int)}
   */
  @Test
  public void testPBKDF2_SHA2562() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    PBKDF.PBKDF2_SHA256(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, 0);
  }

  /**
   * Method under test: {@link PBKDF#PBKDF2_SHA256(byte[], byte[], int)}
   */
  @Test
  public void testPBKDF2_SHA2563() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    PBKDF.PBKDF2_SHA256(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, 0);
  }
}
