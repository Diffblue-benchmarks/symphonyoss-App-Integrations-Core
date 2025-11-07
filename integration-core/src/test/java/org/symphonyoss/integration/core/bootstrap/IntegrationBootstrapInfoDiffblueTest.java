package org.symphonyoss.integration.core.bootstrap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;
import org.springframework.core.env.StandardEnvironment;
import org.symphonyoss.integration.Integration;
import org.symphonyoss.integration.authentication.AuthenticationProxyImpl;
import org.symphonyoss.integration.core.NullIntegration;
import org.symphonyoss.integration.healthcheck.application.ApplicationsHealthIndicator;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.Application;
import org.symphonyoss.integration.utils.IntegrationUtils;

public class IntegrationBootstrapInfoDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>
   * {@link IntegrationBootstrapInfo#IntegrationBootstrapInfo(String, Integration)}
   *   <li>{@link IntegrationBootstrapInfo#getConfigurationType()}
   *   <li>{@link IntegrationBootstrapInfo#getIntegration()}
   *   <li>{@link IntegrationBootstrapInfo#getRetryAttemptCounter()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    ApplicationsHealthIndicator healthIndicator = new ApplicationsHealthIndicator();
    Application application = new Application();
    IntegrationUtils utils = new IntegrationUtils("Web Server Base Dir");
    AuthenticationProxyImpl authenticationProxy = new AuthenticationProxyImpl();
    LogMessageSource logMessage = new LogMessageSource();
    NullIntegration integration = new NullIntegration(healthIndicator, application, utils, authenticationProxy,
        logMessage, new StandardEnvironment());

    // Act
    IntegrationBootstrapInfo actualIntegrationBootstrapInfo = new IntegrationBootstrapInfo("Configuration Type",
        integration);
    String actualConfigurationType = actualIntegrationBootstrapInfo.getConfigurationType();
    Integration actualIntegration = actualIntegrationBootstrapInfo.getIntegration();

    // Assert
    assertEquals("Configuration Type", actualConfigurationType);
    assertEquals(0, actualIntegrationBootstrapInfo.getRetryAttemptCounter());
    assertSame(integration, actualIntegration);
  }

  /**
   * Method under test: {@link IntegrationBootstrapInfo#registerRetryAttempt()}
   */
  @Test
  public void testRegisterRetryAttempt() {
    // Arrange
    ApplicationsHealthIndicator healthIndicator = new ApplicationsHealthIndicator();
    Application application = new Application();
    IntegrationUtils utils = new IntegrationUtils("Web Server Base Dir");
    AuthenticationProxyImpl authenticationProxy = new AuthenticationProxyImpl();
    LogMessageSource logMessage = new LogMessageSource();
    IntegrationBootstrapInfo integrationBootstrapInfo = new IntegrationBootstrapInfo("Configuration Type",
        new NullIntegration(healthIndicator, application, utils, authenticationProxy, logMessage,
            new StandardEnvironment()));

    // Act
    int actualRegisterRetryAttemptResult = integrationBootstrapInfo.registerRetryAttempt();

    // Assert
    assertEquals(1, integrationBootstrapInfo.getRetryAttemptCounter());
    assertEquals(1, actualRegisterRetryAttemptResult);
  }
}
