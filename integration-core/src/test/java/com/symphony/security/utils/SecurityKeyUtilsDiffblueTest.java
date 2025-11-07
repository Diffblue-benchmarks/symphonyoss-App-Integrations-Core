package com.symphony.security.utils;

import java.security.GeneralSecurityException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SecurityKeyUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("Pem Private Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey2() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey3() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey4() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey5() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN RSA PRIVATE KEY-----Pem Private Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey6() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey7() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----END PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey8() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey9() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils
        .parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----Not valid private key.");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey10() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----Pem Private Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey11() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----42");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey12() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----UTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey13() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----X.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey14() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----\\n");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey15() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----\\s");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey16() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils
        .parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey17() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.Not valid private key.");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey18() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.Pem Private Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey19() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.42");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey20() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.UTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey21() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.X.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey22() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.\\n");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey23() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.\\s");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey24() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private Key-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey25() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private KeyNot valid private key.");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey26() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private KeyPem Private Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey27() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private Key42");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey28() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private KeyUTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey29() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private KeyX.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey30() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private Key\\n");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey31() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private Key\\s");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey32() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----42-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey33() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----42Not valid private key.");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey34() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----42Pem Private Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey35() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----UTF-8-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey36() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----UTF-8Not valid private key.");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey37() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----UTF-8Pem Private Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey38() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----UTF-8\\n");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey39() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(" -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey40() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(" -----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey41() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----X.509-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey42() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----X.509Not valid private key.");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey43() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(" -----BEGIN PRIVATE KEY-----Pem Private Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey44() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----X.509Pem Private Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey45() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(" -----BEGIN PRIVATE KEY-----UTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey46() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----X.509\\n");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey47() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(" -----BEGIN PRIVATE KEY-----X.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey48() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\n-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey49() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\nNot valid private key.");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey50() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\nPem Private Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey51() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\nUTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey52() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\nX.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey53() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(" -----END PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey54() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\s-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey55() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\sNot valid private key.");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey56() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\sPem Private Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey57() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY----- ");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey58() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils
        .parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY----------END RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey59() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY----- ");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey60() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils
        .parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey61() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils
        .parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY----------END RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey62() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----\\n");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey63() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----Pem Private Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey64() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----42");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey65() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----\\s");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey66() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----UTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey67() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----X.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey68() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\n-----END RSA PRIVATE KEY-----");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  public void testParseRSAPrivateKey69() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private Key ");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey2() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey3() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey4() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" X.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey5() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("\\nPem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey6() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("\\nUTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey7() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("\\nX.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey8() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public Key ");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey9() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public Key\\n");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey10() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public KeyPem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey11() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public Key\\s");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey12() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public Key42");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey13() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public KeyUTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey14() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public KeyRSA");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey15() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public KeyX.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey16() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("\\sPem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey17() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("42Pem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey18() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("UTF-8 ");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey19() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("UTF-8\\n");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey20() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("UTF-8Pem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey21() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("RSAPem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey22() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("X.509 ");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey23() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("X.509\\n");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey24() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("X.509Pem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey25() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("  Pem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey26() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("  UTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey27() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("  X.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey28() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\nPem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey29() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\nUTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey30() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\nX.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey31() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public Key ");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey32() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public Key\\n");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey33() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public KeyPem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey34() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public Key\\s");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey35() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public Key42");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey36() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public KeyUTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey37() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public KeyRSA");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey38() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public KeyX.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey39() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\sPem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey40() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\s\\s");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey41() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\s42");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey42() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\sUTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey43() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\sRSA");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey44() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\sX.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey45() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" 42Pem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey46() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" 42\\s");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey47() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" 4242");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey48() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" 42UTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey49() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" 42RSA");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey50() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" 42X.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey51() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8 ");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey52() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8\\n");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey53() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8Pem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey54() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8\\s");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey55() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-842");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey56() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8UTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey57() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8RSA");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey58() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8X.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey59() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" RSAPem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey60() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" RSA\\s");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey61() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" RSA42");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey62() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" RSAUTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey63() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" RSARSA");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey64() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" RSAX.509");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey65() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" X.509 ");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey66() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" X.509\\n");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey67() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" X.509Pem Public Key");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey68() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" X.509\\s");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey69() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" X.50942");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey70() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" X.509UTF-8");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey71() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" X.509RSA");
  }

  /**
   * Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  public void testParseRSAPublicKey72() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" X.509X.509");
  }
}
