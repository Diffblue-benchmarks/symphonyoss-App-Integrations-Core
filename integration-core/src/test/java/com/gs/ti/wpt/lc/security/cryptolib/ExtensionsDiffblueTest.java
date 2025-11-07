package com.gs.ti.wpt.lc.security.cryptolib;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.symphony.security.exceptions.SymphonyExtensionException;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExtensionsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link Extensions#addAuthorityInfo(boolean, String)}
   */
  @Test
  public void testAddAuthorityInfo() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addAuthorityInfo(true, "Info Access");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical,Info Access", extensions2.get("authorityInfoAccess"));
  }

  /**
   * Method under test: {@link Extensions#addAuthorityInfo(boolean, String)}
   */
  @Test
  public void testAddAuthorityInfo2() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addAuthorityInfo(false, null);
  }

  /**
   * Method under test: {@link Extensions#addAuthorityInfo(boolean, String)}
   */
  @Test
  public void testAddAuthorityInfo3() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addAuthorityInfo(true, "");
  }

  /**
   * Method under test:
   * {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}
   */
  @Test
  public void testAddAuthorityKeyID() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addAuthorityKeyID(true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, keyid:always, issuer:always", extensions2.get("authorityKeyIdentifier"));
  }

  /**
   * Method under test:
   * {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}
   */
  @Test
  public void testAddAuthorityKeyID2() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addAuthorityKeyID(false, false, false);
  }

  /**
   * Method under test:
   * {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}
   */
  @Test
  public void testAddAuthorityKeyID3() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addAuthorityKeyID(false, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("keyid:always, issuer:always", extensions2.get("authorityKeyIdentifier"));
  }

  /**
   * Method under test:
   * {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}
   */
  @Test
  public void testAddAuthorityKeyID4() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addAuthorityKeyID(true, false, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, issuer", extensions2.get("authorityKeyIdentifier"));
  }

  /**
   * Method under test:
   * {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}
   */
  @Test
  public void testAddAuthorityKeyID5() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addAuthorityKeyID(true, true, false);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, keyid", extensions2.get("authorityKeyIdentifier"));
  }

  /**
   * Method under test: {@link Extensions#addBasicConstraints(boolean, boolean)}
   */
  @Test
  public void testAddBasicConstraints() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addBasicConstraints(true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical,CA:TRUE", extensions2.get("basicConstraints"));
  }

  /**
   * Method under test: {@link Extensions#addBasicConstraints(boolean, boolean)}
   */
  @Test
  public void testAddBasicConstraints2() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addBasicConstraints(false, false);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("CA:FALSE", extensions2.get("basicConstraints"));
  }

  /**
   * Method under test:
   * {@link Extensions#addBasicConstraints(boolean, boolean, int)}
   */
  @Test
  public void testAddBasicConstraints3() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addBasicConstraints(true, true, 3);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical,CA:TRUE,pathlen:3", extensions2.get("basicConstraints"));
  }

  /**
   * Method under test:
   * {@link Extensions#addBasicConstraints(boolean, boolean, int)}
   */
  @Test
  public void testAddBasicConstraints4() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addBasicConstraints(false, false, 0);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("CA:FALSE,pathlen:0", extensions2.get("basicConstraints"));
  }

  /**
   * Method under test:
   * {@link Extensions#addBasicConstraints(boolean, boolean, int)}
   */
  @Test
  public void testAddBasicConstraints5() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addBasicConstraints(false, false, -1);
  }

  /**
   * Method under test:
   * {@link Extensions#addCRLDistributionPoint(boolean, String)}
   */
  @Test
  public void testAddCRLDistributionPoint() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addCRLDistributionPoint(true, "Distribution Points");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, Distribution Points", extensions2.get("crlDistributionPoints"));
  }

  /**
   * Method under test:
   * {@link Extensions#addCRLDistributionPoint(boolean, String)}
   */
  @Test
  public void testAddCRLDistributionPoint2() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addCRLDistributionPoint(false, null);
  }

  /**
   * Method under test:
   * {@link Extensions#addCRLDistributionPoint(boolean, String)}
   */
  @Test
  public void testAddCRLDistributionPoint3() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addCRLDistributionPoint(false, "Distribution Points");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("Distribution Points", extensions2.get("crlDistributionPoints"));
  }

  /**
   * Method under test:
   * {@link Extensions#addCRLDistributionPoint(boolean, String)}
   */
  @Test
  public void testAddCRLDistributionPoint4() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addCRLDistributionPoint(true, "");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical", extensions2.get("crlDistributionPoints"));
  }

  /**
   * Method under test: {@link Extensions#addCrlNumber(boolean, String)}
   */
  @Test
  public void testAddCrlNumber() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addCrlNumber(true, "42");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, 42", extensions2.get("crlNumber"));
  }

  /**
   * Method under test: {@link Extensions#addCrlNumber(boolean, String)}
   */
  @Test
  public void testAddCrlNumber2() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addCrlNumber(false, null);
  }

  /**
   * Method under test: {@link Extensions#addCrlNumber(boolean, String)}
   */
  @Test
  public void testAddCrlNumber3() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addCrlNumber(false, "42");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("42", extensions2.get("crlNumber"));
  }

  /**
   * Method under test: {@link Extensions#addCrlNumber(boolean, String)}
   */
  @Test
  public void testAddCrlNumber4() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addCrlNumber(true, "");
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(true, true, true, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd,"
        + " msCodeCom, msCTLSign, msEFS", extensions2.get("extendedKeyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage2() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addExtendedKeyUsage(false, false, false, false, false, false, false, false, false, false, false);
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage3() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(false, true, true, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd, msCodeCom,"
            + " msCTLSign, msEFS",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage4() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(true, false, true, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd, msCodeCom,"
        + " msCTLSign, msEFS", extensions2.get("extendedKeyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage5() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(true, true, false, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, serverAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd, msCodeCom,"
        + " msCTLSign, msEFS", extensions2.get("extendedKeyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage6() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(true, true, true, false, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, serverAuth, clientAuth, emailProtection, timeStamping, OCSPSigning, msCodeInd, msCodeCom,"
        + " msCTLSign, msEFS", extensions2.get("extendedKeyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage7() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(true, true, true, true, false, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, serverAuth, clientAuth, codeSigning, timeStamping, OCSPSigning, msCodeInd, msCodeCom,"
        + " msCTLSign, msEFS", extensions2.get("extendedKeyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage8() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(true, true, true, true, true, false, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, serverAuth, clientAuth, codeSigning, emailProtection, OCSPSigning, msCodeInd, msCodeCom,"
        + " msCTLSign, msEFS", extensions2.get("extendedKeyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage9() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(true, true, true, true, true, true, false, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, msCodeInd, msCodeCom,"
        + " msCTLSign, msEFS", extensions2.get("extendedKeyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage10() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(true, true, true, true, true, true, true, false, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeCom,"
        + " msCTLSign, msEFS", extensions2.get("extendedKeyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage11() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(true, true, true, true, true, true, true, true, false, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd,"
        + " msCTLSign, msEFS", extensions2.get("extendedKeyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage12() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(true, true, true, true, true, true, true, true, true, false, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd,"
        + " msCodeCom, msEFS", extensions2.get("extendedKeyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage13() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(true, true, true, true, true, true, true, true, true, true, false);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd,"
        + " msCodeCom, msCTLSign", extensions2.get("extendedKeyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddExtendedKeyUsage14() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(true, false, false, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd, msCodeCom, msCTLSign,"
        + " msEFS", extensions2.get("extendedKeyUsage"));
  }

  /**
   * Method under test: {@link Extensions#addInvalidityDate(boolean, String)}
   */
  @Test
  public void testAddInvalidityDate() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addInvalidityDate(true, "2020-03-01");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, 2020-03-01", extensions2.get("invalidityDate"));
  }

  /**
   * Method under test: {@link Extensions#addInvalidityDate(boolean, String)}
   */
  @Test
  public void testAddInvalidityDate2() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addInvalidityDate(false, null);
  }

  /**
   * Method under test: {@link Extensions#addInvalidityDate(boolean, String)}
   */
  @Test
  public void testAddInvalidityDate3() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addInvalidityDate(false, "2020-03-01");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("2020-03-01", extensions2.get("invalidityDate"));
  }

  /**
   * Method under test: {@link Extensions#addInvalidityDate(boolean, String)}
   */
  @Test
  public void testAddInvalidityDate4() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addInvalidityDate(true, "");
  }

  /**
   * Method under test: {@link Extensions#addIssuerAltName(boolean, String)}
   */
  @Test
  public void testAddIssuerAltName() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addIssuerAltName(true, "Issuer Alt Name");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, Issuer Alt Name", extensions2.get("issuerAltName"));
  }

  /**
   * Method under test: {@link Extensions#addIssuerAltName(boolean, String)}
   */
  @Test
  public void testAddIssuerAltName2() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addIssuerAltName(false, null);
  }

  /**
   * Method under test: {@link Extensions#addIssuerAltName(boolean, String)}
   */
  @Test
  public void testAddIssuerAltName3() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addIssuerAltName(false, "Issuer Alt Name");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("Issuer Alt Name", extensions2.get("issuerAltName"));
  }

  /**
   * Method under test: {@link Extensions#addIssuerAltName(boolean, String)}
   */
  @Test
  public void testAddIssuerAltName4() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addIssuerAltName(true, "");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical", extensions2.get("issuerAltName"));
  }

  /**
   * Method under test:
   * {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddKeyUsage() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, digitalSignature, nonRepudiation, keyEncipherment, dataEncipherment, keyAgreement, keyCertSign,"
            + " cRLSign, encipherOnly, decipherOnly",
        extensions2.get("keyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddKeyUsage2() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addKeyUsage(false, false, false, false, false, false, false, false, false, false);
  }

  /**
   * Method under test:
   * {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddKeyUsage3() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(false, true, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "digitalSignature, nonRepudiation, keyEncipherment, dataEncipherment, keyAgreement, keyCertSign, cRLSign,"
            + " encipherOnly, decipherOnly",
        extensions2.get("keyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddKeyUsage4() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, false, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, nonRepudiation, keyEncipherment, dataEncipherment, keyAgreement, keyCertSign, cRLSign,"
        + " encipherOnly, decipherOnly", extensions2.get("keyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddKeyUsage5() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, false, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, digitalSignature, keyEncipherment, dataEncipherment, keyAgreement, keyCertSign, cRLSign,"
        + " encipherOnly, decipherOnly", extensions2.get("keyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddKeyUsage6() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, true, false, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, digitalSignature, nonRepudiation, dataEncipherment, keyAgreement, keyCertSign, cRLSign,"
        + " encipherOnly, decipherOnly", extensions2.get("keyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddKeyUsage7() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, true, true, false, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, digitalSignature, nonRepudiation, keyEncipherment, keyAgreement, keyCertSign, cRLSign,"
        + " encipherOnly, decipherOnly", extensions2.get("keyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddKeyUsage8() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, true, true, true, false, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, digitalSignature, nonRepudiation, keyEncipherment, dataEncipherment, keyCertSign, cRLSign,"
        + " encipherOnly, decipherOnly", extensions2.get("keyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddKeyUsage9() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, true, true, true, true, false, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, digitalSignature, nonRepudiation, keyEncipherment, dataEncipherment, keyAgreement, cRLSign,"
        + " encipherOnly, decipherOnly", extensions2.get("keyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddKeyUsage10() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, true, true, true, true, true, false, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, digitalSignature, nonRepudiation, keyEncipherment, dataEncipherment, keyAgreement, keyCertSign,"
            + " encipherOnly, decipherOnly",
        extensions2.get("keyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddKeyUsage11() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, true, true, true, true, true, true, false, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, digitalSignature, nonRepudiation, keyEncipherment, dataEncipherment, keyAgreement, keyCertSign,"
            + " cRLSign, decipherOnly",
        extensions2.get("keyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddKeyUsage12() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, true, true, true, true, true, true, true, false);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, digitalSignature, nonRepudiation, keyEncipherment, dataEncipherment, keyAgreement, keyCertSign,"
            + " cRLSign, encipherOnly",
        extensions2.get("keyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  public void testAddKeyUsage13() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, false, false, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, keyEncipherment, dataEncipherment, keyAgreement, keyCertSign, cRLSign, encipherOnly,"
        + " decipherOnly", extensions2.get("keyUsage"));
  }

  /**
   * Method under test:
   * {@link Extensions#addNameConstraints(boolean, boolean, String, boolean, String)}
   */
  @Test
  public void testAddNameConstraints() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addNameConstraints(true, true, "42", true, "42");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, permitted;42, excluded;42", extensions2.get("nameConstraints"));
  }

  /**
   * Method under test:
   * {@link Extensions#addNameConstraints(boolean, boolean, String, boolean, String)}
   */
  @Test
  public void testAddNameConstraints2() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addNameConstraints(false, false, "42", false, "42");
  }

  /**
   * Method under test:
   * {@link Extensions#addNameConstraints(boolean, boolean, String, boolean, String)}
   */
  @Test
  public void testAddNameConstraints3() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addNameConstraints(false, true, "42", true, "42");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("permitted;42, excluded;42", extensions2.get("nameConstraints"));
  }

  /**
   * Method under test: {@link Extensions#addPolicyConstraints(boolean, int)}
   */
  @Test
  public void testAddPolicyConstraints() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addPolicyConstraints(true, 10);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, requireExplicitPolicy:10", extensions2.get("policyConstraints"));
  }

  /**
   * Method under test: {@link Extensions#addPolicyConstraints(boolean, int)}
   */
  @Test
  public void testAddPolicyConstraints2() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addPolicyConstraints(false, 0);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("requireExplicitPolicy:0", extensions2.get("policyConstraints"));
  }

  /**
   * Method under test: {@link Extensions#addPolicyConstraints(boolean, int)}
   */
  @Test
  public void testAddPolicyConstraints3() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addPolicyConstraints(false, -1);
  }

  /**
   * Method under test: {@link Extensions#addReasonCode(boolean, String)}
   */
  @Test
  public void testAddReasonCode() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addReasonCode(false, null);
  }

  /**
   * Method under test: {@link Extensions#addReasonCode(boolean, String)}
   */
  @Test
  public void testAddReasonCode2() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addReasonCode(true, "");
  }

  /**
   * Method under test: {@link Extensions#addReasonCode(boolean, String)}
   */
  @Test
  public void testAddReasonCode3() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addReasonCode(true, "42");
  }

  /**
   * Method under test: {@link Extensions#addSubjectAltName(boolean, String)}
   */
  @Test
  public void testAddSubjectAltName() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addSubjectAltName(true, "Hello from the Dreaming Spires");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, Hello from the Dreaming Spires", extensions2.get("subjectAltName"));
  }

  /**
   * Method under test: {@link Extensions#addSubjectAltName(boolean, String)}
   */
  @Test
  public void testAddSubjectAltName2() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addSubjectAltName(false, null);
  }

  /**
   * Method under test: {@link Extensions#addSubjectAltName(boolean, String)}
   */
  @Test
  public void testAddSubjectAltName3() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addSubjectAltName(false, "Hello from the Dreaming Spires");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("Hello from the Dreaming Spires", extensions2.get("subjectAltName"));
  }

  /**
   * Method under test: {@link Extensions#addSubjectAltName(boolean, String)}
   */
  @Test
  public void testAddSubjectAltName4() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addSubjectAltName(true, "");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical", extensions2.get("subjectAltName"));
  }

  /**
   * Method under test: {@link Extensions#addSubjectInfo(boolean, String)}
   */
  @Test
  public void testAddSubjectInfo() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addSubjectInfo(true, "Info Access");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical,Info Access", extensions2.get("subjectInfoAccess"));
  }

  /**
   * Method under test: {@link Extensions#addSubjectInfo(boolean, String)}
   */
  @Test
  public void testAddSubjectInfo2() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addSubjectInfo(false, null);
  }

  /**
   * Method under test: {@link Extensions#addSubjectInfo(boolean, String)}
   */
  @Test
  public void testAddSubjectInfo3() throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    (new Extensions()).addSubjectInfo(true, "");
  }

  /**
   * Method under test: {@link Extensions#addSubjectKeyID(boolean)}
   */
  @Test
  public void testAddSubjectKeyID() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addSubjectKeyID(true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, hash", extensions2.get("subjectKeyIdentifier"));
  }

  /**
   * Method under test: {@link Extensions#addSubjectKeyID(boolean)}
   */
  @Test
  public void testAddSubjectKeyID2() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addSubjectKeyID(false);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("hash", extensions2.get("subjectKeyIdentifier"));
  }

  /**
   * Method under test: {@link Extensions#createArrayExt()}
   */
  @Test
  public void testCreateArrayExt() {
    // Arrange, Act and Assert
    assertNull((new Extensions()).createArrayExt());
  }

  /**
   * Method under test: {@link Extensions#createArrayExt()}
   */
  @Test
  public void testCreateArrayExt2() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();
    extensions.addBasicConstraints(true, true, 3);

    // Act and Assert
    assertArrayEquals(new String[]{"basicConstraints=critical,CA:TRUE,pathlen:3"}, extensions.createArrayExt());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link Extensions}
   *   <li>{@link Extensions#getCrlExt()}
   *   <li>{@link Extensions#getCrtExt()}
   *   <li>{@link Extensions#getExtensions()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    Extensions actualExtensions = new Extensions();
    String[] actualCrlExt = actualExtensions.getCrlExt();
    String[] actualCrtExt = actualExtensions.getCrtExt();

    // Assert
    assertTrue(actualExtensions.getExtensions().isEmpty());
    assertArrayEquals(new String[]{"CRLReason", "CRLReason", "invalidityDate"}, actualCrlExt);
    assertArrayEquals(new String[]{"basicConstraints", "keyUsage", "extendedKeyUsage", "subjectKeyIdentifier",
        "subjectInfoAccess", "crlDistributionPoints", "subjectAltName", "policyConstraints", "nameConstraints"},
        actualCrtExt);
  }
}
