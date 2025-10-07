package org.symphonyoss.integration.web.listener;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.core.env.StandardEnvironment;

public class BootstrapApplicationListenerDiffblueTest {
  /**
   * Test {@link
   * BootstrapApplicationListener#onApplicationEvent(ApplicationEnvironmentPreparedEvent)} with
   * {@code ApplicationEnvironmentPreparedEvent}.
   *
   * <p>Method under test: {@link
   * BootstrapApplicationListener#onApplicationEvent(ApplicationEnvironmentPreparedEvent)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BootstrapApplicationListener.onApplicationEvent(ApplicationEnvironmentPreparedEvent)"
  })
  public void testOnApplicationEventWithApplicationEnvironmentPreparedEvent() {
    // Arrange
    BootstrapApplicationListener bootstrapApplicationListener = new BootstrapApplicationListener();

    StandardEnvironment environment = mock(StandardEnvironment.class);
    when(environment.getProperty(Mockito.<String>any()))
        .thenReturn(System.getProperty("javax.net.ssl.trustStore"));
    String[] args = new String[] {"Args"};

    ApplicationEnvironmentPreparedEvent environmentPreparedEvent =
        new ApplicationEnvironmentPreparedEvent(
            new SpringApplication("Sources"), args, environment);

    // Act
    bootstrapApplicationListener.onApplicationEvent(environmentPreparedEvent);

    // Assert
    verify(environment, atLeast(1)).getProperty(Mockito.<String>any());
  }

  /**
   * Test {@link
   * BootstrapApplicationListener#onApplicationEvent(ApplicationEnvironmentPreparedEvent)} with
   * {@code ApplicationEnvironmentPreparedEvent}.
   *
   * <ul>
   *   <li>Given empty string.
   * </ul>
   *
   * <p>Method under test: {@link
   * BootstrapApplicationListener#onApplicationEvent(ApplicationEnvironmentPreparedEvent)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BootstrapApplicationListener.onApplicationEvent(ApplicationEnvironmentPreparedEvent)"
  })
  public void testOnApplicationEventWithApplicationEnvironmentPreparedEvent_givenEmptyString() {
    // Arrange
    BootstrapApplicationListener bootstrapApplicationListener = new BootstrapApplicationListener();

    StandardEnvironment environment = mock(StandardEnvironment.class);
    when(environment.getProperty(Mockito.<String>any())).thenReturn("");
    String[] args = new String[] {"Args"};

    ApplicationEnvironmentPreparedEvent environmentPreparedEvent =
        new ApplicationEnvironmentPreparedEvent(
            new SpringApplication("Sources"), args, environment);

    // Act
    bootstrapApplicationListener.onApplicationEvent(environmentPreparedEvent);

    // Assert
    verify(environment, atLeast(1)).getProperty(Mockito.<String>any());
  }
}
