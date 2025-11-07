package com.gs.ti.wpt.lc.security.cryptolib;

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
   * Method under test: {@link RSA#Decrypt(String, byte[], int)}
   */
  @Test
  public void testDecrypt() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Decrypt(null, null, 0);
  }

  /**
   * Method under test: {@link RSA#Decrypt(String, byte[], int)}
   */
  @Test
  public void testDecrypt2() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Decrypt("RSAPrivate Key PEM", null, 0);
  }

  /**
   * Method under test: {@link RSA#Decrypt(String, byte[], int)}
   */
  @Test
  public void testDecrypt3() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Decrypt("RSAPrivate Key PEM", "AXAXAXAX".getBytes("UTF-8"), -1);
  }

  /**
   * Method under test: {@link RSA#Encrypt(String, byte[], int)}
   */
  @Test
  public void testEncrypt() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Encrypt(null, null, 0);
  }

  /**
   * Method under test: {@link RSA#Encrypt(String, byte[], int)}
   */
  @Test
  public void testEncrypt2() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Encrypt("-----BEGIN PUBLIC KEY-----", null, 0);
  }

  /**
   * Method under test: {@link RSA#Encrypt(String, byte[], int)}
   */
  @Test
  public void testEncrypt3() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Encrypt("-----BEGIN PUBLIC KEY-----", "AXAXAXAX".getBytes("UTF-8"), -1);
  }

  /**
   * Method under test: {@link RSA#freeRSAKeyPair(long)}
   */
  @Test
  public void testFreeRSAKeyPair() throws SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.freeRSAKeyPair(0L);
  }

  /**
   * Method under test: {@link RSA#GenerateKey(byte[], int)}
   */
  @Test
  public void testGenerateKey() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.GenerateKey(null, 3);
  }

  /**
   * Method under test: {@link RSA#GenerateKey(byte[], int)}
   */
  @Test
  public void testGenerateKey2()
      throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.GenerateKey(new byte[]{}, 3);
  }

  /**
   * Method under test: {@link RSA#getPublicKey(String)}
   */
  @Test
  public void testGetPublicKey()
      throws SymphonyInputException, SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.getPublicKey(null);
  }

  /**
   * Method under test: {@link RSA#mallocRSAKeyPairFromPem(String)}
   */
  @Test
  public void testMallocRSAKeyPairFromPem()
      throws SymphonyInputException, SymphonyPEMFormatException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.mallocRSAKeyPairFromPem(null);
  }

  /**
   * Method under test: {@link RSA#serializeRSAPubKey(long)}
   */
  @Test
  public void testSerializeRSAPubKey() throws SymphonyInputException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.serializeRSAPubKey(0L);
  }

  /**
   * Method under test: {@link RSA#Sign(String, byte[], int)}
   */
  @Test
  public void testSign() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Sign(null, null, 0);
  }

  /**
   * Method under test: {@link RSA#Sign(String, byte[], int)}
   */
  @Test
  public void testSign2() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Sign("RSAPrivate Key PEM", null, 0);
  }

  /**
   * Method under test: {@link RSA#Sign(String, byte[], int)}
   */
  @Test
  public void testSign3() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Sign("RSAPrivate Key PEM", "AXAXAXAX".getBytes("UTF-8"), -1);
  }

  /**
   * Method under test: {@link RSA#Verify(String, byte[], byte[], int)}
   */
  @Test
  public void testVerify() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Verify(null, null, null, 0);
  }

  /**
   * Method under test: {@link RSA#Verify(String, byte[], byte[], int)}
   */
  @Test
  public void testVerify2() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Verify("-----BEGIN PUBLIC KEY-----", null, null, 0);
  }

  /**
   * Method under test: {@link RSA#Verify(String, byte[], byte[], int)}
   */
  @Test
  public void testVerify3() throws SymphonyEncryptionException, SymphonyInputException, SymphonyPEMFormatException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    RSA.Verify("-----BEGIN PUBLIC KEY-----", new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, null, 0);
  }
}
