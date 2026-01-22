package org.symphonyoss.integration.web.filter;

import com.diffblue.cover.annotations.InterestingTestFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.symphonyoss.integration.web.metrics.RequestMetricsController;

import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Factory class for creating valid FilterConfig instances for IntegrationMetricsFilter testing.
 * This factory provides objects that avoid WebApplicationContext exceptions during test generation.
 */
public class IntegrationMetricsFilterFactory {

  /**
   * Creates a FilterConfig with a properly configured ServletContext and WebApplicationContext.
   * This avoids IllegalStateException: No WebApplicationContext found.
   *
   * @return A valid FilterConfig instance
   */
  @InterestingTestFactory
  public static FilterConfig createFilterConfig() {
    FilterConfig filterConfig = mock(FilterConfig.class);
    ServletContext servletContext = mock(ServletContext.class);
    WebApplicationContext webAppContext = mock(WebApplicationContext.class);
    AutowireCapableBeanFactory beanFactory = mock(AutowireCapableBeanFactory.class);
    RequestMetricsController metricsController = mock(RequestMetricsController.class);

    when(filterConfig.getServletContext()).thenReturn(servletContext);
    when(servletContext.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE))
        .thenReturn(webAppContext);
    when(webAppContext.getAutowireCapableBeanFactory()).thenReturn(beanFactory);

    // Setup init parameters
    when(filterConfig.getInitParameter("webhook-url")).thenReturn("/integration/v1/whi/");
    when(filterConfig.getInitParameter("ignore-url")).thenReturn("/health,/metrics");

    return filterConfig;
  }
}
