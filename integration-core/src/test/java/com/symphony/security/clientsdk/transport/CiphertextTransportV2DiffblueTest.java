package com.symphony.security.clientsdk.transport;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.InvalidDataException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CiphertextTransportV2DiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link CiphertextTransportV2#getPodId()}.
   * <ul>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextTransportV2#getPodId()}
   */
  @Test
  @MethodsUnderTest({"int CiphertextTransportV2.getPodId()"})
  public void testGetPodId_thenReturnOne() throws UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    assertEquals(1, (new CiphertextTransportV2(cipherText, aad, iv, "AXAXAXAX".getBytes("UTF-8"), 1, 1L)).getPodId());
  }

  /**
   * Test {@link CiphertextTransportV2#getRawData()}.
   * <ul>
   *   <li>Then return array of {@code byte} with {@link CiphertextTransportEncryptionMode#RSA_OAEP} and {@link CiphertextTransportEncryptionMode#AES_GCM}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextTransportV2#getRawData()}
   */
  @Test
  @MethodsUnderTest({"byte[] CiphertextTransportV2.getRawData()"})
  public void testGetRawData_thenReturnArrayOfByteWithRsa_oaepAndAes_gcm() throws UnsupportedEncodingException {
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
   * Test {@link CiphertextTransportV2#getRotationId()}.
   * <ul>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextTransportV2#getRotationId()}
   */
  @Test
  @MethodsUnderTest({"long CiphertextTransportV2.getRotationId()"})
  public void testGetRotationId_thenReturnOne() throws UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    assertEquals(1L,
        (new CiphertextTransportV2(cipherText, aad, iv, "AXAXAXAX".getBytes("UTF-8"), 1, 1L)).getRotationId());
  }

  /**
   * Test {@link CiphertextTransportV2#CiphertextTransportV2(byte[], byte[], byte[], byte[], int, long)}.
   * <p>
   * Method under test: {@link CiphertextTransportV2#CiphertextTransportV2(byte[], byte[], byte[], byte[], int, long)}
   */
  @Test
  @MethodsUnderTest({"void CiphertextTransportV2.<init>(byte[], byte[], byte[], byte[], int, long)"})
  public void testNewCiphertextTransportV2() throws UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");

    // Act
    CiphertextTransportV2 actualCiphertextTransportV2 = new CiphertextTransportV2(cipherText, aad, iv,
        "AXAXAXAX".getBytes("UTF-8"), 1, 1L);

    // Assert
    assertNull(actualCiphertextTransportV2.getKeyId());
    assertEquals(1, actualCiphertextTransportV2.getPodId());
    assertEquals(1L, actualCiphertextTransportV2.getRotationId());
    assertFalse(actualCiphertextTransportV2.hasKeyId());
    assertEquals(CiphertextTransportEncryptionMode.AES_GCM, actualCiphertextTransportV2.getEncryptionMode());
    assertEquals(CiphertextTransportEncryptionMode.RSA_OAEP, actualCiphertextTransportV2.getVersion());
    byte[] expectedAuthData = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedAuthData, actualCiphertextTransportV2.getAuthData());
    byte[] expectedCiphertext = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedCiphertext, actualCiphertextTransportV2.getCiphertext());
    byte[] expectedIV = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedIV, actualCiphertextTransportV2.getIV());
    byte[] expectedTag = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedTag, actualCiphertextTransportV2.getTag());
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

  /**
   * Test {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}.
   * <ul>
   *   <li>When {@code A}.</li>
   *   <li>Then throw {@link InvalidDataException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}
   */
  @Test
  @MethodsUnderTest({"void CiphertextTransportV2.<init>(byte[])"})
  public void testNewCiphertextTransportV2_whenA_thenThrowInvalidDataException() throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV2(
        new byte[]{CiphertextTransportEncryptionMode.RSA_OAEP, 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Test {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}.
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}
   */
  @Test
  @MethodsUnderTest({"void CiphertextTransportV2.<init>(byte[])"})
  public void testNewCiphertextTransportV2_whenAxaxaxaxBytesIsUtf8()
      throws InvalidDataException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV2("AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}.
   * <ul>
   *   <li>When empty array of {@code byte}.</li>
   *   <li>Then throw {@link InvalidDataException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}
   */
  @Test
  @MethodsUnderTest({"void CiphertextTransportV2.<init>(byte[])"})
  public void testNewCiphertextTransportV2_whenEmptyArrayOfByte_thenThrowInvalidDataException()
      throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV2(new byte[]{});
  }
}
