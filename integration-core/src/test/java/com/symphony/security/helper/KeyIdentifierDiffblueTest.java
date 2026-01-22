package com.symphony.security.helper;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
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
   * <ul>
   *   <li>Given createKeyIdentifier.
   *   <li>Then return array of {@code byte} with one and two.
   * </ul>
   *
   * <p>Method under test: {@link KeyIdentifier#buildBufId()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] KeyIdentifier.buildBufId()"})
  public void testBuildBufId_givenCreateKeyIdentifier_thenReturnArrayOfByteWithOneAndTwo() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {
          1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', '\r', 14, 15, 16, 0, 0, 0, 0, 0, 0, 0, 0
        },
        KeyIdentifierFactory.createKeyIdentifier().buildBufId());
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
   * <ul>
   *   <li>Then return {@code AQIDBAUGBwgJCgsMDQ4PEA== (isPublic=null) FOR userId=1 @ rotationId=0}.
   * </ul>
   *
   * <p>Method under test: {@link KeyIdentifier#toString()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String KeyIdentifier.toString()"})
  public void testToString_thenReturnAQIDBAUGBwgJCgsMDQ4PEAIsPublicNullForUserId1RotationId0() {
    // Arrange, Act and Assert
    assertEquals(
        "AQIDBAUGBwgJCgsMDQ4PEA==\r\n (isPublic=null) FOR userId=1 @ rotationId=0",
        KeyIdentifierFactory.createKeyIdentifier().toString());
  }
}
