package com.symphony.security.clientsdk.transport;

import com.symphony.security.exceptions.OnTheWireFormatException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OnTheWireFormatDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link OnTheWireFormat#OnTheWireFormat(byte[])}
   */
  @Test
  public void testNewOnTheWireFormat() throws OnTheWireFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(OnTheWireFormatException.class);
    new OnTheWireFormat("AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test:
   * {@link OnTheWireFormat#OnTheWireFormat(byte[], byte, byte, byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testNewOnTheWireFormat2() throws OnTheWireFormatException, UnsupportedEncodingException {
    // Arrange
    byte[] cipherText = "AXAXAXAX".getBytes("UTF-8");
    byte[] salt = "AXAXAXAX".getBytes("UTF-8");
    byte[] IV = "AXAXAXAX".getBytes("UTF-8");
    byte[] AAD = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(OnTheWireFormatException.class);

    new OnTheWireFormat(cipherText, (byte) 'A', (byte) 'A', salt, IV, AAD, "AXAXAXAX".getBytes("UTF-8"));

  }

  /**
   * Method under test:
   * {@link OnTheWireFormat#OnTheWireFormat(byte[], byte, byte, byte[], byte[], byte[], byte[])}
   */
  @Test
  public void testNewOnTheWireFormat3() throws OnTheWireFormatException, UnsupportedEncodingException {
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
}
