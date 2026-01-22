package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.utils.ValidateFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CrlDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link Crl#createCRL(String, String, int, int, Extensions)} with {@code
   * PEMEncodedRSAKeyPair}, {@code Cert}, {@code LastUpdate}, {@code NextUpdate}, {@code Ext}.
   *
   * <ul>
   *   <li>When {@link Extensions} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int, Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int, Extensions)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdateExt_whenExtensions()
      throws Exception {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    String Cert = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(PEMEncodedRSAKeyPair, Cert, -1, -1, new Extensions());
  }

  /**
   * Test {@link Crl#createCRL(String, String, int, int, Extensions)} with {@code
   * PEMEncodedRSAKeyPair}, {@code Cert}, {@code LastUpdate}, {@code NextUpdate}, {@code Ext}.
   *
   * <ul>
   *   <li>When zero.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int, Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int, Extensions)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdateExt_whenZero()
      throws Exception {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    String Cert = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(PEMEncodedRSAKeyPair, Cert, 0, -1, new Extensions());
  }

  /**
   * Test {@link Crl#createCRL(String, String, int, int)} with {@code PEMEncodedRSAKeyPair}, {@code
   * Cert}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdate_whenEmptyString()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("", ValidateFactory.createNonNullString(), 1, 1);
  }

  /**
   * Test {@link Crl#createCRL(String, String, int, int)} with {@code PEMEncodedRSAKeyPair}, {@code
   * Cert}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdate_whenEmptyString2()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(ValidateFactory.createNonNullString(), "", 1, 1);
  }

  /**
   * Test {@link Crl#createCRL(String, String, int, int)} with {@code PEMEncodedRSAKeyPair}, {@code
   * Cert}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdate_whenMinusOne()
      throws Exception {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(PEMEncodedRSAKeyPair, ValidateFactory.createNonNullString(), 0, -1);
  }

  /**
   * Test {@link Crl#createCRL(String, String, int, int)} with {@code PEMEncodedRSAKeyPair}, {@code
   * Cert}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdate_whenMinusOne2()
      throws Exception {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(PEMEncodedRSAKeyPair, ValidateFactory.createNonNullString(), -1, 0);
  }

  /**
   * Test {@link Crl#createCRL(String, String, int, int)} with {@code PEMEncodedRSAKeyPair}, {@code
   * Cert}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdate_whenNull()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(ValidateFactory.createNonNullString(), null, 0, 0);
  }

  /**
   * Test {@link Crl#createCRL(String, String, int, int)} with {@code PEMEncodedRSAKeyPair}, {@code
   * Cert}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdate_whenNull2()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(null, ValidateFactory.createNonNullString(), 0, 0);
  }

  /**
   * Test {@link Crl#createCRL(String, String, String, int, int)} with {@code PEMEncodedRSAKeyPair},
   * {@code Cert}, {@code SigAlg}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdate()
      throws Exception {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(PEMEncodedRSAKeyPair, "", ValidateFactory.createNonNullString(), 0, 0);
  }

  /**
   * Test {@link Crl#createCRL(String, String, String, int, int)} with {@code PEMEncodedRSAKeyPair},
   * {@code Cert}, {@code SigAlg}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdate2()
      throws Exception {
    // Arrange
    String Cert = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("", Cert, ValidateFactory.createNonNullString(), 0, 0);
  }

  /**
   * Test {@link Crl#createCRL(String, String, String, int, int, Extensions)} with {@code
   * PEMEncodedRSAKeyPair}, {@code Cert}, {@code SigAlg}, {@code LastUpdate}, {@code NextUpdate},
   * {@code Ext}.
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, String, int, int, Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, String, int, int, Extensions)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdateExt()
      throws Exception {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    String Cert = ValidateFactory.createNonNullString();
    String SigAlg = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(PEMEncodedRSAKeyPair, Cert, SigAlg, -1, -1, new Extensions());
  }

  /**
   * Test {@link Crl#createCRL(String, String, String, int, int, Extensions)} with {@code
   * PEMEncodedRSAKeyPair}, {@code Cert}, {@code SigAlg}, {@code LastUpdate}, {@code NextUpdate},
   * {@code Ext}.
   *
   * <ul>
   *   <li>When zero.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, String, int, int, Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, String, int, int, Extensions)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdateExt_whenZero()
      throws Exception {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    String Cert = ValidateFactory.createNonNullString();
    String SigAlg = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(PEMEncodedRSAKeyPair, Cert, SigAlg, 0, -1, new Extensions());
  }

  /**
   * Test {@link Crl#createCRL(String, String, String, int, int)} with {@code PEMEncodedRSAKeyPair},
   * {@code Cert}, {@code SigAlg}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdate_whenMinusOne()
      throws Exception {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    String Cert = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(PEMEncodedRSAKeyPair, Cert, ValidateFactory.createNonNullString(), 0, -1);
  }

  /**
   * Test {@link Crl#createCRL(String, String, String, int, int)} with {@code PEMEncodedRSAKeyPair},
   * {@code Cert}, {@code SigAlg}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdate_whenMinusOne2()
      throws Exception {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    String Cert = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(PEMEncodedRSAKeyPair, Cert, ValidateFactory.createNonNullString(), -1, 0);
  }

  /**
   * Test {@link Crl#createCRL(String, String, String, int, int)} with {@code PEMEncodedRSAKeyPair},
   * {@code Cert}, {@code SigAlg}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdate_whenNull()
      throws Exception {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(PEMEncodedRSAKeyPair, null, ValidateFactory.createNonNullString(), 0, 0);
  }

  /**
   * Test {@link Crl#createCRL(String, String, String, int, int)} with {@code PEMEncodedRSAKeyPair},
   * {@code Cert}, {@code SigAlg}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdate_whenNull2()
      throws Exception {
    // Arrange
    String Cert = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(null, Cert, ValidateFactory.createNonNullString(), 0, 0);
  }
}
