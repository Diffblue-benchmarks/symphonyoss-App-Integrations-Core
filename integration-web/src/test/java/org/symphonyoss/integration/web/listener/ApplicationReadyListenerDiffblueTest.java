package org.symphonyoss.integration.web.listener;

import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.symphonyoss.integration.core.bootstrap.IntegrationLogging;

public class ApplicationReadyListenerDiffblueTest {
  /**
   * Test {@link ApplicationReadyListener#onApplicationEvent(ApplicationReadyEvent)} with {@code
   * ApplicationReadyEvent}.
   *
   * <ul>
   *   <li>Given {@link IntegrationLogging} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link
   * ApplicationReadyListener#onApplicationEvent(ApplicationReadyEvent)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApplicationReadyListener.onApplicationEvent(ApplicationReadyEvent)"})
  public void testOnApplicationEventWithApplicationReadyEvent_givenIntegrationLogging()
      throws BeansException {
    // Arrange
    ApplicationReadyListener applicationReadyListener = new ApplicationReadyListener();
    AnnotationConfigApplicationContext context = mock(AnnotationConfigApplicationContext.class);
    when(context.getBean(Mockito.<Class<Object>>any())).thenReturn(new IntegrationLogging());

    // Act
    applicationReadyListener.onApplicationEvent(
        new ApplicationReadyEvent(
            new SpringApplication("Sources"), new String[] {"Args"}, context));

    // Assert
    verify(context).getBean(isA(Class.class));
  }

  /**
   * Test {@link ApplicationReadyListener#onApplicationEvent(ApplicationReadyEvent)} with {@code
   * ApplicationReadyEvent}.
   *
   * <ul>
   *   <li>Then calls {@link IntegrationLogging#ready()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ApplicationReadyListener#onApplicationEvent(ApplicationReadyEvent)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApplicationReadyListener.onApplicationEvent(ApplicationReadyEvent)"})
  public void testOnApplicationEventWithApplicationReadyEvent_thenCallsReady()
      throws BeansException {
    // Arrange
    ApplicationReadyListener applicationReadyListener = new ApplicationReadyListener();
    IntegrationLogging integrationLogging = mock(IntegrationLogging.class);
    doNothing().when(integrationLogging).ready();
    AnnotationConfigApplicationContext context = mock(AnnotationConfigApplicationContext.class);
    when(context.getBean(Mockito.<Class<Object>>any())).thenReturn(integrationLogging);

    // Act
    applicationReadyListener.onApplicationEvent(
        new ApplicationReadyEvent(
            new SpringApplication("Sources"), new String[] {"Args"}, context));

    // Assert
    verify(context).getBean(isA(Class.class));
    verify(integrationLogging).ready();
  }
}
