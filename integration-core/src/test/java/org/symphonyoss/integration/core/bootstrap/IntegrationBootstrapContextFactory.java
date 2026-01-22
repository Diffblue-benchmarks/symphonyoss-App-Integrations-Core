package org.symphonyoss.integration.core.bootstrap;

import com.diffblue.cover.annotations.InterestingTestFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.env.Environment;
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.healthcheck.application.ApplicationsHealthIndicator;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.metrics.IntegrationMetricsController;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;
import org.symphonyoss.integration.utils.IntegrationUtils;

import java.lang.reflect.Field;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static org.mockito.Mockito.mock;

/**
 * Factory class for creating valid IntegrationBootstrapContext instances for testing.
 */
public class IntegrationBootstrapContextFactory {

  /**
   * Creates a valid IntegrationBootstrapContext instance with initialized scheduler.
   *
   * @return a valid IntegrationBootstrapContext instance
   */
  @InterestingTestFactory
  public static IntegrationBootstrapContext createIntegrationBootstrapContext() {
    IntegrationBootstrapContext context = new IntegrationBootstrapContext();

    try {
      // Initialize the scheduler to avoid NullPointerException in shutdown()
      ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
      Field schedulerField = IntegrationBootstrapContext.class.getDeclaredField("scheduler");
      schedulerField.setAccessible(true);
      schedulerField.set(context, scheduler);

      // Initialize other required fields with mocks to avoid NullPointerExceptions
      Field contextField = IntegrationBootstrapContext.class.getDeclaredField("context");
      contextField.setAccessible(true);
      contextField.set(context, mock(ApplicationContext.class));

      Field propertiesField = IntegrationBootstrapContext.class.getDeclaredField("properties");
      propertiesField.setAccessible(true);
      propertiesField.set(context, mock(IntegrationProperties.class));

      Field authProxyField = IntegrationBootstrapContext.class.getDeclaredField("authenticationProxy");
      authProxyField.setAccessible(true);
      authProxyField.set(context, mock(AuthenticationProxy.class));

      Field utilsField = IntegrationBootstrapContext.class.getDeclaredField("utils");
      utilsField.setAccessible(true);
      utilsField.set(context, mock(IntegrationUtils.class));

      Field metricsField = IntegrationBootstrapContext.class.getDeclaredField("metricsController");
      metricsField.setAccessible(true);
      metricsField.set(context, mock(IntegrationMetricsController.class));

      Field healthField = IntegrationBootstrapContext.class.getDeclaredField("applicationsHealthIndicator");
      healthField.setAccessible(true);
      healthField.set(context, mock(ApplicationsHealthIndicator.class));

      Field publisherField = IntegrationBootstrapContext.class.getDeclaredField("publisher");
      publisherField.setAccessible(true);
      publisherField.set(context, mock(ApplicationEventPublisher.class));

      Field loggingField = IntegrationBootstrapContext.class.getDeclaredField("logging");
      loggingField.setAccessible(true);
      loggingField.set(context, mock(IntegrationLogging.class));

      Field logMessageField = IntegrationBootstrapContext.class.getDeclaredField("logMessage");
      logMessageField.setAccessible(true);
      logMessageField.set(context, mock(LogMessageSource.class));

      Field environmentField = IntegrationBootstrapContext.class.getDeclaredField("environment");
      environmentField.setAccessible(true);
      environmentField.set(context, mock(Environment.class));

    } catch (NoSuchFieldException | IllegalAccessException e) {
      throw new RuntimeException("Failed to initialize IntegrationBootstrapContext", e);
    }

    return context;
  }
}
