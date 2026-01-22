package com.symphony.security.clientsdk.entity;

import com.diffblue.cover.annotations.InterestingTestFactory;
import com.symphony.security.exceptions.InvalidDataException;
import org.apache.commons.codec.DecoderException;

/**
 * Factory class for creating valid EntityCiphertextTransportV2 instances for testing.
 */
public class EntityCiphertextTransportV2Factory {

  /**
   * Creates a valid EntityCiphertextTransportV2 instance.
   * The entity string must start with "!" followed by base64-encoded data.
   *
   * @return a valid EntityCiphertextTransportV2 instance
   * @throws InvalidDataException if construction fails
   */
  @InterestingTestFactory
  public static EntityCiphertextTransportV2 createEntityCiphertextTransportV2()
      throws InvalidDataException, DecoderException {
    // Entity strings must start with "!" followed by base64 data
    // Creating a minimal valid entity string with proper format
    // Format: !<version>:<base64-encoded-ciphertext>
    String validEntityString = "!2:QUFBQUFBQUE="; // "!" + version + ":" + base64("AAAAAAAA")

    return new EntityCiphertextTransportV2(validEntityString);
  }
}
