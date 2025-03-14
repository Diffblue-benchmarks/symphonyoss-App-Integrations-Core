package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import com.symphony.security.exceptions.SymphonyPEMFormatException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RSADiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link RSA#Decrypt(String, byte[], int)}.
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#Decrypt(String, byte[], int)}
   */
  @Test
  @MethodsUnderTest({"byte[] RSA.Decrypt(String, byte[], int)"})
  public void testDecrypt_whenAxaxaxaxBytesIsUtf8() throws SymphonyEncryptionException, SymphonyInputException,
      SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Decrypt("RSAPrivate Key PEM", "AXAXAXAX".getBytes("UTF-8"), -1);
  }

  /**
   * Test {@link RSA#Decrypt(String, byte[], int)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#Decrypt(String, byte[], int)}
   */
  @Test
  @MethodsUnderTest({"byte[] RSA.Decrypt(String, byte[], int)"})
  public void testDecrypt_whenNull() throws SymphonyEncryptionException, SymphonyInputException,
      SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Decrypt(null, null, 0);
  }

  /**
   * Test {@link RSA#Decrypt(String, byte[], int)}.
   * <ul>
   *   <li>When {@code RSAPrivate Key PEM}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#Decrypt(String, byte[], int)}
   */
  @Test
  @MethodsUnderTest({"byte[] RSA.Decrypt(String, byte[], int)"})
  public void testDecrypt_whenRSAPrivateKeyPem() throws SymphonyEncryptionException, SymphonyInputException,
      SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Decrypt("RSAPrivate Key PEM", null, 0);
  }

  /**
   * Test {@link RSA#Encrypt(String, byte[], int)}.
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#Encrypt(String, byte[], int)}
   */
  @Test
  @MethodsUnderTest({"byte[] RSA.Encrypt(String, byte[], int)"})
  public void testEncrypt_whenAxaxaxaxBytesIsUtf8() throws SymphonyEncryptionException, SymphonyInputException,
      SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Encrypt("-----BEGIN PUBLIC KEY-----", "AXAXAXAX".getBytes("UTF-8"), -1);
  }

  /**
   * Test {@link RSA#Encrypt(String, byte[], int)}.
   * <ul>
   *   <li>When {@code -----BEGIN PUBLIC KEY-----}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#Encrypt(String, byte[], int)}
   */
  @Test
  @MethodsUnderTest({"byte[] RSA.Encrypt(String, byte[], int)"})
  public void testEncrypt_whenBeginPublicKey() throws SymphonyEncryptionException, SymphonyInputException,
      SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Encrypt("-----BEGIN PUBLIC KEY-----", null, 0);
  }

  /**
   * Test {@link RSA#Encrypt(String, byte[], int)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#Encrypt(String, byte[], int)}
   */
  @Test
  @MethodsUnderTest({"byte[] RSA.Encrypt(String, byte[], int)"})
  public void testEncrypt_whenNull() throws SymphonyEncryptionException, SymphonyInputException,
      SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Encrypt(null, null, 0);
  }

  /**
   * Test {@link RSA#freeRSAKeyPair(long)}.
   * <p>
   * Method under test: {@link RSA#freeRSAKeyPair(long)}
   */
  @Test
  @MethodsUnderTest({"void RSA.freeRSAKeyPair(long)"})
  public void testFreeRSAKeyPair() throws SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.freeRSAKeyPair(0L);
  }

  /**
   * Test {@link RSA#GenerateKey(byte[], int)}.
   * <ul>
   *   <li>When empty array of {@code byte}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#GenerateKey(byte[], int)}
   */
  @Test
  @MethodsUnderTest({"String RSA.GenerateKey(byte[], int)"})
  public void testGenerateKey_whenEmptyArrayOfByte()
      throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.GenerateKey(new byte[]{}, 3);
  }

  /**
   * Test {@link RSA#GenerateKey(byte[], int)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#GenerateKey(byte[], int)}
   */
  @Test
  @MethodsUnderTest({"String RSA.GenerateKey(byte[], int)"})
  public void testGenerateKey_whenNull()
      throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.GenerateKey(null, 3);
  }

  /**
   * Test {@link RSA#getPublicKey(String)}.
   * <p>
   * Method under test: {@link RSA#getPublicKey(String)}
   */
  @Test
  @MethodsUnderTest({"String RSA.getPublicKey(String)"})
  public void testGetPublicKey()
      throws SymphonyInputException, SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.getPublicKey(null);
  }

  /**
   * Test {@link RSA#mallocRSAKeyPairFromPem(String)}.
   * <p>
   * Method under test: {@link RSA#mallocRSAKeyPairFromPem(String)}
   */
  @Test
  @MethodsUnderTest({"long RSA.mallocRSAKeyPairFromPem(String)"})
  public void testMallocRSAKeyPairFromPem()
      throws SymphonyInputException, SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.mallocRSAKeyPairFromPem(null);
  }

  /**
   * Test {@link RSA#serializeRSAPubKey(long)}.
   * <p>
   * Method under test: {@link RSA#serializeRSAPubKey(long)}
   */
  @Test
  @MethodsUnderTest({"String RSA.serializeRSAPubKey(long)"})
  public void testSerializeRSAPubKey() throws SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.serializeRSAPubKey(0L);
  }

  /**
   * Test {@link RSA#Sign(String, byte[], int)}.
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#Sign(String, byte[], int)}
   */
  @Test
  @MethodsUnderTest({"byte[] RSA.Sign(String, byte[], int)"})
  public void testSign_whenAxaxaxaxBytesIsUtf8() throws SymphonyEncryptionException, SymphonyInputException,
      SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Sign("RSAPrivate Key PEM", "AXAXAXAX".getBytes("UTF-8"), -1);
  }

  /**
   * Test {@link RSA#Sign(String, byte[], int)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#Sign(String, byte[], int)}
   */
  @Test
  @MethodsUnderTest({"byte[] RSA.Sign(String, byte[], int)"})
  public void testSign_whenNull() throws SymphonyEncryptionException, SymphonyInputException,
      SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Sign(null, null, 0);
  }

  /**
   * Test {@link RSA#Sign(String, byte[], int)}.
   * <ul>
   *   <li>When {@code RSAPrivate Key PEM}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#Sign(String, byte[], int)}
   */
  @Test
  @MethodsUnderTest({"byte[] RSA.Sign(String, byte[], int)"})
  public void testSign_whenRSAPrivateKeyPem() throws SymphonyEncryptionException, SymphonyInputException,
      SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Sign("RSAPrivate Key PEM", null, 0);
  }

  /**
   * Test {@link RSA#Verify(String, byte[], byte[], int)}.
   * <ul>
   *   <li>When {@code A}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#Verify(String, byte[], byte[], int)}
   */
  @Test
  @MethodsUnderTest({"boolean RSA.Verify(String, byte[], byte[], int)"})
  public void testVerify_whenA() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Verify("-----BEGIN PUBLIC KEY-----", new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, 0);
  }

  /**
   * Test {@link RSA#Verify(String, byte[], byte[], int)}.
   * <ul>
   *   <li>When {@code -----BEGIN PUBLIC KEY-----}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#Verify(String, byte[], byte[], int)}
   */
  @Test
  @MethodsUnderTest({"boolean RSA.Verify(String, byte[], byte[], int)"})
  public void testVerify_whenBeginPublicKey() throws SymphonyEncryptionException, SymphonyInputException,
      SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Verify("-----BEGIN PUBLIC KEY-----", null, null, 0);
  }

  /**
   * Test {@link RSA#Verify(String, byte[], byte[], int)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RSA#Verify(String, byte[], byte[], int)}
   */
  @Test
  @MethodsUnderTest({"boolean RSA.Verify(String, byte[], byte[], int)"})
  public void testVerify_whenNull() throws SymphonyEncryptionException, SymphonyInputException,
      SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Verify(null, null, null, 0);
  }
}
