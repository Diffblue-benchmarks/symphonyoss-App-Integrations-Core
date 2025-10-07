package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
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
   *   <li>When {@code Cert}.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int, Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int, Extensions)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdateExt_whenCert()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "Cert", -1, 0, (Extensions) null);
  }

  /**
   * Test {@link Crl#createCRL(String, String, int, int, Extensions)} with {@code
   * PEMEncodedRSAKeyPair}, {@code Cert}, {@code LastUpdate}, {@code NextUpdate}, {@code Ext}.
   *
   * <ul>
   *   <li>When {@code Cert}.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int, Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int, Extensions)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdateExt_whenCert2()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "Cert", 0, -1, (Extensions) null);
  }

  /**
   * Test {@link Crl#createCRL(String, String, int, int, Extensions)} with {@code
   * PEMEncodedRSAKeyPair}, {@code Cert}, {@code LastUpdate}, {@code NextUpdate}, {@code Ext}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int, Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int, Extensions)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdateExt_whenEmptyString()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("", null, 0, 0, (Extensions) null);
  }

  /**
   * Test {@link Crl#createCRL(String, String, int, int, Extensions)} with {@code
   * PEMEncodedRSAKeyPair}, {@code Cert}, {@code LastUpdate}, {@code NextUpdate}, {@code Ext}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int, Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int, Extensions)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdateExt_whenEmptyString2()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "", 0, 0, (Extensions) null);
  }

  /**
   * Test {@link Crl#createCRL(String, String, int, int, Extensions)} with {@code
   * PEMEncodedRSAKeyPair}, {@code Cert}, {@code LastUpdate}, {@code NextUpdate}, {@code Ext}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int, Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int, Extensions)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdateExt_whenNull()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(null, null, 0, 0, (Extensions) null);
  }

  /**
   * Test {@link Crl#createCRL(String, String, int, int, Extensions)} with {@code
   * PEMEncodedRSAKeyPair}, {@code Cert}, {@code LastUpdate}, {@code NextUpdate}, {@code Ext}.
   *
   * <ul>
   *   <li>When {@code secret}.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, int, int, Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, int, int, Extensions)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertLastUpdateNextUpdateExt_whenSecret()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", null, 0, 0, (Extensions) null);
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
    Crl.createCRL("", "Cert", 1, 1);
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
    Crl.createCRL("secret", "", 1, 1);
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
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "Cert", 0, -1);
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
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "Cert", -1, 0);
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
    Crl.createCRL(null, null, 0, 0);
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
    Crl.createCRL("secret", null, 0, 0);
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
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("", null, null, 0, 0);
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
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "", null, 0, 0);
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
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", null, null, 0, 0, (Extensions) null);
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
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdateExt2()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("", null, null, 0, 0, (Extensions) null);
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
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdateExt3()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "", null, 0, 0, (Extensions) null);
  }

  /**
   * Test {@link Crl#createCRL(String, String, String, int, int, Extensions)} with {@code
   * PEMEncodedRSAKeyPair}, {@code Cert}, {@code SigAlg}, {@code LastUpdate}, {@code NextUpdate},
   * {@code Ext}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, String, int, int, Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, String, int, int, Extensions)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdateExt_whenNull()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(null, null, null, 0, 0, (Extensions) null);
  }

  /**
   * Test {@link Crl#createCRL(String, String, String, int, int)} with {@code PEMEncodedRSAKeyPair},
   * {@code Cert}, {@code SigAlg}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <ul>
   *   <li>When {@code Cert}.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdate_whenCert()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "Cert", null, 0, -1);
  }

  /**
   * Test {@link Crl#createCRL(String, String, String, int, int)} with {@code PEMEncodedRSAKeyPair},
   * {@code Cert}, {@code SigAlg}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <ul>
   *   <li>When {@code Cert}.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdate_whenCert2()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "Cert", null, -1, 0);
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
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(null, null, null, 0, 0);
  }

  /**
   * Test {@link Crl#createCRL(String, String, String, int, int)} with {@code PEMEncodedRSAKeyPair},
   * {@code Cert}, {@code SigAlg}, {@code LastUpdate}, {@code NextUpdate}.
   *
   * <ul>
   *   <li>When {@code secret}.
   * </ul>
   *
   * <p>Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Crl.createCRL(String, String, String, int, int)"})
  public void testCreateCRLWithPEMEncodedRSAKeyPairCertSigAlgLastUpdateNextUpdate_whenSecret()
      throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", null, null, 0, 0);
  }
}
