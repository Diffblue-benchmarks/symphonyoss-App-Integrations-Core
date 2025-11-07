package org.symphonyoss.integration.auth.api.client;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.auth.api.exception.InvalidAppTokenException;
import org.symphonyoss.integration.auth.api.exception.UnauthorizedAppException;
import org.symphonyoss.integration.auth.api.exception.UnexpectedAppAuthenticationException;
import org.symphonyoss.integration.authentication.api.model.AppToken;
import org.symphonyoss.integration.authentication.api.model.PodCertificate;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;

public class AuthenticationAppApiClientDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test:
   * {@link AuthenticationAppApiClient#authenticate(String, String)}
   */
  @Test
  public void testAuthenticate() throws RemoteApiException {
    // Arrange
    HttpApiClient apiClient = mock(HttpApiClient.class);
    AppToken appToken = new AppToken("42", "ABC123", "ABC123");

    when(apiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenReturn(appToken);

    // Act
    AppToken actualAuthenticateResult = (new AuthenticationAppApiClient(apiClient, new LogMessageSource()))
        .authenticate("42", "ABC123");

    // Assert
    verify(apiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
    assertSame(appToken, actualAuthenticateResult);
  }

  /**
   * Method under test:
   * {@link AuthenticationAppApiClient#authenticate(String, String)}
   */
  @Test
  public void testAuthenticate2() throws RemoteApiException {
    // Arrange
    HttpApiClient apiClient = mock(HttpApiClient.class);
    when(apiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenThrow(new RemoteApiException(5, "An error occurred"));

    // Act and Assert
    thrown.expect(UnexpectedAppAuthenticationException.class);
    (new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class))).authenticate("42", "ABC123");
    verify(apiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
  }

  /**
   * Method under test:
   * {@link AuthenticationAppApiClient#authenticate(String, String)}
   */
  @Test
  public void testAuthenticate3() throws RemoteApiException {
    // Arrange
    HttpApiClient apiClient = mock(HttpApiClient.class);
    when(apiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Object>any(), Mockito.<Class<Object>>any()))
            .thenThrow(new RemoteApiException(401, "An error occurred"));

    // Act and Assert
    thrown.expect(UnauthorizedAppException.class);
    (new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class))).authenticate("42", "ABC123");
    verify(apiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
  }

  /**
   * Method under test:
   * {@link AuthenticationAppApiClient#authenticate(String, String)}
   */
  @Test
  public void testAuthenticate4() throws RemoteApiException {
    // Arrange
    HttpApiClient apiClient = mock(HttpApiClient.class);
    when(apiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Object>any(), Mockito.<Class<Object>>any()))
            .thenThrow(new RemoteApiException(400, "An error occurred"));

    // Act and Assert
    thrown.expect(InvalidAppTokenException.class);
    (new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class))).authenticate("42", "ABC123");
    verify(apiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
  }

  /**
   * Method under test:
   * {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}
   */
  @Test
  public void testGetPodPublicCertificate() throws RemoteApiException {
    // Arrange
    HttpApiClient apiClient = mock(HttpApiClient.class);
    PodCertificate podCertificate = new PodCertificate();
    when(apiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Class<Object>>any())).thenReturn(podCertificate);

    // Act
    PodCertificate actualPodPublicCertificate = (new AuthenticationAppApiClient(apiClient, new LogMessageSource()))
        .getPodPublicCertificate("42");

    // Assert
    verify(apiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    assertNull(actualPodPublicCertificate.getCertificate());
    assertSame(podCertificate, actualPodPublicCertificate);
  }

  /**
   * Method under test:
   * {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}
   */
  @Test
  public void testGetPodPublicCertificate2() throws RemoteApiException {
    // Arrange
    HttpApiClient apiClient = mock(HttpApiClient.class);
    when(apiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Class<Object>>any())).thenThrow(new RemoteApiException(4, "An error occurred"));

    // Act and Assert
    thrown.expect(UnexpectedAppAuthenticationException.class);
    (new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class))).getPodPublicCertificate("42");
    verify(apiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }

  /**
   * Method under test:
   * {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}
   */
  @Test
  public void testGetPodPublicCertificate3() throws RemoteApiException {
    // Arrange
    HttpApiClient apiClient = mock(HttpApiClient.class);
    when(apiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Class<Object>>any())).thenThrow(new RemoteApiException(401, "An error occurred"));

    // Act and Assert
    thrown.expect(UnauthorizedAppException.class);
    (new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class))).getPodPublicCertificate("42");
    verify(apiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }

  /**
   * Method under test:
   * {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}
   */
  @Test
  public void testGetPodPublicCertificate4() throws RemoteApiException {
    // Arrange
    HttpApiClient apiClient = mock(HttpApiClient.class);
    when(apiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Class<Object>>any())).thenThrow(new RemoteApiException(400, "An error occurred"));

    // Act and Assert
    thrown.expect(InvalidAppTokenException.class);
    (new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class))).getPodPublicCertificate("42");
    verify(apiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }
}
