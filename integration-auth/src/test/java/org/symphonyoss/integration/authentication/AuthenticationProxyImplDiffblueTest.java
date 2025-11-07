package org.symphonyoss.integration.authentication;

import static org.junit.Assert.assertFalse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.auth.api.client.KmAuthHttpApiClient;
import org.symphonyoss.integration.auth.api.client.PodAuthHttpApiClient;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;
import org.symphonyoss.integration.authentication.exception.UnregisteredSessionTokenException;
import org.symphonyoss.integration.authentication.exception.UnregisteredUserAuthException;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.exception.authentication.AuthenticationException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

@ContextConfiguration(classes = {AuthenticationProxyImpl.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthenticationProxyImplDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Autowired
  private AuthenticationProxyImpl authenticationProxyImpl;

  @Autowired
  private IntegrationProperties integrationProperties;

  @MockBean
  private KmAuthHttpApiClient kmAuthHttpApiClient;

  @MockBean
  private LogMessageSource logMessageSource;

  @MockBean
  private PodAuthHttpApiClient podAuthHttpApiClient;

  /**
   * Method under test: {@link AuthenticationProxyImpl#authenticate(String)}
   */
  @Test
  public void testAuthenticate() throws AuthenticationException {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredUserAuthException.class);
    authenticationProxyImpl.authenticate("42");
  }

  /**
   * Method under test: {@link AuthenticationProxyImpl#isAuthenticated(String)}
   */
  @Test
  public void testIsAuthenticated() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredUserAuthException.class);
    authenticationProxyImpl.isAuthenticated("User");
  }

  /**
   * Method under test: {@link AuthenticationProxyImpl#invalidate(String)}
   */
  @Test
  public void testInvalidate() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredUserAuthException.class);
    authenticationProxyImpl.invalidate("42");
  }

  /**
   * Method under test: {@link AuthenticationProxyImpl#getToken(String)}
   */
  @Test
  public void testGetToken() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredUserAuthException.class);
    authenticationProxyImpl.getToken("42");
  }

  /**
   * Method under test: {@link AuthenticationProxyImpl#getSessionToken(String)}
   */
  @Test
  public void testGetSessionToken() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredUserAuthException.class);
    authenticationProxyImpl.getSessionToken("42");
  }

  /**
   * Method under test:
   * {@link AuthenticationProxyImpl#reAuthSessionOrThrow(String, RemoteApiException)}
   */
  @Test
  public void testReAuthSessionOrThrow() throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredSessionTokenException.class);
    authenticationProxyImpl.reAuthSessionOrThrow("ABC123", new RemoteApiException(1, "An error occurred"));
  }

  /**
   * Method under test:
   * {@link AuthenticationProxyImpl#sessionNoLongerEntitled(int)}
   */
  @Test
  public void testSessionNoLongerEntitled() {
    // Arrange, Act and Assert
    assertFalse(authenticationProxyImpl.sessionNoLongerEntitled(1));
  }

  /**
   * Method under test: {@link AuthenticationProxyImpl#sessionUnauthorized(int)}
   */
  @Test
  public void testSessionUnauthorized() {
    // Arrange, Act and Assert
    assertFalse(authenticationProxyImpl.sessionUnauthorized(1));
  }

  /**
   * Method under test:
   * {@link AuthenticationProxyImpl#httpClientForUser(String, ServiceName)}
   */
  @Test
  public void testHttpClientForUser() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredUserAuthException.class);
    authenticationProxyImpl.httpClientForUser("https://example.org/example", ServiceName.POD_SESSION_MANAGER);
  }

  /**
   * Method under test:
   * {@link AuthenticationProxyImpl#httpClientForSessionToken(String, ServiceName)}
   */
  @Test
  public void testHttpClientForSessionToken() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredSessionTokenException.class);
    authenticationProxyImpl.httpClientForSessionToken("https://example.org/example", ServiceName.POD_SESSION_MANAGER);
  }
}
