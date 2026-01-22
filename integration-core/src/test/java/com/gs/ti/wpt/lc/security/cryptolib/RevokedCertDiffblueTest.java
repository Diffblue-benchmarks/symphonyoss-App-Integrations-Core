package com.gs.ti.wpt.lc.security.cryptolib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyExtensionException;
import com.symphony.security.exceptions.SymphonyRevokedCertException;
import com.symphony.security.utils.ValidateFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RevokedCertDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RevokedCert#getExt()}
   *   <li>{@link RevokedCert#getRevDate()}
   *   <li>{@link RevokedCert#getSerial()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String[] RevokedCert.getExt()",
    "String RevokedCert.getRevDate()",
    "String RevokedCert.getSerial()"
  })
  public void testGettersAndSetters() {
    // Arrange
    RevokedCert revokedCert = new RevokedCert();

    // Act
    String[] actualExt = revokedCert.getExt();
    revokedCert.getRevDate();

    // Assert
    assertNull(revokedCert.getSerial());
    assertNull(actualExt);
  }

  /**
   * Test new {@link RevokedCert} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link RevokedCert}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void RevokedCert.<init>()"})
  public void testNewRevokedCert() {
    // Arrange and Act
    RevokedCert actualRevokedCert = new RevokedCert();

    // Assert
    assertNull(actualRevokedCert.getSerial());
    assertNull(actualRevokedCert.getExt());
  }

  /**
   * Test {@link RevokedCert#setExtensions(Extensions)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link RevokedCert#setExtensions(Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void RevokedCert.setExtensions(Extensions)"})
  public void testSetExtensions_givenTrue_thenDoesNotThrow()
      throws SymphonyExtensionException, SymphonyRevokedCertException {
    // Arrange
    RevokedCert createRevokedCertResult = RevokedCertFactory.createRevokedCert();

    Extensions extension = new Extensions();
    extension.addBasicConstraints(true, true, 3);

    // Act and Assert
    createRevokedCertResult.setExtensions(extension);
  }

  /**
   * Test {@link RevokedCert#setExtensions(Extensions)}.
   *
   * <ul>
   *   <li>When {@link Extensions} (default constructor).
   *   <li>Then throw {@link SymphonyRevokedCertException}.
   * </ul>
   *
   * <p>Method under test: {@link RevokedCert#setExtensions(Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void RevokedCert.setExtensions(Extensions)"})
  public void testSetExtensions_whenExtensions_thenThrowSymphonyRevokedCertException()
      throws SymphonyExtensionException, SymphonyRevokedCertException {
    // Arrange
    RevokedCert createRevokedCertResult = RevokedCertFactory.createRevokedCert();

    // Act and Assert
    thrown.expect(SymphonyRevokedCertException.class);
    createRevokedCertResult.setExtensions(new Extensions());
  }

  /**
   * Test {@link RevokedCert#setExtensions(Extensions)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyRevokedCertException}.
   * </ul>
   *
   * <p>Method under test: {@link RevokedCert#setExtensions(Extensions)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void RevokedCert.setExtensions(Extensions)"})
  public void testSetExtensions_whenNull_thenThrowSymphonyRevokedCertException()
      throws SymphonyExtensionException, SymphonyRevokedCertException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyRevokedCertException.class);
    RevokedCertFactory.createRevokedCert().setExtensions(null);
  }

  /**
   * Test {@link RevokedCert#setSerial(String)}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then createRevokedCert Serial is {@code validString}.
   * </ul>
   *
   * <p>Method under test: {@link RevokedCert#setSerial(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void RevokedCert.setSerial(String)"})
  public void testSetSerial_whenCreateNonNullString_thenCreateRevokedCertSerialIsValidString()
      throws SymphonyExtensionException, SymphonyRevokedCertException {
    // Arrange
    RevokedCert createRevokedCertResult = RevokedCertFactory.createRevokedCert();

    // Act
    createRevokedCertResult.setSerial(ValidateFactory.createNonNullString());

    // Assert
    assertEquals("validString", createRevokedCertResult.getSerial());
  }

  /**
   * Test {@link RevokedCert#setSerial(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link SymphonyRevokedCertException}.
   * </ul>
   *
   * <p>Method under test: {@link RevokedCert#setSerial(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void RevokedCert.setSerial(String)"})
  public void testSetSerial_whenEmptyString_thenThrowSymphonyRevokedCertException()
      throws SymphonyExtensionException, SymphonyRevokedCertException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyRevokedCertException.class);
    RevokedCertFactory.createRevokedCert().setSerial("");
  }

  /**
   * Test {@link RevokedCert#setSerial(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link SymphonyRevokedCertException}.
   * </ul>
   *
   * <p>Method under test: {@link RevokedCert#setSerial(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void RevokedCert.setSerial(String)"})
  public void testSetSerial_whenNull_thenThrowSymphonyRevokedCertException()
      throws SymphonyExtensionException, SymphonyRevokedCertException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyRevokedCertException.class);
    RevokedCertFactory.createRevokedCert().setSerial(null);
  }
}
