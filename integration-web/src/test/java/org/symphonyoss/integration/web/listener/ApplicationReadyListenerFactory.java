package org.symphonyoss.integration.web.listener;

import com.diffblue.cover.annotations.InterestingTestFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.symphonyoss.integration.core.bootstrap.IntegrationLogging;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Factory class for creating valid ApplicationReadyEvent instances for ApplicationReadyListener testing.
 * This factory provides objects that avoid NullPointerException during test generation.
 */
public class ApplicationReadyListenerFactory {

  /**
   * Creates an ApplicationReadyEvent with a properly configured ApplicationContext.
   * This avoids NullPointerException when accessing the application context and its beans.
   *
   * @return A valid ApplicationReadyEvent instance
   */
  @InterestingTestFactory
  public static ApplicationReadyEvent createApplicationReadyEvent() {
    ConfigurableApplicationContext applicationContext = mock(ConfigurableApplicationContext.class);
    IntegrationLogging integrationLogging = mock(IntegrationLogging.class);

    when(applicationContext.getBean(IntegrationLogging.class)).thenReturn(integrationLogging);

    // ApplicationReadyEvent constructor requires an ApplicationContext and args
    ApplicationReadyEvent event = mock(ApplicationReadyEvent.class);
    when(event.getApplicationContext()).thenReturn(applicationContext);

    return event;
  }
}
