package com.symphony.security.utils;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyPEMFormatException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.KeyPair;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.custom.djb.Curve25519;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConverterDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link Converter#bytesToChars(byte[])}.
   *
   * <p>Method under test: {@link Converter#bytesToChars(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"char[] Converter.bytesToChars(byte[])"})
  public void testBytesToChars() throws UnsupportedEncodingException {
    // Arrange and Act
    char[] actualBytesToCharsResult = Converter.bytesToChars("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertArrayEquals("AXAXAXAX".toCharArray(), actualBytesToCharsResult);
  }

  /**
   * Test {@link Converter#bytesToHex(byte[])}.
   *
   * <p>Method under test: {@link Converter#bytesToHex(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Converter.bytesToHex(byte[])"})
  public void testBytesToHex() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertEquals("4158415841584158", Converter.bytesToHex("AXAXAXAX".getBytes("UTF-8")));
  }

  /**
   * Test {@link Converter#bytesToString(byte[])}.
   *
   * <p>Method under test: {@link Converter#bytesToString(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Converter.bytesToString(byte[])"})
  public void testBytesToString() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertEquals("AXAXAXAX", Converter.bytesToString("AXAXAXAX".getBytes("UTF-8")));
  }

  /**
   * Test {@link Converter#charsToBytes(char[])}.
   *
   * <p>Method under test: {@link Converter#charsToBytes(char[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] Converter.charsToBytes(char[])"})
  public void testCharsToBytes() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertArrayEquals("AZAZ".getBytes("UTF-8"), Converter.charsToBytes("AZAZ".toCharArray()));
  }

  /**
   * Test {@link Converter#getCRLFromPem(String)}.
   *
   * <ul>
   *   <li>Then throw {@link SymphonyPEMFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getCRLFromPem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.cert.X509CRL Converter.getCRLFromPem(String)"})
  public void testGetCRLFromPem_thenThrowSymphonyPEMFormatException()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Converter.getCRLFromPem(SecurityKeyUtilsFactory.createValidX509CertificateString());
  }

  /**
   * Test {@link Converter#getCRLFromPem(String)}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getCRLFromPem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.cert.X509CRL Converter.getCRLFromPem(String)"})
  public void testGetCRLFromPem_whenCreateNonNullString_thenReturnNull()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    assertNull(Converter.getCRLFromPem(ValidateFactory.createNonNullString()));
  }

  /**
   * Test {@link Converter#getCertificateFromPem(String)}.
   *
   * <ul>
   *   <li>Then throw {@link SymphonyPEMFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getCertificateFromPem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.cert.X509Certificate Converter.getCertificateFromPem(String)"})
  public void testGetCertificateFromPem_thenThrowSymphonyPEMFormatException()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Converter.getCertificateFromPem(SecurityKeyUtilsFactory.createValidX509CertificateString());
  }

  /**
   * Test {@link Converter#getCertificateFromPem(String)}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getCertificateFromPem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.cert.X509Certificate Converter.getCertificateFromPem(String)"})
  public void testGetCertificateFromPem_whenCreateNonNullString_thenReturnNull()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    assertNull(Converter.getCertificateFromPem(ValidateFactory.createNonNullString()));
  }

  /**
   * Test {@link Converter#getCertificateRequestFromPem(String)}.
   *
   * <ul>
   *   <li>Then throw {@link SymphonyPEMFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getCertificateRequestFromPem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"PKCS10CertificationRequest Converter.getCertificateRequestFromPem(String)"})
  public void testGetCertificateRequestFromPem_thenThrowSymphonyPEMFormatException()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Converter.getCertificateRequestFromPem(
        SecurityKeyUtilsFactory.createValidX509CertificateString());
  }

  /**
   * Test {@link Converter#getCertificateRequestFromPem(String)}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getCertificateRequestFromPem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"PKCS10CertificationRequest Converter.getCertificateRequestFromPem(String)"})
  public void testGetCertificateRequestFromPem_whenCreateNonNullString_thenReturnNull()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    assertNull(Converter.getCertificateRequestFromPem(ValidateFactory.createNonNullString()));
  }

  /**
   * Test {@link Converter#getKeyFromPem(String)}.
   *
   * <ul>
   *   <li>Then throw {@link SymphonyPEMFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getKeyFromPem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.Key Converter.getKeyFromPem(String)"})
  public void testGetKeyFromPem_thenThrowSymphonyPEMFormatException()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Converter.getKeyFromPem(SecurityKeyUtilsFactory.createValidX509CertificateString());
  }

  /**
   * Test {@link Converter#getKeyFromPem(String)}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getKeyFromPem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.Key Converter.getKeyFromPem(String)"})
  public void testGetKeyFromPem_whenCreateNonNullString_thenReturnNull()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    assertNull(Converter.getKeyFromPem(ValidateFactory.createNonNullString()));
  }

  /**
   * Test {@link Converter#getPrivateKeyFromPem(String)}.
   *
   * <ul>
   *   <li>Then throw {@link SymphonyPEMFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getPrivateKeyFromPem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey Converter.getPrivateKeyFromPem(String)"})
  public void testGetPrivateKeyFromPem_thenThrowSymphonyPEMFormatException()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Converter.getPrivateKeyFromPem(SecurityKeyUtilsFactory.createValidX509CertificateString());
  }

  /**
   * Test {@link Converter#getPrivateKeyFromPem(String)}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getPrivateKeyFromPem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey Converter.getPrivateKeyFromPem(String)"})
  public void testGetPrivateKeyFromPem_whenCreateNonNullString_thenReturnNull()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    assertNull(Converter.getPrivateKeyFromPem(ValidateFactory.createNonNullString()));
  }

  /**
   * Test {@link Converter#getPublicKeyFromPKCS10CertificationRequest(PKCS10CertificationRequest)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * Converter#getPublicKeyFromPKCS10CertificationRequest(PKCS10CertificationRequest)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.security.PublicKey Converter.getPublicKeyFromPKCS10CertificationRequest(PKCS10CertificationRequest)"
  })
  public void testGetPublicKeyFromPKCS10CertificationRequest_whenNull_thenReturnNull()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    assertNull(Converter.getPublicKeyFromPKCS10CertificationRequest(null));
  }

  /**
   * Test {@link Converter#getPublicKeyFromPem(String)}.
   *
   * <ul>
   *   <li>Then throw {@link SymphonyPEMFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getPublicKeyFromPem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey Converter.getPublicKeyFromPem(String)"})
  public void testGetPublicKeyFromPem_thenThrowSymphonyPEMFormatException()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Converter.getPublicKeyFromPem(SecurityKeyUtilsFactory.createValidX509CertificateString());
  }

  /**
   * Test {@link Converter#getPublicKeyFromPem(String)}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getPublicKeyFromPem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey Converter.getPublicKeyFromPem(String)"})
  public void testGetPublicKeyFromPem_whenCreateNonNullString_thenReturnNull()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    assertNull(Converter.getPublicKeyFromPem(ValidateFactory.createNonNullString()));
  }

  /**
   * Test {@link Converter#getSubjectFromPKCS10CertificationRequest(PKCS10CertificationRequest)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * Converter#getSubjectFromPKCS10CertificationRequest(PKCS10CertificationRequest)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Converter.getSubjectFromPKCS10CertificationRequest(PKCS10CertificationRequest)"
  })
  public void testGetSubjectFromPKCS10CertificationRequest_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(Converter.getSubjectFromPKCS10CertificationRequest(null));
  }

  /**
   * Test {@link Converter#getSubjectInfoFromPemCSR(String)}.
   *
   * <ul>
   *   <li>Then throw {@link SymphonyPEMFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getSubjectInfoFromPemCSR(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"sun.security.x509.X509CertInfo Converter.getSubjectInfoFromPemCSR(String)"})
  public void testGetSubjectInfoFromPemCSR_thenThrowSymphonyPEMFormatException()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Converter.getSubjectInfoFromPemCSR(SecurityKeyUtilsFactory.createValidX509CertificateString());
  }

  /**
   * Test {@link Converter#getSubjectInfoFromPemCSR(String)}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#getSubjectInfoFromPemCSR(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"sun.security.x509.X509CertInfo Converter.getSubjectInfoFromPemCSR(String)"})
  public void testGetSubjectInfoFromPemCSR_whenCreateNonNullString_thenReturnNull()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    assertNull(Converter.getSubjectInfoFromPemCSR(ValidateFactory.createNonNullString()));
  }

  /**
   * Test {@link Converter#hexStringToBytes(String)}.
   *
   * <ul>
   *   <li>Then return array of {@code byte} with one and {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#hexStringToBytes(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] Converter.hexStringToBytes(String)"})
  public void testHexStringToBytes_thenReturnArrayOfByteWithOneAndNumberSign() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new byte[] {1, '#', 'E', 'g', -119, -85, -51, -17},
        Converter.hexStringToBytes("0123456789ABCDEF"));
  }

  /**
   * Test {@link Converter#toPemString(Object)}.
   *
   * <p>Method under test: {@link Converter#toPemString(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Converter.toPemString(Object)"})
  public void testToPemString() throws SymphonyPEMFormatException {
    // Arrange
    short[][] shortArray = new short[][] {new short[] {1, -1, 1, -1}};
    short[][] shortArray2 = new short[][] {new short[] {1, -1, 1, -1}};

    RainbowPublicKeyParameters rainbowPublicKeyParameters =
        new RainbowPublicKeyParameters(1, shortArray, shortArray2, new short[] {1, -1, 1, -1});
    KeyPair keyPair = new KeyPair(new BCRainbowPublicKey(rainbowPublicKeyParameters), null);

    // Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Converter.toPemString(keyPair);
  }

  /**
   * Test {@link Converter#toPemString(Object)}.
   *
   * <ul>
   *   <li>Then return {@code -----BEGIN EC PRIVATE KEY----- MAoCAQEEAQGgAgUA -----END EC PRIVATE
   *       KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#toPemString(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Converter.toPemString(Object)"})
  public void testToPemString_thenReturnBeginEcPrivateKeyMAoCAQEEAQGgAgUAEndEcPrivateKey()
      throws SymphonyPEMFormatException {
    // Arrange
    ECPoint ecPoint = mock(ECPoint.class);
    when(ecPoint.normalize()).thenReturn(null);
    ECDomainParameters ecDomainParameters = new ECDomainParameters(new Curve25519(), ecPoint, null);
    BigInteger valueOfResult = BigInteger.valueOf(1L);

    ECPrivateKeyParameters ecPrivateKeyParameters =
        new ECPrivateKeyParameters(valueOfResult, ecDomainParameters);
    BCDSTU4145PrivateKey bcdstu4145PrivateKey =
        new BCDSTU4145PrivateKey(ValidateFactory.createNonNullString(), ecPrivateKeyParameters);
    short[][] shortArray = new short[][] {new short[] {}};
    short[][] shortArray2 = new short[][] {new short[] {1, -1, 1, -1}};

    RainbowPublicKeyParameters rainbowPublicKeyParameters =
        new RainbowPublicKeyParameters(1, shortArray, shortArray2, new short[] {1, -1, 1, -1});
    KeyPair keyPair =
        new KeyPair(new BCRainbowPublicKey(rainbowPublicKeyParameters), bcdstu4145PrivateKey);

    // Act
    String actualToPemStringResult = Converter.toPemString(keyPair);

    // Assert
    verify(ecPoint).normalize();
    assertEquals(
        "-----BEGIN EC PRIVATE KEY-----\nMAoCAQEEAQGgAgUA\n-----END EC PRIVATE KEY-----\n",
        actualToPemStringResult);
  }

  /**
   * Test {@link Converter#toPemString(Object)}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then throw {@link SymphonyPEMFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link Converter#toPemString(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Converter.toPemString(Object)"})
  public void testToPemString_whenKey_thenThrowSymphonyPEMFormatException()
      throws SymphonyPEMFormatException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Converter.toPemString("Key");
  }
}
