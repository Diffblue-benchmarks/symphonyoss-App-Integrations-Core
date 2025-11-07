package org.symphonyoss.integration.healthcheck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Map;
import org.junit.Test;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.symphonyoss.integration.healthcheck.application.TestWebHookIntegration;
import org.symphonyoss.integration.model.healthcheck.IntegrationHealth;

public class IntegrationHealthIndicatorAdapterDiffblueTest {
  /**
   * Method under test: {@link IntegrationHealthIndicatorAdapter#health()}
   */
  @Test
  public void testHealth() {
    // Arrange
    TestWebHookIntegration integration = new TestWebHookIntegration();
    integration.onCreate("Integration User");

    // Act
    Health actualHealthResult = (new IntegrationHealthIndicatorAdapter(integration)).health();

    // Assert
    Map<String, Object> details = actualHealthResult.getDetails();
    assertEquals(1, details.size());
    Object getResult = details.get("detail");
    assertTrue(getResult instanceof IntegrationHealth);
    Status status = actualHealthResult.getStatus();
    assertEquals("", status.getDescription());
    assertEquals("INACTIVE", status.getCode());
    assertEquals("INACTIVE", status.toString());
    assertEquals("INACTIVE", ((IntegrationHealth) getResult).getStatus());
    assertEquals("Integration User", ((IntegrationHealth) getResult).getName());
    assertEquals("N/A", ((IntegrationHealth) getResult).getVersion());
    assertNull(((IntegrationHealth) getResult).getLatestPostTimestamp());
    assertNull(((IntegrationHealth) getResult).getMessage());
    assertNull(((IntegrationHealth) getResult).getConfigurator());
    assertNull(((IntegrationHealth) getResult).getFlags());
  }
}
