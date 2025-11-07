package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.mockito.Mockito;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.pod.api.model.Envelope;
import org.symphonyoss.integration.pod.api.model.PodInfo;

public class PodInfoClientDiffblueTest {
  /**
   * Method under test: {@link PodInfoClient#getPodInfo(String)}
   */
  @Test
  public void testGetPodInfo() throws RemoteApiException {
    // Arrange
    Envelope<Object> envelope = mock(Envelope.class);
    when(envelope.getData()).thenReturn(new HashMap<>());
    HttpApiClient apiClient = mock(HttpApiClient.class);
    when(apiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Class<Object>>any())).thenReturn(envelope);

    // Act
    PodInfo actualPodInfo = (new PodInfoClient(apiClient, new LogMessageSource())).getPodInfo("ABC123");

    // Assert
    verify(apiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(envelope).getData();
    assertNull(actualPodInfo.getExternalPodId());
    assertNull(actualPodInfo.getPodId());
  }
}
