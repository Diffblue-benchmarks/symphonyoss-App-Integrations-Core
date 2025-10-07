package org.symphonyoss.integration.pod.api.client;

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
import org.symphonyoss.integration.exception.IntegrationRuntimeException;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.exception.authentication.UnauthorizedUserException;
import org.symphonyoss.integration.logging.LogMessageSource;

public class PodInfoClientDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link PodInfoClient#getPodInfo(String)}.
   *
   * <ul>
   *   <li>Then throw {@link IntegrationRuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link PodInfoClient#getPodInfo(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.symphonyoss.integration.pod.api.model.PodInfo PodInfoClient.getPodInfo(String)"
  })
  public void testGetPodInfo_thenThrowIntegrationRuntimeException() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<Object>>any()))
        .thenThrow(new RemoteApiException(1, "An error occurred"));
    PodInfoClient podInfoClient = new PodInfoClient(apiClient, mock(LogMessageSource.class));

    // Act and Assert
    thrown.expect(IntegrationRuntimeException.class);
    podInfoClient.getPodInfo("ABC123");
    verify(apiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }

  /**
   * Test {@link PodInfoClient#getPodInfo(String)}.
   *
   * <ul>
   *   <li>Then throw {@link UnauthorizedUserException}.
   * </ul>
   *
   * <p>Method under test: {@link PodInfoClient#getPodInfo(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.symphonyoss.integration.pod.api.model.PodInfo PodInfoClient.getPodInfo(String)"
  })
  public void testGetPodInfo_thenThrowUnauthorizedUserException() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<Object>>any()))
        .thenThrow(new RemoteApiException(401, "An error occurred"));
    PodInfoClient podInfoClient = new PodInfoClient(apiClient, mock(LogMessageSource.class));

    // Act and Assert
    thrown.expect(UnauthorizedUserException.class);
    podInfoClient.getPodInfo("ABC123");
    verify(apiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }
}
