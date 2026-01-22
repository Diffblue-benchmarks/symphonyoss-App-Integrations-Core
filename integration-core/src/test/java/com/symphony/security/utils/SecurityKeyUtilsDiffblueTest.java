package com.symphony.security.utils;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.helper.ClientCryptoHandlerFactory;
import java.security.GeneralSecurityException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SecurityKeyUtilsDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----42-----BEGIN RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKey42BeginRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----42-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----42-----END RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKey42EndRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----42-----END RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----42Not valid private key.}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKey42NotValidPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----42Not valid private key.");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----42Pem Private Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKey42PemPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----42Pem Private Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyBeginRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyBeginRsaPrivateKey2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        " -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyBeginRsaPrivateKey3()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY----- ");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----42}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyBeginRsaPrivateKey42()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----42");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY----------BEGIN RSA
   *       PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyBeginRsaPrivateKeyBeginRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY----------END RSA
   *       PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyBeginRsaPrivateKeyEndRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY----------END RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----\n}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyBeginRsaPrivateKeyN()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----\\n");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----Not valid private
   *       key.}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyBeginRsaPrivateKeyNotValidPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----Not valid private key.");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----Pem Private Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyBeginRsaPrivateKeyPemPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----Pem Private Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----\s}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyBeginRsaPrivateKeyS()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----\\s");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyBeginRsaPrivateKeyUtf8()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----UTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----X.509}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyBeginRsaPrivateKeyX509()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----X.509");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyEndRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyEndRsaPrivateKey2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        " -----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyEndRsaPrivateKey3()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY----- ");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----42}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyEndRsaPrivateKey42()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----42");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY----------BEGIN RSA
   *       PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyEndRsaPrivateKeyBeginRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY----------BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY----------END RSA PRIVATE
   *       KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyEndRsaPrivateKeyEndRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY----------END RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----\n}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyEndRsaPrivateKeyN()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----\\n");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----Pem Private Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyEndRsaPrivateKeyPemPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----Pem Private Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----\s}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyEndRsaPrivateKeyS()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY----------END RSA PRIVATE KEY-----\\s");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----\n-----BEGIN RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNBeginRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----\\n-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----\n-----END RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNEndRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----\\n-----END RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----\nNot valid private key.}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNNotValidPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\nNot valid private key.");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----\nPem Private Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNPemPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\nPem Private Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----\nUTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNUTF8() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\nUTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----\nX.509}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNX509() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\nX.509");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Not valid private key.}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNotValidPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Not valid private key.42}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNotValidPrivateKey42()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.42");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Not valid private key.-----BEGIN RSA PRIVATE
   *       KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNotValidPrivateKeyBeginRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----Not valid private key.-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Not valid private key.\n}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNotValidPrivateKeyN()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.\\n");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Not valid private key.Not valid private key.}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNotValidPrivateKeyNotValidPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----Not valid private key.Not valid private key.");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Not valid private key.Pem Private Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNotValidPrivateKeyPemPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----Not valid private key.Pem Private Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Not valid private key.\s}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNotValidPrivateKeyS()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.\\s");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Not valid private key.UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNotValidPrivateKeyUtf8()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.UTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Not valid private key.X.509}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyNotValidPrivateKeyX509()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Not valid private key.X.509");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyPemPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyPemPrivateKey2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(" -----BEGIN PRIVATE KEY-----Pem Private Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyPemPrivateKey3()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private Key ");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private Key42}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyPemPrivateKey42()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private Key42");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private Key-----BEGIN RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyPemPrivateKeyBeginRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----Pem Private Key-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private Key-----END RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyPemPrivateKeyEndRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----Pem Private Key-----END RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private Key\n}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyPemPrivateKeyN()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private Key\\n");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private KeyNot valid private key.}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyPemPrivateKeyNotValidPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----Pem Private KeyNot valid private key.");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private KeyPem Private Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyPemPrivateKeyPemPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----Pem Private KeyPem Private Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private Key\s}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyPemPrivateKeyS()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private Key\\s");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private KeyUTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyPemPrivateKeyUTF8()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private KeyUTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----Pem Private KeyX.509}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyPemPrivateKeyX509()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----Pem Private KeyX.509");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----\s-----BEGIN RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeySBeginRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----\\s-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----\s-----END RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeySEndRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----\\s-----END RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----\sNot valid private key.}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeySNotValidPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\sNot valid private key.");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----\sPem Private Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeySPemPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----\\sPem Private Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----UTF-8-----BEGIN RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyUtf8BeginRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----UTF-8-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----UTF-8\n}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyUtf8N() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----UTF-8\\n");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----UTF-8Not valid private key.}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyUtf8NotValidPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----UTF-8Not valid private key.");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----UTF-8Pem Private Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyUtf8PemPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----UTF-8Pem Private Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----UTF-8}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyUtf8_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(" -----BEGIN PRIVATE KEY-----UTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----UTF-8}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyUtf8_thenThrowGeneralSecurityException2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----UTF-8 ");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----X.509-----BEGIN RSA PRIVATE KEY-----}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyX509BeginRsaPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(
        "-----BEGIN PRIVATE KEY-----X.509-----BEGIN RSA PRIVATE KEY-----");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----X.509\n}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyX509N() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----X.509\\n");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----X.509Not valid private key.}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyX509NotValidPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----X.509Not valid private key.");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN PRIVATE KEY-----X.509Pem Private Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginPrivateKeyX509PemPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN PRIVATE KEY-----X.509Pem Private Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN RSA PRIVATE KEY-----Not valid private key.}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginRsaPrivateKeyNotValidPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN RSA PRIVATE KEY-----Not valid private key.");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN RSA PRIVATE KEY-----Pem Private Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginRsaPrivateKeyPemPrivateKey()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN RSA PRIVATE KEY-----Pem Private Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When {@code -----BEGIN RSA PRIVATE KEY-----UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenBeginRsaPrivateKeyUtf8() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey("-----BEGIN RSA PRIVATE KEY-----UTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPrivateKey(String)}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPrivateKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PrivateKey SecurityKeyUtils.parseRSAPrivateKey(String)"})
  public void testParseRSAPrivateKey_whenCreateNonNullString_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPrivateKey(ValidateFactory.createNonNullString());
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code 42Pem Public Key}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_when42PemPublicKey_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("42Pem Public Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code 42Pem Public Key}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_when42PemPublicKey_thenThrowGeneralSecurityException2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" 42Pem Public Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code 42\s}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_when42S_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" 42\\s");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code 42UTF-8}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_when42utf8_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" 42UTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code 4242}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_when4242_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" 4242");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenCreateNonNullString_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(ValidateFactory.createNonNullString());
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When createValidEncryptedMessageString.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenCreateValidEncryptedMessageString()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(
        ClientCryptoHandlerFactory.createValidEncryptedMessageString());
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When createValidX509CertificateString.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenCreateValidX509CertificateString()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(SecurityKeyUtilsFactory.createValidX509CertificateString());
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code \nPem Public Key}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenNPemPublicKey_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("\\nPem Public Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code \nPem Public Key}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenNPemPublicKey_thenThrowGeneralSecurityException2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\nPem Public Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code \nUTF-8}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenNUTF8_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("\\nUTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code \nUTF-8}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenNUTF8_thenThrowGeneralSecurityException2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\nUTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public Key42}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKey42_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public Key42");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public Key42}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKey42_thenThrowGeneralSecurityException2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public Key42");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public Key\n}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKeyN_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public Key\\n");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public Key\n}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKeyN_thenThrowGeneralSecurityException2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public Key\\n");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public KeyPem Public Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKeyPemPublicKey() throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public KeyPem Public Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public KeyPem Public Key}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKeyPemPublicKey2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public KeyPem Public Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public Key\s}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKeyS_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public Key\\s");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public Key\s}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKeyS_thenThrowGeneralSecurityException2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public Key\\s");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public KeyUTF-8}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKeyUTF8_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public KeyUTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public KeyUTF-8}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKeyUTF8_thenThrowGeneralSecurityException2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public KeyUTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public Key}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKey_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public Key}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKey_thenThrowGeneralSecurityException2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public Key}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKey_thenThrowGeneralSecurityException3()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("Pem Public Key ");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public Key}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKey_thenThrowGeneralSecurityException4()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("  Pem Public Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code Pem Public Key}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenPemPublicKey_thenThrowGeneralSecurityException5()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" Pem Public Key ");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code \s42}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenS42_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\s42");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code \sPem Public Key}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenSPemPublicKey_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("\\sPem Public Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code \sPem Public Key}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenSPemPublicKey_thenThrowGeneralSecurityException2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\sPem Public Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code \s\s}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenSS_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\s\\s");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code \sUTF-8}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenSUTF8_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" \\sUTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code UTF-8\n}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenUtf8N_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("UTF-8\\n");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code UTF-8\n}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenUtf8N_thenThrowGeneralSecurityException2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8\\n");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code UTF-8Pem Public Key}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenUtf8PemPublicKey_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("UTF-8Pem Public Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code UTF-8Pem Public Key}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenUtf8PemPublicKey_thenThrowGeneralSecurityException2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8Pem Public Key");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code UTF-8\s}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenUtf8S_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8\\s");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code UTF-8}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenUtf8_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code UTF-8}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenUtf8_thenThrowGeneralSecurityException2()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("UTF-8 ");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code UTF-8}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenUtf8_thenThrowGeneralSecurityException3()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey("  UTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code UTF-8}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenUtf8_thenThrowGeneralSecurityException4()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8 ");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code UTF-8UTF-8}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenUtf8utf8_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-8UTF-8");
  }

  /**
   * Test {@link SecurityKeyUtils#parseRSAPublicKey(String)}.
   *
   * <ul>
   *   <li>When {@code UTF-842}.
   *   <li>Then throw {@link GeneralSecurityException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityKeyUtils#parseRSAPublicKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.security.PublicKey SecurityKeyUtils.parseRSAPublicKey(String)"})
  public void testParseRSAPublicKey_whenUtf842_thenThrowGeneralSecurityException()
      throws GeneralSecurityException {
    // Arrange, Act and Assert
    thrown.expect(GeneralSecurityException.class);
    SecurityKeyUtils.parseRSAPublicKey(" UTF-842");
  }
}
