package com.symphony.security.clientsdk.transport;

import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.OnTheWireFormatException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OnTheWireFormatDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link OnTheWireFormat#OnTheWireFormat(byte[])}.
   * <p>
   * Method under test: {@link OnTheWireFormat#OnTheWireFormat(byte[])}
   */
  @Test
  @MethodsUnderTest({"void OnTheWireFormat.<init>(byte[])"})
  public void testNewOnTheWireFormat() throws OnTheWireFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(OnTheWireFormatException.class);
    new OnTheWireFormat("AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link OnTheWireFormat#OnTheWireFormat(byte[], byte, byte, byte[], byte[], byte[], byte[])}.
   * <ul>
   *   <li>When array of {@code byte} with {@code A} and sixteen.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnTheWireFormat#OnTheWireFormat(byte[], byte, byte, byte[], byte[], byte[], byte[])}
   */
  @Test
  @MethodsUnderTest({"void OnTheWireFormat.<init>(byte[], byte, byte, byte[], byte[], byte[], byte[])"})
  public void testNewOnTheWireFormat_whenArrayOfByteWithAAndSixteen()
      throws OnTheWireFormatException, UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] salt = "AXAXAXAX".getBytes("UTF-8");
    byte[] AAD = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(OnTheWireFormatException.class);

    new OnTheWireFormat(cipherText, (byte) 'A', (byte) 'A', salt,
        new byte[]{'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16}, AAD,
        "AXAXAXAX".getBytes("UTF-8"));

  }

  /**
   * Test {@link OnTheWireFormat#OnTheWireFormat(byte[], byte, byte, byte[], byte[], byte[], byte[])}.
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnTheWireFormat#OnTheWireFormat(byte[], byte, byte, byte[], byte[], byte[], byte[])}
   */
  @Test
  @MethodsUnderTest({"void OnTheWireFormat.<init>(byte[], byte, byte, byte[], byte[], byte[], byte[])"})
  public void testNewOnTheWireFormat_whenAxaxaxaxBytesIsUtf8()
      throws OnTheWireFormatException, UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] salt = "AXAXAXAX".getBytes("UTF-8");
    byte[] IV = "AXAXAXAX".getBytes("UTF-8");
    byte[] AAD = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(OnTheWireFormatException.class);

    new OnTheWireFormat(cipherText, (byte) 'A', (byte) 'A', salt, IV, AAD, "AXAXAXAX".getBytes("UTF-8"));

  }
}
