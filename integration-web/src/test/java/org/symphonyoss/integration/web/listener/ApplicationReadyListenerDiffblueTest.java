package org.symphonyoss.integration.web.listener;

import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.symphonyoss.integration.core.bootstrap.IntegrationLogging;

public class ApplicationReadyListenerDiffblueTest {
  /**
   * Method under test:
   * {@link ApplicationReadyListener#onApplicationEvent(ApplicationReadyEvent)}
   */
  @Test
  public void testOnApplicationEvent() throws BeansException {
    // Arrange
    ApplicationReadyListener applicationReadyListener = new ApplicationReadyListener();
    AnnotationConfigApplicationContext context = mock(AnnotationConfigApplicationContext.class);
    when(context.getBean(Mockito.<Class<Object>>any())).thenReturn(new IntegrationLogging());

    // Act
    applicationReadyListener
        .onApplicationEvent(new ApplicationReadyEvent(new SpringApplication("Sources"), new String[]{"Args"}, context));

    // Assert
    verify(context).getBean(isA(Class.class));
  }

  /**
   * Method under test:
   * {@link ApplicationReadyListener#onApplicationEvent(ApplicationReadyEvent)}
   */
  @Test
  public void testOnApplicationEvent2() throws BeansException {
    // Arrange
    ApplicationReadyListener applicationReadyListener = new ApplicationReadyListener();
    IntegrationLogging integrationLogging = mock(IntegrationLogging.class);
    doNothing().when(integrationLogging).ready();
    AnnotationConfigApplicationContext context = mock(AnnotationConfigApplicationContext.class);
    when(context.getBean(Mockito.<Class<Object>>any())).thenReturn(integrationLogging);

    // Act
    applicationReadyListener
        .onApplicationEvent(new ApplicationReadyEvent(new SpringApplication("Sources"), new String[]{"Args"}, context));

    // Assert
    verify(context).getBean(isA(Class.class));
    verify(integrationLogging).ready();
  }
}
