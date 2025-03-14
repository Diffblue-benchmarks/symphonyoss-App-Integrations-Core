package com.symphony.security.clientsdk.transport;

import com.diffblue.cover.annotations.MethodsUnderTest;
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
   * Test {@link CiphertextFactory#getTransport(byte[])} with {@code transportableBytes}.
   * <p>
   * Method under test: {@link CiphertextFactory#getTransport(byte[])}
   */
  @Test
  @MethodsUnderTest({
      "com.symphony.security.clientsdk.transport.ICiphertextTransport CiphertextFactory.getTransport(byte[])"})
  public void testGetTransportWithTransportableBytes()
      throws CiphertextTransportIsEmptyException, CiphertextTransportVersionException, InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(CiphertextTransportIsEmptyException.class);
    CiphertextFactory.getTransport(new byte[]{});
  }

  /**
   * Test {@link CiphertextFactory#getTransport(byte[])} with {@code transportableBytes}.
   * <p>
   * Method under test: {@link CiphertextFactory#getTransport(byte[])}
   */
  @Test
  @MethodsUnderTest({
      "com.symphony.security.clientsdk.transport.ICiphertextTransport CiphertextFactory.getTransport(byte[])"})
  public void testGetTransportWithTransportableBytes2() throws CiphertextTransportIsEmptyException,
      CiphertextTransportVersionException, InvalidDataException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(CiphertextTransportVersionException.class);
    CiphertextFactory.getTransport("A\bA\bA\bA\bA\bA\bA\bA\b".getBytes("UTF-8"));
  }

  /**
   * Test {@link CiphertextFactory#getTransport(byte[])} with {@code transportableBytes}.
   * <ul>
   *   <li>When a string Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextFactory#getTransport(byte[])}
   */
  @Test
  @MethodsUnderTest({
      "com.symphony.security.clientsdk.transport.ICiphertextTransport CiphertextFactory.getTransport(byte[])"})
  public void testGetTransportWithTransportableBytes_whenAStringBytesIsUtf8()
      throws CiphertextTransportIsEmptyException, CiphertextTransportVersionException, InvalidDataException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(CiphertextTransportVersionException.class);
    CiphertextFactory.getTransport("A\bA\bA\bA\bA\bA\bA\bA\bA\bA\bA\bA\b".getBytes("UTF-8"));
  }

  /**
   * Test {@link CiphertextFactory#getTransport(byte[])} with {@code transportableBytes}.
   * <ul>
   *   <li>When array of {@code byte} with minus one and {@code X}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextFactory#getTransport(byte[])}
   */
  @Test
  @MethodsUnderTest({
      "com.symphony.security.clientsdk.transport.ICiphertextTransport CiphertextFactory.getTransport(byte[])"})
  public void testGetTransportWithTransportableBytes_whenArrayOfByteWithMinusOneAndX()
      throws CiphertextTransportIsEmptyException, CiphertextTransportVersionException, InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(CiphertextTransportVersionException.class);
    CiphertextFactory.getTransport(new byte[]{-1, 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Test {@link CiphertextFactory#getTransport(byte[])} with {@code transportableBytes}.
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextFactory#getTransport(byte[])}
   */
  @Test
  @MethodsUnderTest({
      "com.symphony.security.clientsdk.transport.ICiphertextTransport CiphertextFactory.getTransport(byte[])"})
  public void testGetTransportWithTransportableBytes_whenAxaxaxaxBytesIsUtf8()
      throws CiphertextTransportIsEmptyException, CiphertextTransportVersionException, InvalidDataException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(CiphertextTransportVersionException.class);
    CiphertextFactory.getTransport("AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link CiphertextFactory#getTransport(byte[])} with {@code transportableBytes}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link InvalidDataException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CiphertextFactory#getTransport(byte[])}
   */
  @Test
  @MethodsUnderTest({
      "com.symphony.security.clientsdk.transport.ICiphertextTransport CiphertextFactory.getTransport(byte[])"})
  public void testGetTransportWithTransportableBytes_whenNull_thenThrowInvalidDataException()
      throws CiphertextTransportIsEmptyException, CiphertextTransportVersionException, InvalidDataException {
    // Arrange, Act and Assert
    thrown.expect(InvalidDataException.class);
    CiphertextFactory.getTransport((byte[]) null);
  }
}
