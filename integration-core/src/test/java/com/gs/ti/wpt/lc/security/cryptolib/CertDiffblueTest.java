package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyInputException;
import com.symphony.security.exceptions.SymphonyPEMFormatException;
import com.symphony.security.exceptions.SymphonySignatureException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CertDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link Cert#createCSR(String, String)}.
   *
   * <ul>
   *   <li>When {@code Cert PEM}.
   *   <li>Then throw {@link SymphonyInputException}.
   * </ul>
   *
   * <p>Method under test: {@link Cert#createCSR(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createCSR(String, String)"})
  public void testCreateCSR_whenCertPem_thenThrowSymphonyInputException()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createCSR("Cert PEM", null);
  }

  /**
   * Test {@link Cert#createCSR(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyInputException}.
   * </ul>
   *
   * <p>Method under test: {@link Cert#createCSR(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createCSR(String, String)"})
  public void testCreateCSR_whenNull_thenThrowSymphonyInputException()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createCSR(null, null);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int,
   * int)} with {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code
   * Org}, {@code CommonName}, {@code Uid}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String, String,
   * String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, String, String, String, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, null, null, null, null, null, 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int,
   * int)} with {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code
   * Org}, {@code CommonName}, {@code Uid}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String, String,
   * String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, String, String, String, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays2()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, null, null, null, null, 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int,
   * int)} with {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code
   * Org}, {@code CommonName}, {@code Uid}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String, String,
   * String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, String, String, String, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays3()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        "secret",
        null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        null,
        null,
        null,
        1,
        1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int,
   * int)} with {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code
   * Org}, {@code CommonName}, {@code Uid}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String, String,
   * String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, String, String, String, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays4()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        "secret",
        null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        null,
        null,
        1,
        1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int,
   * int)} with {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code
   * Org}, {@code CommonName}, {@code Uid}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String, String,
   * String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, String, String, String, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays5()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        "secret",
        null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        null,
        1,
        1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int,
   * int)} with {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code
   * Org}, {@code CommonName}, {@code Uid}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String, String,
   * String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, String, String, String, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays6()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        "secret",
        null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "",
        null,
        1,
        1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int,
   * int)} with {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code
   * Org}, {@code CommonName}, {@code Uid}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String, String,
   * String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, String, String, String, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays7()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        "secret",
        null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        null,
        "1234",
        1,
        1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int,
   * int)} with {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code
   * Org}, {@code CommonName}, {@code Uid}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String, String,
   * String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, String, String, String, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays8()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        "secret",
        null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        null,
        "",
        1,
        1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, String, String, int,
   * int)} with {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code
   * Org}, {@code CommonName}, {@code Uid}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String, String,
   * String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, String, String, String, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays9()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        "secret",
        null,
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1 and SerialNumber must be at least 1",
        null,
        1,
        0);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, int, String, String, String, int, int)} with {@code
   * PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code Org}, {@code
   * CommonName}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, int, String, String, String, int,
   * int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createSelfSigned(String, int, String, String, String, int, int)"})
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameValidStartingInXDaysValidForXDays()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, 10, null, null, null, 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, int, String, String, String, int, int)} with {@code
   * PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code Org}, {@code
   * CommonName}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, int, String, String, String, int,
   * int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createSelfSigned(String, int, String, String, String, int, int)"})
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameValidStartingInXDaysValidForXDays2()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", 10, null, null, null, 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, int, String, String, String, int, int)} with {@code
   * PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code Org}, {@code
   * CommonName}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, int, String, String, String, int,
   * int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createSelfSigned(String, int, String, String, String, int, int)"})
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameValidStartingInXDaysValidForXDays3()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", 10, "Coutrny Code", null, null, 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, int, String, String, String, int, int)} with {@code
   * PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code Org}, {@code
   * CommonName}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, int, String, String, String, int,
   * int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createSelfSigned(String, int, String, String, String, int, int)"})
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameValidStartingInXDaysValidForXDays4()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", 10, "Coutrny Code", "Org", null, 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, int, String, String, String, int, int)} with {@code
   * PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code Org}, {@code
   * CommonName}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, int, String, String, String, int,
   * int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createSelfSigned(String, int, String, String, String, int, int)"})
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameValidStartingInXDaysValidForXDays5()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", 10, "Coutrny Code", "Org", "", 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, int, String, String, String, int, int)} with {@code
   * PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code CoutrnyCode}, {@code Org}, {@code
   * CommonName}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, int, String, String, String, int,
   * int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createSelfSigned(String, int, String, String, String, int, int)"})
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameValidStartingInXDaysValidForXDays6()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", 10, "Coutrny Code", "Org", "Common Name", 1, 0);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, Extensions, int, int)} with
   * {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code name}, {@code ext}, {@code
   * ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, Extensions, int,
   * int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, Extensions, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameExtValidStartingInXDaysValidForXDays()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, null, "Name", (Extensions) null, 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, Extensions, int, int)} with
   * {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code name}, {@code ext}, {@code
   * ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, Extensions, int,
   * int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, Extensions, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameExtValidStartingInXDaysValidForXDays2()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", (Extensions) null, 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, Extensions, int, int)} with
   * {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code name}, {@code ext}, {@code
   * ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, Extensions, int,
   * int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, Extensions, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameExtValidStartingInXDaysValidForXDays3()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", (Extensions) null, 1, 0);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, Extensions, int, int)}
   * with {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code name}, {@code sigalg}, {@code
   * ext}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String,
   * Extensions, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, String, Extensions, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameSigalgExtValidStartingInXDaysValidForXDays()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, null, "Name", null, null, 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, Extensions, int, int)}
   * with {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code name}, {@code sigalg}, {@code
   * ext}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String,
   * Extensions, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, String, Extensions, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameSigalgExtValidStartingInXDaysValidForXDays2()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", null, null, 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, Extensions, int, int)}
   * with {@code PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code name}, {@code sigalg}, {@code
   * ext}, {@code ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String,
   * Extensions, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.createSelfSigned(String, BigInteger, String, String, Extensions, int, int)"
  })
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameSigalgExtValidStartingInXDaysValidForXDays3()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", null, null, 1, 0);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, int, int)} with {@code
   * PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code name}, {@code sigalg}, {@code
   * ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String, int,
   * int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createSelfSigned(String, BigInteger, String, String, int, int)"})
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameSigalgValidStartingInXDaysValidForXDays()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, null, "Name", (String) null, 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, int, int)} with {@code
   * PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code name}, {@code sigalg}, {@code
   * ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String, int,
   * int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createSelfSigned(String, BigInteger, String, String, int, int)"})
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameSigalgValidStartingInXDaysValidForXDays2()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", (String) null, 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, String, int, int)} with {@code
   * PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code name}, {@code sigalg}, {@code
   * ValidStartingInXDays}, {@code ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, String, int,
   * int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createSelfSigned(String, BigInteger, String, String, int, int)"})
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameSigalgValidStartingInXDaysValidForXDays3()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", (String) null, 1, 0);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, int, int)} with {@code
   * PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code name}, {@code ValidStartingInXDays}, {@code
   * ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createSelfSigned(String, BigInteger, String, int, int)"})
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameValidStartingInXDaysValidForXDays()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, null, "Name", 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, int, int)} with {@code
   * PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code name}, {@code ValidStartingInXDays}, {@code
   * ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createSelfSigned(String, BigInteger, String, int, int)"})
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameValidStartingInXDaysValidForXDays2()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", 1, 1);
  }

  /**
   * Test {@link Cert#createSelfSigned(String, BigInteger, String, int, int)} with {@code
   * PEMEncodedRSAKeyPair}, {@code SerialNumber}, {@code name}, {@code ValidStartingInXDays}, {@code
   * ValidForXDays}.
   *
   * <p>Method under test: {@link Cert#createSelfSigned(String, BigInteger, String, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.createSelfSigned(String, BigInteger, String, int, int)"})
  public void
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameValidStartingInXDaysValidForXDays3()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned("secret", null, "Name", 1, 0);
  }

  /**
   * Test {@link Cert#generateCSR(String, String)} with {@code subjectName}, {@code
   * SigningRSAKeyPairPEM}.
   *
   * <p>Method under test: {@link Cert#generateCSR(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.generateCSR(String, String)"})
  public void testGenerateCSRWithSubjectNameSigningRSAKeyPairPEM()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR("Hello from the Dreaming Spires", "Signing RSAKey Pair PEM");
  }

  /**
   * Test {@link Cert#generateCSR(String, String)} with {@code subjectName}, {@code
   * SigningRSAKeyPairPEM}.
   *
   * <p>Method under test: {@link Cert#generateCSR(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.generateCSR(String, String)"})
  public void testGenerateCSRWithSubjectNameSigningRSAKeyPairPEM2()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR("Hello from the Dreaming Spires", null);
  }

  /**
   * Test {@link Cert#generateCSR(String, String)} with {@code subjectName}, {@code
   * SigningRSAKeyPairPEM}.
   *
   * <p>Method under test: {@link Cert#generateCSR(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.generateCSR(String, String)"})
  public void testGenerateCSRWithSubjectNameSigningRSAKeyPairPEM3()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Cert.generateCSR("", "Signing RSAKey Pair PEM");
  }

  /**
   * Test {@link Cert#generateCSR(String, String, String)} with {@code subjectName}, {@code
   * SigningRSAKeyPairPEM}, {@code signatureAlgorithm}.
   *
   * <p>Method under test: {@link Cert#generateCSR(String, String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.generateCSR(String, String, String)"})
  public void testGenerateCSRWithSubjectNameSigningRSAKeyPairPEMSignatureAlgorithm()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR(
        "Hello from the Dreaming Spires", "Signing RSAKey Pair PEM", "Signature Algorithm");
  }

  /**
   * Test {@link Cert#generateCSR(String, String, String)} with {@code subjectName}, {@code
   * SigningRSAKeyPairPEM}, {@code signatureAlgorithm}.
   *
   * <p>Method under test: {@link Cert#generateCSR(String, String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.generateCSR(String, String, String)"})
  public void testGenerateCSRWithSubjectNameSigningRSAKeyPairPEMSignatureAlgorithm2()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR("Hello from the Dreaming Spires", null, null);
  }

  /**
   * Test {@link Cert#generateCSR(String, String, String)} with {@code subjectName}, {@code
   * SigningRSAKeyPairPEM}, {@code signatureAlgorithm}.
   *
   * <p>Method under test: {@link Cert#generateCSR(String, String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.generateCSR(String, String, String)"})
  public void testGenerateCSRWithSubjectNameSigningRSAKeyPairPEMSignatureAlgorithm3()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Cert.generateCSR("", "Signing RSAKey Pair PEM", "Signature Algorithm");
  }

  /**
   * Test {@link Cert#generateCSR(String, String, String)} with {@code subjectName}, {@code
   * SigningRSAKeyPairPEM}, {@code signatureAlgorithm}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Cert#generateCSR(String, String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.generateCSR(String, String, String)"})
  public void testGenerateCSRWithSubjectNameSigningRSAKeyPairPEMSignatureAlgorithm_whenNull()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR(null, null, null);
  }

  /**
   * Test {@link Cert#generateCSR(String, String)} with {@code subjectName}, {@code
   * SigningRSAKeyPairPEM}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Cert#generateCSR(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.generateCSR(String, String)"})
  public void testGenerateCSRWithSubjectNameSigningRSAKeyPairPEM_whenNull()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR(null, null);
  }

  /**
   * Test {@link Cert#getPubRSA(String)}.
   *
   * <p>Method under test: {@link Cert#getPubRSA(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.getPubRSA(String)"})
  public void testGetPubRSA()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.getPubRSA(null);
  }

  /**
   * Test {@link Cert#getReqPubKey(String)}.
   *
   * <p>Method under test: {@link Cert#getReqPubKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.getReqPubKey(String)"})
  public void testGetReqPubKey()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.getReqPubKey(null);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, BigInteger, int, int)} with {@code String},
   * {@code String}, {@code String}, {@code BigInteger}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When {@code CSRPEM}.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, BigInteger, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.signCSR(String, String, String, BigInteger, int, int)"})
  public void testSignCSRWithStringStringStringBigIntegerIntInt_whenCsrpem()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", null, null, null, 1, 1);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, BigInteger, int, int)} with {@code String},
   * {@code String}, {@code String}, {@code BigInteger}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, BigInteger, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.signCSR(String, String, String, BigInteger, int, int)"})
  public void testSignCSRWithStringStringStringBigIntegerIntInt_whenNull()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(null, null, null, null, 1, 1);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, BigInteger, int, int)} with {@code String},
   * {@code String}, {@code String}, {@code BigInteger}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When {@code Signing Cert PEM}.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, BigInteger, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.signCSR(String, String, String, BigInteger, int, int)"})
  public void testSignCSRWithStringStringStringBigIntegerIntInt_whenSigningCertPem()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", "Signing RSAKey Pair PEM", "Signing Cert PEM", null, 1, 1);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, BigInteger, int, int)} with {@code String},
   * {@code String}, {@code String}, {@code BigInteger}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When {@code Signing RSAKey Pair PEM}.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, BigInteger, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.signCSR(String, String, String, BigInteger, int, int)"})
  public void testSignCSRWithStringStringStringBigIntegerIntInt_whenSigningRSAKeyPairPem()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", "Signing RSAKey Pair PEM", null, null, 1, 1);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, BigInteger, int, int)} with {@code String},
   * {@code String}, {@code String}, {@code BigInteger}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When zero.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, BigInteger, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.signCSR(String, String, String, BigInteger, int, int)"})
  public void testSignCSRWithStringStringStringBigIntegerIntInt_whenZero()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", "Signing RSAKey Pair PEM", "Signing Cert PEM", null, 1, 0);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, BigInteger, String, Extensions, int, int)}
   * with {@code String}, {@code String}, {@code String}, {@code BigInteger}, {@code String}, {@code
   * Extensions}, {@code int}, {@code int}.
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, BigInteger, String,
   * Extensions, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.signCSR(String, String, String, BigInteger, String, Extensions, int, int)"
  })
  public void testSignCSRWithStringStringStringBigIntegerStringExtensionsIntInt()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        null,
        null,
        null,
        null,
        null,
        1,
        1);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, BigInteger, String, Extensions, int, int)}
   * with {@code String}, {@code String}, {@code String}, {@code BigInteger}, {@code String}, {@code
   * Extensions}, {@code int}, {@code int}.
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, BigInteger, String,
   * Extensions, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.signCSR(String, String, String, BigInteger, String, Extensions, int, int)"
  })
  public void testSignCSRWithStringStringStringBigIntegerStringExtensionsIntInt2()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        null,
        null,
        null,
        null,
        1,
        1);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, BigInteger, String, Extensions, int, int)}
   * with {@code String}, {@code String}, {@code String}, {@code BigInteger}, {@code String}, {@code
   * Extensions}, {@code int}, {@code int}.
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, BigInteger, String,
   * Extensions, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.signCSR(String, String, String, BigInteger, String, Extensions, int, int)"
  })
  public void testSignCSRWithStringStringStringBigIntegerStringExtensionsIntInt3()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        null,
        null,
        null,
        1,
        1);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, BigInteger, String, Extensions, int, int)}
   * with {@code String}, {@code String}, {@code String}, {@code BigInteger}, {@code String}, {@code
   * Extensions}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, BigInteger, String,
   * Extensions, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.signCSR(String, String, String, BigInteger, String, Extensions, int, int)"
  })
  public void testSignCSRWithStringStringStringBigIntegerStringExtensionsIntInt_whenNull()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(null, null, null, null, null, null, 1, 1);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, BigInteger, String, Extensions, int, int)}
   * with {@code String}, {@code String}, {@code String}, {@code BigInteger}, {@code String}, {@code
   * Extensions}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When zero.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, BigInteger, String,
   * Extensions, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Cert.signCSR(String, String, String, BigInteger, String, Extensions, int, int)"
  })
  public void testSignCSRWithStringStringStringBigIntegerStringExtensionsIntInt_whenZero()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        "can not pass null's, and ValidForXDays must be at least 1, and SerialNum must be at least 1",
        null,
        null,
        null,
        1,
        0);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, int, int, int)} with {@code String}, {@code
   * String}, {@code String}, {@code int}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When {@code CSRPEM}.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, int, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.signCSR(String, String, String, int, int, int)"})
  public void testSignCSRWithStringStringStringIntIntInt_whenCsrpem()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", null, null, 10, 1, 1);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, int, int, int)} with {@code String}, {@code
   * String}, {@code String}, {@code int}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, int, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.signCSR(String, String, String, int, int, int)"})
  public void testSignCSRWithStringStringStringIntIntInt_whenNull()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(null, null, null, 10, 1, 1);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, int, int, int)} with {@code String}, {@code
   * String}, {@code String}, {@code int}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When {@code Signing Cert PEM}.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, int, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.signCSR(String, String, String, int, int, int)"})
  public void testSignCSRWithStringStringStringIntIntInt_whenSigningCertPem()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", "Signing RSAKey Pair PEM", "Signing Cert PEM", 10, 1, 0);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, int, int, int)} with {@code String}, {@code
   * String}, {@code String}, {@code int}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When {@code Signing RSAKey Pair PEM}.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, int, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.signCSR(String, String, String, int, int, int)"})
  public void testSignCSRWithStringStringStringIntIntInt_whenSigningRSAKeyPairPem()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR("CSRPEM", "Signing RSAKey Pair PEM", null, 10, 1, 1);
  }
}
