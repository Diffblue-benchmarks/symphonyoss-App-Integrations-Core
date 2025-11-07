package com.symphony.security.hsm;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TransportableWrappedKeyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test:
   * {@link TransportableWrappedKey#TransportableWrappedKey(byte[])}
   */
  @Test
  public void testNewTransportableWrappedKey() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    new TransportableWrappedKey("AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test:
   * {@link TransportableWrappedKey#TransportableWrappedKey(byte[])}
   */
  @Test
  public void testNewTransportableWrappedKey2() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    new TransportableWrappedKey(null);
  }

  /**
   * Method under test:
   * {@link TransportableWrappedKey#TransportableWrappedKey(byte[])}
   */
  @Test
  public void testNewTransportableWrappedKey3() throws IOException {
    // Arrange
    byte[] transportableBytes = new byte[]{'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16};

    // Act
    TransportableWrappedKey actualTransportableWrappedKey = new TransportableWrappedKey(transportableBytes);

    // Assert
    assertEquals(0, actualTransportableWrappedKey.getWrappedKeyBytes().length);
    assertSame(transportableBytes, actualTransportableWrappedKey.getTransportableBytes());
    assertArrayEquals(new byte[]{'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16},
        actualTransportableWrappedKey.getIv());
  }

  /**
   * Method under test:
   * {@link TransportableWrappedKey#TransportableWrappedKey(byte[], byte[])}
   */
  @Test
  public void testNewTransportableWrappedKey4() throws IOException {
    // Arrange
    byte[] wrappedKeyBytes = "AXAXAXAX".getBytes("UTF-8");
    byte[] iv = "AXAXAXAX".getBytes("UTF-8");

    // Act
    TransportableWrappedKey actualTransportableWrappedKey = new TransportableWrappedKey(wrappedKeyBytes, iv);

    // Assert
    assertSame(iv, actualTransportableWrappedKey.getIv());
    assertSame(wrappedKeyBytes, actualTransportableWrappedKey.getWrappedKeyBytes());
    byte[] expectedTransportableBytes = "AXAXAXAXAXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedTransportableBytes, actualTransportableWrappedKey.getTransportableBytes());
  }

  /**
   * Method under test:
   * {@link TransportableWrappedKey#TransportableWrappedKey(byte[], byte[])}
   */
  @Test
  public void testNewTransportableWrappedKey5() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);

    new TransportableWrappedKey(null, null);

  }

  /**
   * Method under test:
   * {@link TransportableWrappedKey#TransportableWrappedKey(byte[], byte[])}
   */
  @Test
  public void testNewTransportableWrappedKey6() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);

    new TransportableWrappedKey(null, new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'});

  }

  /**
   * Method under test:
   * {@link TransportableWrappedKey#TransportableWrappedKey(byte[], byte[])}
   */
  @Test
  public void testNewTransportableWrappedKey7() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);

    new TransportableWrappedKey(new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null);

  }
}
