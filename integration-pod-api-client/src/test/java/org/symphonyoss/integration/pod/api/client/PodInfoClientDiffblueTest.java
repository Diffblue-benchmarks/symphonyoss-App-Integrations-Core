package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.mockito.Mockito;
import org.symphonyoss.integration.api.client.AppAuthenticationProxyApiClient;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.pod.api.model.Envelope;
import org.symphonyoss.integration.pod.api.model.PodInfo;

public class PodInfoClientDiffblueTest {
  /**
   * Test {@link PodInfoClient#getPodInfo(String)}.
   *
   * <ul>
   *   <li>Given {@link Envelope} {@link Envelope#getData()} return {@link HashMap#HashMap()}.
   *   <li>Then return PodId is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link PodInfoClient#getPodInfo(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"PodInfo PodInfoClient.getPodInfo(String)"})
  public void testGetPodInfo_givenEnvelopeGetDataReturnHashMap_thenReturnPodIdIsNull()
      throws RemoteApiException {
    // Arrange
    Envelope<Object> envelope = mock(Envelope.class);
    when(envelope.getData()).thenReturn(new HashMap<>());
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<Object>>any()))
        .thenReturn(envelope);

    // Act
    PodInfo actualPodInfo =
        new PodInfoClient(apiClient, new LogMessageSource()).getPodInfo("ABC123");

    // Assert
    verify(apiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(envelope).getData();
    assertNull(actualPodInfo.getExternalPodId());
    assertNull(actualPodInfo.getPodId());
  }

  /**
   * Test {@link PodInfoClient#getPodInfo(String)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code podId} is {@code 42}.
   *   <li>Then return PodId is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PodInfoClient#getPodInfo(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"PodInfo PodInfoClient.getPodInfo(String)"})
  public void testGetPodInfo_givenHashMapPodIdIs42_thenReturnPodIdIs42() throws RemoteApiException {
    // Arrange
    HashMap<Object, Object> objectObjectMap = new HashMap<>();
    objectObjectMap.put("podId", "42");
    Envelope<Object> envelope = mock(Envelope.class);
    when(envelope.getData()).thenReturn(objectObjectMap);
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<Object>>any()))
        .thenReturn(envelope);

    // Act
    PodInfo actualPodInfo =
        new PodInfoClient(apiClient, new LogMessageSource()).getPodInfo("ABC123");

    // Assert
    verify(apiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(envelope).getData();
    assertEquals("42", actualPodInfo.getPodId());
    assertNull(actualPodInfo.getExternalPodId());
  }
}
