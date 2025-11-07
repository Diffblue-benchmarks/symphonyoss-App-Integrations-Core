package com.symphony.security.clientsdk.transport;

import com.symphony.security.exceptions.CiphertextTransportIsEmptyException;
import com.symphony.security.exceptions.CiphertextTransportVersionException;
import com.symphony.security.exceptions.InvalidDataException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CiphertextFactoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link CiphertextFactory#getTransport(byte[])}
   */
  @Test
  public void testGetTransport() throws CiphertextTransportIsEmptyException, CiphertextTransportVersionException,
      InvalidDataException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(CiphertextTransportVersionException.class);
    CiphertextFactory.getTransport("AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Method under test: {@link CiphertextFactory#getTransport(byte[])}
   */
  @Test
  public void testGetTransport2()
      throws CiphertextTransportIsEmptyException, CiphertextTransportVersionException, InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    CiphertextFactory.getTransport((byte[]) null);
  }

  /**
   * Method under test: {@link CiphertextFactory#getTransport(byte[])}
   */
  @Test
  public void testGetTransport3()
      throws CiphertextTransportIsEmptyException, CiphertextTransportVersionException, InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(CiphertextTransportVersionException.class);
    CiphertextFactory.getTransport(new byte[]{-1, 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Method under test: {@link CiphertextFactory#getTransport(byte[])}
   */
  @Test
  public void testGetTransport4()
      throws CiphertextTransportIsEmptyException, CiphertextTransportVersionException, InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(CiphertextTransportIsEmptyException.class);
    CiphertextFactory.getTransport(new byte[]{});
  }

  /**
   * Method under test: {@link CiphertextFactory#getTransport(byte[])}
   */
  @Test
  public void testGetTransport5() throws CiphertextTransportIsEmptyException, CiphertextTransportVersionException,
      InvalidDataException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(CiphertextTransportVersionException.class);
    CiphertextFactory.getTransport("A\bA\bA\bA\bA\bA\bA\bA\b".getBytes("UTF-8"));
  }

  /**
   * Method under test: {@link CiphertextFactory#getTransport(byte[])}
   */
  @Test
  public void testGetTransport6() throws CiphertextTransportIsEmptyException, CiphertextTransportVersionException,
      InvalidDataException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(CiphertextTransportVersionException.class);
    CiphertextFactory.getTransport("A\bA\bA\bA\bA\bA\bA\bA\bA\bA\bA\bA\b".getBytes("UTF-8"));
  }
}
