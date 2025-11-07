package org.symphonyoss.integration.healthcheck.services.indicators;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;

public class KmHealthIndicatorDiffblueTest {
  /**
   * Method under test: {@link KmHealthIndicator#getServiceName()}
   */
  @Test
  public void testGetServiceName() {
    // Arrange, Act and Assert
    assertEquals(ServiceName.KEY_MANAGER, (new KmHealthIndicator()).getServiceName());
  }
}
