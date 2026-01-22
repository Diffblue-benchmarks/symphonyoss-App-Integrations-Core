package com.symphony.security.helper;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.CiphertextTransportVersionException;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClientCryptoHandlerDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link ClientCryptoHandler#encryptMsg(byte[], KeyIdentifier, byte[], byte)} with {@code
   * key}, {@code keyId}, {@code plaintext}, {@code ciphertextTransportEncryptionMode}.
   *
   * <p>Method under test: {@link ClientCryptoHandler#encryptMsg(byte[], KeyIdentifier, byte[],
   * byte)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] ClientCryptoHandler.encryptMsg(byte[], KeyIdentifier, byte[], byte)"})
  public void testEncryptMsgWithKeyKeyIdPlaintextCiphertextTransportEncryptionMode()
      throws CiphertextTransportVersionException, SymphonyEncryptionException,
          SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    ClientCryptoHandler createClientCryptoHandlerResult =
        ClientCryptoHandlerFactory.createClientCryptoHandler();
    byte[] key = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    createClientCryptoHandlerResult.encryptMsg(
        key,
        KeyIdentifierFactory.createKeyIdentifierWithRotation(),
        "AXAXAXAX".getBytes("UTF-8"),
        (byte) 'A');
  }

  /**
   * Test {@link ClientCryptoHandler#encryptMsg(byte[], KeyIdentifier, byte[], byte)} with {@code
   * key}, {@code keyId}, {@code plaintext}, {@code ciphertextTransportEncryptionMode}.
   *
   * <p>Method under test: {@link ClientCryptoHandler#encryptMsg(byte[], KeyIdentifier, byte[],
   * byte)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] ClientCryptoHandler.encryptMsg(byte[], KeyIdentifier, byte[], byte)"})
  public void testEncryptMsgWithKeyKeyIdPlaintextCiphertextTransportEncryptionMode2()
      throws CiphertextTransportVersionException, SymphonyEncryptionException,
          SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    ClientCryptoHandler createClientCryptoHandlerResult =
        ClientCryptoHandlerFactory.createClientCryptoHandler();
    byte[] key = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    createClientCryptoHandlerResult.encryptMsg(
        key,
        KeyIdentifierFactory.createKeyIdentifierWithRotation(),
        "AXAXAXAX".getBytes("UTF-8"),
        (byte) 1);
  }
}
