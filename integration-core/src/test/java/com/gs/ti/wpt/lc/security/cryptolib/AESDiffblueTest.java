package com.gs.ti.wpt.lc.security.cryptolib;

import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AESDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link AES#DecryptCBC(byte[], byte[], byte[])}
   */
  @Test
  public void testDecryptCBC()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    byte[] In = "AXAXAXAX".getBytes("UTF-8");
    byte[] Key = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptCBC(In, Key, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test: {@link AES#DecryptCBC(byte[], byte[], byte[])}
   */
  @Test
  public void testDecryptCBC2() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptCBC(null, null, null);
  }

  /**
   * Method under test: {@link AES#DecryptCBC(byte[], byte[], byte[])}
   */
  @Test
  public void testDecryptCBC3() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptCBC(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, null);
  }

  /**
   * Method under test: {@link AES#DecryptCBC(byte[], byte[], byte[])}
   */
  @Test
  public void testDecryptCBC4() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptCBC(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null);
  }

  /**
   * Method under test: {@link AES#DecryptCBC(byte[], byte[], byte[])}
   */
  @Test
  public void testDecryptCBC5()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    byte[] Key = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptCBC(new byte[]{}, Key, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test:
   * {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testDecryptGCM()
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
   * Method under test:
   * {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testDecryptGCM2() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptGCM(null, null, null, null, null);
  }

  /**
   * Method under test:
   * {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testDecryptGCM3() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptGCM(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, null, null, null);
  }

  /**
   * Method under test:
   * {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testDecryptGCM4() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptGCM(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, null, null);
  }

  /**
   * Method under test:
   * {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testDecryptGCM5() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptGCM(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null,
        null);
  }

  /**
   * Method under test:
   * {@link AES#DecryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testDecryptGCM6() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.DecryptGCM(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null);
  }

  /**
   * Method under test: {@link AES#EncryptCBC(byte[], byte[], byte[])}
   */
  @Test
  public void testEncryptCBC()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    byte[] In = "AXAXAXAX".getBytes("UTF-8");
    byte[] Key = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptCBC(In, Key, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test: {@link AES#EncryptCBC(byte[], byte[], byte[])}
   */
  @Test
  public void testEncryptCBC2() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptCBC(null, null, null);
  }

  /**
   * Method under test: {@link AES#EncryptCBC(byte[], byte[], byte[])}
   */
  @Test
  public void testEncryptCBC3() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptCBC(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, null);
  }

  /**
   * Method under test: {@link AES#EncryptCBC(byte[], byte[], byte[])}
   */
  @Test
  public void testEncryptCBC4() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptCBC(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null);
  }

  /**
   * Method under test: {@link AES#EncryptCBC(byte[], byte[], byte[])}
   */
  @Test
  public void testEncryptCBC5()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    byte[] Key = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptCBC(new byte[]{}, Key, "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test:
   * {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testEncryptGCM()
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
   * Method under test:
   * {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testEncryptGCM2() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptGCM(null, null, null, null, null);
  }

  /**
   * Method under test:
   * {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testEncryptGCM3() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptGCM(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, null, null, null);
  }

  /**
   * Method under test:
   * {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testEncryptGCM4() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptGCM(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, null, null);
  }

  /**
   * Method under test:
   * {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testEncryptGCM5() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptGCM(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null,
        null);
  }

  /**
   * Method under test:
   * {@link AES#EncryptGCM(byte[], byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testEncryptGCM6() throws SymphonyEncryptionException, SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    AES.EncryptGCM(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null);
  }
}
