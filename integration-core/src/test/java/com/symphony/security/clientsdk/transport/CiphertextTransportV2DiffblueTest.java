package com.symphony.security.clientsdk.transport;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.InvalidDataException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CiphertextTransportV2DiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link CiphertextTransportV2#getPodId()}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV2#getPodId()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"int CiphertextTransportV2.getPodId()"})
  public void testGetPodId_thenReturnOne() throws UnsupportedEncodingException {
    // Arrange
    CiphertextTransportV2 ciphertextTransportV2 =
        new CiphertextTransportV2(
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            1,
            1L);

    // Act and Assert
    assertEquals(1, ciphertextTransportV2.getPodId());
  }

  /**
   * Test {@link CiphertextTransportV2#getRawData()}.
   *
   * <ul>
   *   <li>Then return array of {@code byte} with {@link CiphertextTransportEncryptionMode#RSA_OAEP}
   *       and {@link CiphertextTransportEncryptionMode#AES_GCM}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV2#getRawData()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV2.getRawData()"})
  public void testGetRawData_thenReturnArrayOfByteWithRsa_oaepAndAes_gcm()
      throws UnsupportedEncodingException {
    // Arrange
    CiphertextTransportV2 ciphertextTransportV2 =
        new CiphertextTransportV2(
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            1,
            1L);

    // Act and Assert
    assertArrayEquals(
        new byte[] {
          CiphertextTransportEncryptionMode.RSA_OAEP,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_CBC,
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X'
        },
        ciphertextTransportV2.getRawData());
  }

  /**
   * Test {@link CiphertextTransportV2#getRotationId()}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV2#getRotationId()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"long CiphertextTransportV2.getRotationId()"})
  public void testGetRotationId_thenReturnOne() throws UnsupportedEncodingException {
    // Arrange
    CiphertextTransportV2 ciphertextTransportV2 =
        new CiphertextTransportV2(
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            1,
            1L);

    // Act and Assert
    assertEquals(1L, ciphertextTransportV2.getRotationId());
  }

  /**
   * Test {@link CiphertextTransportV2#CiphertextTransportV2(byte[], byte[], byte[], byte[], int,
   * long)}.
   *
   * <p>Method under test: {@link CiphertextTransportV2#CiphertextTransportV2(byte[], byte[],
   * byte[], byte[], int, long)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CiphertextTransportV2.<init>(byte[], byte[], byte[], byte[], int, long)"
  })
  public void testNewCiphertextTransportV2() throws UnsupportedEncodingException {
    // Arrange and Act
    CiphertextTransportV2 actualCiphertextTransportV2 =
        new CiphertextTransportV2(
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            1,
            1L);

    // Assert
    assertNull(actualCiphertextTransportV2.getKeyId());
    assertEquals(1, actualCiphertextTransportV2.getPodId());
    assertEquals(1L, actualCiphertextTransportV2.getRotationId());
    assertFalse(actualCiphertextTransportV2.hasKeyId());
    assertEquals(
        CiphertextTransportEncryptionMode.AES_GCM, actualCiphertextTransportV2.getEncryptionMode());
    assertEquals(
        CiphertextTransportEncryptionMode.RSA_OAEP, actualCiphertextTransportV2.getVersion());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualCiphertextTransportV2.getAuthData());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualCiphertextTransportV2.getCiphertext());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualCiphertextTransportV2.getIV());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualCiphertextTransportV2.getTag());
    assertArrayEquals(
        new byte[] {
          CiphertextTransportEncryptionMode.RSA_OAEP,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_CBC,
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X',
          'A',
          'X'
        },
        actualCiphertextTransportV2.getRawData());
  }

  /**
   * Test {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   *   <li>Then throw {@link InvalidDataException}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CiphertextTransportV2.<init>(byte[])"})
  public void testNewCiphertextTransportV2_whenA_thenThrowInvalidDataException()
      throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV2(
        new byte[] {CiphertextTransportEncryptionMode.RSA_OAEP, 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Test {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CiphertextTransportV2.<init>(byte[])"})
  public void testNewCiphertextTransportV2_whenAxaxaxaxBytesIsUtf8()
      throws InvalidDataException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV2("AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}.
   *
   * <ul>
   *   <li>When empty array of {@code byte}.
   *   <li>Then throw {@link InvalidDataException}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV2#CiphertextTransportV2(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CiphertextTransportV2.<init>(byte[])"})
  public void testNewCiphertextTransportV2_whenEmptyArrayOfByte_thenThrowInvalidDataException()
      throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV2(new byte[] {});
  }
}
