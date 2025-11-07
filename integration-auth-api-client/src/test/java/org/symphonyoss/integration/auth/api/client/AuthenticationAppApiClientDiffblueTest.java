package org.symphonyoss.integration.auth.api.client;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import org.symphonyoss.integration.api.client.AppAuthenticationProxyApiClient;
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
   * Test {@link AuthenticationAppApiClient#authenticate(String, String)}.
   * <p>
   * Method under test: {@link AuthenticationAppApiClient#authenticate(String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"AppToken AuthenticationAppApiClient.authenticate(String, String)"})
  public void testAuthenticate() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
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
   * Test {@link AuthenticationAppApiClient#authenticate(String, String)}.
   * <ul>
   *   <li>Then throw {@link InvalidAppTokenException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationAppApiClient#authenticate(String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"AppToken AuthenticationAppApiClient.authenticate(String, String)"})
  public void testAuthenticate_thenThrowInvalidAppTokenException() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
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
   * Test {@link AuthenticationAppApiClient#authenticate(String, String)}.
   * <ul>
   *   <li>Then throw {@link UnauthorizedAppException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationAppApiClient#authenticate(String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"AppToken AuthenticationAppApiClient.authenticate(String, String)"})
  public void testAuthenticate_thenThrowUnauthorizedAppException() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
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
   * Test {@link AuthenticationAppApiClient#authenticate(String, String)}.
   * <ul>
   *   <li>Then throw {@link UnexpectedAppAuthenticationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationAppApiClient#authenticate(String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"AppToken AuthenticationAppApiClient.authenticate(String, String)"})
  public void testAuthenticate_thenThrowUnexpectedAppAuthenticationException() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenThrow(new RemoteApiException(5, "An error occurred"));

    // Act and Assert
    thrown.expect(UnexpectedAppAuthenticationException.class);
    (new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class))).authenticate("42", "ABC123");
    verify(apiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
  }

  /**
   * Test {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}.
   * <ul>
   *   <li>Then return Certificate is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PodCertificate AuthenticationAppApiClient.getPodPublicCertificate(String)"})
  public void testGetPodPublicCertificate_thenReturnCertificateIsNull() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
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
   * Test {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}.
   * <ul>
   *   <li>Then throw {@link InvalidAppTokenException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PodCertificate AuthenticationAppApiClient.getPodPublicCertificate(String)"})
  public void testGetPodPublicCertificate_thenThrowInvalidAppTokenException() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Class<Object>>any())).thenThrow(new RemoteApiException(400, "An error occurred"));

    // Act and Assert
    thrown.expect(InvalidAppTokenException.class);
    (new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class))).getPodPublicCertificate("42");
    verify(apiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }

  /**
   * Test {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}.
   * <ul>
   *   <li>Then throw {@link UnauthorizedAppException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PodCertificate AuthenticationAppApiClient.getPodPublicCertificate(String)"})
  public void testGetPodPublicCertificate_thenThrowUnauthorizedAppException() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Class<Object>>any())).thenThrow(new RemoteApiException(401, "An error occurred"));

    // Act and Assert
    thrown.expect(UnauthorizedAppException.class);
    (new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class))).getPodPublicCertificate("42");
    verify(apiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }

  /**
   * Test {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}.
   * <ul>
   *   <li>Then throw {@link UnexpectedAppAuthenticationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationAppApiClient#getPodPublicCertificate(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PodCertificate AuthenticationAppApiClient.getPodPublicCertificate(String)"})
  public void testGetPodPublicCertificate_thenThrowUnexpectedAppAuthenticationException() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Class<Object>>any())).thenThrow(new RemoteApiException(4, "An error occurred"));

    // Act and Assert
    thrown.expect(UnexpectedAppAuthenticationException.class);
    (new AuthenticationAppApiClient(apiClient, mock(LogMessageSource.class))).getPodPublicCertificate("42");
    verify(apiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }
}
