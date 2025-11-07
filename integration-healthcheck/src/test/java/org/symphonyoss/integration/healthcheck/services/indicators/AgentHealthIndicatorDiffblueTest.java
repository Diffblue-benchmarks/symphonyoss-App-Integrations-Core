package org.symphonyoss.integration.healthcheck.services.indicators;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;

public class AgentHealthIndicatorDiffblueTest {
  /**
   * Method under test: {@link AgentHealthIndicator#getServiceName()}
   */
  @Test
  public void testGetServiceName() {
    // Arrange, Act and Assert
    assertEquals(ServiceName.AGENT, (new AgentHealthIndicator()).getServiceName());
  }
}
