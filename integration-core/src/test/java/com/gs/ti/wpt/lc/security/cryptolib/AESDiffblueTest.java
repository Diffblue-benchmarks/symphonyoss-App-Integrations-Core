package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AESDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link AES#DecryptCBC(byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   *   <li>Then throw {@link SymphonyInputException}.
   * </ul>
   *
   * <p>Method under test: {@link AES#DecryptCBC(byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.DecryptCBC(byte[], byte[], byte[])"})
  public void testDecryptCBC_whenA_thenThrowSymphonyInputException()
      throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptCBC(new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, null);
  }

  /**
   * Test {@link AES#DecryptCBC(byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   *   <li>Then throw {@link SymphonyInputException}.
   * </ul>
   *
   * <p>Method under test: {@link AES#DecryptCBC(byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.DecryptCBC(byte[], byte[], byte[])"})
  public void testDecryptCBC_whenA_thenThrowSymphonyInputException2()
      throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptCBC(
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        null);
  }

  /**
   * Test {@link AES#DecryptCBC(byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When empty array of {@code byte}.
   *   <li>Then throw {@link SymphonyInputException}.
   * </ul>
   *
   * <p>Method under test: {@link AES#DecryptCBC(byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.DecryptCBC(byte[], byte[], byte[])"})
  public void testDecryptCBC_whenEmptyArrayOfByte_thenThrowSymphonyInputException()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    byte[] Key = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptCBC(new byte[] {}, Key, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link AES#DecryptCBC(byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyInputException}.
   * </ul>
   *
   * <p>Method under test: {@link AES#DecryptCBC(byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.DecryptCBC(byte[], byte[], byte[])"})
  public void testDecryptCBC_whenNull_thenThrowSymphonyInputException()
      throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptCBC(null, null, null);
  }

  /**
   * Test {@link AES#DecryptCBC(byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code XXAXAXAX} Bytes is {@code UTF-8}.
   *   <li>Then throw {@link SymphonyInputException}.
   * </ul>
   *
   * <p>Method under test: {@link AES#DecryptCBC(byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.DecryptCBC(byte[], byte[], byte[])"})
  public void testDecryptCBC_whenXxaxaxaxBytesIsUtf8_thenThrowSymphonyInputException()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    byte[] In = "XXAXAXAX".getBytes("UTF-8");
    byte[] Key = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptCBC(In, Key, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.DecryptGCM(byte[], byte[], byte[], byte[], byte[])"})
  public void testDecryptGCM_whenA() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptGCM(new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, null, null, null);
  }

  /**
   * Test {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.DecryptGCM(byte[], byte[], byte[], byte[], byte[])"})
  public void testDecryptGCM_whenA2() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptGCM(
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        null,
        null,
        null);
  }

  /**
   * Test {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.DecryptGCM(byte[], byte[], byte[], byte[], byte[])"})
  public void testDecryptGCM_whenA3() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptGCM(
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        null,
        null);
  }

  /**
   * Test {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.DecryptGCM(byte[], byte[], byte[], byte[], byte[])"})
  public void testDecryptGCM_whenA4() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptGCM(
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        null);
  }

  /**
   * Test {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.DecryptGCM(byte[], byte[], byte[], byte[], byte[])"})
  public void testDecryptGCM_whenAxaxaxaxBytesIsUtf8()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    byte[] In = "AXAXAXAX".getBytes("UTF-8");
    byte[] AAD = "AXAXAXAX".getBytes("UTF-8");
    byte[] Key = "AXAXAXAX".getBytes("UTF-8");
    byte[] IV = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptGCM(In, AAD, Key, IV, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.DecryptGCM(byte[], byte[], byte[], byte[], byte[])"})
  public void testDecryptGCM_whenNull() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptGCM(null, null, null, null, null);
  }

  /**
   * Test {@link AES#EncryptCBC(byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link AES#EncryptCBC(byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.EncryptCBC(byte[], byte[], byte[])"})
  public void testEncryptCBC_whenA() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptCBC(new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, null);
  }

  /**
   * Test {@link AES#EncryptCBC(byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link AES#EncryptCBC(byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.EncryptCBC(byte[], byte[], byte[])"})
  public void testEncryptCBC_whenA2() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptCBC(
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        null);
  }

  /**
   * Test {@link AES#EncryptCBC(byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link AES#EncryptCBC(byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.EncryptCBC(byte[], byte[], byte[])"})
  public void testEncryptCBC_whenAxaxaxaxBytesIsUtf8()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    byte[] In = "AXAXAXAX".getBytes("UTF-8");
    byte[] Key = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptCBC(In, Key, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link AES#EncryptCBC(byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When empty array of {@code byte}.
   * </ul>
   *
   * <p>Method under test: {@link AES#EncryptCBC(byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.EncryptCBC(byte[], byte[], byte[])"})
  public void testEncryptCBC_whenEmptyArrayOfByte()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    byte[] Key = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptCBC(new byte[] {}, Key, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link AES#EncryptCBC(byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AES#EncryptCBC(byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.EncryptCBC(byte[], byte[], byte[])"})
  public void testEncryptCBC_whenNull() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptCBC(null, null, null);
  }

  /**
   * Test {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.EncryptGCM(byte[], byte[], byte[], byte[], byte[])"})
  public void testEncryptGCM_whenA() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptGCM(new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, null, null, null);
  }

  /**
   * Test {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.EncryptGCM(byte[], byte[], byte[], byte[], byte[])"})
  public void testEncryptGCM_whenA2() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptGCM(
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        null,
        null,
        null);
  }

  /**
   * Test {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.EncryptGCM(byte[], byte[], byte[], byte[], byte[])"})
  public void testEncryptGCM_whenA3() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptGCM(
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        null,
        null);
  }

  /**
   * Test {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.EncryptGCM(byte[], byte[], byte[], byte[], byte[])"})
  public void testEncryptGCM_whenA4() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptGCM(
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        null);
  }

  /**
   * Test {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.EncryptGCM(byte[], byte[], byte[], byte[], byte[])"})
  public void testEncryptGCM_whenAxaxaxaxBytesIsUtf8()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    byte[] In = "AXAXAXAX".getBytes("UTF-8");
    byte[] AAD = "AXAXAXAX".getBytes("UTF-8");
    byte[] Key = "AXAXAXAX".getBytes("UTF-8");
    byte[] IV = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptGCM(In, AAD, Key, IV, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] AES.EncryptGCM(byte[], byte[], byte[], byte[], byte[])"})
  public void testEncryptGCM_whenNull() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptGCM(null, null, null, null, null);
  }
}
