package org.symphonyoss.integration.auth.api.client;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import org.symphonyoss.integration.api.client.AppAuthenticationProxyApiClient;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.auth.api.exception.InvalidAppTokenException;
import org.symphonyoss.integration.auth.api.exception.UnauthorizedAppException;
import org.symphonyoss.integration.auth.api.exception.UnexpectedAppAuthenticationException;
import org.symphonyoss.integration.authentication.api.model.AppToken;
import org.symphonyoss.integration.authentication.api.model.PodCertificate;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;

public class AuthenticationAppApiClientDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AuthenticationAppApiClient#AuthenticationAppApiClient(HttpApiClient,
   *       LogMessageSource)}
   *   <li>{@link AuthenticationAppApiClient#getApiClient()}
   *   <li>{@link AuthenticationAppApiClient#getLogMessage()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AuthenticationAppApiClient.<init>(HttpApiClient, LogMessageSource)",
    "HttpApiClient AuthenticationAppApiClient.getApiClient()",
    "LogMessageSource AuthenticationAppApiClient.getLogMessage()"
  })
  public void testGettersAndSetters() {
    // Arrange
    KmAuthHttpApiClient apiClient = new KmAuthHttpApiClient();
    LogMessageSource logMessage = new LogMessageSource();

    // Act
    AuthenticationAppApiClient actualAuthenticationAppApiClient =
        new AuthenticationAppApiClient(apiClient, logMessage);
    HttpApiClient actualApiClient = actualAuthenticationAppApiClient.getApiClient();

    // Assert
    assertTrue(actualApiClient instanceof KmAuthHttpApiClient);
    assertSame(apiClient, actualApiClient);
    assertSame(logMessage, actualAuthenticationAppApiClient.getLogMessage());
  }

  /**
   * Test {@link AuthenticationAppApiClient#authenticate(String, String)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationAppApiClient#authenticate(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"AppToken AuthenticationAppApiClient.authenticate(String, String)"})
  public void testAuthenticate_thenReturnNull() {
    // Arrange
    AuthenticationAppApiClient authenticationAppApiClient =
        new AuthenticationAppApiClient(
            mock(AppAuthenticationProxyApiClient.class), mock(LogMessageSource.class));

    // Act and Assert
    assertNull(authenticationAppApiClient.authenticate("42", "ABC123"));
  }

  /**
   * Test {@link AuthenticationAppApiClient#authenticate(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link InvalidAppTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationAppApiClient#authenticate(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"AppToken AuthenticationAppApiClient.authenticate(String, String)"})
  public void testAuthenticate_thenThrowInvalidAppTokenException() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doPost(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Object>any(),
            Mockito.<Class<AppToken>>any()))
        .thenThrow(new RemoteApiException(400, "An error occurred"));
    AuthenticationAppApiClient authenticationAppApiClient =
        new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class));

    // Act and Assert
    thrown.expect(InvalidAppTokenException.class);
    authenticationAppApiClient.authenticate("42", "ABC123");
    verify(apiClient)
        .doPost(
            Mockito.<String>any(),
            isA(Map.class),
            isA(Map.class),
            isA(Object.class),
            isA(Class.class));
  }

  /**
   * Test {@link AuthenticationAppApiClient#authenticate(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link UnauthorizedAppException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationAppApiClient#authenticate(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"AppToken AuthenticationAppApiClient.authenticate(String, String)"})
  public void testAuthenticate_thenThrowUnauthorizedAppException() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doPost(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Object>any(),
            Mockito.<Class<AppToken>>any()))
        .thenThrow(new RemoteApiException(401, "An error occurred"));
    AuthenticationAppApiClient authenticationAppApiClient =
        new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class));

    // Act and Assert
    thrown.expect(UnauthorizedAppException.class);
    authenticationAppApiClient.authenticate("42", "ABC123");
    verify(apiClient)
        .doPost(
            Mockito.<String>any(),
            isA(Map.class),
            isA(Map.class),
            isA(Object.class),
            isA(Class.class));
  }

  /**
   * Test {@link AuthenticationAppApiClient#authenticate(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link UnexpectedAppAuthenticationException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationAppApiClient#authenticate(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"AppToken AuthenticationAppApiClient.authenticate(String, String)"})
  public void testAuthenticate_thenThrowUnexpectedAppAuthenticationException()
      throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doPost(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Object>any(),
            Mockito.<Class<AppToken>>any()))
        .thenThrow(new RemoteApiException(1, "An error occurred"));
    AuthenticationAppApiClient authenticationAppApiClient =
        new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class));

    // Act and Assert
    thrown.expect(UnexpectedAppAuthenticationException.class);
    authenticationAppApiClient.authenticate("42", "ABC123");
    verify(apiClient)
        .doPost(
            Mockito.<String>any(),
            isA(Map.class),
            isA(Map.class),
            isA(Object.class),
            isA(Class.class));
  }

  /**
   * Test {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"PodCertificate AuthenticationAppApiClient.getPodPublicCertificate(String)"})
  public void testGetPodPublicCertificate_thenReturnNull() {
    // Arrange
    AuthenticationAppApiClient authenticationAppApiClient =
        new AuthenticationAppApiClient(
            mock(AppAuthenticationProxyApiClient.class), mock(LogMessageSource.class));

    // Act and Assert
    assertNull(authenticationAppApiClient.getPodPublicCertificate("42"));
  }

  /**
   * Test {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}.
   *
   * <ul>
   *   <li>Then throw {@link InvalidAppTokenException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"PodCertificate AuthenticationAppApiClient.getPodPublicCertificate(String)"})
  public void testGetPodPublicCertificate_thenThrowInvalidAppTokenException()
      throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<PodCertificate>>any()))
        .thenThrow(new RemoteApiException(400, "An error occurred"));
    AuthenticationAppApiClient authenticationAppApiClient =
        new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class));

    // Act and Assert
    thrown.expect(InvalidAppTokenException.class);
    authenticationAppApiClient.getPodPublicCertificate("42");
    verify(apiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }

  /**
   * Test {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}.
   *
   * <ul>
   *   <li>Then throw {@link UnauthorizedAppException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"PodCertificate AuthenticationAppApiClient.getPodPublicCertificate(String)"})
  public void testGetPodPublicCertificate_thenThrowUnauthorizedAppException()
      throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<PodCertificate>>any()))
        .thenThrow(new RemoteApiException(401, "An error occurred"));
    AuthenticationAppApiClient authenticationAppApiClient =
        new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class));

    // Act and Assert
    thrown.expect(UnauthorizedAppException.class);
    authenticationAppApiClient.getPodPublicCertificate("42");
    verify(apiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }

  /**
   * Test {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}.
   *
   * <ul>
   *   <li>Then throw {@link UnexpectedAppAuthenticationException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"PodCertificate AuthenticationAppApiClient.getPodPublicCertificate(String)"})
  public void testGetPodPublicCertificate_thenThrowUnexpectedAppAuthenticationException()
      throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<PodCertificate>>any()))
        .thenThrow(new RemoteApiException(1, "An error occurred"));
    AuthenticationAppApiClient authenticationAppApiClient =
        new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class));

    // Act and Assert
    thrown.expect(UnexpectedAppAuthenticationException.class);
    authenticationAppApiClient.getPodPublicCertificate("42");
    verify(apiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }
}
