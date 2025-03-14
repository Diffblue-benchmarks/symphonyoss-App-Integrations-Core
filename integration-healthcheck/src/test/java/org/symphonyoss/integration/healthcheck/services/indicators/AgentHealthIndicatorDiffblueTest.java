package org.symphonyoss.integration.healthcheck.services.indicators;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;

public class AgentHealthIndicatorDiffblueTest {
  /**
   * Test {@link AgentHealthIndicator#getServiceName()}.
   * <p>
   * Method under test: {@link AgentHealthIndicator#getServiceName()}
   */
  @Test
  @MethodsUnderTest({"ServiceName AgentHealthIndicator.getServiceName()"})
  public void testGetServiceName() {
    // Arrange, Act and Assert
    assertEquals(ServiceName.AGENT, (new AgentHealthIndicator()).getServiceName());
  }
}
