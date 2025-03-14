package com.gs.ti.wpt.lc.security.cryptolib;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyExtensionException;
import com.symphony.security.exceptions.SymphonyRevokedCertException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RevokedCertDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RevokedCert#getExt()}
   *   <li>{@link RevokedCert#getRevDate()}
   *   <li>{@link RevokedCert#getSerial()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"String[] RevokedCert.getExt()", "String RevokedCert.getRevDate()",
      "String RevokedCert.getSerial()"})
  public void testGettersAndSetters() {
    // Arrange
    RevokedCert revokedCert = new RevokedCert();

    // Act
    String[] actualExt = revokedCert.getExt();
    revokedCert.getRevDate();

    // Assert
    assertNull(actualExt);
    assertNull(revokedCert.getSerial());
  }

  /**
   * Test new {@link RevokedCert} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link RevokedCert}
   */
  @Test
  @MethodsUnderTest({"void RevokedCert.<init>()"})
  public void testNewRevokedCert() {
    // Arrange and Act
    RevokedCert actualRevokedCert = new RevokedCert();

    // Assert
    assertNull(actualRevokedCert.getExt());
    assertNull(actualRevokedCert.getSerial());
  }

  /**
   * Test {@link RevokedCert#setExtensions(Extensions)}.
   * <p>
   * Method under test: {@link RevokedCert#setExtensions(Extensions)}
   */
  @Test
  @MethodsUnderTest({"void RevokedCert.setExtensions(Extensions)"})
  public void testSetExtensions() throws SymphonyExtensionException, SymphonyRevokedCertException {
    // Arrange
    RevokedCert revokedCert = new RevokedCert();

    Extensions extension = new Extensions();
    extension.addBasicConstraints(true, true, 3);

    // Act
    revokedCert.setExtensions(extension);

    // Assert
    assertArrayEquals(new String[]{"basicConstraints=critical,CA:TRUE,pathlen:3"}, revokedCert.getExt());
  }

  /**
   * Test {@link RevokedCert#setExtensions(Extensions)}.
   * <ul>
   *   <li>When {@link Extensions} (default constructor).</li>
   *   <li>Then throw {@link SymphonyRevokedCertException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RevokedCert#setExtensions(Extensions)}
   */
  @Test
  @MethodsUnderTest({"void RevokedCert.setExtensions(Extensions)"})
  public void testSetExtensions_whenExtensions_thenThrowSymphonyRevokedCertException()
      throws SymphonyRevokedCertException {
    // Arrange
    RevokedCert revokedCert = new RevokedCert();

    // Act and Assert
    thrown.expect(SymphonyRevokedCertException.class);
    revokedCert.setExtensions(new Extensions());
  }

  /**
   * Test {@link RevokedCert#setExtensions(Extensions)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link SymphonyRevokedCertException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RevokedCert#setExtensions(Extensions)}
   */
  @Test
  @MethodsUnderTest({"void RevokedCert.setExtensions(Extensions)"})
  public void testSetExtensions_whenNull_thenThrowSymphonyRevokedCertException() throws SymphonyRevokedCertException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyRevokedCertException.class);
    (new RevokedCert()).setExtensions(null);
  }

  /**
   * Test {@link RevokedCert#setSerial(String)}.
   * <ul>
   *   <li>When empty string.</li>
   *   <li>Then throw {@link SymphonyRevokedCertException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RevokedCert#setSerial(String)}
   */
  @Test
  @MethodsUnderTest({"void RevokedCert.setSerial(String)"})
  public void testSetSerial_whenEmptyString_thenThrowSymphonyRevokedCertException()
      throws SymphonyRevokedCertException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyRevokedCertException.class);
    (new RevokedCert()).setSerial("");
  }

  /**
   * Test {@link RevokedCert#setSerial(String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link SymphonyRevokedCertException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RevokedCert#setSerial(String)}
   */
  @Test
  @MethodsUnderTest({"void RevokedCert.setSerial(String)"})
  public void testSetSerial_whenNull_thenThrowSymphonyRevokedCertException() throws SymphonyRevokedCertException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyRevokedCertException.class);
    (new RevokedCert()).setSerial(null);
  }

  /**
   * Test {@link RevokedCert#setSerial(String)}.
   * <ul>
   *   <li>When {@code Seri}.</li>
   *   <li>Then {@link RevokedCert} (default constructor) Serial is {@code Seri}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RevokedCert#setSerial(String)}
   */
  @Test
  @MethodsUnderTest({"void RevokedCert.setSerial(String)"})
  public void testSetSerial_whenSeri_thenRevokedCertSerialIsSeri() throws SymphonyRevokedCertException {
    // Arrange
    RevokedCert revokedCert = new RevokedCert();

    // Act
    revokedCert.setSerial("Seri");

    // Assert
    assertEquals("Seri", revokedCert.getSerial());
  }
}
