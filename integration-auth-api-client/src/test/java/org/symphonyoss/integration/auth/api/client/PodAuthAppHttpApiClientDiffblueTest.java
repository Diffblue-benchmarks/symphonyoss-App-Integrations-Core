package org.symphonyoss.integration.auth.api.client;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.integration.api.client.metrics.MetricsHttpApiClient;

public class PodAuthAppHttpApiClientDiffblueTest {
  /**
   * Test {@link PodAuthAppHttpApiClient#buildHttpClient(String)}.
   *
   * <p>Method under test: {@link PodAuthAppHttpApiClient#buildHttpClient(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.symphonyoss.integration.api.client.HttpApiClient PodAuthAppHttpApiClient.buildHttpClient(String)"
  })
  public void testBuildHttpClient() {
    // Arrange, Act and Assert
    assertTrue(
        new PodAuthAppHttpApiClient().buildHttpClient("https://example.org/example")
            instanceof MetricsHttpApiClient);
  }
}
