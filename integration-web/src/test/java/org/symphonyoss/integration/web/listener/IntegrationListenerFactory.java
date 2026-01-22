package org.symphonyoss.integration.web.listener;

import com.diffblue.cover.annotations.InterestingTestFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.symphonyoss.integration.core.bootstrap.IntegrationBootstrapContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Factory class for creating valid ServletContextEvent instances for IntegrationListener testing.
 * This factory provides objects that avoid WebApplicationContext exceptions during test generation.
 */
public class IntegrationListenerFactory {

  /**
   * Creates a ServletContextEvent with a properly configured ServletContext and WebApplicationContext.
   * This avoids IllegalStateException: No WebApplicationContext found.
   *
   * @return A valid ServletContextEvent instance
   */
  @InterestingTestFactory
  public static ServletContextEvent createServletContextEvent() {
    ServletContext servletContext = mock(ServletContext.class);
    WebApplicationContext webAppContext = mock(WebApplicationContext.class);
    AutowireCapableBeanFactory beanFactory = mock(AutowireCapableBeanFactory.class);
    IntegrationBootstrapContext bootstrapContext = mock(IntegrationBootstrapContext.class);

    when(servletContext.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE))
        .thenReturn(webAppContext);
    when(webAppContext.getAutowireCapableBeanFactory()).thenReturn(beanFactory);

    ServletContextEvent event = new ServletContextEvent(servletContext);

    return event;
  }
}
