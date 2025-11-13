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
  public void testBuildBufId() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 1, 0, 0, 0, 0, 0, 0, 0},
        new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L).buildBufId());
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
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual()
      throws UnsupportedEncodingException {
    // Arrange
    KeyIdentifier keyIdentifier = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L);
    KeyIdentifier keyIdentifier2 = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L);

    // Act and Assert
    assertEquals(keyIdentifier, keyIdentifier2);
    assertEquals(keyIdentifier.hashCode(), keyIdentifier2.hashCode());
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
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual()
      throws UnsupportedEncodingException {
    // Arrange
    KeyIdentifier keyIdentifier = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L);

    // Act and Assert
    assertEquals(keyIdentifier, keyIdentifier);
    int expectedHashCodeResult = keyIdentifier.hashCode();
    assertEquals(expectedHashCodeResult, keyIdentifier.hashCode());
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
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual()
      throws UnsupportedEncodingException {
    // Arrange
    KeyIdentifier keyIdentifier = new KeyIdentifier(null, 1L, 1L);

    // Act and Assert
    assertNotEquals(keyIdentifier, new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L));
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
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2()
      throws UnsupportedEncodingException {
    // Arrange
    KeyIdentifier keyIdentifier = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 2L, 1L);

    // Act and Assert
    assertNotEquals(keyIdentifier, new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L));
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
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3()
      throws UnsupportedEncodingException {
    // Arrange
    KeyIdentifier keyIdentifier = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 2L);

    // Act and Assert
    assertNotEquals(keyIdentifier, new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L));
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
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertNotEquals(new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L), null);
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
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual()
      throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertNotEquals(
        new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L), "Different type to KeyIdentifier");
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
  public void testToString() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertEquals(
        "QVhBWEFYQVhBWEFYQVhBWEFYQVhBWEFY\r\n (isPublic=null) FOR userId=1 @ rotationId=1",
        new KeyIdentifier("AXAXAXAXAXAXAXAXAXAXAXAX".getBytes("UTF-8"), 1L, 1L).toString());
  }

  /**
   * Test {@link KeyIdentifier#toString()}.
   *
   * <ul>
   *   <li>Given {@code A}.
   *   <li>Then return {@code /1hBWEFYQVg= (isPublic=null) FOR userId=1 @ rotationId=1}.
   * </ul>
   *
   * <p>Method under test: {@link KeyIdentifier#toString()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String KeyIdentifier.toString()"})
  public void testToString_givenA_thenReturn1hBWEFYQVgIsPublicNullForUserId1RotationId1() {
    // Arrange, Act and Assert
    assertEquals(
        "/1hBWEFYQVg=\r\n (isPublic=null) FOR userId=1 @ rotationId=1",
        new KeyIdentifier(new byte[] {-1, 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, 1L, 1L).toString());
  }

  /**
   * Test {@link KeyIdentifier#toString()}.
   *
   * <ul>
   *   <li>Then return {@code (isPublic=null) FOR userId=1 @ rotationId=1}.
   * </ul>
   *
   * <p>Method under test: {@link KeyIdentifier#toString()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String KeyIdentifier.toString()"})
  public void testToString_thenReturnIsPublicNullForUserId1RotationId1() {
    // Arrange, Act and Assert
    assertEquals(
        " (isPublic=null) FOR userId=1 @ rotationId=1",
        new KeyIdentifier(new byte[] {}, 1L, 1L).toString());
  }

  /**
   * Test {@link KeyIdentifier#toString()}.
   *
   * <ul>
   *   <li>Then return {@code null (isPublic=null) FOR userId=1 @ rotationId=1}.
   * </ul>
   *
   * <p>Method under test: {@link KeyIdentifier#toString()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String KeyIdentifier.toString()"})
  public void testToString_thenReturnNullIsPublicNullForUserId1RotationId1() {
    // Arrange, Act and Assert
    assertEquals(
        "null (isPublic=null) FOR userId=1 @ rotationId=1",
        new KeyIdentifier(null, 1L, 1L).toString());
  }

  /**
   * Test {@link KeyIdentifier#toString()}.
   *
   * <ul>
   *   <li>Then return {@code QVhBWEFYQVg= (isPublic=null) FOR userId=1 @ rotationId=1}.
   * </ul>
   *
   * <p>Method under test: {@link KeyIdentifier#toString()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String KeyIdentifier.toString()"})
  public void testToString_thenReturnQVhBWEFYQVgIsPublicNullForUserId1RotationId1()
      throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertEquals(
        "QVhBWEFYQVg=\r\n (isPublic=null) FOR userId=1 @ rotationId=1",
        new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L).toString());
  }

  /**
   * Test {@link KeyIdentifier#toString()}.
   *
   * <ul>
   *   <li>Then return {@code QVhBWEFYQVg= (isPublic=private) FOR userId=1 @ rotationId=1}.
   * </ul>
   *
   * <p>Method under test: {@link KeyIdentifier#toString()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String KeyIdentifier.toString()"})
  public void testToString_thenReturnQVhBWEFYQVgIsPublicPrivateForUserId1RotationId1()
      throws UnsupportedEncodingException {
    // Arrange
    KeyIdentifier keyIdentifier = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L, false);

    // Act and Assert
    assertEquals(
        "QVhBWEFYQVg=\r\n (isPublic=private) FOR userId=1 @ rotationId=1",
        keyIdentifier.toString());
  }

  /**
   * Test {@link KeyIdentifier#toString()}.
   *
   * <ul>
   *   <li>Then return {@code QVhBWEFYQVg= (isPublic=public) FOR userId=1 @ rotationId=1}.
   * </ul>
   *
   * <p>Method under test: {@link KeyIdentifier#toString()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String KeyIdentifier.toString()"})
  public void testToString_thenReturnQVhBWEFYQVgIsPublicPublicForUserId1RotationId1()
      throws UnsupportedEncodingException {
    // Arrange
    KeyIdentifier keyIdentifier = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L, true);

    // Act and Assert
    assertEquals(
        "QVhBWEFYQVg=\r\n (isPublic=public) FOR userId=1 @ rotationId=1", keyIdentifier.toString());
  }

  /**
   * Test {@link KeyIdentifier#toString()}.
   *
   * <ul>
   *   <li>Then return {@code QVhBWEFYQVhBWEFYQVhBWA== (isPublic=null) FOR userId=1 @ rotationId=1}.
   * </ul>
   *
   * <p>Method under test: {@link KeyIdentifier#toString()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String KeyIdentifier.toString()"})
  public void testToString_thenReturnQVhBWEFYQVhBWEFYQVhBWAIsPublicNullForUserId1RotationId1()
      throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertEquals(
        "QVhBWEFYQVhBWEFYQVhBWA==\r\n (isPublic=null) FOR userId=1 @ rotationId=1",
        new KeyIdentifier("AXAXAXAXAXAXAXAX".getBytes("UTF-8"), 1L, 1L).toString());
  }
}
