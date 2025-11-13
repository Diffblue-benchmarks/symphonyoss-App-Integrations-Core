package org.symphonyoss.integration.authentication;

import static org.junit.Assert.assertFalse;
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
  @Autowired private AuthenticationProxyImpl authenticationProxyImpl;

  @Autowired private IntegrationProperties integrationProperties;

  @MockBean private KmAuthHttpApiClient kmAuthHttpApiClient;

  @MockBean private LogMessageSource logMessageSource;

  @MockBean private PodAuthHttpApiClient podAuthHttpApiClient;

  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link AuthenticationProxyImpl#authenticate(String)}.
   *
   * <ul>
   *   <li>Given {@link LogMessageSource}.
   *   <li>Then throw {@link UnregisteredUserAuthException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationProxyImpl#authenticate(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void AuthenticationProxyImpl.authenticate(String)"})
  public void testAuthenticate_givenLogMessageSource_thenThrowUnregisteredUserAuthException()
      throws AuthenticationException {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredUserAuthException.class);
    authenticationProxyImpl.authenticate("42");
  }

  /**
   * Test {@link AuthenticationProxyImpl#isAuthenticated(String)}.
   *
   * <ul>
   *   <li>Given {@link LogMessageSource}.
   *   <li>Then throw {@link UnregisteredUserAuthException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationProxyImpl#isAuthenticated(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthenticationProxyImpl.isAuthenticated(String)"})
  public void testIsAuthenticated_givenLogMessageSource_thenThrowUnregisteredUserAuthException() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredUserAuthException.class);
    authenticationProxyImpl.isAuthenticated("User");
  }

  /**
   * Test {@link AuthenticationProxyImpl#invalidate(String)}.
   *
   * <ul>
   *   <li>Given {@link LogMessageSource}.
   *   <li>Then throw {@link UnregisteredUserAuthException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationProxyImpl#invalidate(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void AuthenticationProxyImpl.invalidate(String)"})
  public void testInvalidate_givenLogMessageSource_thenThrowUnregisteredUserAuthException() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredUserAuthException.class);
    authenticationProxyImpl.invalidate("42");
  }

  /**
   * Test {@link AuthenticationProxyImpl#getToken(String)}.
   *
   * <ul>
   *   <li>Given {@link LogMessageSource}.
   *   <li>When {@code 42}.
   *   <li>Then throw {@link UnregisteredUserAuthException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationProxyImpl#getToken(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.symphonyoss.integration.authentication.AuthenticationToken AuthenticationProxyImpl.getToken(String)"
  })
  public void testGetToken_givenLogMessageSource_when42_thenThrowUnregisteredUserAuthException() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredUserAuthException.class);
    authenticationProxyImpl.getToken("42");
  }

  /**
   * Test {@link AuthenticationProxyImpl#getSessionToken(String)}.
   *
   * <ul>
   *   <li>Given {@link LogMessageSource}.
   *   <li>Then throw {@link UnregisteredUserAuthException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationProxyImpl#getSessionToken(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String AuthenticationProxyImpl.getSessionToken(String)"})
  public void testGetSessionToken_givenLogMessageSource_thenThrowUnregisteredUserAuthException() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredUserAuthException.class);
    authenticationProxyImpl.getSessionToken("42");
  }

  /**
   * Test {@link AuthenticationProxyImpl#reAuthSessionOrThrow(String, RemoteApiException)}.
   *
   * <p>Method under test: {@link AuthenticationProxyImpl#reAuthSessionOrThrow(String,
   * RemoteApiException)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.symphonyoss.integration.authentication.AuthenticationToken AuthenticationProxyImpl.reAuthSessionOrThrow(String, RemoteApiException)"
  })
  public void testReAuthSessionOrThrow() throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredSessionTokenException.class);
    authenticationProxyImpl.reAuthSessionOrThrow(
        "ABC123", new RemoteApiException(1, "An error occurred"));
  }

  /**
   * Test {@link AuthenticationProxyImpl#sessionNoLongerEntitled(int)}.
   *
   * <p>Method under test: {@link AuthenticationProxyImpl#sessionNoLongerEntitled(int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthenticationProxyImpl.sessionNoLongerEntitled(int)"})
  public void testSessionNoLongerEntitled() {
    // Arrange, Act and Assert
    assertFalse(authenticationProxyImpl.sessionNoLongerEntitled(1));
  }

  /**
   * Test {@link AuthenticationProxyImpl#sessionUnauthorized(int)}.
   *
   * <p>Method under test: {@link AuthenticationProxyImpl#sessionUnauthorized(int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AuthenticationProxyImpl.sessionUnauthorized(int)"})
  public void testSessionUnauthorized() {
    // Arrange, Act and Assert
    assertFalse(authenticationProxyImpl.sessionUnauthorized(1));
  }

  /**
   * Test {@link AuthenticationProxyImpl#httpClientForUser(String, ServiceName)}.
   *
   * <ul>
   *   <li>Then throw {@link UnregisteredUserAuthException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationProxyImpl#httpClientForUser(String, ServiceName)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "javax.ws.rs.client.Client AuthenticationProxyImpl.httpClientForUser(String, ServiceName)"
  })
  public void testHttpClientForUser_thenThrowUnregisteredUserAuthException() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredUserAuthException.class);
    authenticationProxyImpl.httpClientForUser(
        "https://example.org/example", ServiceName.POD_SESSION_MANAGER);
  }

  /**
   * Test {@link AuthenticationProxyImpl#httpClientForSessionToken(String, ServiceName)}.
   *
   * <p>Method under test: {@link AuthenticationProxyImpl#httpClientForSessionToken(String,
   * ServiceName)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "javax.ws.rs.client.Client AuthenticationProxyImpl.httpClientForSessionToken(String, ServiceName)"
  })
  public void testHttpClientForSessionToken() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredSessionTokenException.class);
    authenticationProxyImpl.httpClientForSessionToken(
        "https://example.org/example", ServiceName.POD_SESSION_MANAGER);
  }
}
