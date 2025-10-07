package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.logging.LogMessageSource;

public class IntegrationInstanceAdminApiClientDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IntegrationInstanceAdminApiClient#IntegrationInstanceAdminApiClient(HttpApiClient,
   *       LogMessageSource)}
   *   <li>{@link IntegrationInstanceAdminApiClient#getApiPathPrefix()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void IntegrationInstanceAdminApiClient.<init>(HttpApiClient, LogMessageSource)",
    "java.lang.String IntegrationInstanceAdminApiClient.getApiPathPrefix()"
  })
  public void testGettersAndSetters() {
    // Arrange
    IntegrationHttpApiClient apiClient = new IntegrationHttpApiClient();

    // Act
    IntegrationInstanceAdminApiClient actualIntegrationInstanceAdminApiClient =
        new IntegrationInstanceAdminApiClient(apiClient, new LogMessageSource());

    // Assert
    assertEquals("/v1/admin", actualIntegrationInstanceAdminApiClient.getApiPathPrefix());
  }
}
