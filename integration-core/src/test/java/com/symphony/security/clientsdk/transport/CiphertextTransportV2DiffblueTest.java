package com.symphony.security.clientsdk.transport;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.InvalidDataException;
import com.symphony.security.utils.ValidateFactory;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CiphertextTransportV2DiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link CiphertextTransportV2#equals(Object)}, and {@link
   * CiphertextTransportV2#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CiphertextTransportV2#equals(Object)}
   *   <li>{@link CiphertextTransportV2#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CiphertextTransportV2.equals(Object)",
    "int CiphertextTransportV2.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CiphertextTransportV2 createCiphertextTransportV2Result =
        CiphertextTransportV2Factory.createCiphertextTransportV2();
    CiphertextTransportV2 createCiphertextTransportV2Result2 =
        CiphertextTransportV2Factory.createCiphertextTransportV2();

    // Act and Assert
    assertEquals(createCiphertextTransportV2Result, createCiphertextTransportV2Result2);
    assertEquals(
        createCiphertextTransportV2Result.hashCode(),
        createCiphertextTransportV2Result2.hashCode());
  }

  /**
   * Test {@link CiphertextTransportV2#equals(Object)}, and {@link
   * CiphertextTransportV2#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CiphertextTransportV2#equals(Object)}
   *   <li>{@link CiphertextTransportV2#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CiphertextTransportV2.equals(Object)",
    "int CiphertextTransportV2.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CiphertextTransportV2 createCiphertextTransportV2Result =
        CiphertextTransportV2Factory.createCiphertextTransportV2();

    // Act and Assert
    assertEquals(createCiphertextTransportV2Result, createCiphertextTransportV2Result);
    int expectedHashCodeResult = createCiphertextTransportV2Result.hashCode();
    assertEquals(expectedHashCodeResult, createCiphertextTransportV2Result.hashCode());
  }

  /**
   * Test {@link CiphertextTransportV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV2#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CiphertextTransportV2.equals(Object)",
    "int CiphertextTransportV2.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CiphertextTransportV2 createCiphertextTransportV2Result =
        CiphertextTransportV2Factory.createCiphertextTransportV2();

    // Act and Assert
    assertNotEquals(createCiphertextTransportV2Result, ValidateFactory.createNonNullString());
  }

  /**
   * Test {@link CiphertextTransportV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV2#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CiphertextTransportV2.equals(Object)",
    "int CiphertextTransportV2.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CiphertextTransportV2Factory.createCiphertextTransportV2(), null);
  }

  /**
   * Test {@link CiphertextTransportV2#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CiphertextTransportV2#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CiphertextTransportV2.equals(Object)",
    "int CiphertextTransportV2.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CiphertextTransportV2Factory.createCiphertextTransportV2(),
        "Different type to CiphertextTransportV2");
  }

  /**
   * Test {@link CiphertextTransportV2#getCiphertextAndTag()}.
   *
   * <p>Method under test: {@link CiphertextTransportV2#getCiphertextAndTag()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV2.getCiphertextAndTag()"})
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
        CiphertextTransportV2Factory.createCiphertextTransportV2().getCiphertextAndTag());
  }

  /**
   * Test {@link CiphertextTransportV2#getPodId()}.
   *
   * <p>Method under test: {@link CiphertextTransportV2#getPodId()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"int CiphertextTransportV2.getPodId()"})
  public void testGetPodId() {
    // Arrange, Act and Assert
    assertEquals(1, CiphertextTransportV2Factory.createCiphertextTransportV2().getPodId());
  }

  /**
   * Test {@link CiphertextTransportV2#getRawData()}.
   *
   * <p>Method under test: {@link CiphertextTransportV2#getRawData()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] CiphertextTransportV2.getRawData()"})
  public void testGetRawData() {
    // Arrange, Act and Assert
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
        CiphertextTransportV2Factory.createCiphertextTransportV2().getRawData());
  }

  /**
   * Test {@link CiphertextTransportV2#getRotationId()}.
   *
   * <p>Method under test: {@link CiphertextTransportV2#getRotationId()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"long CiphertextTransportV2.getRotationId()"})
  public void testGetRotationId() {
    // Arrange, Act and Assert
    assertEquals(1L, CiphertextTransportV2Factory.createCiphertextTransportV2().getRotationId());
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
        "AXAXAXAXAXAXAXAX".getBytes("UTF-8"), actualCiphertextTransportV2.getCiphertextAndTag());
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
