package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyInputException;
import com.symphony.security.exceptions.SymphonyNativeException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SecureLocalPersistenceDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link SecureLocalPersistence#SecureLocalPersistence(byte[], String)}.
   *
   * <ul>
   *   <li>When {@code A}.
   *   <li>Then throw {@link SymphonyInputException}.
   * </ul>
   *
   * <p>Method under test: {@link SecureLocalPersistence#SecureLocalPersistence(byte[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void SecureLocalPersistence.<init>(byte[], String)"})
  public void testNewSecureLocalPersistence_whenA_thenThrowSymphonyInputException()
      throws SymphonyInputException, SymphonyNativeException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    new SecureLocalPersistence(new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null);
  }

  /**
   * Test {@link SecureLocalPersistence#SecureLocalPersistence(byte[], String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyInputException}.
   * </ul>
   *
   * <p>Method under test: {@link SecureLocalPersistence#SecureLocalPersistence(byte[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void SecureLocalPersistence.<init>(byte[], String)"})
  public void testNewSecureLocalPersistence_whenNull_thenThrowSymphonyInputException()
      throws SymphonyInputException, SymphonyNativeException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    new SecureLocalPersistence(null, null);
  }

  /**
   * Test {@link SecureLocalPersistence#SecureLocalPersistence(byte[], String)}.
   *
   * <ul>
   *   <li>When {@code XXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link SecureLocalPersistence#SecureLocalPersistence(byte[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void SecureLocalPersistence.<init>(byte[], String)"})
  public void testNewSecureLocalPersistence_whenXxaxaxaxBytesIsUtf8()
      throws SymphonyInputException, SymphonyNativeException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    new SecureLocalPersistence("XXAXAXAX".getBytes("UTF-8"), "Path");
  }
}
