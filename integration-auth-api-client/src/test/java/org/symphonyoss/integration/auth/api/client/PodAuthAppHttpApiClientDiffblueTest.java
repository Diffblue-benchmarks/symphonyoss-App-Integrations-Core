package org.symphonyoss.integration.auth.api.client;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.symphonyoss.integration.api.client.metrics.MetricsHttpApiClient;

@RunWith(MockitoJUnitRunner.class)
public class PodAuthAppHttpApiClientDiffblueTest {
  @InjectMocks
  private PodAuthAppHttpApiClient podAuthAppHttpApiClient;

  /**
   * Test {@link PodAuthAppHttpApiClient#buildHttpClient(String)}.
   * <p>
   * Method under test: {@link PodAuthAppHttpApiClient#buildHttpClient(String)}
   */
  @Test
  @MethodsUnderTest({
      "org.symphonyoss.integration.api.client.HttpApiClient PodAuthAppHttpApiClient.buildHttpClient(String)"})
  public void testBuildHttpClient() {
    // Arrange, Act and Assert
    assertTrue(podAuthAppHttpApiClient.buildHttpClient("https://example.org/example") instanceof MetricsHttpApiClient);
  }
}
