package org.symphonyoss.integration.healthcheck.services.invokers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;
import org.symphonyoss.integration.healthcheck.services.indicators.ServiceHealthIndicator;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

@ContextConfiguration(classes = {AgentHealthInvoker.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class AgentHealthInvokerDiffblueTest {
  @Autowired
  private AgentHealthInvoker agentHealthInvoker;

  @MockBean
  private ApplicationEventPublisher applicationEventPublisher;

  @MockBean
  private AuthenticationProxy authenticationProxy;

  @Autowired
  private IntegrationProperties integrationProperties;

  @MockBean
  private LogMessageSource logMessageSource;

  @MockBean(name = "agentHealthIndicator")
  private ServiceHealthIndicator serviceHealthIndicator;

  /**
   * Method under test: {@link AgentHealthInvoker#getHealthCheckUrl()}
   */
  @Test
  public void testGetHealthCheckUrl() {
    // Arrange, Act and Assert
    assertEquals("/v1/HealthCheck", agentHealthInvoker.getHealthCheckUrl());
  }

  /**
   * Method under test: {@link AgentHealthInvoker#getServiceBaseUrl()}
   */
  @Test
  public void testGetServiceBaseUrl() {
    // Arrange, Act and Assert
    assertEquals("", agentHealthInvoker.getServiceBaseUrl());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AgentHealthInvoker#getHealthIndicator()}
   *   <li>{@link AgentHealthInvoker#getServiceName()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    AgentHealthInvoker agentHealthInvoker = new AgentHealthInvoker();

    // Act
    ServiceHealthIndicator actualHealthIndicator = agentHealthInvoker.getHealthIndicator();

    // Assert
    assertNull(actualHealthIndicator);
    assertEquals(ServiceName.AGENT, agentHealthInvoker.getServiceName());
  }
}
