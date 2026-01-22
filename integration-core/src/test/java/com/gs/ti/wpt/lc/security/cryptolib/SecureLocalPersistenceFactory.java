package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.InterestingTestFactory;
import com.symphony.security.exceptions.SymphonyInputException;
import com.symphony.security.exceptions.SymphonyNativeException;
import java.io.File;
import java.io.IOException;

/**
 * Factory class for creating valid SecureLocalPersistence instances for testing.
 */
public class SecureLocalPersistenceFactory {

  /**
   * Creates a valid SecureLocalPersistence instance with a temporary directory.
   *
   * @return a valid SecureLocalPersistence instance
   * @throws SymphonyInputException if construction fails
   */
  @InterestingTestFactory
  public static SecureLocalPersistence createSecureLocalPersistence()
      throws SymphonyInputException {
    // Create a temporary directory for testing
    try {
      File tempDir = File.createTempFile("secure-persist-", "-test");
      tempDir.delete(); // Delete the file
      tempDir.mkdir(); // Create as directory
      tempDir.deleteOnExit(); // Clean up on exit

      // Create a hex-encoded key string (64 hex chars = 32 bytes)
      String keyHex = "0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef";

      // Convert path to byte array as required by the constructor
      byte[] pathBytes = tempDir.getAbsolutePath().getBytes("UTF-8");

      return new SecureLocalPersistence(pathBytes, keyHex);
    } catch (IOException e) {
      throw new SymphonyInputException("Failed to create temporary directory for testing", e);
    } catch (SymphonyNativeException e) {
      throw new SymphonyInputException("Failed to initialize SecureLocalPersistence", e);
    }
  }
}
