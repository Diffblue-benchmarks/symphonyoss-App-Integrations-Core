package com.gs.ti.wpt.lc.security.cryptolib;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyExtensionException;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExtensionsDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link Extensions#addAuthorityInfo(boolean, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addAuthorityInfo(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addAuthorityInfo(boolean, String)"})
  public void testAddAuthorityInfo_whenEmptyString_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addAuthorityInfo(true, "");
  }

  /**
   * Test {@link Extensions#addAuthorityInfo(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addAuthorityInfo(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addAuthorityInfo(boolean, String)"})
  public void testAddAuthorityInfo_whenFalse_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addAuthorityInfo(false, null);
  }

  /**
   * Test {@link Extensions#addAuthorityInfo(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code Info Access}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addAuthorityInfo(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addAuthorityInfo(boolean, String)"})
  public void testAddAuthorityInfo_whenInfoAccess_thenExtensionsExtensionsSizeIsOne()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}.
   *
   * <p>Method under test: {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addAuthorityKeyID(boolean, boolean, boolean)"})
  public void testAddAuthorityKeyID() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addAuthorityKeyID(true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, keyid:always, issuer:always", extensions2.get("authorityKeyIdentifier"));
  }

  /**
   * Test {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}.
   *
   * <p>Method under test: {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addAuthorityKeyID(boolean, boolean, boolean)"})
  public void testAddAuthorityKeyID2() throws SymphonyExtensionException {
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
   * Test {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}.
   *
   * <p>Method under test: {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addAuthorityKeyID(boolean, boolean, boolean)"})
  public void testAddAuthorityKeyID3() throws SymphonyExtensionException {
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
   * Test {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}.
   *
   * <p>Method under test: {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addAuthorityKeyID(boolean, boolean, boolean)"})
  public void testAddAuthorityKeyID4() throws SymphonyExtensionException {
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
   * Test {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addAuthorityKeyID(boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addAuthorityKeyID(boolean, boolean, boolean)"})
  public void testAddAuthorityKeyID_whenFalse_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addAuthorityKeyID(false, false, false);
  }

  /**
   * Test {@link Extensions#addBasicConstraints(boolean, boolean)} with {@code crit}, {@code ca}.
   *
   * <p>Method under test: {@link Extensions#addBasicConstraints(boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addBasicConstraints(boolean, boolean)"})
  public void testAddBasicConstraintsWithCritCa() throws SymphonyExtensionException {
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
   * Test {@link Extensions#addBasicConstraints(boolean, boolean)} with {@code crit}, {@code ca}.
   *
   * <p>Method under test: {@link Extensions#addBasicConstraints(boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addBasicConstraints(boolean, boolean)"})
  public void testAddBasicConstraintsWithCritCa2() throws SymphonyExtensionException {
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
   * Test {@link Extensions#addBasicConstraints(boolean, boolean, int)} with {@code crit}, {@code
   * ca}, {@code pathLen}.
   *
   * <p>Method under test: {@link Extensions#addBasicConstraints(boolean, boolean, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addBasicConstraints(boolean, boolean, int)"})
  public void testAddBasicConstraintsWithCritCaPathLen() throws SymphonyExtensionException {
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
   * Test {@link Extensions#addBasicConstraints(boolean, boolean, int)} with {@code crit}, {@code
   * ca}, {@code pathLen}.
   *
   * <p>Method under test: {@link Extensions#addBasicConstraints(boolean, boolean, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addBasicConstraints(boolean, boolean, int)"})
  public void testAddBasicConstraintsWithCritCaPathLen2() throws SymphonyExtensionException {
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
   * Test {@link Extensions#addBasicConstraints(boolean, boolean, int)} with {@code crit}, {@code
   * ca}, {@code pathLen}.
   *
   * <ul>
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addBasicConstraints(boolean, boolean, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addBasicConstraints(boolean, boolean, int)"})
  public void testAddBasicConstraintsWithCritCaPathLen_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addBasicConstraints(false, false, -1);
  }

  /**
   * Test {@link Extensions#addCRLDistributionPoint(boolean, String)}.
   *
   * <p>Method under test: {@link Extensions#addCRLDistributionPoint(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addCRLDistributionPoint(boolean, String)"})
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
   * Test {@link Extensions#addCRLDistributionPoint(boolean, String)}.
   *
   * <p>Method under test: {@link Extensions#addCRLDistributionPoint(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addCRLDistributionPoint(boolean, String)"})
  public void testAddCRLDistributionPoint2() throws SymphonyExtensionException {
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
   * Test {@link Extensions#addCRLDistributionPoint(boolean, String)}.
   *
   * <p>Method under test: {@link Extensions#addCRLDistributionPoint(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addCRLDistributionPoint(boolean, String)"})
  public void testAddCRLDistributionPoint3() throws SymphonyExtensionException {
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
   * Test {@link Extensions#addCRLDistributionPoint(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addCRLDistributionPoint(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addCRLDistributionPoint(boolean, String)"})
  public void testAddCRLDistributionPoint_whenNull_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addCRLDistributionPoint(false, null);
  }

  /**
   * Test {@link Extensions#addCrlNumber(boolean, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addCrlNumber(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addCrlNumber(boolean, String)"})
  public void testAddCrlNumber_whenEmptyString_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addCrlNumber(true, "");
  }

  /**
   * Test {@link Extensions#addCrlNumber(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then {@link Extensions} (default constructor) Extensions {@code crlNumber} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addCrlNumber(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addCrlNumber(boolean, String)"})
  public void testAddCrlNumber_whenFalse_thenExtensionsExtensionsCrlNumberIs42()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addCrlNumber(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addCrlNumber(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addCrlNumber(boolean, String)"})
  public void testAddCrlNumber_whenNull_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addCrlNumber(false, null);
  }

  /**
   * Test {@link Extensions#addCrlNumber(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions {@code crlNumber} is {@code
   *       critical, 42}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addCrlNumber(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addCrlNumber(boolean, String)"})
  public void testAddCrlNumber_whenTrue_thenExtensionsExtensionsCrlNumberIsCritical42()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenFalse_thenExtensionsExtensionsSizeIsOne()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(
        false, true, true, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd, msCodeCom,"
            + " msCTLSign, msEFS",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenFalse_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions()
        .addExtendedKeyUsage(
            false, false, false, false, false, false, false, false, false, false, false);
  }

  /**
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(
        true, true, true, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd,"
            + " msCodeCom, msCTLSign, msEFS",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne2()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(
        true, false, true, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd, msCodeCom,"
            + " msCTLSign, msEFS",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne3()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(
        true, true, false, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, serverAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd, msCodeCom,"
            + " msCTLSign, msEFS",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne4()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(
        true, true, true, false, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, serverAuth, clientAuth, emailProtection, timeStamping, OCSPSigning, msCodeInd, msCodeCom,"
            + " msCTLSign, msEFS",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne5()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(
        true, true, true, true, false, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, serverAuth, clientAuth, codeSigning, timeStamping, OCSPSigning, msCodeInd, msCodeCom,"
            + " msCTLSign, msEFS",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne6()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(
        true, true, true, true, true, false, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, serverAuth, clientAuth, codeSigning, emailProtection, OCSPSigning, msCodeInd, msCodeCom,"
            + " msCTLSign, msEFS",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne7()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(
        true, true, true, true, true, true, false, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, msCodeInd, msCodeCom,"
            + " msCTLSign, msEFS",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne8()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(
        true, true, true, true, true, true, true, false, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeCom,"
            + " msCTLSign, msEFS",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne9()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(
        true, true, true, true, true, true, true, true, false, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd,"
            + " msCTLSign, msEFS",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne10()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(
        true, true, true, true, true, true, true, true, true, false, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd,"
            + " msCodeCom, msEFS",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne11()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(
        true, true, true, true, true, true, true, true, true, true, false);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, serverAuth, clientAuth, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd,"
            + " msCodeCom, msCTLSign",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Test {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addExtendedKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addExtendedKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddExtendedKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne12()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addExtendedKeyUsage(
        true, false, false, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, codeSigning, emailProtection, timeStamping, OCSPSigning, msCodeInd, msCodeCom, msCTLSign,"
            + " msEFS",
        extensions2.get("extendedKeyUsage"));
  }

  /**
   * Test {@link Extensions#addInvalidityDate(boolean, String)}.
   *
   * <ul>
   *   <li>Then {@link Extensions} (default constructor) Extensions {@code invalidityDate} is {@code
   *       critical, 2020-03-01}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addInvalidityDate(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addInvalidityDate(boolean, String)"})
  public void testAddInvalidityDate_thenExtensionsExtensionsInvalidityDateIsCritical20200301()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addInvalidityDate(boolean, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addInvalidityDate(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addInvalidityDate(boolean, String)"})
  public void testAddInvalidityDate_whenEmptyString_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addInvalidityDate(true, "");
  }

  /**
   * Test {@link Extensions#addInvalidityDate(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then {@link Extensions} (default constructor) Extensions {@code invalidityDate} is {@code
   *       2020-03-01}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addInvalidityDate(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addInvalidityDate(boolean, String)"})
  public void testAddInvalidityDate_whenFalse_thenExtensionsExtensionsInvalidityDateIs20200301()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addInvalidityDate(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addInvalidityDate(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addInvalidityDate(boolean, String)"})
  public void testAddInvalidityDate_whenNull_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addInvalidityDate(false, null);
  }

  /**
   * Test {@link Extensions#addIssuerAltName(boolean, String)}.
   *
   * <p>Method under test: {@link Extensions#addIssuerAltName(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addIssuerAltName(boolean, String)"})
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
   * Test {@link Extensions#addIssuerAltName(boolean, String)}.
   *
   * <ul>
   *   <li>Then {@link Extensions} (default constructor) Extensions {@code issuerAltName} is {@code
   *       critical}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addIssuerAltName(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addIssuerAltName(boolean, String)"})
  public void testAddIssuerAltName_thenExtensionsExtensionsIssuerAltNameIsCritical()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addIssuerAltName(boolean, String)}.
   *
   * <ul>
   *   <li>Then {@link Extensions} (default constructor) Extensions {@code issuerAltName} is {@code
   *       Issuer Alt Name}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addIssuerAltName(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addIssuerAltName(boolean, String)"})
  public void testAddIssuerAltName_thenExtensionsExtensionsIssuerAltNameIsIssuerAltName()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addIssuerAltName(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addIssuerAltName(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addIssuerAltName(boolean, String)"})
  public void testAddIssuerAltName_whenNull_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addIssuerAltName(false, null);
  }

  /**
   * Test {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddKeyUsage_whenFalse_thenExtensionsExtensionsSizeIsOne()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddKeyUsage_whenFalse_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions()
        .addKeyUsage(false, false, false, false, false, false, false, false, false, false);
  }

  /**
   * Test {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne2()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, false, true, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, nonRepudiation, keyEncipherment, dataEncipherment, keyAgreement, keyCertSign, cRLSign,"
            + " encipherOnly, decipherOnly",
        extensions2.get("keyUsage"));
  }

  /**
   * Test {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne3()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, false, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, digitalSignature, keyEncipherment, dataEncipherment, keyAgreement, keyCertSign, cRLSign,"
            + " encipherOnly, decipherOnly",
        extensions2.get("keyUsage"));
  }

  /**
   * Test {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne4()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, true, false, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, digitalSignature, nonRepudiation, dataEncipherment, keyAgreement, keyCertSign, cRLSign,"
            + " encipherOnly, decipherOnly",
        extensions2.get("keyUsage"));
  }

  /**
   * Test {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne5()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, true, true, false, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, digitalSignature, nonRepudiation, keyEncipherment, keyAgreement, keyCertSign, cRLSign,"
            + " encipherOnly, decipherOnly",
        extensions2.get("keyUsage"));
  }

  /**
   * Test {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne6()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, true, true, true, false, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, digitalSignature, nonRepudiation, keyEncipherment, dataEncipherment, keyCertSign, cRLSign,"
            + " encipherOnly, decipherOnly",
        extensions2.get("keyUsage"));
  }

  /**
   * Test {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne7()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, true, true, true, true, true, false, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, digitalSignature, nonRepudiation, keyEncipherment, dataEncipherment, keyAgreement, cRLSign,"
            + " encipherOnly, decipherOnly",
        extensions2.get("keyUsage"));
  }

  /**
   * Test {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne8()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne9()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne10()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addKeyUsage(boolean, boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean, boolean, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addKeyUsage(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  public void testAddKeyUsage_whenTrue_thenExtensionsExtensionsSizeIsOne11()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addKeyUsage(true, false, false, true, true, true, true, true, true, true);

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals(
        "critical, keyEncipherment, dataEncipherment, keyAgreement, keyCertSign, cRLSign, encipherOnly,"
            + " decipherOnly",
        extensions2.get("keyUsage"));
  }

  /**
   * Test {@link Extensions#addNameConstraints(boolean, boolean, String, boolean, String)}.
   *
   * <p>Method under test: {@link Extensions#addNameConstraints(boolean, boolean, String, boolean,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addNameConstraints(boolean, boolean, String, boolean, String)"
  })
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
   * Test {@link Extensions#addNameConstraints(boolean, boolean, String, boolean, String)}.
   *
   * <p>Method under test: {@link Extensions#addNameConstraints(boolean, boolean, String, boolean,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addNameConstraints(boolean, boolean, String, boolean, String)"
  })
  public void testAddNameConstraints2() throws SymphonyExtensionException {
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
   * Test {@link Extensions#addNameConstraints(boolean, boolean, String, boolean, String)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addNameConstraints(boolean, boolean, String, boolean,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.addNameConstraints(boolean, boolean, String, boolean, String)"
  })
  public void testAddNameConstraints_whenFalse_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addNameConstraints(false, false, "42", false, "42");
  }

  /**
   * Test {@link Extensions#addPolicyConstraints(boolean, int)}.
   *
   * <p>Method under test: {@link Extensions#addPolicyConstraints(boolean, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addPolicyConstraints(boolean, int)"})
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
   * Test {@link Extensions#addPolicyConstraints(boolean, int)}.
   *
   * <p>Method under test: {@link Extensions#addPolicyConstraints(boolean, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addPolicyConstraints(boolean, int)"})
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
   * Test {@link Extensions#addPolicyConstraints(boolean, int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addPolicyConstraints(boolean, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addPolicyConstraints(boolean, int)"})
  public void testAddPolicyConstraints_whenMinusOne_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addPolicyConstraints(false, -1);
  }

  /**
   * Test {@link Extensions#addReasonCode(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code 1}.
   *   <li>Then {@link Extensions} (default constructor) Extensions {@code CRLReason} is {@code 1}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addReasonCode(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addReasonCode(boolean, String)"})
  public void testAddReasonCode_when1_thenExtensionsExtensionsCRLReasonIs1()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addReasonCode(false, "1");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("1", extensions2.get("CRLReason"));
  }

  /**
   * Test {@link Extensions#addReasonCode(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code 1}.
   *   <li>Then {@link Extensions} (default constructor) Extensions {@code CRLReason} is {@code
   *       critical, 1}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addReasonCode(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addReasonCode(boolean, String)"})
  public void testAddReasonCode_when1_thenExtensionsExtensionsCRLReasonIsCritical1()
      throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();

    // Act
    extensions.addReasonCode(true, "1");

    // Assert
    HashMap<String, String> extensions2 = extensions.getExtensions();
    assertEquals(1, extensions2.size());
    assertEquals("critical, 1", extensions2.get("CRLReason"));
  }

  /**
   * Test {@link Extensions#addReasonCode(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code -1}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addReasonCode(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addReasonCode(boolean, String)"})
  public void testAddReasonCode_when1_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addReasonCode(false, "-1");
  }

  /**
   * Test {@link Extensions#addReasonCode(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addReasonCode(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addReasonCode(boolean, String)"})
  public void testAddReasonCode_when42_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addReasonCode(true, "42");
  }

  /**
   * Test {@link Extensions#addReasonCode(boolean, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addReasonCode(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addReasonCode(boolean, String)"})
  public void testAddReasonCode_whenEmptyString_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addReasonCode(true, "");
  }

  /**
   * Test {@link Extensions#addReasonCode(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addReasonCode(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addReasonCode(boolean, String)"})
  public void testAddReasonCode_whenNull_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addReasonCode(false, null);
  }

  /**
   * Test {@link Extensions#addSubjectAltName(boolean, String)}.
   *
   * <p>Method under test: {@link Extensions#addSubjectAltName(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addSubjectAltName(boolean, String)"})
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
   * Test {@link Extensions#addSubjectAltName(boolean, String)}.
   *
   * <p>Method under test: {@link Extensions#addSubjectAltName(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addSubjectAltName(boolean, String)"})
  public void testAddSubjectAltName2() throws SymphonyExtensionException {
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
   * Test {@link Extensions#addSubjectAltName(boolean, String)}.
   *
   * <ul>
   *   <li>Then {@link Extensions} (default constructor) Extensions {@code subjectAltName} is {@code
   *       critical}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addSubjectAltName(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addSubjectAltName(boolean, String)"})
  public void testAddSubjectAltName_thenExtensionsExtensionsSubjectAltNameIsCritical()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addSubjectAltName(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addSubjectAltName(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addSubjectAltName(boolean, String)"})
  public void testAddSubjectAltName_whenNull_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addSubjectAltName(false, null);
  }

  /**
   * Test {@link Extensions#addSubjectInfo(boolean, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addSubjectInfo(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addSubjectInfo(boolean, String)"})
  public void testAddSubjectInfo_whenEmptyString_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addSubjectInfo(true, "");
  }

  /**
   * Test {@link Extensions#addSubjectInfo(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link SymphonyExtensionException}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addSubjectInfo(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addSubjectInfo(boolean, String)"})
  public void testAddSubjectInfo_whenFalse_thenThrowSymphonyExtensionException()
      throws SymphonyExtensionException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyExtensionException.class);
    new Extensions().addSubjectInfo(false, null);
  }

  /**
   * Test {@link Extensions#addSubjectInfo(boolean, String)}.
   *
   * <ul>
   *   <li>When {@code Info Access}.
   *   <li>Then {@link Extensions} (default constructor) Extensions size is one.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addSubjectInfo(boolean, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addSubjectInfo(boolean, String)"})
  public void testAddSubjectInfo_whenInfoAccess_thenExtensionsExtensionsSizeIsOne()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addSubjectKeyID(boolean)}.
   *
   * <ul>
   *   <li>Then {@link Extensions} (default constructor) Extensions {@code subjectKeyIdentifier} is
   *       {@code critical, hash}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addSubjectKeyID(boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addSubjectKeyID(boolean)"})
  public void testAddSubjectKeyID_thenExtensionsExtensionsSubjectKeyIdentifierIsCriticalHash()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#addSubjectKeyID(boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then {@link Extensions} (default constructor) Extensions {@code subjectKeyIdentifier} is
   *       {@code hash}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#addSubjectKeyID(boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Extensions.addSubjectKeyID(boolean)"})
  public void testAddSubjectKeyID_whenFalse_thenExtensionsExtensionsSubjectKeyIdentifierIsHash()
      throws SymphonyExtensionException {
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
   * Test {@link Extensions#createArrayExt()}.
   *
   * <p>Method under test: {@link Extensions#createArrayExt()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String[] Extensions.createArrayExt()"})
  public void testCreateArrayExt() throws SymphonyExtensionException {
    // Arrange
    Extensions extensions = new Extensions();
    extensions.addBasicConstraints(true, true, 3);

    // Act and Assert
    assertArrayEquals(
        new String[] {"basicConstraints=critical,CA:TRUE,pathlen:3"}, extensions.createArrayExt());
  }

  /**
   * Test {@link Extensions#createArrayExt()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Extensions#createArrayExt()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String[] Extensions.createArrayExt()"})
  public void testCreateArrayExt_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new Extensions().createArrayExt());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Extensions}
   *   <li>{@link Extensions#getCrlExt()}
   *   <li>{@link Extensions#getCrtExt()}
   *   <li>{@link Extensions#getExtensions()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Extensions.<init>()",
    "String[] Extensions.getCrlExt()",
    "String[] Extensions.getCrtExt()",
    "HashMap Extensions.getExtensions()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    Extensions actualExtensions = new Extensions();
    String[] actualCrlExt = actualExtensions.getCrlExt();
    String[] actualCrtExt = actualExtensions.getCrtExt();

    // Assert
    assertTrue(actualExtensions.getExtensions().isEmpty());
    assertArrayEquals(new String[] {"CRLReason", "CRLReason", "invalidityDate"}, actualCrlExt);
    assertArrayEquals(
        new String[] {
          "basicConstraints",
          "keyUsage",
          "extendedKeyUsage",
          "subjectKeyIdentifier",
          "subjectInfoAccess",
          "crlDistributionPoints",
          "subjectAltName",
          "policyConstraints",
          "nameConstraints"
        },
        actualCrtExt);
  }
}
