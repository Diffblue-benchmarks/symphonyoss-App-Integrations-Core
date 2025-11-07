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

@ContextConfiguration(classes = {PodHealthInvoker.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class PodHealthInvokerDiffblueTest {
  @MockBean
  private ApplicationEventPublisher applicationEventPublisher;

  @MockBean
  private AuthenticationProxy authenticationProxy;

  @Autowired
  private IntegrationProperties integrationProperties;

  @MockBean
  private LogMessageSource logMessageSource;

  @Autowired
  private PodHealthInvoker podHealthInvoker;

  @MockBean(name = "podHealthIndicator")
  private ServiceHealthIndicator serviceHealthIndicator;

  /**
   * Method under test: {@link PodHealthInvoker#getHealthCheckUrl()}
   */
  @Test
  public void testGetHealthCheckUrl() {
    // Arrange, Act and Assert
    assertEquals("/webcontroller/HealthCheck/version", podHealthInvoker.getHealthCheckUrl());
  }

  /**
   * Method under test: {@link PodHealthInvoker#getServiceBaseUrl()}
   */
  @Test
  public void testGetServiceBaseUrl() {
    // Arrange, Act and Assert
    assertEquals("", podHealthInvoker.getServiceBaseUrl());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link PodHealthInvoker#getHealthIndicator()}
   *   <li>{@link PodHealthInvoker#getServiceName()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    PodHealthInvoker podHealthInvoker = new PodHealthInvoker();

    // Act
    ServiceHealthIndicator actualHealthIndicator = podHealthInvoker.getHealthIndicator();

    // Assert
    assertNull(actualHealthIndicator);
    assertEquals(ServiceName.POD, podHealthInvoker.getServiceName());
  }
}
