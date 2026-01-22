package org.symphonyoss.integration.authentication;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.security.KeyStore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.symphonyoss.integration.authentication.exception.MissingServiceConfigurationException;
import org.symphonyoss.integration.model.yaml.ConnectionInfo;
import org.symphonyoss.integration.model.yaml.HttpClientConfig;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;
import org.symphonyoss.integration.model.yaml.ProxyConnectionInfo;

public class AppAuthenticationContextDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link AppAuthenticationContext#AppAuthenticationContext(String, KeyStore, String,
   * HttpClientConfig, IntegrationProperties)}.
   *
   * <ul>
   *   <li>Given {@link ProxyConnectionInfo} (default constructor) Password is {@code iloveyou}.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationContext#AppAuthenticationContext(String,
   * KeyStore, String, HttpClientConfig, IntegrationProperties)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AppAuthenticationContext.<init>(String, KeyStore, String, HttpClientConfig, IntegrationProperties)"
  })
  public void testNewAppAuthenticationContext_givenProxyConnectionInfoPasswordIsIloveyou() {
    // Arrange
    KeyStore keyStore = AuthenticationContextFactory.createKeyStore();

    HttpClientConfig httpClientConfig = new HttpClientConfig();
    httpClientConfig.setConnectTimeout(10);
    httpClientConfig.setMaxConnections(3);
    httpClientConfig.setMaxConnectionsPerRoute(3);
    httpClientConfig.setReadTimeout(10);

    ProxyConnectionInfo proxy = new ProxyConnectionInfo();
    proxy.setPassword("iloveyou");
    proxy.setURI("jersey.config.client.readTimeout");
    proxy.setUser("jersey.config.client.readTimeout");

    ConnectionInfo pod = new ConnectionInfo();
    pod.setHost("localhost");
    pod.setMinVersion("1.0.2");
    pod.setPort("jersey.config.client.readTimeout");
    pod.setProxy(proxy);

    IntegrationProperties properties = AuthenticationContextFactory.createIntegrationProperties();
    properties.setPod(pod);

    // Act
    AppAuthenticationContext actualAppAuthenticationContext =
        new AppAuthenticationContext("42", keyStore, "iloveyou", httpClientConfig, properties);

    // Assert
    assertEquals("42", actualAppAuthenticationContext.getApplicationId());
  }

  /**
   * Test {@link AppAuthenticationContext#AppAuthenticationContext(String, KeyStore, String,
   * HttpClientConfig, IntegrationProperties)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@code null}.
   *   <li>Then return ApplicationId is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationContext#AppAuthenticationContext(String,
   * KeyStore, String, HttpClientConfig, IntegrationProperties)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AppAuthenticationContext.<init>(String, KeyStore, String, HttpClientConfig, IntegrationProperties)"
  })
  public void testNewAppAuthenticationContext_givenTen_whenNull_thenReturnApplicationIdIs42() {
    // Arrange
    KeyStore keyStore = AuthenticationContextFactory.createKeyStore();

    HttpClientConfig httpClientConfig = new HttpClientConfig();
    httpClientConfig.setConnectTimeout(10);
    httpClientConfig.setMaxConnections(3);
    httpClientConfig.setMaxConnectionsPerRoute(3);
    httpClientConfig.setReadTimeout(10);

    // Act
    AppAuthenticationContext actualAppAuthenticationContext =
        new AppAuthenticationContext(
            "42",
            keyStore,
            null,
            httpClientConfig,
            AuthenticationContextFactory.createIntegrationProperties());

    // Assert
    assertEquals("42", actualAppAuthenticationContext.getApplicationId());
  }

  /**
   * Test {@link AppAuthenticationContext#AppAuthenticationContext(String, KeyStore, String,
   * HttpClientConfig, IntegrationProperties)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@code null}.
   *   <li>Then return ApplicationId is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationContext#AppAuthenticationContext(String,
   * KeyStore, String, HttpClientConfig, IntegrationProperties)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AppAuthenticationContext.<init>(String, KeyStore, String, HttpClientConfig, IntegrationProperties)"
  })
  public void testNewAppAuthenticationContext_givenTen_whenNull_thenReturnApplicationIdIs422() {
    // Arrange
    HttpClientConfig httpClientConfig = new HttpClientConfig();
    httpClientConfig.setConnectTimeout(10);
    httpClientConfig.setMaxConnections(3);
    httpClientConfig.setMaxConnectionsPerRoute(3);
    httpClientConfig.setReadTimeout(10);

    // Act
    AppAuthenticationContext actualAppAuthenticationContext =
        new AppAuthenticationContext(
            "42",
            null,
            "iloveyou",
            httpClientConfig,
            AuthenticationContextFactory.createIntegrationProperties());

    // Assert
    assertEquals("42", actualAppAuthenticationContext.getApplicationId());
  }

  /**
   * Test {@link AppAuthenticationContext#AppAuthenticationContext(String, KeyStore, String,
   * HttpClientConfig, IntegrationProperties)}.
   *
   * <ul>
   *   <li>Then return ApplicationId is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationContext#AppAuthenticationContext(String,
   * KeyStore, String, HttpClientConfig, IntegrationProperties)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AppAuthenticationContext.<init>(String, KeyStore, String, HttpClientConfig, IntegrationProperties)"
  })
  public void testNewAppAuthenticationContext_thenReturnApplicationIdIs42() {
    // Arrange
    KeyStore keyStore = AuthenticationContextFactory.createKeyStore();

    HttpClientConfig httpClientConfig = new HttpClientConfig();
    httpClientConfig.setConnectTimeout(10);
    httpClientConfig.setMaxConnections(3);
    httpClientConfig.setMaxConnectionsPerRoute(3);
    httpClientConfig.setReadTimeout(10);

    // Act
    AppAuthenticationContext actualAppAuthenticationContext =
        new AppAuthenticationContext(
            "42",
            keyStore,
            "iloveyou",
            httpClientConfig,
            AuthenticationContextFactory.createIntegrationProperties());

    // Assert
    assertEquals("42", actualAppAuthenticationContext.getApplicationId());
  }

  /**
   * Test {@link AppAuthenticationContext#AppAuthenticationContext(String, KeyStore, String,
   * HttpClientConfig, IntegrationProperties)}.
   *
   * <ul>
   *   <li>Then throw {@link MissingServiceConfigurationException}.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationContext#AppAuthenticationContext(String,
   * KeyStore, String, HttpClientConfig, IntegrationProperties)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AppAuthenticationContext.<init>(String, KeyStore, String, HttpClientConfig, IntegrationProperties)"
  })
  public void testNewAppAuthenticationContext_thenThrowMissingServiceConfigurationException() {
    // Arrange
    KeyStore keyStore = AuthenticationContextFactory.createKeyStore();

    HttpClientConfig httpClientConfig = new HttpClientConfig();
    httpClientConfig.setConnectTimeout(10);
    httpClientConfig.setMaxConnections(3);
    httpClientConfig.setMaxConnectionsPerRoute(3);
    httpClientConfig.setReadTimeout(10);

    // Act and Assert
    thrown.expect(MissingServiceConfigurationException.class);
    new AppAuthenticationContext(
        "42", keyStore, "iloveyou", httpClientConfig, new IntegrationProperties());
  }

  /**
   * Test {@link AppAuthenticationContext#AppAuthenticationContext(String, KeyStore, String,
   * HttpClientConfig, IntegrationProperties)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return ApplicationId is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationContext#AppAuthenticationContext(String,
   * KeyStore, String, HttpClientConfig, IntegrationProperties)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AppAuthenticationContext.<init>(String, KeyStore, String, HttpClientConfig, IntegrationProperties)"
  })
  public void testNewAppAuthenticationContext_whenNull_thenReturnApplicationIdIs42() {
    // Arrange
    KeyStore keyStore = AuthenticationContextFactory.createKeyStore();

    // Act
    AppAuthenticationContext actualAppAuthenticationContext =
        new AppAuthenticationContext(
            "42",
            keyStore,
            "iloveyou",
            null,
            AuthenticationContextFactory.createIntegrationProperties());

    // Assert
    assertEquals("42", actualAppAuthenticationContext.getApplicationId());
  }

  /**
   * Test {@link AppAuthenticationContext#getApplicationId()}.
   *
   * <p>Method under test: {@link AppAuthenticationContext#getApplicationId()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String AppAuthenticationContext.getApplicationId()"})
  public void testGetApplicationId() {
    // Arrange
    HttpClientConfig httpClientConfig = new HttpClientConfig();
    httpClientConfig.setConnectTimeout(10);
    httpClientConfig.setMaxConnections(3);
    httpClientConfig.setMaxConnectionsPerRoute(3);
    httpClientConfig.setReadTimeout(10);
    KeyStore keyStore = AuthenticationContextFactory.createKeyStore();

    AppAuthenticationContext appAuthenticationContext =
        new AppAuthenticationContext(
            "42",
            keyStore,
            "iloveyou",
            httpClientConfig,
            AuthenticationContextFactory.createIntegrationProperties());

    // Act and Assert
    assertEquals("42", appAuthenticationContext.getApplicationId());
  }
}
