package com.symphony.security.clientsdk.entity;

import static org.junit.Assert.assertArrayEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import com.symphony.security.utils.ValidateFactory;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EntityCryptoHandlerDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link EntityCryptoHandler#encrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandler#encrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandler.encrypt(String, byte[])"})
  public void testEncrypt_whenCreateNonNullString_thenThrowSymphonyEncryptionException()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException,
          NoSuchAlgorithmException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandler.encrypt(
        ValidateFactory.createNonNullString(), "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandler#encrypt(String, byte[])}.
   *
   * <ul>
   *   <li>When {@code ?}.
   *   <li>Then throw {@link SymphonyEncryptionException}.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandler#encrypt(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String EntityCryptoHandler.encrypt(String, byte[])"})
  public void testEncrypt_whenQuestionMark_thenThrowSymphonyEncryptionException()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException,
          NoSuchAlgorithmException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyEncryptionException.class);
    EntityCryptoHandler.encrypt("?", "AXAXAXAX".getBytes("UTF-8"));
  }

  /**
   * Test {@link EntityCryptoHandler#getIv(String, byte[])}.
   *
   * <ul>
   *   <li>Then return array of {@code byte} with minus eighty-four and minus twenty-three.
   * </ul>
   *
   * <p>Method under test: {@link EntityCryptoHandler#getIv(String, byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] EntityCryptoHandler.getIv(String, byte[])"})
  public void testGetIv_thenReturnArrayOfByteWithMinusEightyFourAndMinusTwentyThree()
      throws UnsupportedEncodingException, NoSuchAlgorithmException {
    // Arrange and Act
    byte[] actualIv =
        EntityCryptoHandler.getIv(
            ValidateFactory.createNonNullString(), "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertArrayEquals(
        new byte[] {-84, -23, 5, -78, -73, -39, -3, 'I', ' ', -102, -66, 'R', -35, -22, 'O', -114},
        actualIv);
  }
}
