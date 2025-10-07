package org.symphonyoss.integration.authentication;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.security.KeyStore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.symphonyoss.integration.authentication.exception.MissingServiceConfigurationException;
import org.symphonyoss.integration.model.yaml.HttpClientConfig;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

public class UserAuthenticationContextDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link UserAuthenticationContext#UserAuthenticationContext(String, KeyStore, String,
   * HttpClientConfig, IntegrationProperties)}.
   *
   * <ul>
   *   <li>Then throw {@link MissingServiceConfigurationException}.
   * </ul>
   *
   * <p>Method under test: {@link UserAuthenticationContext#UserAuthenticationContext(String,
   * KeyStore, String, HttpClientConfig, IntegrationProperties)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserAuthenticationContext.<init>(String, KeyStore, String, HttpClientConfig, IntegrationProperties)"
  })
  public void testNewUserAuthenticationContext_thenThrowMissingServiceConfigurationException() {
    // Arrange, Act and Assert
    thrown.expect(MissingServiceConfigurationException.class);
    new UserAuthenticationContext("42", null, null, null, new IntegrationProperties());
  }

  /**
   * Test {@link UserAuthenticationContext#UserAuthenticationContext(String, KeyStore, String,
   * HttpClientConfig, IntegrationProperties)}.
   *
   * <ul>
   *   <li>Then throw {@link MissingServiceConfigurationException}.
   * </ul>
   *
   * <p>Method under test: {@link UserAuthenticationContext#UserAuthenticationContext(String,
   * KeyStore, String, HttpClientConfig, IntegrationProperties)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserAuthenticationContext.<init>(String, KeyStore, String, HttpClientConfig, IntegrationProperties)"
  })
  public void testNewUserAuthenticationContext_thenThrowMissingServiceConfigurationException2() {
    // Arrange
    HttpClientConfig httpClientConfig = new HttpClientConfig();
    httpClientConfig.setConnectTimeout(10);
    httpClientConfig.setMaxConnections(3);
    httpClientConfig.setMaxConnectionsPerRoute(3);
    httpClientConfig.setReadTimeout(10);

    // Act and Assert
    thrown.expect(MissingServiceConfigurationException.class);
    new UserAuthenticationContext("42", null, null, httpClientConfig, new IntegrationProperties());
  }
}
