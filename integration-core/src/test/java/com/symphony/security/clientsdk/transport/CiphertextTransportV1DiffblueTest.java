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

public class CiphertextTransportV1DiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link CiphertextTransportV1#getPodId()}
   */
  @Test
  public void testGetPodId() throws UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    (new CiphertextTransportV1(cipherText, aad, iv, "AXAXAXAX".getBytes("UTF-8"))).getPodId();
  }

  /**
   * Method under test: {@link CiphertextTransportV1#getRawData()}
   */
  @Test
  public void testGetRawData() throws UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    assertArrayEquals(
        new byte[]{CiphertextTransportEncryptionMode.AES_CBC, CiphertextTransportEncryptionMode.AES_GCM, 'A', 'X', 'A',
            'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X',
            'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
        (new CiphertextTransportV1(cipherText, aad, iv, "AXAXAXAX".getBytes("UTF-8"))).getRawData());
  }

  /**
   * Method under test: {@link CiphertextTransportV1#getRotationId()}
   */
  @Test
  public void testGetRotationId() throws UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    (new CiphertextTransportV1(cipherText, aad, iv, "AXAXAXAX".getBytes("UTF-8"))).getRotationId();
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>
   * {@link CiphertextTransportV1#CiphertextTransportV1(byte[], byte[], byte[], byte[])}
   *   <li>{@link CiphertextTransportV1#toString()}
   *   <li>{@link CiphertextTransportV1#getAuthData()}
   *   <li>{@link CiphertextTransportV1#getCiphertext()}
   *   <li>{@link CiphertextTransportV1#getEncryptionMode()}
   *   <li>{@link CiphertextTransportV1#getIV()}
   *   <li>{@link CiphertextTransportV1#getKeyId()}
   *   <li>{@link CiphertextTransportV1#getOptions()}
   *   <li>{@link CiphertextTransportV1#getSalt()}
   *   <li>{@link CiphertextTransportV1#getTag()}
   *   <li>{@link CiphertextTransportV1#getVersion()}
   *   <li>{@link CiphertextTransportV1#hasKeyId()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() throws UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");
    byte[] tag = "AXAXAXAX".getBytes("UTF-8");

    // Act
    CiphertextTransportV1 actualCiphertextTransportV1 = new CiphertextTransportV1(cipherText, aad, iv, tag);
    String actualToStringResult = actualCiphertextTransportV1.toString();
    byte[] actualAuthData = actualCiphertextTransportV1.getAuthData();
    byte[] actualCiphertext = actualCiphertextTransportV1.getCiphertext();
    byte actualEncryptionMode = actualCiphertextTransportV1.getEncryptionMode();
    byte[] actualIV = actualCiphertextTransportV1.getIV();
    byte[] actualKeyId = actualCiphertextTransportV1.getKeyId();
    byte actualOptions = actualCiphertextTransportV1.getOptions();
    byte[] actualSalt = actualCiphertextTransportV1.getSalt();
    byte[] actualTag = actualCiphertextTransportV1.getTag();
    byte actualVersion = actualCiphertextTransportV1.getVersion();

    // Assert
    assertEquals("V1", actualToStringResult);
    assertNull(actualKeyId);
    assertNull(actualSalt);
    assertFalse(actualCiphertextTransportV1.hasKeyId());
    assertEquals(CiphertextTransportEncryptionMode.AES_CBC, actualVersion);
    assertEquals(CiphertextTransportEncryptionMode.AES_GCM, actualEncryptionMode);
    assertEquals(CiphertextTransportEncryptionMode.AES_GCM, actualOptions);
    assertSame(aad, actualAuthData);
    assertSame(cipherText, actualCiphertext);
    assertSame(iv, actualIV);
    assertSame(tag, actualTag);
  }

  /**
   * Method under test:
   * {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}
   */
  @Test
  public void testNewCiphertextTransportV1() throws InvalidDataException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV1("AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test:
   * {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}
   */
  @Test
  public void testNewCiphertextTransportV12() throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV1(new byte[]{CiphertextTransportEncryptionMode.AES_CBC, 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Method under test:
   * {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}
   */
  @Test
  public void testNewCiphertextTransportV13() throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV1(new byte[]{});
  }

  /**
   * Method under test:
   * {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}
   */
  @Test
  public void testNewCiphertextTransportV14() throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV1(new byte[]{CiphertextTransportEncryptionMode.AES_CBC,
        CiphertextTransportEncryptionMode.AES_CBC, 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Method under test:
   * {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}
   */
  @Test
  public void testNewCiphertextTransportV15() throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV1(new byte[]{CiphertextTransportEncryptionMode.AES_CBC,
        CiphertextTransportEncryptionMode.AES_GCM, 'A', 'X', 'A', 'X', 'A', 'X'});
  }
}
