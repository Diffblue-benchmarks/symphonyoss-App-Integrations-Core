package com.gs.ti.wpt.lc.security.cryptolib;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.symphony.security.exceptions.SymphonyExtensionException;
import com.symphony.security.exceptions.SymphonyRevokedCertException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RevokedCertDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link RevokedCert#getExt()}
   *   <li>{@link RevokedCert#getRevDate()}
   *   <li>{@link RevokedCert#getSerial()}
   * </ul>
   */
  @Test
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
   * Method under test: default or parameterless constructor of
   * {@link RevokedCert}
   */
  @Test
  public void testNewRevokedCert() {
    // Arrange and Act
    RevokedCert actualRevokedCert = new RevokedCert();

    // Assert
    assertNull(actualRevokedCert.getExt());
    assertNull(actualRevokedCert.getSerial());
  }

  /**
   * Method under test: {@link RevokedCert#setExtensions(Extensions)}
   */
  @Test
  public void testSetExtensions() throws SymphonyRevokedCertException {
    // Arrange
    RevokedCert revokedCert = new RevokedCert();

    // Act and Assert
    thrown.expect(SymphonyRevokedCertException.class);
    revokedCert.setExtensions(new Extensions());
  }

  /**
   * Method under test: {@link RevokedCert#setExtensions(Extensions)}
   */
  @Test
  public void testSetExtensions2() throws SymphonyRevokedCertException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyRevokedCertException.class);
    (new RevokedCert()).setExtensions(null);
  }

  /**
   * Method under test: {@link RevokedCert#setExtensions(Extensions)}
   */
  @Test
  public void testSetExtensions3() throws SymphonyExtensionException, SymphonyRevokedCertException {
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
   * Method under test: {@link RevokedCert#setSerial(String)}
   */
  @Test
  public void testSetSerial() throws SymphonyRevokedCertException {
    // Arrange
    RevokedCert revokedCert = new RevokedCert();

    // Act
    revokedCert.setSerial("Seri");

    // Assert
    assertEquals("Seri", revokedCert.getSerial());
  }

  /**
   * Method under test: {@link RevokedCert#setSerial(String)}
   */
  @Test
  public void testSetSerial2() throws SymphonyRevokedCertException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyRevokedCertException.class);
    (new RevokedCert()).setSerial(null);
  }

  /**
   * Method under test: {@link RevokedCert#setSerial(String)}
   */
  @Test
  public void testSetSerial3() throws SymphonyRevokedCertException {
    // Arrange, Act and Assert
    thrown.expect(SymphonyRevokedCertException.class);
    (new RevokedCert()).setSerial("");
  }
}
