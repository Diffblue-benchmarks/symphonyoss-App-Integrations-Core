package org.symphonyoss.integration.auth.api.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.api.client.metrics.MetricsHttpApiClient;

public class PodAuthAppHttpApiClientDiffblueTest {
  /**
   * Method under test: {@link PodAuthAppHttpApiClient#buildHttpClient(String)}
   */
  @Test
  public void testBuildHttpClient() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange and Act
    HttpApiClient actualBuildHttpClientResult = (new PodAuthAppHttpApiClient())
        .buildHttpClient("https://example.org/example");

    // Assert
    assertTrue(actualBuildHttpClientResult instanceof MetricsHttpApiClient);
    assertEquals("https%3A%2F%2Fexample.org%2Fexample",
        actualBuildHttpClientResult.escapeString("https://example.org/example"));
  }
}
