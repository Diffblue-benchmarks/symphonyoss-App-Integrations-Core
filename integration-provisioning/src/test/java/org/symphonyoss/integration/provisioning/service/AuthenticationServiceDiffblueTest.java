package org.symphonyoss.integration.provisioning.service;

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
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @MockBean
  private AuthenticationProxy authenticationProxy;

  @Autowired
  private AuthenticationService authenticationService;

  @MockBean
  private LogMessageSource logMessageSource;

  /**
   * Method under test:
   * {@link AuthenticationService#authenticate(String, String, String, String, String, String, String)}
   */
  @Test
  public void testAuthenticate() {
    // Arrange, Act and Assert
    thrown.expect(IntegrationProvisioningAuthException.class);
    authenticationService.authenticate("42", System.getProperty("javax.net.ssl.trustStore"),
        System.getProperty("javax.net.ssl.trustStorePassword"), System.getProperty("javax.net.ssl.trustStoreType"),
        "Keystore", System.getProperty("javax.net.ssl.trustStorePassword"), "Key Store Type");
  }

  /**
   * Method under test:
   * {@link AuthenticationService#authenticate(String, String, String, String, String, String, String)}
   */
  @Test
  public void testAuthenticate2() {
    // Arrange, Act and Assert
    thrown.expect(IntegrationProvisioningAuthException.class);
    authenticationService.authenticate("42", "", System.getProperty("javax.net.ssl.trustStorePassword"),
        System.getProperty("javax.net.ssl.trustStoreType"), "Keystore",
        System.getProperty("javax.net.ssl.trustStorePassword"), "Key Store Type");
  }

  /**
   * Method under test:
   * {@link AuthenticationService#authenticate(String, String, String, String, String, String, String)}
   */
  @Test
  public void testAuthenticate3() {
    // Arrange, Act and Assert
    thrown.expect(IntegrationProvisioningAuthException.class);
    authenticationService.authenticate("42", System.getProperty("javax.net.ssl.trustStore"), "",
        System.getProperty("javax.net.ssl.trustStoreType"), "Keystore",
        System.getProperty("javax.net.ssl.trustStorePassword"), "Key Store Type");
  }

  /**
   * Method under test:
   * {@link AuthenticationService#authenticate(String, String, String, String, String, String, String)}
   */
  @Test
  public void testAuthenticate4() {
    // Arrange, Act and Assert
    thrown.expect(IntegrationProvisioningAuthException.class);
    authenticationService.authenticate("42", System.getProperty("javax.net.ssl.trustStore"),
        System.getProperty("javax.net.ssl.trustStorePassword"), "", "Keystore",
        System.getProperty("javax.net.ssl.trustStorePassword"), "Key Store Type");
  }
}
