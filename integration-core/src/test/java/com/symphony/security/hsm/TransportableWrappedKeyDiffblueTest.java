package com.symphony.security.hsm;

import static org.junit.Assert.assertArrayEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TransportableWrappedKeyDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link TransportableWrappedKey#TransportableWrappedKey(byte[], byte[])}.
   *
   * <ul>
   *   <li>Then return Iv is {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link TransportableWrappedKey#TransportableWrappedKey(byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransportableWrappedKey.<init>(byte[], byte[])"})
  public void testNewTransportableWrappedKey_thenReturnIvIsAxaxaxaxBytesIsUtf8()
      throws IOException {
    // Arrange
    byte[] wrappedKeyBytes = "AXAXAXAX".getBytes("UTF-8");

    // Act
    TransportableWrappedKey actualTransportableWrappedKey =
        new TransportableWrappedKey(wrappedKeyBytes, "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    byte[] expectedIv = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedIv, actualTransportableWrappedKey.getIv());
    byte[] expectedWrappedKeyBytes = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedWrappedKeyBytes, actualTransportableWrappedKey.getWrappedKeyBytes());
    byte[] expectedTransportableBytes = "AXAXAXAXAXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(
        expectedTransportableBytes, actualTransportableWrappedKey.getTransportableBytes());
  }

  /**
   * Test {@link TransportableWrappedKey#TransportableWrappedKey(byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   *   <li>Then return WrappedKeyBytes is empty array of {@code byte}.
   * </ul>
   *
   * <p>Method under test: {@link TransportableWrappedKey#TransportableWrappedKey(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransportableWrappedKey.<init>(byte[])"})
  public void testNewTransportableWrappedKey_whenA_thenReturnWrappedKeyBytesIsEmptyArrayOfByte()
      throws IOException {
    // Arrange and Act
    TransportableWrappedKey actualTransportableWrappedKey =
        new TransportableWrappedKey(
            new byte[] {'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16});

    // Assert
    assertArrayEquals(new byte[] {}, actualTransportableWrappedKey.getWrappedKeyBytes());
    assertArrayEquals(
        new byte[] {'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16},
        actualTransportableWrappedKey.getIv());
    assertArrayEquals(
        new byte[] {'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16},
        actualTransportableWrappedKey.getTransportableBytes());
  }

  /**
   * Test {@link TransportableWrappedKey#TransportableWrappedKey(byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   *   <li>Then throw {@link IOException}.
   * </ul>
   *
   * <p>Method under test: {@link TransportableWrappedKey#TransportableWrappedKey(byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransportableWrappedKey.<init>(byte[], byte[])"})
  public void testNewTransportableWrappedKey_whenA_thenThrowIOException() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);

    new TransportableWrappedKey(null, new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Test {@link TransportableWrappedKey#TransportableWrappedKey(byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code A}.
   *   <li>Then throw {@link IOException}.
   * </ul>
   *
   * <p>Method under test: {@link TransportableWrappedKey#TransportableWrappedKey(byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransportableWrappedKey.<init>(byte[], byte[])"})
  public void testNewTransportableWrappedKey_whenA_thenThrowIOException2() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);

    new TransportableWrappedKey(new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null);
  }

  /**
   * Test {@link TransportableWrappedKey#TransportableWrappedKey(byte[])}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   *   <li>Then throw {@link IOException}.
   * </ul>
   *
   * <p>Method under test: {@link TransportableWrappedKey#TransportableWrappedKey(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransportableWrappedKey.<init>(byte[])"})
  public void testNewTransportableWrappedKey_whenAxaxaxaxBytesIsUtf8_thenThrowIOException()
      throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    new TransportableWrappedKey("AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link TransportableWrappedKey#TransportableWrappedKey(byte[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IOException}.
   * </ul>
   *
   * <p>Method under test: {@link TransportableWrappedKey#TransportableWrappedKey(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransportableWrappedKey.<init>(byte[])"})
  public void testNewTransportableWrappedKey_whenNull_thenThrowIOException() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    new TransportableWrappedKey(null);
  }

  /**
   * Test {@link TransportableWrappedKey#TransportableWrappedKey(byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IOException}.
   * </ul>
   *
   * <p>Method under test: {@link TransportableWrappedKey#TransportableWrappedKey(byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransportableWrappedKey.<init>(byte[], byte[])"})
  public void testNewTransportableWrappedKey_whenNull_thenThrowIOException2() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);

    new TransportableWrappedKey(null, null);
  }
}
