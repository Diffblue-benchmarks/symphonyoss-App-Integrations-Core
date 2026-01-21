package org.symphonyoss.integration.pod.api.client;

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
import org.symphonyoss.integration.exception.IntegrationRuntimeException;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.exception.authentication.UnauthorizedUserException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.pod.api.model.Envelope;

public class PodInfoClientDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PodInfoClient#PodInfoClient(HttpApiClient, LogMessageSource)}
   *   <li>{@link PodInfoClient#getApiClient()}
   *   <li>{@link PodInfoClient#getLogMessage()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PodInfoClient.<init>(HttpApiClient, LogMessageSource)",
    "HttpApiClient PodInfoClient.getApiClient()",
    "LogMessageSource PodInfoClient.getLogMessage()"
  })
  public void testGettersAndSetters() {
    // Arrange
    IntegrationHttpApiClient apiClient = new IntegrationHttpApiClient();
    LogMessageSource logMessage = new LogMessageSource();

    // Act
    PodInfoClient actualPodInfoClient = new PodInfoClient(apiClient, logMessage);
    HttpApiClient actualApiClient = actualPodInfoClient.getApiClient();

    // Assert
    assertTrue(actualApiClient instanceof IntegrationHttpApiClient);
    assertSame(logMessage, actualPodInfoClient.getLogMessage());
    assertSame(apiClient, actualApiClient);
  }

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
            Mockito.<Class<Envelope<Object>>>any()))
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
            Mockito.<Class<Envelope<Object>>>any()))
        .thenThrow(new RemoteApiException(401, "An error occurred"));
    PodInfoClient podInfoClient = new PodInfoClient(apiClient, mock(LogMessageSource.class));

    // Act and Assert
    thrown.expect(UnauthorizedUserException.class);
    podInfoClient.getPodInfo("ABC123");
    verify(apiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }
}
