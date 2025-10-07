package org.symphonyoss.integration.core.service;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.exception.CryptoException;
import org.symphonyoss.integration.logging.LogMessageSource;

@ContextConfiguration(classes = {CryptoServiceImpl.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class CryptoServiceImplDiffblueTest {
  @Autowired private CryptoServiceImpl cryptoServiceImpl;

  @MockBean private LogMessageSource logMessageSource;

  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link CryptoServiceImpl#encrypt(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link CryptoServiceImpl#encrypt(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String CryptoServiceImpl.encrypt(String, String)"})
  public void testEncrypt_whenEmptyString() throws CryptoException {
    // Arrange, Act and Assert
    thrown.expect(CryptoException.class);
    cryptoServiceImpl.encrypt("", "");
  }

  /**
   * Test {@link CryptoServiceImpl#encrypt(String, String)}.
   *
   * <ul>
   *   <li>When {@code plainText}.
   * </ul>
   *
   * <p>Method under test: {@link CryptoServiceImpl#encrypt(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String CryptoServiceImpl.encrypt(String, String)"})
  public void testEncrypt_whenPlainText() throws CryptoException {
    // Arrange, Act and Assert
    thrown.expect(CryptoException.class);
    cryptoServiceImpl.encrypt("plainText", "");
  }

  /**
   * Test {@link CryptoServiceImpl#decrypt(String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CryptoServiceImpl#decrypt(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String CryptoServiceImpl.decrypt(String, String)"})
  public void testDecrypt_when42() throws CryptoException {
    // Arrange, Act and Assert
    thrown.expect(CryptoException.class);
    cryptoServiceImpl.decrypt("42", "Key");
  }

  /**
   * Test {@link CryptoServiceImpl#decrypt(String, String)}.
   *
   * <ul>
   *   <li>When {@code Component:}.
   * </ul>
   *
   * <p>Method under test: {@link CryptoServiceImpl#decrypt(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String CryptoServiceImpl.decrypt(String, String)"})
  public void testDecrypt_whenComponent() throws CryptoException {
    // Arrange, Act and Assert
    thrown.expect(CryptoException.class);
    cryptoServiceImpl.decrypt("Component: ", "Key");
  }

  /**
   * Test {@link CryptoServiceImpl#decrypt(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link CryptoServiceImpl#decrypt(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String CryptoServiceImpl.decrypt(String, String)"})
  public void testDecrypt_whenEmptyString() throws CryptoException {
    // Arrange, Act and Assert
    thrown.expect(CryptoException.class);
    cryptoServiceImpl.decrypt("", "");
  }

  /**
   * Test {@link CryptoServiceImpl#decrypt(String, String)}.
   *
   * <ul>
   *   <li>When {@code encryptedText}.
   * </ul>
   *
   * <p>Method under test: {@link CryptoServiceImpl#decrypt(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String CryptoServiceImpl.decrypt(String, String)"})
  public void testDecrypt_whenEncryptedText() throws CryptoException {
    // Arrange, Act and Assert
    thrown.expect(CryptoException.class);
    cryptoServiceImpl.decrypt("encryptedText", "");
  }

  /**
   * Test {@link CryptoServiceImpl#decrypt(String, String)}.
   *
   * <ul>
   *   <li>When {@code key}.
   * </ul>
   *
   * <p>Method under test: {@link CryptoServiceImpl#decrypt(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String CryptoServiceImpl.decrypt(String, String)"})
  public void testDecrypt_whenKey() throws CryptoException {
    // Arrange, Act and Assert
    thrown.expect(CryptoException.class);
    cryptoServiceImpl.decrypt("key", "Key");
  }

  /**
   * Test {@link CryptoServiceImpl#decrypt(String, String)}.
   *
   * <ul>
   *   <li>When lf.
   * </ul>
   *
   * <p>Method under test: {@link CryptoServiceImpl#decrypt(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String CryptoServiceImpl.decrypt(String, String)"})
  public void testDecrypt_whenLf() throws CryptoException {
    // Arrange, Act and Assert
    thrown.expect(CryptoException.class);
    cryptoServiceImpl.decrypt("\n", "Key");
  }
}
