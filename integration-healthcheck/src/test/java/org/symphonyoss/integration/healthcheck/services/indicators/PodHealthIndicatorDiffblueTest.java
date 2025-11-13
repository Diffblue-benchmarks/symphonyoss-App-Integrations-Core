package org.symphonyoss.integration.healthcheck.services.indicators;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;

public class PodHealthIndicatorDiffblueTest {
  /**
   * Test {@link PodHealthIndicator#getServiceName()}.
   *
   * <p>Method under test: {@link PodHealthIndicator#getServiceName()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ServiceName PodHealthIndicator.getServiceName()"})
  public void testGetServiceName() {
    // Arrange, Act and Assert
    assertEquals(ServiceName.POD, new PodHealthIndicator().getServiceName());
  }
}
