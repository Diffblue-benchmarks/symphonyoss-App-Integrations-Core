package com.symphony.security.clientsdk.transport;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.InvalidDataException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CiphertextTransportV3DiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link CiphertextTransportV3#getAuthData()}.
   * <ul>
   *   <li>Then return {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextTransportV3#getAuthData()}
   */
  @Test
  @MethodsUnderTest({"byte[] CiphertextTransportV3.getAuthData()"})
  public void testGetAuthData_thenReturnAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange
    byte[] ciphertext = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");
    byte[] tag = "AXAXAXAX".getBytes("UTF-8");

    // Act
    byte[] actualAuthData = (new CiphertextTransportV3(ciphertext, aad, iv, tag, 1, 1L, "AXAXAXAX".getBytes("UTF-8"),
        (byte) 'A')).getAuthData();

    // Assert
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualAuthData);
  }

  /**
   * Test {@link CiphertextTransportV3#getCiphertext()}.
   * <ul>
   *   <li>Then return {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextTransportV3#getCiphertext()}
   */
  @Test
  @MethodsUnderTest({"byte[] CiphertextTransportV3.getCiphertext()"})
  public void testGetCiphertext_thenReturnAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange
    byte[] ciphertext = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");
    byte[] tag = "AXAXAXAX".getBytes("UTF-8");

    // Act
    byte[] actualCiphertext = (new CiphertextTransportV3(ciphertext, aad, iv, tag, 1, 1L, "AXAXAXAX".getBytes("UTF-8"),
        (byte) 'A')).getCiphertext();

    // Assert
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualCiphertext);
  }

  /**
   * Test {@link CiphertextTransportV3#getIV()}.
   * <ul>
   *   <li>Then return {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextTransportV3#getIV()}
   */
  @Test
  @MethodsUnderTest({"byte[] CiphertextTransportV3.getIV()"})
  public void testGetIV_thenReturnAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange
    byte[] ciphertext = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");
    byte[] tag = "AXAXAXAX".getBytes("UTF-8");

    // Act
    byte[] actualIV = (new CiphertextTransportV3(ciphertext, aad, iv, tag, 1, 1L, "AXAXAXAX".getBytes("UTF-8"),
        (byte) 'A')).getIV();

    // Assert
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualIV);
  }

  /**
   * Test {@link CiphertextTransportV3#getPodId()}.
   * <ul>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextTransportV3#getPodId()}
   */
  @Test
  @MethodsUnderTest({"int CiphertextTransportV3.getPodId()"})
  public void testGetPodId_thenReturnOne() throws UnsupportedEncodingException {
    // Arrange
    byte[] ciphertext = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");
    byte[] tag = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    assertEquals(1,
        (new CiphertextTransportV3(ciphertext, aad, iv, tag, 1, 1L, "AXAXAXAX".getBytes("UTF-8"), (byte) 'A'))
            .getPodId());
  }

  /**
   * Test {@link CiphertextTransportV3#getRotationId()}.
   * <ul>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextTransportV3#getRotationId()}
   */
  @Test
  @MethodsUnderTest({"long CiphertextTransportV3.getRotationId()"})
  public void testGetRotationId_thenReturnOne() throws UnsupportedEncodingException {
    // Arrange
    byte[] ciphertext = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");
    byte[] tag = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    assertEquals(1L,
        (new CiphertextTransportV3(ciphertext, aad, iv, tag, 1, 1L, "AXAXAXAX".getBytes("UTF-8"), (byte) 'A'))
            .getRotationId());
  }

  /**
   * Test {@link CiphertextTransportV3#getTag()}.
   * <ul>
   *   <li>Then return {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextTransportV3#getTag()}
   */
  @Test
  @MethodsUnderTest({"byte[] CiphertextTransportV3.getTag()"})
  public void testGetTag_thenReturnAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange
    byte[] ciphertext = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");
    byte[] tag = "AXAXAXAX".getBytes("UTF-8");

    // Act
    byte[] actualTag = (new CiphertextTransportV3(ciphertext, aad, iv, tag, 1, 1L, "AXAXAXAX".getBytes("UTF-8"),
        (byte) 'A')).getTag();

    // Assert
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualTag);
  }

  /**
   * Test {@link CiphertextTransportV3#CiphertextTransportV3(byte[], byte[], byte[], byte[], int, long, byte[], byte)}.
   * <p>
   * Method under test: {@link CiphertextTransportV3#CiphertextTransportV3(byte[], byte[], byte[], byte[], int, long, byte[], byte)}
   */
  @Test
  @MethodsUnderTest({"void CiphertextTransportV3.<init>(byte[], byte[], byte[], byte[], int, long, byte[], byte)"})
  public void testNewCiphertextTransportV3() throws UnsupportedEncodingException {
    // Arrange
    byte[] ciphertext = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");
    byte[] tag = "AXAXAXAX".getBytes("UTF-8");

    // Act
    CiphertextTransportV3 actualCiphertextTransportV3 = new CiphertextTransportV3(ciphertext, aad, iv, tag, 1, 1L,
        "AXAXAXAX".getBytes("UTF-8"), (byte) 'A');

    // Assert
    assertEquals(1, actualCiphertextTransportV3.getPodId());
    assertEquals(1L, actualCiphertextTransportV3.getRotationId());
    assertTrue(actualCiphertextTransportV3.hasKeyId());
    assertEquals(CiphertextTransportV3.EXPECTED_VERSION, actualCiphertextTransportV3.getVersion());
    assertEquals('A', actualCiphertextTransportV3.getEncryptionMode());
    byte[] expectedAuthData = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedAuthData, actualCiphertextTransportV3.getAuthData());
    byte[] expectedCiphertext = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedCiphertext, actualCiphertextTransportV3.getCiphertext());
    byte[] expectedIV = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedIV, actualCiphertextTransportV3.getIV());
    byte[] expectedKeyId = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedKeyId, actualCiphertextTransportV3.getKeyId());
    byte[] expectedTag = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedTag, actualCiphertextTransportV3.getTag());
  }

  /**
   * Test {@link CiphertextTransportV3#CiphertextTransportV3(byte[])}.
   * <ul>
   *   <li>Then throw {@link InvalidDataException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextTransportV3#CiphertextTransportV3(byte[])}
   */
  @Test
  @MethodsUnderTest({"void CiphertextTransportV3.<init>(byte[])"})
  public void testNewCiphertextTransportV3_thenThrowInvalidDataException()
      throws InvalidDataException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV3("AXAXAXAX".getBytes("UTF-8"));
  }
}
