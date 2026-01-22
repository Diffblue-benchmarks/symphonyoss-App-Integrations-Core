package com.symphony.security.clientsdk.transport;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.InvalidDataException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CiphertextTransportV3DiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link CiphertextTransportV3#getAuthData()}.
   *
   * <p>Method under test: {@link CiphertextTransportV3#getAuthData()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV3.getAuthData()"})
  public void testGetAuthData() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {'\n', 11, '\f', '\r', 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25},
        CiphertextTransportV3Factory.createCiphertextTransportV3().getAuthData());
  }

  /**
   * Test {@link CiphertextTransportV3#getCiphertext()}.
   *
   * <p>Method under test: {@link CiphertextTransportV3#getCiphertext()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV3.getCiphertext()"})
  public void testGetCiphertext() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.RSA_OAEP,
          CiphertextTransportV3.EXPECTED_VERSION,
          4,
          5,
          6,
          7,
          '\b',
          '\t',
          '\n',
          11,
          '\f',
          '\r',
          14,
          15,
          16
        },
        CiphertextTransportV3Factory.createCiphertextTransportV3().getCiphertext());
  }

  /**
   * Test {@link CiphertextTransportV3#getCiphertextAndTag()}.
   *
   * <p>Method under test: {@link CiphertextTransportV3#getCiphertextAndTag()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV3.getCiphertextAndTag()"})
  public void testGetCiphertextAndTag() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.RSA_OAEP,
          CiphertextTransportV3.EXPECTED_VERSION,
          4,
          5,
          6,
          7,
          '\b',
          '\t',
          '\n',
          11,
          '\f',
          '\r',
          14,
          15,
          16,
          30,
          31,
          ' ',
          '!',
          '"',
          '#',
          '$',
          '%',
          '&',
          '\'',
          '(',
          ')',
          '*',
          '+',
          ',',
          '-'
        },
        CiphertextTransportV3Factory.createCiphertextTransportV3().getCiphertextAndTag());
  }

  /**
   * Test {@link CiphertextTransportV3#getIV()}.
   *
   * <p>Method under test: {@link CiphertextTransportV3#getIV()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV3.getIV()"})
  public void testGetIV() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, ' ', '!', '"', '#'},
        CiphertextTransportV3Factory.createCiphertextTransportV3().getIV());
  }

  /**
   * Test {@link CiphertextTransportV3#getPodId()}.
   *
   * <p>Method under test: {@link CiphertextTransportV3#getPodId()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"int CiphertextTransportV3.getPodId()"})
  public void testGetPodId() {
    // Arrange, Act and Assert
    assertEquals(1, CiphertextTransportV3Factory.createCiphertextTransportV3().getPodId());
  }

  /**
   * Test {@link CiphertextTransportV3#getRotationId()}.
   *
   * <p>Method under test: {@link CiphertextTransportV3#getRotationId()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"long CiphertextTransportV3.getRotationId()"})
  public void testGetRotationId() {
    // Arrange, Act and Assert
    assertEquals(1L, CiphertextTransportV3Factory.createCiphertextTransportV3().getRotationId());
  }

  /**
   * Test {@link CiphertextTransportV3#getTag()}.
   *
   * <p>Method under test: {@link CiphertextTransportV3#getTag()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV3.getTag()"})
  public void testGetTag() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {30, 31, ' ', '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-'},
        CiphertextTransportV3Factory.createCiphertextTransportV3().getTag());
  }

  /**
   * Test {@link CiphertextTransportV3#CiphertextTransportV3(byte[], byte[], byte[], byte[], int,
   * long, byte[], byte)}.
   *
   * <p>Method under test: {@link CiphertextTransportV3#CiphertextTransportV3(byte[], byte[],
   * byte[], byte[], int, long, byte[], byte)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CiphertextTransportV3.<init>(byte[], byte[], byte[], byte[], int, long, byte[], byte)"
  })
  public void testNewCiphertextTransportV3() throws UnsupportedEncodingException {
    // Arrange and Act
    CiphertextTransportV3 actualCiphertextTransportV3 =
        new CiphertextTransportV3(
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            1,
            1L,
            "AXAXAXAX".getBytes("UTF-8"),
            (byte) 'A');

    // Assert
    assertEquals(1, actualCiphertextTransportV3.getPodId());
    assertEquals(1L, actualCiphertextTransportV3.getRotationId());
    assertTrue(actualCiphertextTransportV3.hasKeyId());
    assertEquals(CiphertextTransportV3.EXPECTED_VERSION, actualCiphertextTransportV3.getVersion());
    assertEquals('A', actualCiphertextTransportV3.getEncryptionMode());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualCiphertextTransportV3.getAuthData());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualCiphertextTransportV3.getCiphertext());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualCiphertextTransportV3.getIV());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualCiphertextTransportV3.getKeyId());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualCiphertextTransportV3.getTag());
    assertArrayEquals(
        "AXAXAXAXAXAXAXAX".getBytes("UTF-8"), actualCiphertextTransportV3.getCiphertextAndTag());
  }

  /**
   * Test {@link CiphertextTransportV3#CiphertextTransportV3(byte[])}.
   *
   * <ul>
   *   <li>Then throw {@link InvalidDataException}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV3#CiphertextTransportV3(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CiphertextTransportV3.<init>(byte[])"})
  public void testNewCiphertextTransportV3_thenThrowInvalidDataException()
      throws InvalidDataException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV3("AXAXAXAX".getBytes("UTF-8"));
  }
}
