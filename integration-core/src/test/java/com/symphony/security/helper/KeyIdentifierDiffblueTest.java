package com.symphony.security.helper;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.io.UnsupportedEncodingException;
import org.junit.Test;

public class KeyIdentifierDiffblueTest {
  /**
   * Method under test: {@link KeyIdentifier#buildBufId()}
   */
  @Test
  public void testBuildBufId() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertArrayEquals(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X', 1, 0, 0, 0, 0, 0, 0, 0},
        (new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L)).buildBufId());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link KeyIdentifier#equals(Object)}
   *   <li>{@link KeyIdentifier#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() throws UnsupportedEncodingException {
    // Arrange
    KeyIdentifier keyIdentifier = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L);
    KeyIdentifier keyIdentifier2 = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L);

    // Act and Assert
    assertEquals(keyIdentifier, keyIdentifier2);
    int expectedHashCodeResult = keyIdentifier.hashCode();
    assertEquals(expectedHashCodeResult, keyIdentifier2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link KeyIdentifier#equals(Object)}
   *   <li>{@link KeyIdentifier#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() throws UnsupportedEncodingException {
    // Arrange
    KeyIdentifier keyIdentifier = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L);

    // Act and Assert
    assertEquals(keyIdentifier, keyIdentifier);
    int expectedHashCodeResult = keyIdentifier.hashCode();
    assertEquals(expectedHashCodeResult, keyIdentifier.hashCode());
  }

  /**
   * Method under test: {@link KeyIdentifier#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() throws UnsupportedEncodingException {
    // Arrange
    KeyIdentifier keyIdentifier = new KeyIdentifier(new byte[]{1, 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, 1L, 1L);

    // Act and Assert
    assertNotEquals(keyIdentifier, new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L));
  }

  /**
   * Method under test: {@link KeyIdentifier#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() throws UnsupportedEncodingException {
    // Arrange
    KeyIdentifier keyIdentifier = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 2L, 1L);

    // Act and Assert
    assertNotEquals(keyIdentifier, new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L));
  }

  /**
   * Method under test: {@link KeyIdentifier#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() throws UnsupportedEncodingException {
    // Arrange
    KeyIdentifier keyIdentifier = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 2L);

    // Act and Assert
    assertNotEquals(keyIdentifier, new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L));
  }

  /**
   * Method under test: {@link KeyIdentifier#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertNotEquals(new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L), null);
  }

  /**
   * Method under test: {@link KeyIdentifier#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertNotEquals(new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L), "Different type to KeyIdentifier");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link KeyIdentifier#KeyIdentifier(byte[], Long, Long)}
   *   <li>{@link KeyIdentifier#getIsPublic()}
   *   <li>{@link KeyIdentifier#getRotationId()}
   *   <li>{@link KeyIdentifier#getStreamId()}
   *   <li>{@link KeyIdentifier#getUserId()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() throws UnsupportedEncodingException {
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
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link KeyIdentifier#KeyIdentifier(byte[], Long, Long, Boolean)}
   *   <li>{@link KeyIdentifier#getIsPublic()}
   *   <li>{@link KeyIdentifier#getRotationId()}
   *   <li>{@link KeyIdentifier#getStreamId()}
   *   <li>{@link KeyIdentifier#getUserId()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters2() throws UnsupportedEncodingException {
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
  }

  /**
   * Method under test: {@link KeyIdentifier#toString()}
   */
  @Test
  public void testToString() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertEquals("QVhBWEFYQVg=\r\n (isPublic=null) FOR userId=1 @ rotationId=1",
        (new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L)).toString());
    assertEquals("/1hBWEFYQVg=\r\n (isPublic=null) FOR userId=1 @ rotationId=1",
        (new KeyIdentifier(new byte[]{-1, 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, 1L, 1L)).toString());
    assertEquals("null (isPublic=null) FOR userId=1 @ rotationId=1", (new KeyIdentifier(null, 1L, 1L)).toString());
    assertEquals(" (isPublic=null) FOR userId=1 @ rotationId=1", (new KeyIdentifier(new byte[]{}, 1L, 1L)).toString());
    assertEquals("QVhBWEFYQVhBWEFYQVhBWA==\r\n (isPublic=null) FOR userId=1 @ rotationId=1",
        (new KeyIdentifier("AXAXAXAXAXAXAXAX".getBytes("UTF-8"), 1L, 1L)).toString());
    assertEquals("QVhBWEFYQVhBWEFYQVhBWEFYQVhBWEFY\r\n (isPublic=null) FOR userId=1 @ rotationId=1",
        (new KeyIdentifier("AXAXAXAXAXAXAXAXAXAXAXAX".getBytes("UTF-8"), 1L, 1L)).toString());
    assertEquals("QVhBWEFYQVg=\r\n (isPublic=public) FOR userId=1 @ rotationId=1",
        (new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L, true)).toString());
  }
}
