package org.symphonyoss.integration.core.bootstrap;

import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.healthcheck.application.ApplicationsHealthIndicator;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.metrics.IntegrationMetricsController;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;
import org.symphonyoss.integration.utils.IntegrationUtils;

@ContextConfiguration(classes = {IntegrationBootstrapContext.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class IntegrationBootstrapContextDiffblueTest {
  @Autowired
  private ApplicationContext applicationContext;

  @MockBean
  private ApplicationEventPublisher applicationEventPublisher;

  @MockBean
  private ApplicationsHealthIndicator applicationsHealthIndicator;

  @MockBean
  private AuthenticationProxy authenticationProxy;

  @MockBean
  private Environment environment;

  @Autowired
  private IntegrationBootstrapContext integrationBootstrapContext;

  @MockBean
  private IntegrationLogging integrationLogging;

  @MockBean
  private IntegrationMetricsController integrationMetricsController;

  @Autowired
  private IntegrationProperties integrationProperties;

  @MockBean
  private IntegrationUtils integrationUtils;

  @MockBean
  private LogMessageSource logMessageSource;

  /**
   * Method under test:
   * {@link IntegrationBootstrapContext#getIntegrationById(String)}
   */
  @Test
  public void testGetIntegrationById() throws IllegalStateException {
    // Arrange, Act and Assert
    assertNull(integrationBootstrapContext.getIntegrationById("42"));
  }
}
