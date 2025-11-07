package com.symphony.security.clientsdk.transport;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.symphony.security.exceptions.InvalidDataException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CiphertextTransportV3DiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link CiphertextTransportV3#getAuthData()}
   */
  @Test
  public void testGetAuthData() throws UnsupportedEncodingException {
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
   * Method under test: {@link CiphertextTransportV3#getCiphertext()}
   */
  @Test
  public void testGetCiphertext() throws UnsupportedEncodingException {
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
   * Method under test: {@link CiphertextTransportV3#getIV()}
   */
  @Test
  public void testGetIV() throws UnsupportedEncodingException {
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
   * Method under test: {@link CiphertextTransportV3#getPodId()}
   */
  @Test
  public void testGetPodId() throws UnsupportedEncodingException {
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
   * Method under test: {@link CiphertextTransportV3#getRotationId()}
   */
  @Test
  public void testGetRotationId() throws UnsupportedEncodingException {
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
   * Method under test: {@link CiphertextTransportV3#getTag()}
   */
  @Test
  public void testGetTag() throws UnsupportedEncodingException {
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
   * Method under test:
   * {@link CiphertextTransportV3#CiphertextTransportV3(byte[])}
   */
  @Test
  public void testNewCiphertextTransportV3() throws InvalidDataException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV3("AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test:
   * {@link CiphertextTransportV3#CiphertextTransportV3(byte[], byte[], byte[], byte[], int, long, byte[], byte)}
   */
  @Test
  public void testNewCiphertextTransportV32() throws UnsupportedEncodingException {
    // Arrange
    byte[] ciphertext = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");
    byte[] tag = "AXAXAXAX".getBytes("UTF-8");
    byte[] keyId = "AXAXAXAX".getBytes("UTF-8");

    // Act
    CiphertextTransportV3 actualCiphertextTransportV3 = new CiphertextTransportV3(ciphertext, aad, iv, tag, 1, 1L,
        keyId, (byte) 'A');

    // Assert
    assertEquals(1, actualCiphertextTransportV3.getPodId());
    assertEquals(1L, actualCiphertextTransportV3.getRotationId());
    assertTrue(actualCiphertextTransportV3.hasKeyId());
    assertEquals(CiphertextTransportV3.EXPECTED_VERSION, actualCiphertextTransportV3.getVersion());
    assertEquals('A', actualCiphertextTransportV3.getEncryptionMode());
    assertSame(aad, actualCiphertextTransportV3.getAuthData());
    assertSame(ciphertext, actualCiphertextTransportV3.getCiphertext());
    assertSame(iv, actualCiphertextTransportV3.getIV());
    assertSame(keyId, actualCiphertextTransportV3.getKeyId());
    assertSame(tag, actualCiphertextTransportV3.getTag());
  }
}
