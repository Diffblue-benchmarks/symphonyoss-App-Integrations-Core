package org.symphonyoss.integration.core.bootstrap;

import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
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
  @Autowired private ApplicationContext applicationContext;

  @MockBean private ApplicationsHealthIndicator applicationsHealthIndicator;

  @MockBean private AuthenticationProxy authenticationProxy;

  @Autowired private IntegrationBootstrapContext integrationBootstrapContext;

  @MockBean private IntegrationLogging integrationLogging;

  @MockBean private IntegrationMetricsController integrationMetricsController;

  @Autowired private IntegrationProperties integrationProperties;

  @MockBean private IntegrationUtils integrationUtils;

  @MockBean private LogMessageSource logMessageSource;

  /**
   * Test {@link IntegrationBootstrapContext#getIntegrationById(String)}.
   *
   * <p>Method under test: {@link IntegrationBootstrapContext#getIntegrationById(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.symphonyoss.integration.Integration IntegrationBootstrapContext.getIntegrationById(String)"
  })
  public void testGetIntegrationById() throws IllegalStateException {
    // Arrange, Act and Assert
    assertNull(integrationBootstrapContext.getIntegrationById("42"));
  }
}
