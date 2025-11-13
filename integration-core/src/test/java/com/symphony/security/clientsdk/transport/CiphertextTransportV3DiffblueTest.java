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
   * <ul>
   *   <li>Then return {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV3#getAuthData()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV3.getAuthData()"})
  public void testGetAuthData_thenReturnAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange
    CiphertextTransportV3 ciphertextTransportV3 =
        new CiphertextTransportV3(
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            1,
            1L,
            "AXAXAXAX".getBytes("UTF-8"),
            (byte) 'A');

    // Act and Assert
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), ciphertextTransportV3.getAuthData());
  }

  /**
   * Test {@link CiphertextTransportV3#getCiphertext()}.
   *
   * <ul>
   *   <li>Then return {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV3#getCiphertext()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV3.getCiphertext()"})
  public void testGetCiphertext_thenReturnAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    CiphertextTransportV3 ciphertextTransportV3 =
        new CiphertextTransportV3(
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            1,
            1L,
            "AXAXAXAX".getBytes("UTF-8"),
            (byte) 'A');

    // Act and Assert
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), ciphertextTransportV3.getCiphertext());
  }

  /**
   * Test {@link CiphertextTransportV3#getIV()}.
   *
   * <ul>
   *   <li>Then return {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV3#getIV()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV3.getIV()"})
  public void testGetIV_thenReturnAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange
    CiphertextTransportV3 ciphertextTransportV3 =
        new CiphertextTransportV3(
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            1,
            1L,
            "AXAXAXAX".getBytes("UTF-8"),
            (byte) 'A');

    // Act and Assert
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), ciphertextTransportV3.getIV());
  }

  /**
   * Test {@link CiphertextTransportV3#getPodId()}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV3#getPodId()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"int CiphertextTransportV3.getPodId()"})
  public void testGetPodId_thenReturnOne() throws UnsupportedEncodingException {
    // Arrange
    CiphertextTransportV3 ciphertextTransportV3 =
        new CiphertextTransportV3(
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            1,
            1L,
            "AXAXAXAX".getBytes("UTF-8"),
            (byte) 'A');

    // Act and Assert
    assertEquals(1, ciphertextTransportV3.getPodId());
  }

  /**
   * Test {@link CiphertextTransportV3#getRotationId()}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV3#getRotationId()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"long CiphertextTransportV3.getRotationId()"})
  public void testGetRotationId_thenReturnOne() throws UnsupportedEncodingException {
    // Arrange
    CiphertextTransportV3 ciphertextTransportV3 =
        new CiphertextTransportV3(
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            1,
            1L,
            "AXAXAXAX".getBytes("UTF-8"),
            (byte) 'A');

    // Act and Assert
    assertEquals(1L, ciphertextTransportV3.getRotationId());
  }

  /**
   * Test {@link CiphertextTransportV3#getTag()}.
   *
   * <ul>
   *   <li>Then return {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV3#getTag()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV3.getTag()"})
  public void testGetTag_thenReturnAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange
    CiphertextTransportV3 ciphertextTransportV3 =
        new CiphertextTransportV3(
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            "AXAXAXAX".getBytes("UTF-8"),
            1,
            1L,
            "AXAXAXAX".getBytes("UTF-8"),
            (byte) 'A');

    // Act and Assert
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), ciphertextTransportV3.getTag());
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
