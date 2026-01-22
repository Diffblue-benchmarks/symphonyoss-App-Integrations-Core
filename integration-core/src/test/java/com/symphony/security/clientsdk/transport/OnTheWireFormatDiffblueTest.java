package com.symphony.security.clientsdk.transport;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.OnTheWireFormatException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OnTheWireFormatDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link OnTheWireFormat#entireMessage()}.
   *
   * <p>Method under test: {@link OnTheWireFormat#entireMessage()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] OnTheWireFormat.entireMessage()"})
  public void testEntireMessage() throws OnTheWireFormatException {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.RSA_OAEP,
          CiphertextTransportEncryptionMode.RSA_PSS,
          4,
          5,
          6,
          7,
          '\b',
          '\t',
          '\n',
          11,
          '\f',
          '\r',
          14,
          15,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.RSA_OAEP,
          CiphertextTransportEncryptionMode.RSA_PSS,
          4,
          5,
          6,
          7,
          '\n',
          20,
          30,
          '(',
          '2',
          '<',
          'F',
          'P',
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.RSA_OAEP,
          CiphertextTransportEncryptionMode.RSA_PSS,
          4,
          5,
          6,
          7,
          '\b',
          '\t',
          '\n',
          11,
          '\f',
          '\r',
          14,
          15,
          16
        },
        OnTheWireFormatFactory.createOnTheWireFormatFromBytes().entireMessage());
  }

  /**
   * Test {@link OnTheWireFormat#getAuth()}.
   *
   * <p>Method under test: {@link OnTheWireFormat#getAuth()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] OnTheWireFormat.getAuth()"})
  public void testGetAuth() throws OnTheWireFormatException {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {
          '\b',
          '\t',
          '\n',
          11,
          '\f',
          '\r',
          14,
          15,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.RSA_OAEP,
          CiphertextTransportEncryptionMode.RSA_PSS,
          4,
          5,
          6,
          7
        },
        OnTheWireFormatFactory.createOnTheWireFormatFromBytes().getAuth());
  }

  /**
   * Test {@link OnTheWireFormat#getCiphertext()}.
   *
   * <p>Method under test: {@link OnTheWireFormat#getCiphertext()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] OnTheWireFormat.getCiphertext()"})
  public void testGetCiphertext() throws OnTheWireFormatException {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {'\n', 20, 30, '(', '2', '<', 'F', 'P'},
        OnTheWireFormatFactory.createOnTheWireFormatFromBytes().getCiphertext());
  }

  /**
   * Test {@link OnTheWireFormat#getIv()}.
   *
   * <p>Method under test: {@link OnTheWireFormat#getIv()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] OnTheWireFormat.getIv()"})
  public void testGetIv() throws OnTheWireFormatException {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_GCM,
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.RSA_OAEP,
          CiphertextTransportEncryptionMode.RSA_PSS,
          4,
          5,
          6,
          7
        },
        OnTheWireFormatFactory.createOnTheWireFormatFromBytes().getIv());
  }

  /**
   * Test {@link OnTheWireFormat#getPassword()}.
   *
   * <p>Method under test: {@link OnTheWireFormat#getPassword()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"int OnTheWireFormat.getPassword()"})
  public void testGetPassword() throws OnTheWireFormatException {
    // Arrange, Act and Assert
    assertEquals(0, OnTheWireFormatFactory.createOnTheWireFormatFromBytes().getPassword());
  }

  /**
   * Test {@link OnTheWireFormat#getSalt()}.
   *
   * <p>Method under test: {@link OnTheWireFormat#getSalt()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] OnTheWireFormat.getSalt()"})
  public void testGetSalt() throws OnTheWireFormatException {
    // Arrange, Act and Assert
    assertNull(OnTheWireFormatFactory.createOnTheWireFormatFromBytes().getSalt());
  }

  /**
   * Test {@link OnTheWireFormat#getTag()}.
   *
   * <p>Method under test: {@link OnTheWireFormat#getTag()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] OnTheWireFormat.getTag()"})
  public void testGetTag() throws OnTheWireFormatException {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {
          CiphertextTransportEncryptionMode.AES_CBC,
          CiphertextTransportEncryptionMode.RSA_OAEP,
          CiphertextTransportEncryptionMode.RSA_PSS,
          4,
          5,
          6,
          7,
          '\b',
          '\t',
          '\n',
          11,
          '\f',
          '\r',
          14,
          15,
          16
        },
        OnTheWireFormatFactory.createOnTheWireFormatFromBytes().getTag());
  }

  /**
   * Test {@link OnTheWireFormat#getVersion()}.
   *
   * <p>Method under test: {@link OnTheWireFormat#getVersion()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"int OnTheWireFormat.getVersion()"})
  public void testGetVersion() throws OnTheWireFormatException {
    // Arrange, Act and Assert
    assertEquals(1, OnTheWireFormatFactory.createOnTheWireFormatFromBytes().getVersion());
  }

  /**
   * Test {@link OnTheWireFormat#OnTheWireFormat(byte[])}.
   *
   * <p>Method under test: {@link OnTheWireFormat#OnTheWireFormat(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void OnTheWireFormat.<init>(byte[])"})
  public void testNewOnTheWireFormat()
      throws OnTheWireFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(OnTheWireFormatException.class);
    new OnTheWireFormat("AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link OnTheWireFormat#OnTheWireFormat(byte[], byte, byte, byte[], byte[], byte[],
   * byte[])}.
   *
   * <ul>
   *   <li>When array of {@code byte} with {@code A} and sixteen.
   * </ul>
   *
   * <p>Method under test: {@link OnTheWireFormat#OnTheWireFormat(byte[], byte, byte, byte[],
   * byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OnTheWireFormat.<init>(byte[], byte, byte, byte[], byte[], byte[], byte[])"
  })
  public void testNewOnTheWireFormat_whenArrayOfByteWithAAndSixteen()
      throws OnTheWireFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(OnTheWireFormatException.class);
    new OnTheWireFormat(
        "AXAXAXAX".getBytes("UTF-8"),
        (byte) 'A',
        (byte) 'A',
        "AXAXAXAX".getBytes("UTF-8"),
        new byte[] {'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16, 'A', 16},
        "AXAXAXAX".getBytes("UTF-8"),
        "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link OnTheWireFormat#OnTheWireFormat(byte[], byte, byte, byte[], byte[], byte[],
   * byte[])}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link OnTheWireFormat#OnTheWireFormat(byte[], byte, byte, byte[],
   * byte[], byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OnTheWireFormat.<init>(byte[], byte, byte, byte[], byte[], byte[], byte[])"
  })
  public void testNewOnTheWireFormat_whenAxaxaxaxBytesIsUtf8()
      throws OnTheWireFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(OnTheWireFormatException.class);
    new OnTheWireFormat(
        "AXAXAXAX".getBytes("UTF-8"),
        (byte) 'A',
        (byte) 'A',
        "AXAXAXAX".getBytes("UTF-8"),
        "AXAXAXAX".getBytes("UTF-8"),
        "AXAXAXAX".getBytes("UTF-8"),
        "AXAXAXAX".getBytes("UTF-8"));
  }
}
