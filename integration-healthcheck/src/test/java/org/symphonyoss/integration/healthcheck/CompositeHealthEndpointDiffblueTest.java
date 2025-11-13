package org.symphonyoss.integration.healthcheck;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.healthcheck.application.ApplicationsHealthIndicator;
import org.symphonyoss.integration.healthcheck.services.CompositeServiceHealthIndicator;

@ContextConfiguration(classes = {CompositeHealthEndpoint.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class CompositeHealthEndpointDiffblueTest {
  @MockBean private ApplicationsHealthIndicator applicationsHealthIndicator;

  @Autowired private CompositeHealthEndpoint compositeHealthEndpoint;

  @MockBean private CompositeServiceHealthIndicator compositeServiceHealthIndicator;

  @MockBean private IntegrationBridgeHealthAggregator integrationBridgeHealthAggregator;

  /**
   * Test {@link CompositeHealthEndpoint#invoke()}.
   *
   * <p>Method under test: {@link CompositeHealthEndpoint#invoke()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Health CompositeHealthEndpoint.invoke()"})
  public void testInvoke() {
    // Arrange
    Builder statusResult = Health.status(new Status("Code"));
    Status status = new Status("Code");
    when(integrationBridgeHealthAggregator.aggregate(Mockito.<Map<String, Health>>any()))
        .thenReturn(statusResult.status(status).build());

    Builder statusResult2 = Health.status(new Status("Code"));
    when(applicationsHealthIndicator.health())
        .thenReturn(statusResult2.status(new Status("Code")).build());

    Builder statusResult3 = Health.status(new Status("Code"));
    when(compositeServiceHealthIndicator.health())
        .thenReturn(statusResult3.status(new Status("Code")).build());

    // Act
    Health actualInvokeResult = compositeHealthEndpoint.invoke();

    // Assert
    verify(applicationsHealthIndicator).health();
    verify(compositeServiceHealthIndicator).health();
    verify(integrationBridgeHealthAggregator).aggregate(isA(Map.class));
    assertTrue(actualInvokeResult.getDetails().isEmpty());
    assertSame(status, actualInvokeResult.getStatus());
  }
}
