package com.symphony.security.clientsdk.transport;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.symphony.security.exceptions.InvalidDataException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CiphertextTransportV2DiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link CiphertextTransportV2#getPodId()}
   */
  @Test
  public void testGetPodId() throws UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    assertEquals(1, (new CiphertextTransportV2(cipherText, aad, iv, "AXAXAXAX".getBytes("UTF-8"), 1, 1L)).getPodId());
  }

  /**
   * Method under test: {@link CiphertextTransportV2#getRawData()}
   */
  @Test
  public void testGetRawData() throws UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    assertArrayEquals(
        new byte[]{CiphertextTransportEncryptionMode.RSA_OAEP, CiphertextTransportEncryptionMode.AES_GCM,
            CiphertextTransportEncryptionMode.AES_GCM, CiphertextTransportEncryptionMode.AES_GCM,
            CiphertextTransportEncryptionMode.AES_CBC, CiphertextTransportEncryptionMode.AES_GCM,
            CiphertextTransportEncryptionMode.AES_GCM, CiphertextTransportEncryptionMode.AES_GCM,
            CiphertextTransportEncryptionMode.AES_GCM, CiphertextTransportEncryptionMode.AES_GCM,
            CiphertextTransportEncryptionMode.AES_GCM, CiphertextTransportEncryptionMode.AES_GCM,
            CiphertextTransportEncryptionMode.AES_CBC, 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A',
            'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        (new CiphertextTransportV2(cipherText, aad, iv, "AXAXAXAX".getBytes("UTF-8"), 1, 1L)).getRawData());
  }

  /**
   * Method under test: {@link CiphertextTransportV2#getRotationId()}
   */
  @Test
  public void testGetRotationId() throws UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    assertEquals(1L,
        (new CiphertextTransportV2(cipherText, aad, iv, "AXAXAXAX".getBytes("UTF-8"), 1, 1L)).getRotationId());
  }

  /**
   * Method under test:
   * {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}
   */
  @Test
  public void testNewCiphertextTransportV2() throws InvalidDataException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV2("AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test:
   * {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}
   */
  @Test
  public void testNewCiphertextTransportV22() throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV2(
        new byte[]{CiphertextTransportEncryptionMode.RSA_OAEP, 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Method under test:
   * {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}
   */
  @Test
  public void testNewCiphertextTransportV23() throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV2(new byte[]{});
  }

  /**
   * Method under test:
   * {@link CiphertextTransportV2#CiphertextTransportV2(byte[], byte[], byte[], byte[], int, long)}
   */
  @Test
  public void testNewCiphertextTransportV24() throws UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");
    byte[] tag = "AXAXAXAX".getBytes("UTF-8");

    // Act
    CiphertextTransportV2 actualCiphertextTransportV2 = new CiphertextTransportV2(cipherText, aad, iv, tag, 1, 1L);

    // Assert
    assertNull(actualCiphertextTransportV2.getKeyId());
    assertEquals(1, actualCiphertextTransportV2.getPodId());
    assertEquals(1L, actualCiphertextTransportV2.getRotationId());
    assertFalse(actualCiphertextTransportV2.hasKeyId());
    assertEquals(CiphertextTransportEncryptionMode.AES_GCM, actualCiphertextTransportV2.getEncryptionMode());
    assertEquals(CiphertextTransportEncryptionMode.RSA_OAEP, actualCiphertextTransportV2.getVersion());
    assertSame(aad, actualCiphertextTransportV2.getAuthData());
    assertSame(cipherText, actualCiphertextTransportV2.getCiphertext());
    assertSame(iv, actualCiphertextTransportV2.getIV());
    assertSame(tag, actualCiphertextTransportV2.getTag());
    assertArrayEquals(
        new byte[]{CiphertextTransportEncryptionMode.RSA_OAEP, CiphertextTransportEncryptionMode.AES_GCM,
            CiphertextTransportEncryptionMode.AES_GCM, CiphertextTransportEncryptionMode.AES_GCM,
            CiphertextTransportEncryptionMode.AES_CBC, CiphertextTransportEncryptionMode.AES_GCM,
            CiphertextTransportEncryptionMode.AES_GCM, CiphertextTransportEncryptionMode.AES_GCM,
            CiphertextTransportEncryptionMode.AES_GCM, CiphertextTransportEncryptionMode.AES_GCM,
            CiphertextTransportEncryptionMode.AES_GCM, CiphertextTransportEncryptionMode.AES_GCM,
            CiphertextTransportEncryptionMode.AES_CBC, 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A',
            'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        actualCiphertextTransportV2.getRawData());
  }
}
