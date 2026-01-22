package com.symphony.security.clientsdk.transport;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.InvalidDataException;
import com.symphony.security.utils.ValidateFactory;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CiphertextTransportV1DiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link CiphertextTransportV1#equals(Object)}, and {@link
   * CiphertextTransportV1#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CiphertextTransportV1#equals(Object)}
   *   <li>{@link CiphertextTransportV1#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CiphertextTransportV1.equals(Object)",
    "int CiphertextTransportV1.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CiphertextTransportV1 createCiphertextTransportV1Result =
        CiphertextTransportV1Factory.createCiphertextTransportV1();
    CiphertextTransportV1 createCiphertextTransportV1Result2 =
        CiphertextTransportV1Factory.createCiphertextTransportV1();

    // Act and Assert
    assertEquals(createCiphertextTransportV1Result, createCiphertextTransportV1Result2);
    assertEquals(
        createCiphertextTransportV1Result.hashCode(),
        createCiphertextTransportV1Result2.hashCode());
  }

  /**
   * Test {@link CiphertextTransportV1#equals(Object)}, and {@link
   * CiphertextTransportV1#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CiphertextTransportV1#equals(Object)}
   *   <li>{@link CiphertextTransportV1#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CiphertextTransportV1.equals(Object)",
    "int CiphertextTransportV1.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CiphertextTransportV1 createCiphertextTransportV1Result =
        CiphertextTransportV1Factory.createCiphertextTransportV1();

    // Act and Assert
    assertEquals(createCiphertextTransportV1Result, createCiphertextTransportV1Result);
    int expectedHashCodeResult = createCiphertextTransportV1Result.hashCode();
    assertEquals(expectedHashCodeResult, createCiphertextTransportV1Result.hashCode());
  }

  /**
   * Test {@link CiphertextTransportV1#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV1#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CiphertextTransportV1.equals(Object)",
    "int CiphertextTransportV1.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CiphertextTransportV1 createCiphertextTransportV1Result =
        CiphertextTransportV1Factory.createCiphertextTransportV1();

    // Act and Assert
    assertNotEquals(createCiphertextTransportV1Result, ValidateFactory.createNonNullString());
  }

  /**
   * Test {@link CiphertextTransportV1#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV1#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CiphertextTransportV1.equals(Object)",
    "int CiphertextTransportV1.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CiphertextTransportV1Factory.createCiphertextTransportV1(), null);
  }

  /**
   * Test {@link CiphertextTransportV1#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV1#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CiphertextTransportV1.equals(Object)",
    "int CiphertextTransportV1.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CiphertextTransportV1Factory.createCiphertextTransportV1(),
        "Different type to CiphertextTransportV1");
  }

  /**
   * Test {@link CiphertextTransportV1#getCiphertextAndTag()}.
   *
   * <p>Method under test: {@link CiphertextTransportV1#getCiphertextAndTag()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV1.getCiphertextAndTag()"})
  public void testGetCiphertextAndTag() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.RSA_OAEP,
          CiphertextTransportEncryptionMode.RSA_PSS,
          4,
          5,
          6,
          7,
          '\b',
          30,
          31,
          ' ',
          '!',
          '"',
          '#',
          '$',
          '%'
        },
        CiphertextTransportV1Factory.createCiphertextTransportV1().getCiphertextAndTag());
  }

  /**
   * Test {@link CiphertextTransportV1#getPodId()}.
   *
   * <p>Method under test: {@link CiphertextTransportV1#getPodId()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"int CiphertextTransportV1.getPodId()"})
  public void testGetPodId() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    CiphertextTransportV1Factory.createCiphertextTransportV1().getPodId();
  }

  /**
   * Test {@link CiphertextTransportV1#getRawData()}.
   *
   * <p>Method under test: {@link CiphertextTransportV1#getRawData()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV1.getRawData()"})
  public void testGetRawData() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.AES_GCM,
          20,
          21,
          22,
          23,
          24,
          25,
          26,
          27,
          '\n',
          11,
          '\f',
          '\r',
          14,
          15,
          16,
          17,
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.RSA_OAEP,
          CiphertextTransportEncryptionMode.RSA_PSS,
          4,
          5,
          6,
          7,
          '\b',
          30,
          31,
          ' ',
          '!',
          '"',
          '#',
          '$',
          '%'
        },
        CiphertextTransportV1Factory.createCiphertextTransportV1().getRawData());
  }

  /**
   * Test {@link CiphertextTransportV1#getRotationId()}.
   *
   * <p>Method under test: {@link CiphertextTransportV1#getRotationId()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"long CiphertextTransportV1.getRotationId()"})
  public void testGetRotationId() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    CiphertextTransportV1Factory.createCiphertextTransportV1().getRotationId();
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CiphertextTransportV1#CiphertextTransportV1(byte[], byte[], byte[], byte[])}
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
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CiphertextTransportV1.<init>(byte[], byte[], byte[], byte[])",
    "byte[] CiphertextTransportV1.getAuthData()",
    "byte[] CiphertextTransportV1.getCiphertext()",
    "byte CiphertextTransportV1.getEncryptionMode()",
    "byte[] CiphertextTransportV1.getIV()",
    "byte[] CiphertextTransportV1.getKeyId()",
    "byte CiphertextTransportV1.getOptions()",
    "byte[] CiphertextTransportV1.getSalt()",
    "byte[] CiphertextTransportV1.getTag()",
    "byte CiphertextTransportV1.getVersion()",
    "boolean CiphertextTransportV1.hasKeyId()",
    "String CiphertextTransportV1.toString()"
  })
  public void testGettersAndSetters() throws UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] aad = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");
    byte[] tag = "AXAXAXAX".getBytes("UTF-8");

    // Act
    CiphertextTransportV1 actualCiphertextTransportV1 =
        new CiphertextTransportV1(cipherText, aad, iv, tag);
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
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualAuthData);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualCiphertext);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualIV);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualTag);
  }

  /**
   * Test {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}.
   *
   * <ul>
   *   <li>When array of {@code byte} with {@link CiphertextTransportEncryptionMode#AES_CBC} and
   *       {@link CiphertextTransportEncryptionMode#AES_CBC}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CiphertextTransportV1.<init>(byte[])"})
  public void testNewCiphertextTransportV1_whenArrayOfByteWithAes_cbcAndAes_cbc()
      throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV1(
        new byte[] {
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.AES_CBC,
          'A',
          'X',
          'A',
          'X',
          'A',
          'X'
        });
  }

  /**
   * Test {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}.
   *
   * <ul>
   *   <li>When array of {@code byte} with {@link CiphertextTransportEncryptionMode#AES_CBC} and
   *       {@link CiphertextTransportEncryptionMode#AES_GCM}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CiphertextTransportV1.<init>(byte[])"})
  public void testNewCiphertextTransportV1_whenArrayOfByteWithAes_cbcAndAes_gcm()
      throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV1(
        new byte[] {
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.AES_GCM,
          'A',
          'X',
          'A',
          'X',
          'A',
          'X'
        });
  }

  /**
   * Test {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}.
   *
   * <ul>
   *   <li>When array of {@code byte} with {@link CiphertextTransportEncryptionMode#AES_CBC} and
   *       {@code X}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CiphertextTransportV1.<init>(byte[])"})
  public void testNewCiphertextTransportV1_whenArrayOfByteWithAes_cbcAndX()
      throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV1(
        new byte[] {CiphertextTransportEncryptionMode.AES_CBC, 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Test {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CiphertextTransportV1.<init>(byte[])"})
  public void testNewCiphertextTransportV1_whenAxaxaxaxBytesIsUtf8()
      throws InvalidDataException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV1("AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}.
   *
   * <ul>
   *   <li>When empty array of {@code byte}.
   *   <li>Then throw {@link InvalidDataException}.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV1#CiphertextTransportV1(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CiphertextTransportV1.<init>(byte[])"})
  public void testNewCiphertextTransportV1_whenEmptyArrayOfByte_thenThrowInvalidDataException()
      throws InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    new CiphertextTransportV1(new byte[] {});
  }
}
