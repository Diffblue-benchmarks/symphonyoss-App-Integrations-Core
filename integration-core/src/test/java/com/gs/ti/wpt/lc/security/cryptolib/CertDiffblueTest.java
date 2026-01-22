package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyInputException;
import com.symphony.security.exceptions.SymphonyPEMFormatException;
import com.symphony.security.exceptions.SymphonySignatureException;
import com.symphony.security.utils.ValidateFactory;
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
    Cert.createCSR(ValidateFactory.createNonNullString(), null);
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
  public void testCreateCSR_whenNull_thenThrowSymphonyInputException2()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createCSR(null, ValidateFactory.createNonNullString());
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(1L);
    String CoutrnyCode = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair,
        SerialNumber,
        CoutrnyCode,
        ValidateFactory.createNonNullString(),
        "",
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
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays2()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(1L);
    String CoutrnyCode = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair,
        SerialNumber,
        CoutrnyCode,
        ValidateFactory.createNonNullString(),
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
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays3()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(1L);
    String CoutrnyCode = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair,
        SerialNumber,
        CoutrnyCode,
        ValidateFactory.createNonNullString(),
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
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays4()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(1L);

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair,
        SerialNumber,
        ValidateFactory.createNonNullString(),
        null,
        "",
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
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays5()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(1L);

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair,
        SerialNumber,
        null,
        ValidateFactory.createNonNullString(),
        "",
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
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays6()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(0L);
    String CoutrnyCode = ValidateFactory.createNonNullString();
    String Org = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair,
        SerialNumber,
        CoutrnyCode,
        Org,
        ValidateFactory.createNonNullString(),
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
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameUidValidStartingInXDaysValidForXDays7()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(0L);
    String CoutrnyCode = ValidateFactory.createNonNullString();
    String Org = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair,
        SerialNumber,
        CoutrnyCode,
        Org,
        ValidateFactory.createNonNullString(),
        "",
        1,
        -1);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(0L);
    String CoutrnyCode = ValidateFactory.createNonNullString();
    String Org = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair,
        SerialNumber,
        CoutrnyCode,
        Org,
        "",
        ValidateFactory.createNonNullString(),
        1,
        1);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    String CoutrnyCode = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair, 10, CoutrnyCode, ValidateFactory.createNonNullString(), "", 1, 1);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    String CoutrnyCode = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair, 10, CoutrnyCode, ValidateFactory.createNonNullString(), null, 1, 1);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair, 10, ValidateFactory.createNonNullString(), null, "", 1, 1);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair, 10, null, ValidateFactory.createNonNullString(), "", 1, 1);
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
    // Arrange
    String CoutrnyCode = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, 10, CoutrnyCode, ValidateFactory.createNonNullString(), "", 1, 1);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    String CoutrnyCode = ValidateFactory.createNonNullString();
    String Org = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair, 0, CoutrnyCode, Org, ValidateFactory.createNonNullString(), 1, 1);
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
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberCoutrnyCodeOrgCommonNameValidStartingInXDaysValidForXDays7()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    String CoutrnyCode = ValidateFactory.createNonNullString();
    String Org = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair, 0, CoutrnyCode, Org, ValidateFactory.createNonNullString(), 1, -1);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(1L);
    String name = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(PEMEncodedRSAKeyPair, SerialNumber, name, new Extensions(), 1, 0);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    String name = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(PEMEncodedRSAKeyPair, null, name, new Extensions(), 1, 1);
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
    // Arrange
    BigInteger SerialNumber = BigInteger.valueOf(1L);
    String name = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, SerialNumber, name, new Extensions(), 1, 1);
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
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameExtValidStartingInXDaysValidForXDays4()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(0L);
    String name = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(PEMEncodedRSAKeyPair, SerialNumber, name, new Extensions(), 1, 1);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(1L);
    String name = ValidateFactory.createNonNullString();
    String sigalg = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(PEMEncodedRSAKeyPair, SerialNumber, name, sigalg, new Extensions(), 1, 0);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    String name = ValidateFactory.createNonNullString();
    String sigalg = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(PEMEncodedRSAKeyPair, null, name, sigalg, new Extensions(), 1, 1);
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
    // Arrange
    BigInteger SerialNumber = BigInteger.valueOf(1L);
    String name = ValidateFactory.createNonNullString();
    String sigalg = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, SerialNumber, name, sigalg, new Extensions(), 1, 1);
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
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameSigalgExtValidStartingInXDaysValidForXDays4()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(0L);
    String name = ValidateFactory.createNonNullString();
    String sigalg = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(PEMEncodedRSAKeyPair, SerialNumber, name, sigalg, new Extensions(), 1, 1);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(1L);
    String name = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair, SerialNumber, name, ValidateFactory.createNonNullString(), 1, 0);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    String name = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair, null, name, ValidateFactory.createNonNullString(), 1, 1);
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
    // Arrange
    BigInteger SerialNumber = BigInteger.valueOf(1L);
    String name = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, SerialNumber, name, ValidateFactory.createNonNullString(), 1, 1);
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
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameSigalgValidStartingInXDaysValidForXDays4()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(0L);
    String name = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair, SerialNumber, name, ValidateFactory.createNonNullString(), 1, 1);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(1L);

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair, SerialNumber, ValidateFactory.createNonNullString(), 1, 0);
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
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(PEMEncodedRSAKeyPair, null, ValidateFactory.createNonNullString(), 1, 1);
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
    // Arrange
    BigInteger SerialNumber = BigInteger.valueOf(1L);

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(null, SerialNumber, ValidateFactory.createNonNullString(), 1, 1);
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
      testCreateSelfSignedWithPEMEncodedRSAKeyPairSerialNumberNameValidStartingInXDaysValidForXDays4()
          throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
              UnsupportedEncodingException {
    // Arrange
    String PEMEncodedRSAKeyPair = ValidateFactory.createNonNullString();
    BigInteger SerialNumber = BigInteger.valueOf(0L);

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.createSelfSigned(
        PEMEncodedRSAKeyPair, SerialNumber, ValidateFactory.createNonNullString(), 1, 1);
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
    // Arrange
    String subjectName = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR(subjectName, ValidateFactory.createNonNullString());
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
    thrown.expect(SymphonyPEMFormatException.class);
    Cert.generateCSR("", ValidateFactory.createNonNullString());
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
    // Arrange
    String subjectName = ValidateFactory.createNonNullString();
    String SigningRSAKeyPairPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR(subjectName, SigningRSAKeyPairPEM, ValidateFactory.createNonNullString());
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
    // Arrange
    String SigningRSAKeyPairPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyPEMFormatException.class);
    Cert.generateCSR("", SigningRSAKeyPairPEM, ValidateFactory.createNonNullString());
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
    // Arrange
    String subjectName = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR(subjectName, null, ValidateFactory.createNonNullString());
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
  public void testGenerateCSRWithSubjectNameSigningRSAKeyPairPEMSignatureAlgorithm_whenNull2()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange
    String SigningRSAKeyPairPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR(null, SigningRSAKeyPairPEM, ValidateFactory.createNonNullString());
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
    Cert.generateCSR(ValidateFactory.createNonNullString(), null);
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
  public void testGenerateCSRWithSubjectNameSigningRSAKeyPairPEM_whenNull2()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.generateCSR(null, ValidateFactory.createNonNullString());
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
    // Arrange
    String CSRPEM = ValidateFactory.createNonNullString();
    String SigningRSAKeyPairPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(CSRPEM, SigningRSAKeyPairPEM, ValidateFactory.createNonNullString(), null, 1, 1);
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
  public void testSignCSRWithStringStringStringBigIntegerIntInt_whenNull2()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange
    String CSRPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(CSRPEM, ValidateFactory.createNonNullString(), null, BigInteger.valueOf(1L), 1, 1);
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
  public void testSignCSRWithStringStringStringBigIntegerIntInt_whenNull3()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange
    String CSRPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(CSRPEM, null, ValidateFactory.createNonNullString(), BigInteger.valueOf(1L), 1, 1);
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
  public void testSignCSRWithStringStringStringBigIntegerIntInt_whenNull4()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange
    String SigningRSAKeyPairPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(
        null,
        SigningRSAKeyPairPEM,
        ValidateFactory.createNonNullString(),
        BigInteger.valueOf(1L),
        1,
        1);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, BigInteger, int, int)} with {@code String},
   * {@code String}, {@code String}, {@code BigInteger}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When valueOf zero.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, BigInteger, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.signCSR(String, String, String, BigInteger, int, int)"})
  public void testSignCSRWithStringStringStringBigIntegerIntInt_whenValueOfZero()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange
    String CSRPEM = ValidateFactory.createNonNullString();
    String SigningRSAKeyPairPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(
        CSRPEM,
        SigningRSAKeyPairPEM,
        ValidateFactory.createNonNullString(),
        BigInteger.valueOf(0L),
        1,
        1);
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
    // Arrange
    String CSRPEM = ValidateFactory.createNonNullString();
    String SigningRSAKeyPairPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(
        CSRPEM,
        SigningRSAKeyPairPEM,
        ValidateFactory.createNonNullString(),
        BigInteger.valueOf(1L),
        1,
        0);
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
    // Arrange
    String CSRPEM = ValidateFactory.createNonNullString();
    String SigningRSAKeyPairPEM = ValidateFactory.createNonNullString();
    String SigningCertPEM = ValidateFactory.createNonNullString();
    BigInteger SerialNum = BigInteger.valueOf(0L);
    String sigAlg = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(
        CSRPEM, SigningRSAKeyPairPEM, SigningCertPEM, SerialNum, sigAlg, new Extensions(), 1, 1);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, BigInteger, String, Extensions, int, int)}
   * with {@code String}, {@code String}, {@code String}, {@code BigInteger}, {@code String}, {@code
   * Extensions}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When valueOf one.
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
  public void testSignCSRWithStringStringStringBigIntegerStringExtensionsIntInt_whenValueOfOne()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange
    String CSRPEM = ValidateFactory.createNonNullString();
    String SigningRSAKeyPairPEM = ValidateFactory.createNonNullString();
    String SigningCertPEM = ValidateFactory.createNonNullString();
    BigInteger SerialNum = BigInteger.valueOf(1L);
    String sigAlg = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(
        CSRPEM, SigningRSAKeyPairPEM, SigningCertPEM, SerialNum, sigAlg, new Extensions(), 1, 0);
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
    // Arrange
    String CSRPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(CSRPEM, ValidateFactory.createNonNullString(), null, 10, 1, 1);
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
  public void testSignCSRWithStringStringStringIntIntInt_whenNull2()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange
    String CSRPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(CSRPEM, null, ValidateFactory.createNonNullString(), 10, 1, 1);
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
  public void testSignCSRWithStringStringStringIntIntInt_whenNull3()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange
    String SigningRSAKeyPairPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(null, SigningRSAKeyPairPEM, ValidateFactory.createNonNullString(), 10, 1, 1);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, int, int, int)} with {@code String}, {@code
   * String}, {@code String}, {@code int}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When zero.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, int, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.signCSR(String, String, String, int, int, int)"})
  public void testSignCSRWithStringStringStringIntIntInt_whenZero()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange
    String CSRPEM = ValidateFactory.createNonNullString();
    String SigningRSAKeyPairPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(CSRPEM, SigningRSAKeyPairPEM, ValidateFactory.createNonNullString(), 10, 1, 0);
  }

  /**
   * Test {@link Cert#signCSR(String, String, String, int, int, int)} with {@code String}, {@code
   * String}, {@code String}, {@code int}, {@code int}, {@code int}.
   *
   * <ul>
   *   <li>When zero.
   * </ul>
   *
   * <p>Method under test: {@link Cert#signCSR(String, String, String, int, int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Cert.signCSR(String, String, String, int, int, int)"})
  public void testSignCSRWithStringStringStringIntIntInt_whenZero2()
      throws SymphonyInputException, SymphonyPEMFormatException, SymphonySignatureException,
          UnsupportedEncodingException {
    // Arrange
    String CSRPEM = ValidateFactory.createNonNullString();
    String SigningRSAKeyPairPEM = ValidateFactory.createNonNullString();

    // Act and Assert
    thrown.expect(SymphonyInputException.class);
    Cert.signCSR(CSRPEM, SigningRSAKeyPairPEM, ValidateFactory.createNonNullString(), 0, 1, 1);
  }
}
