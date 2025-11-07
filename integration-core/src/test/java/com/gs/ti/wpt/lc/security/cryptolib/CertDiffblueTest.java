package com.gs.ti.wpt.lc.security.cryptolib;

import com.symphony.security.exceptions.SymphonyInputException;
import com.symphony.security.exceptions.SymphonyPEMFormatException;
import com.symphony.security.exceptions.SymphonySignatureException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CertDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link Cert#createCSR(String, String)}
   */
  @Test
  public void testCreateCSR() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createCSR(null, null);
  }

  /**
   * Method under test: {@link Cert#createCSR(String, String)}
   */
  @Test
  public void testCreateCSR2() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createCSR("Cert PEM", null);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, int, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, 10, null, null, null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, int, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned2() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", 10, null, null, null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, int, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned3() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", 10, "Coutrny Code", null, null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, int, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned4() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", 10, "Coutrny Code", "Org", null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, int, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned5() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", 10, "Coutrny Code", "Org", "", 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, int, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned6() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", 10, "Coutrny Code", "Org", "Common Name", 1, 0);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned7() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, null, "Name", 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned8() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned9() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", 1, 0);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, Extensions, int, int)}
   */
  @Test
  public void testCreateSelfSigned10() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, null, "Name", (Extensions) null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, Extensions, int, int)}
   */
  @Test
  public void testCreateSelfSigned11() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", (Extensions) null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, Extensions, int, int)}
   */
  @Test
  public void testCreateSelfSigned12() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", (Extensions) null, 1, 0);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned13() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, null, "Name", (String) null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned14() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", (String) null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned15() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", (String) null, 1, 0);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, Extensions, int, int)}
   */
  @Test
  public void testCreateSelfSigned16() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, null, "Name", null, null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, Extensions, int, int)}
   */
  @Test
  public void testCreateSelfSigned17() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", null, null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, Extensions, int, int)}
   */
  @Test
  public void testCreateSelfSigned18() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", null, null, 1, 0);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned19() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, null, null, null, null, null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned20() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, null, null, null, null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned21() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1", null, null,
        null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned22() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1", null, null, 1,
        1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned23() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1", null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned24() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1", "", null, 1,
        1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned25() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1", null, "1234",
        1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned26() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1", null, "", 1,
        1);
  }

  /**
   * Method under test:
   * {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int, int)}
   */
  @Test
  public void testCreateSelfSigned27() throws SymphonyInputException, SymphonyPEMFormatException,
      SymphonySignatureException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1", null, 1, 0);
  }

  /**
   * Method under test: {@link Cert#generateCSR(String, String)}
   */
  @Test
  public void testGenerateCSR() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR("Hello from the Dreaming Spires", "Signing RSAKey Pair PEM");
  }

  /**
   * Method under test: {@link Cert#generateCSR(String, String)}
   */
  @Test
  public void testGenerateCSR2() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR(null, null);
  }

  /**
   * Method under test: {@link Cert#generateCSR(String, String)}
   */
  @Test
  public void testGenerateCSR3() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR("Hello from the Dreaming Spires", null);
  }

  /**
   * Method under test: {@link Cert#generateCSR(String, String)}
   */
  @Test
  public void testGenerateCSR4() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Cert.generateCSR("", "Signing RSAKey Pair PEM");
  }

  /**
   * Method under test: {@link Cert#generateCSR(String, String, String)}
   */
  @Test
  public void testGenerateCSR5() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR("Hello from the Dreaming Spires", "Signing RSAKey Pair PEM", "Signature Algorithm");
  }

  /**
   * Method under test: {@link Cert#generateCSR(String, String, String)}
   */
  @Test
  public void testGenerateCSR6() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR(null, null, null);
  }

  /**
   * Method under test: {@link Cert#generateCSR(String, String, String)}
   */
  @Test
  public void testGenerateCSR7() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR("Hello from the Dreaming Spires", null, null);
  }

  /**
   * Method under test: {@link Cert#generateCSR(String, String, String)}
   */
  @Test
  public void testGenerateCSR8() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Cert.generateCSR("", "Signing RSAKey Pair PEM", "Signature Algorithm");
  }

  /**
   * Method under test: {@link Cert#getPubRSA(String)}
   */
  @Test
  public void testGetPubRSA() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.getPubRSA(null);
  }

  /**
   * Method under test: {@link Cert#getReqPubKey(String)}
   */
  @Test
  public void testGetReqPubKey() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.getReqPubKey(null);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, int, int, int)}
   */
  @Test
  public void testSignCSR() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(null, null, null, 10, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, int, int, int)}
   */
  @Test
  public void testSignCSR2() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", null, null, 10, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, int, int, int)}
   */
  @Test
  public void testSignCSR3() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", "Signing RSAKey Pair PEM", null, 10, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, int, int, int)}
   */
  @Test
  public void testSignCSR4() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", "Signing RSAKey Pair PEM", "Signing Cert PEM", 10, 1, 0);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, BigInteger, int, int)}
   */
  @Test
  public void testSignCSR5() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(null, null, null, null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, BigInteger, int, int)}
   */
  @Test
  public void testSignCSR6() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", null, null, null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, BigInteger, int, int)}
   */
  @Test
  public void testSignCSR7() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", "Signing RSAKey Pair PEM", null, null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, BigInteger, int, int)}
   */
  @Test
  public void testSignCSR8() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", "Signing RSAKey Pair PEM", "Signing Cert PEM", null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, BigInteger, int, int)}
   */
  @Test
  public void testSignCSR9() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", "Signing RSAKey Pair PEM", "Signing Cert PEM", null, 1, 0);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, BigInteger, String, Extensions, int, int)}
   */
  @Test
  public void testSignCSR10() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(null, null, null, null, null, null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, BigInteger, String, Extensions, int, int)}
   */
  @Test
  public void testSignCSR11() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1", null,
        null, null, null, null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, BigInteger, String, Extensions, int, int)}
   */
  @Test
  public void testSignCSR12() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1", null, null, null,
        null, 1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, BigInteger, String, Extensions, int, int)}
   */
  @Test
  public void testSignCSR13() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1", null, null, null,
        1, 1);
  }

  /**
   * Method under test:
   * {@link Cert#signCSR(String, String, String, BigInteger, String, Extensions, int, int)}
   */
  @Test
  public void testSignCSR14() throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
      UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1", null, null, null,
        1, 0);
  }
}
