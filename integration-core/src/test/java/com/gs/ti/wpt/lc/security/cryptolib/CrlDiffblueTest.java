package com.gs.ti.wpt.lc.security.cryptolib;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CrlDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link Crl#createCRL(String, String, int, int)}
   */
  @Test
  public void testCreateCRL() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(null, null, 0, 0);
  }

  /**
   * Method under test: {@link Crl#createCRL(String, String, int, int)}
   */
  @Test
  public void testCreateCRL2() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", null, 0, 0);
  }

  /**
   * Method under test: {@link Crl#createCRL(String, String, int, int)}
   */
  @Test
  public void testCreateCRL3() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "Cert", 0, -1);
  }

  /**
   * Method under test: {@link Crl#createCRL(String, String, int, int)}
   */
  @Test
  public void testCreateCRL4() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "Cert", -1, 0);
  }

  /**
   * Method under test: {@link Crl#createCRL(String, String, int, int)}
   */
  @Test
  public void testCreateCRL5() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("", null, 0, 0);
  }

  /**
   * Method under test: {@link Crl#createCRL(String, String, int, int)}
   */
  @Test
  public void testCreateCRL6() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "", 0, 0);
  }

  /**
   * Method under test:
   * {@link Crl#createCRL(String, String, int, int, Extensions)}
   */
  @Test
  public void testCreateCRL7() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(null, null, 0, 0, (Extensions) null);
  }

  /**
   * Method under test:
   * {@link Crl#createCRL(String, String, int, int, Extensions)}
   */
  @Test
  public void testCreateCRL8() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", null, 0, 0, (Extensions) null);
  }

  /**
   * Method under test:
   * {@link Crl#createCRL(String, String, int, int, Extensions)}
   */
  @Test
  public void testCreateCRL9() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("", null, 0, 0, (Extensions) null);
  }

  /**
   * Method under test:
   * {@link Crl#createCRL(String, String, int, int, Extensions)}
   */
  @Test
  public void testCreateCRL10() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "", 0, 0, (Extensions) null);
  }

  /**
   * Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  public void testCreateCRL11() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(null, null, null, 0, 0);
  }

  /**
   * Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  public void testCreateCRL12() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", null, null, 0, 0);
  }

  /**
   * Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  public void testCreateCRL13() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "Cert", null, 0, -1);
  }

  /**
   * Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  public void testCreateCRL14() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "Cert", null, -1, 0);
  }

  /**
   * Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  public void testCreateCRL15() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("", null, null, 0, 0);
  }

  /**
   * Method under test: {@link Crl#createCRL(String, String, String, int, int)}
   */
  @Test
  public void testCreateCRL16() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "", null, 0, 0);
  }

  /**
   * Method under test:
   * {@link Crl#createCRL(String, String, String, int, int, Extensions)}
   */
  @Test
  public void testCreateCRL17() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL(null, null, null, 0, 0, (Extensions) null);
  }

  /**
   * Method under test:
   * {@link Crl#createCRL(String, String, String, int, int, Extensions)}
   */
  @Test
  public void testCreateCRL18() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", null, null, 0, 0, (Extensions) null);
  }

  /**
   * Method under test:
   * {@link Crl#createCRL(String, String, String, int, int, Extensions)}
   */
  @Test
  public void testCreateCRL19() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("", null, null, 0, 0, (Extensions) null);
  }

  /**
   * Method under test:
   * {@link Crl#createCRL(String, String, String, int, int, Extensions)}
   */
  @Test
  public void testCreateCRL20() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(Exception.class);
    Crl.createCRL("secret", "", null, 0, 0, (Extensions) null);
  }
}
