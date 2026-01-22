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
    // Creating a valid entity string with sufficient data to avoid ArrayIndexOutOfBoundsException
    // The format needs enough base64 data for the constructor to parse properly
    // Based on the error at line 66 (Arrays.copyOfRange), we need more data
    String validEntityString = "!2:QUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUE=";

    return new EntityCiphertextTransportV2(validEntityString);
  }
}
