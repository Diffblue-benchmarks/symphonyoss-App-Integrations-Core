package com.symphony.security.helper;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import org.junit.Test;

public class KeyIdentifierDiffblueTest {
  /**
   * Test {@link KeyIdentifier#buildBufId()}.
   *
   * <p>Method under test: {@link KeyIdentifier#buildBufId()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] KeyIdentifier.buildBufId()"})
  public void testBuildBufId() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {
          1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', '\r', 14, 15, 16, 1, 0, 0, 0, 0, 0, 0, 0
        },
        KeyIdentifierFactory.createKeyIdentifierWithRotation().buildBufId());
  }

  /**
   * Test {@link KeyIdentifier#equals(Object)}, and {@link KeyIdentifier#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link KeyIdentifier#equals(Object)}
   *   <li>{@link KeyIdentifier#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeyIdentifier.equals(Object)", "int KeyIdentifier.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    KeyIdentifier createKeyIdentifierWithRotationResult =
        KeyIdentifierFactory.createKeyIdentifierWithRotation();
    KeyIdentifier createKeyIdentifierWithRotationResult2 =
        KeyIdentifierFactory.createKeyIdentifierWithRotation();

    // Act and Assert
    assertEquals(createKeyIdentifierWithRotationResult, createKeyIdentifierWithRotationResult2);
    assertEquals(
        createKeyIdentifierWithRotationResult.hashCode(),
        createKeyIdentifierWithRotationResult2.hashCode());
  }

  /**
   * Test {@link KeyIdentifier#equals(Object)}, and {@link KeyIdentifier#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link KeyIdentifier#equals(Object)}
   *   <li>{@link KeyIdentifier#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeyIdentifier.equals(Object)", "int KeyIdentifier.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    KeyIdentifier createKeyIdentifierWithRotationResult =
        KeyIdentifierFactory.createKeyIdentifierWithRotation();

    // Act and Assert
    assertEquals(createKeyIdentifierWithRotationResult, createKeyIdentifierWithRotationResult);
    int expectedHashCodeResult = createKeyIdentifierWithRotationResult.hashCode();
    assertEquals(expectedHashCodeResult, createKeyIdentifierWithRotationResult.hashCode());
  }

  /**
   * Test {@link KeyIdentifier#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link KeyIdentifier#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeyIdentifier.equals(Object)", "int KeyIdentifier.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    KeyIdentifier createKeyIdentifierAlternateResult =
        KeyIdentifierFactory.createKeyIdentifierAlternate();

    // Act and Assert
    assertNotEquals(
        createKeyIdentifierAlternateResult, KeyIdentifierFactory.createKeyIdentifierWithRotation());
  }

  /**
   * Test {@link KeyIdentifier#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link KeyIdentifier#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeyIdentifier.equals(Object)", "int KeyIdentifier.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(KeyIdentifierFactory.createKeyIdentifierWithRotation(), null);
  }

  /**
   * Test {@link KeyIdentifier#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link KeyIdentifier#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KeyIdentifier.equals(Object)", "int KeyIdentifier.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        KeyIdentifierFactory.createKeyIdentifierWithRotation(), "Different type to KeyIdentifier");
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   *   <li>Then return IsPublic is {@code null}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link KeyIdentifier#KeyIdentifier(byte[], Long, Long)}
   *   <li>{@link KeyIdentifier#getIsPublic()}
   *   <li>{@link KeyIdentifier#getRotationId()}
   *   <li>{@link KeyIdentifier#getStreamId()}
   *   <li>{@link KeyIdentifier#getUserId()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void KeyIdentifier.<init>(byte[], Long, Long)",
    "void KeyIdentifier.<init>(byte[], Long, Long, Boolean)",
    "Boolean KeyIdentifier.getIsPublic()",
    "Long KeyIdentifier.getRotationId()",
    "byte[] KeyIdentifier.getStreamId()",
    "Long KeyIdentifier.getUserId()"
  })
  public void testGettersAndSetters_whenAxaxaxaxBytesIsUtf8_thenReturnIsPublicIsNull()
      throws UnsupportedEncodingException {
    // Arrange
    byte[] streamId = "AXAXAXAX".getBytes("UTF-8");

    // Act
    KeyIdentifier actualKeyIdentifier = new KeyIdentifier(streamId, 1L, 1L);
    Boolean actualIsPublic = actualKeyIdentifier.getIsPublic();
    Long actualRotationId = actualKeyIdentifier.getRotationId();
    byte[] actualStreamId = actualKeyIdentifier.getStreamId();
    Long actualUserId = actualKeyIdentifier.getUserId();

    // Assert
    assertNull(actualIsPublic);
    assertEquals(1L, actualRotationId.longValue());
    assertEquals(1L, actualUserId.longValue());
    assertSame(streamId, actualStreamId);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualStreamId);
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return IsPublic.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link KeyIdentifier#KeyIdentifier(byte[], Long, Long, Boolean)}
   *   <li>{@link KeyIdentifier#getIsPublic()}
   *   <li>{@link KeyIdentifier#getRotationId()}
   *   <li>{@link KeyIdentifier#getStreamId()}
   *   <li>{@link KeyIdentifier#getUserId()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void KeyIdentifier.<init>(byte[], Long, Long)",
    "void KeyIdentifier.<init>(byte[], Long, Long, Boolean)",
    "Boolean KeyIdentifier.getIsPublic()",
    "Long KeyIdentifier.getRotationId()",
    "byte[] KeyIdentifier.getStreamId()",
    "Long KeyIdentifier.getUserId()"
  })
  public void testGettersAndSetters_whenTrue_thenReturnIsPublic()
      throws UnsupportedEncodingException {
    // Arrange
    byte[] streamId = "AXAXAXAX".getBytes("UTF-8");

    // Act
    KeyIdentifier actualKeyIdentifier = new KeyIdentifier(streamId, 1L, 1L, true);
    Boolean actualIsPublic = actualKeyIdentifier.getIsPublic();
    Long actualRotationId = actualKeyIdentifier.getRotationId();
    byte[] actualStreamId = actualKeyIdentifier.getStreamId();
    Long actualUserId = actualKeyIdentifier.getUserId();

    // Assert
    assertEquals(1L, actualRotationId.longValue());
    assertEquals(1L, actualUserId.longValue());
    assertTrue(actualIsPublic);
    assertSame(streamId, actualStreamId);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualStreamId);
  }

  /**
   * Test {@link KeyIdentifier#toString()}.
   *
   * <p>Method under test: {@link KeyIdentifier#toString()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String KeyIdentifier.toString()"})
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals(
        "AQIDBAUGBwgJCgsMDQ4PEA==\r\n (isPublic=null) FOR userId=2 @ rotationId=1",
        KeyIdentifierFactory.createKeyIdentifierWithRotation().toString());
  }
}
