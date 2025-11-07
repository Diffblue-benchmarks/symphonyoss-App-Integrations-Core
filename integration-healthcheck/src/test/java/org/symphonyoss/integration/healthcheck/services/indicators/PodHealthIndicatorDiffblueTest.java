package org.symphonyoss.integration.healthcheck.services.indicators;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;

public class PodHealthIndicatorDiffblueTest {
  /**
   * Method under test: {@link PodHealthIndicator#getServiceName()}
   */
  @Test
  public void testGetServiceName() {
    // Arrange, Act and Assert
    assertEquals(ServiceName.POD, (new PodHealthIndicator()).getServiceName());
  }
}
