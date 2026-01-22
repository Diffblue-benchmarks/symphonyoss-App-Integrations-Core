package org.symphonyoss.integration.web.listener;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import javax.servlet.ServletContextEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.core.bootstrap.IntegrationBootstrapContext;

@ContextConfiguration(classes = {IntegrationListener.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class IntegrationListenerDiffblueTest {
  @MockBean private IntegrationBootstrapContext integrationBootstrapContext;

  @Autowired private IntegrationListener integrationListener;

  /**
   * Test {@link IntegrationListener#contextInitialized(ServletContextEvent)}.
   *
   * <ul>
   *   <li>When createServletContextEvent.
   *   <li>Then calls {@link IntegrationBootstrapContext#startup()}.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationListener#contextInitialized(ServletContextEvent)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void IntegrationListener.contextInitialized(ServletContextEvent)"})
  public void testContextInitialized_whenCreateServletContextEvent_thenCallsStartup() {
    // Arrange
    doNothing().when(integrationBootstrapContext).startup();

    // Act
    integrationListener.contextInitialized(IntegrationListenerFactory.createServletContextEvent());

    // Assert
    verify(integrationBootstrapContext).startup();
  }

  /**
   * Test {@link IntegrationListener#contextDestroyed(ServletContextEvent)}.
   *
   * <p>Method under test: {@link IntegrationListener#contextDestroyed(ServletContextEvent)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void IntegrationListener.contextDestroyed(ServletContextEvent)"})
  public void testContextDestroyed() throws IllegalStateException {
    // Arrange
    doNothing().when(integrationBootstrapContext).shutdown();

    // Act
    integrationListener.contextDestroyed(IntegrationListenerFactory.createServletContextEvent());

    // Assert
    verify(integrationBootstrapContext).shutdown();
  }
}
