package org.symphonyoss.integration.provisioning.service;

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
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.provisioning.exception.IntegrationProvisioningAuthException;

@ContextConfiguration(classes = {AuthenticationService.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthenticationServiceDiffblueTest {
  @MockBean private AuthenticationProxy authenticationProxy;

  @Autowired private AuthenticationService authenticationService;

  @MockBean private LogMessageSource logMessageSource;

  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link AuthenticationService#authenticate(String, String, String, String, String, String,
   * String)}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationService#authenticate(String, String, String, String,
   * String, String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AuthenticationService.authenticate(String, String, String, String, String, String, String)"
  })
  public void testAuthenticate_whenEmptyString() {
    // Arrange, Act and Assert
    thrown.expect(IntegrationProvisioningAuthException.class);
    authenticationService.authenticate(
        "42",
        "",
        System.getProperty("javax.net.ssl.trustStorePassword"),
        System.getProperty("javax.net.ssl.trustStoreType"),
        "Keystore",
        System.getProperty("javax.net.ssl.trustStorePassword"),
        "Key Store Type");
  }

  /**
   * Test {@link AuthenticationService#authenticate(String, String, String, String, String, String,
   * String)}.
   *
   * <ul>
   *   <li>When Property is {@code javax.net.ssl.trustStore}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationService#authenticate(String, String, String, String,
   * String, String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AuthenticationService.authenticate(String, String, String, String, String, String, String)"
  })
  public void testAuthenticate_whenPropertyIsJavaxNetSslTrustStore() {
    // Arrange, Act and Assert
    thrown.expect(IntegrationProvisioningAuthException.class);
    authenticationService.authenticate(
        "42",
        System.getProperty("javax.net.ssl.trustStore"),
        System.getProperty("javax.net.ssl.trustStorePassword"),
        System.getProperty("javax.net.ssl.trustStoreType"),
        "Keystore",
        System.getProperty("javax.net.ssl.trustStorePassword"),
        "Key Store Type");
  }

  /**
   * Test {@link AuthenticationService#authenticate(String, String, String, String, String, String,
   * String)}.
   *
   * <ul>
   *   <li>When Property is {@code javax.net.ssl.trustStore}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationService#authenticate(String, String, String, String,
   * String, String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AuthenticationService.authenticate(String, String, String, String, String, String, String)"
  })
  public void testAuthenticate_whenPropertyIsJavaxNetSslTrustStore2() {
    // Arrange, Act and Assert
    thrown.expect(IntegrationProvisioningAuthException.class);
    authenticationService.authenticate(
        "42",
        System.getProperty("javax.net.ssl.trustStore"),
        "",
        System.getProperty("javax.net.ssl.trustStoreType"),
        "Keystore",
        System.getProperty("javax.net.ssl.trustStorePassword"),
        "Key Store Type");
  }

  /**
   * Test {@link AuthenticationService#authenticate(String, String, String, String, String, String,
   * String)}.
   *
   * <ul>
   *   <li>When Property is {@code javax.net.ssl.trustStore}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationService#authenticate(String, String, String, String,
   * String, String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AuthenticationService.authenticate(String, String, String, String, String, String, String)"
  })
  public void testAuthenticate_whenPropertyIsJavaxNetSslTrustStore3() {
    // Arrange, Act and Assert
    thrown.expect(IntegrationProvisioningAuthException.class);
    authenticationService.authenticate(
        "42",
        System.getProperty("javax.net.ssl.trustStore"),
        System.getProperty("javax.net.ssl.trustStorePassword"),
        "",
        "Keystore",
        System.getProperty("javax.net.ssl.trustStorePassword"),
        "Key Store Type");
  }
}
