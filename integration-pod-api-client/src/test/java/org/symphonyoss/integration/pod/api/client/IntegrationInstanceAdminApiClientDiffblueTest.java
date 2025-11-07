package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.logging.LogMessageSource;

public class IntegrationInstanceAdminApiClientDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>
   * {@link IntegrationInstanceAdminApiClient#IntegrationInstanceAdminApiClient(HttpApiClient, LogMessageSource)}
   *   <li>{@link IntegrationInstanceAdminApiClient#getApiPathPrefix()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    IntegrationHttpApiClient apiClient = new IntegrationHttpApiClient();

    // Act and Assert
    assertEquals("/v1/admin",
        (new IntegrationInstanceAdminApiClient(apiClient, new LogMessageSource())).getApiPathPrefix());
  }
}
