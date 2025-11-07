package com.gs.ti.wpt.lc.security.cryptolib;

import com.symphony.security.exceptions.SymphonyInputException;
import com.symphony.security.exceptions.SymphonyNativeException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SecureLocalPersistenceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test:
   * {@link SecureLocalPersistence#SecureLocalPersistence(byte[], String)}
   */
  @Test
  public void testNewSecureLocalPersistence()
      throws SymphonyInputException, SymphonyNativeException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);

    new SecureLocalPersistence("AXAXAXAX".getBytes("UTF-8"), "Path");

  }

  /**
   * Method under test:
   * {@link SecureLocalPersistence#SecureLocalPersistence(byte[], String)}
   */
  @Test
  public void testNewSecureLocalPersistence2() throws SymphonyInputException, SymphonyNativeException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);

    new SecureLocalPersistence(null, null);

  }

  /**
   * Method under test:
   * {@link SecureLocalPersistence#SecureLocalPersistence(byte[], String)}
   */
  @Test
  public void testNewSecureLocalPersistence3() throws SymphonyInputException, SymphonyNativeException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);

    new SecureLocalPersistence(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null);

  }
}
