package org.symphonyoss.integration.authentication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
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

public class UserAuthenticationContextDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link UserAuthenticationContext#UserAuthenticationContext(String, KeyStore, String,
   * HttpClientConfig, IntegrationProperties)}.
   *
   * <ul>
   *   <li>Given {@link ProxyConnectionInfo} (default constructor) Password is {@code iloveyou}.
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
  public void testNewUserAuthenticationContext_givenProxyConnectionInfoPasswordIsIloveyou() {
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
    UserAuthenticationContext actualUserAuthenticationContext =
        new UserAuthenticationContext("42", keyStore, "iloveyou", httpClientConfig, properties);

    // Assert
    assertEquals("42", actualUserAuthenticationContext.getUserId());
    AuthenticationToken previousToken = actualUserAuthenticationContext.getPreviousToken();
    assertEquals(0L, previousToken.getAuthenticationTime());
    assertFalse(actualUserAuthenticationContext.isAuthenticated());
    assertEquals(AuthenticationToken.VOID_KM_TOKEN, previousToken.getKeyManagerToken());
    assertEquals(AuthenticationToken.VOID_KM_TOKEN, previousToken.getSessionToken());
    assertSame(previousToken, actualUserAuthenticationContext.getToken());
  }

  /**
   * Test {@link UserAuthenticationContext#UserAuthenticationContext(String, KeyStore, String,
   * HttpClientConfig, IntegrationProperties)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@code null}.
   *   <li>Then return UserId is {@code 42}.
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
  public void testNewUserAuthenticationContext_givenTen_whenNull_thenReturnUserIdIs42() {
    // Arrange
    KeyStore keyStore = AuthenticationContextFactory.createKeyStore();

    HttpClientConfig httpClientConfig = new HttpClientConfig();
    httpClientConfig.setConnectTimeout(10);
    httpClientConfig.setMaxConnections(3);
    httpClientConfig.setMaxConnectionsPerRoute(3);
    httpClientConfig.setReadTimeout(10);

    // Act
    UserAuthenticationContext actualUserAuthenticationContext =
        new UserAuthenticationContext(
            "42",
            keyStore,
            null,
            httpClientConfig,
            AuthenticationContextFactory.createIntegrationProperties());

    // Assert
    assertEquals("42", actualUserAuthenticationContext.getUserId());
    AuthenticationToken previousToken = actualUserAuthenticationContext.getPreviousToken();
    assertEquals(0L, previousToken.getAuthenticationTime());
    assertFalse(actualUserAuthenticationContext.isAuthenticated());
    assertEquals(AuthenticationToken.VOID_KM_TOKEN, previousToken.getKeyManagerToken());
    assertEquals(AuthenticationToken.VOID_KM_TOKEN, previousToken.getSessionToken());
    assertSame(previousToken, actualUserAuthenticationContext.getToken());
  }

  /**
   * Test {@link UserAuthenticationContext#UserAuthenticationContext(String, KeyStore, String,
   * HttpClientConfig, IntegrationProperties)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@code null}.
   *   <li>Then return UserId is {@code 42}.
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
  public void testNewUserAuthenticationContext_givenTen_whenNull_thenReturnUserIdIs422() {
    // Arrange
    HttpClientConfig httpClientConfig = new HttpClientConfig();
    httpClientConfig.setConnectTimeout(10);
    httpClientConfig.setMaxConnections(3);
    httpClientConfig.setMaxConnectionsPerRoute(3);
    httpClientConfig.setReadTimeout(10);

    // Act
    UserAuthenticationContext actualUserAuthenticationContext =
        new UserAuthenticationContext(
            "42",
            null,
            "iloveyou",
            httpClientConfig,
            AuthenticationContextFactory.createIntegrationProperties());

    // Assert
    assertEquals("42", actualUserAuthenticationContext.getUserId());
    AuthenticationToken previousToken = actualUserAuthenticationContext.getPreviousToken();
    assertEquals(0L, previousToken.getAuthenticationTime());
    assertFalse(actualUserAuthenticationContext.isAuthenticated());
    assertEquals(AuthenticationToken.VOID_KM_TOKEN, previousToken.getKeyManagerToken());
    assertEquals(AuthenticationToken.VOID_KM_TOKEN, previousToken.getSessionToken());
    assertSame(previousToken, actualUserAuthenticationContext.getToken());
  }

  /**
   * Test {@link UserAuthenticationContext#UserAuthenticationContext(String, KeyStore, String,
   * HttpClientConfig, IntegrationProperties)}.
   *
   * <ul>
   *   <li>Then return UserId is {@code 42}.
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
  public void testNewUserAuthenticationContext_thenReturnUserIdIs42() {
    // Arrange
    KeyStore keyStore = AuthenticationContextFactory.createKeyStore();

    HttpClientConfig httpClientConfig = new HttpClientConfig();
    httpClientConfig.setConnectTimeout(10);
    httpClientConfig.setMaxConnections(3);
    httpClientConfig.setMaxConnectionsPerRoute(3);
    httpClientConfig.setReadTimeout(10);

    // Act
    UserAuthenticationContext actualUserAuthenticationContext =
        new UserAuthenticationContext(
            "42",
            keyStore,
            "iloveyou",
            httpClientConfig,
            AuthenticationContextFactory.createIntegrationProperties());

    // Assert
    assertEquals("42", actualUserAuthenticationContext.getUserId());
    AuthenticationToken previousToken = actualUserAuthenticationContext.getPreviousToken();
    assertEquals(0L, previousToken.getAuthenticationTime());
    assertFalse(actualUserAuthenticationContext.isAuthenticated());
    assertEquals(AuthenticationToken.VOID_KM_TOKEN, previousToken.getKeyManagerToken());
    assertEquals(AuthenticationToken.VOID_KM_TOKEN, previousToken.getSessionToken());
    assertSame(previousToken, actualUserAuthenticationContext.getToken());
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
  public void testNewUserAuthenticationContext_thenThrowMissingServiceConfigurationException() {
    // Arrange
    KeyStore keyStore = AuthenticationContextFactory.createKeyStore();

    HttpClientConfig httpClientConfig = new HttpClientConfig();
    httpClientConfig.setConnectTimeout(10);
    httpClientConfig.setMaxConnections(3);
    httpClientConfig.setMaxConnectionsPerRoute(3);
    httpClientConfig.setReadTimeout(10);

    // Act and Assert
    thrown.expect(MissingServiceConfigurationException.class);
    new UserAuthenticationContext(
        "42", keyStore, "iloveyou", httpClientConfig, new IntegrationProperties());
  }

  /**
   * Test {@link UserAuthenticationContext#UserAuthenticationContext(String, KeyStore, String,
   * HttpClientConfig, IntegrationProperties)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return UserId is {@code 42}.
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
  public void testNewUserAuthenticationContext_whenNull_thenReturnUserIdIs42() {
    // Arrange
    KeyStore keyStore = AuthenticationContextFactory.createKeyStore();

    // Act
    UserAuthenticationContext actualUserAuthenticationContext =
        new UserAuthenticationContext(
            "42",
            keyStore,
            "iloveyou",
            null,
            AuthenticationContextFactory.createIntegrationProperties());

    // Assert
    assertEquals("42", actualUserAuthenticationContext.getUserId());
    AuthenticationToken previousToken = actualUserAuthenticationContext.getPreviousToken();
    assertEquals(0L, previousToken.getAuthenticationTime());
    assertFalse(actualUserAuthenticationContext.isAuthenticated());
    assertEquals(AuthenticationToken.VOID_KM_TOKEN, previousToken.getKeyManagerToken());
    assertEquals(AuthenticationToken.VOID_KM_TOKEN, previousToken.getSessionToken());
    assertSame(previousToken, actualUserAuthenticationContext.getToken());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserAuthenticationContext#invalidateAuthentication()}
   *   <li>{@link UserAuthenticationContext#getPreviousToken()}
   *   <li>{@link UserAuthenticationContext#getToken()}
   *   <li>{@link UserAuthenticationContext#getUserId()}
   *   <li>{@link UserAuthenticationContext#isAuthenticated()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "AuthenticationToken UserAuthenticationContext.getPreviousToken()",
    "AuthenticationToken UserAuthenticationContext.getToken()",
    "String UserAuthenticationContext.getUserId()",
    "void UserAuthenticationContext.invalidateAuthentication()",
    "boolean UserAuthenticationContext.isAuthenticated()"
  })
  public void testGettersAndSetters() {
    // Arrange
    HttpClientConfig httpClientConfig = new HttpClientConfig();
    httpClientConfig.setConnectTimeout(10);
    httpClientConfig.setMaxConnections(3);
    httpClientConfig.setMaxConnectionsPerRoute(3);
    httpClientConfig.setReadTimeout(10);
    KeyStore keyStore = AuthenticationContextFactory.createKeyStore();

    UserAuthenticationContext userAuthenticationContext =
        new UserAuthenticationContext(
            "42",
            keyStore,
            "iloveyou",
            httpClientConfig,
            AuthenticationContextFactory.createIntegrationProperties());

    // Act
    userAuthenticationContext.invalidateAuthentication();
    AuthenticationToken actualPreviousToken = userAuthenticationContext.getPreviousToken();
    AuthenticationToken actualToken = userAuthenticationContext.getToken();
    String actualUserId = userAuthenticationContext.getUserId();

    // Assert
    assertEquals("42", actualUserId);
    assertFalse(userAuthenticationContext.isAuthenticated());
    AuthenticationToken authenticationToken = AuthenticationToken.VOID_AUTH_TOKEN;
    assertSame(authenticationToken, actualPreviousToken);
    assertSame(authenticationToken, actualToken);
  }

  /**
   * Test {@link UserAuthenticationContext#setToken(AuthenticationToken)}.
   *
   * <ul>
   *   <li>Then createUserAuthenticationContext Authenticated.
   * </ul>
   *
   * <p>Method under test: {@link UserAuthenticationContext#setToken(AuthenticationToken)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserAuthenticationContext.setToken(AuthenticationToken)"})
  public void testSetToken_thenCreateUserAuthenticationContextAuthenticated() {
    // Arrange
    UserAuthenticationContext createUserAuthenticationContextResult =
        AuthenticationContextFactory.createUserAuthenticationContext();
    AuthenticationToken newToken = new AuthenticationToken("ABC123", "ABC123");

    // Act
    createUserAuthenticationContextResult.setToken(newToken);

    // Assert
    assertTrue(createUserAuthenticationContextResult.isAuthenticated());
    assertSame(newToken, createUserAuthenticationContextResult.getToken());
  }

  /**
   * Test {@link UserAuthenticationContext#setToken(AuthenticationToken)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then not createUserAuthenticationContext Authenticated.
   * </ul>
   *
   * <p>Method under test: {@link UserAuthenticationContext#setToken(AuthenticationToken)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserAuthenticationContext.setToken(AuthenticationToken)"})
  public void testSetToken_whenNull_thenNotCreateUserAuthenticationContextAuthenticated() {
    // Arrange
    UserAuthenticationContext createUserAuthenticationContextResult =
        AuthenticationContextFactory.createUserAuthenticationContext();

    // Act
    createUserAuthenticationContextResult.setToken(null);

    // Assert that nothing has changed
    assertFalse(createUserAuthenticationContextResult.isAuthenticated());
  }
}
