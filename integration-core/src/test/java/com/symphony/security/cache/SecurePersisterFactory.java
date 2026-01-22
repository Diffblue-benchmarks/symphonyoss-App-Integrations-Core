package com.symphony.security.cache;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating valid SecurePersister instances for testing.
 */
public class SecurePersisterFactory {

  /**
   * Creates a valid SecurePersister instance with an InMemoryPersister.
   * This avoids NullPointerException by providing a non-null persister.
   *
   * @return a valid SecurePersister instance
   */
  @InterestingTestFactory
  public static SecurePersister createSecurePersister() {
    IPersister persister = new InMemoryPersister();
    long keyId = 1L;
    return new SecurePersister(persister, keyId);
  }

  /**
   * Creates a valid byte array input for SecurePersister.delete method.
   * This provides a non-null byte array to avoid NullPointerException.
   *
   * @return a valid byte array
   */
  @InterestingTestFactory
  public static byte[] createDeleteInput() {
    // Provide a simple non-null byte array
    return new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
  }
}
