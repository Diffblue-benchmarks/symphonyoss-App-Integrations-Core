package com.symphony.security.helper;

import com.symphony.security.exceptions.CiphertextTransportVersionException;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClientCryptoHandlerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test:
   * {@link ClientCryptoHandler#encryptMsg(byte[], KeyIdentifier, byte[], byte)}
   */
  @Test
  public void testEncryptMsg() throws CiphertextTransportVersionException, SymphonyEncryptionException,
      SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    ClientCryptoHandler clientCryptoHandler = new ClientCryptoHandler();
    byte[] key = "AXAXAXAX".getBytes("UTF-8");
    KeyIdentifier keyId = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L);

    // Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    clientCryptoHandler.encryptMsg(key, keyId, "AXAXAXAX".getBytes("UTF-8"), (byte) 'A');
  }

  /**
   * Method under test:
   * {@link ClientCryptoHandler#encryptMsg(byte[], KeyIdentifier, byte[], byte)}
   */
  @Test
  public void testEncryptMsg2() throws CiphertextTransportVersionException, SymphonyEncryptionException,
      SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    ClientCryptoHandler clientCryptoHandler = new ClientCryptoHandler();
    byte[] key = "AXAXAXAX".getBytes("UTF-8");
    KeyIdentifier keyId = new KeyIdentifier("AXAXAXAX".getBytes("UTF-8"), 1L, 1L);

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    clientCryptoHandler.encryptMsg(key, keyId, "AXAXAXAX".getBytes("UTF-8"), (byte) 1);
  }
}
