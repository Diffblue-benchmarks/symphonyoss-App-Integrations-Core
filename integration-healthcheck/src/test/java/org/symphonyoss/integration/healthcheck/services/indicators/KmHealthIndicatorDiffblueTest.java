package org.symphonyoss.integration.healthcheck.services.indicators;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;

public class KmHealthIndicatorDiffblueTest {
  /**
   * Test {@link KmHealthIndicator#getServiceName()}.
   * <p>
   * Method under test: {@link KmHealthIndicator#getServiceName()}
   */
  @Test
  @MethodsUnderTest({"ServiceName KmHealthIndicator.getServiceName()"})
  public void testGetServiceName() {
    // Arrange, Act and Assert
    assertEquals(ServiceName.KEY_MANAGER, (new KmHealthIndicator()).getServiceName());
  }
}
