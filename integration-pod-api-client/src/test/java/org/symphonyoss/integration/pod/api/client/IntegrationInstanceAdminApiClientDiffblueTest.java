package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
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
    LogMessageSource logMessage = new LogMessageSource();

    // Act
    IntegrationInstanceAdminApiClient actualIntegrationInstanceAdminApiClient =
        new IntegrationInstanceAdminApiClient(apiClient, logMessage);

    // Assert
    assertEquals("/v1/admin", actualIntegrationInstanceAdminApiClient.getApiPathPrefix());
    assertSame(logMessage, actualIntegrationInstanceAdminApiClient.getLogMessage());
  }
}
