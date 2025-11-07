package org.symphonyoss.integration.healthcheck;

import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.healthcheck.application.ApplicationsHealthIndicator;
import org.symphonyoss.integration.healthcheck.services.CompositeServiceHealthIndicator;

@ContextConfiguration(classes = {CompositeHealthEndpoint.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class CompositeHealthEndpointDiffblueTest {
  @MockBean
  private ApplicationsHealthIndicator applicationsHealthIndicator;

  @Autowired
  private CompositeHealthEndpoint compositeHealthEndpoint;

  @MockBean
  private CompositeServiceHealthIndicator compositeServiceHealthIndicator;

  @MockBean
  private IntegrationBridgeHealthAggregator integrationBridgeHealthAggregator;

  /**
   * Method under test: {@link CompositeHealthEndpoint#invoke()}
   */
  @Test
  public void testInvoke() {
    // Arrange
    when(integrationBridgeHealthAggregator.aggregate(Mockito.<Map<String, Health>>any())).thenReturn(null);
    when(applicationsHealthIndicator.health()).thenReturn(null);
    when(compositeServiceHealthIndicator.health()).thenReturn(null);

    // Act
    Health actualInvokeResult = compositeHealthEndpoint.invoke();

    // Assert
    verify(applicationsHealthIndicator).health();
    verify(compositeServiceHealthIndicator).health();
    verify(integrationBridgeHealthAggregator).aggregate(isA(Map.class));
    assertNull(actualInvokeResult);
  }
}
