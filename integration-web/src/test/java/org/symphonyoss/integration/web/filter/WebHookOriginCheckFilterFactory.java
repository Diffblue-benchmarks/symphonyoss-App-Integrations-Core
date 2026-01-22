package org.symphonyoss.integration.web.filter;

import com.diffblue.cover.annotations.InterestingTestFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.WebApplicationContext;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Factory class for creating valid objects for WebHookOriginCheckFilter testing.
 * This factory provides objects that avoid common exceptions during test generation.
 */
public class WebHookOriginCheckFilterFactory {

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

    IntegrationProperties properties = mock(IntegrationProperties.class);
    LogMessageSource logMessageSource = mock(LogMessageSource.class);

    when(logMessageSource.getMessage(anyString())).thenReturn("Test message");
    when(logMessageSource.getMessage(anyString(), anyString())).thenReturn("Test message");

    when(filterConfig.getServletContext()).thenReturn(servletContext);
    when(servletContext.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE))
        .thenReturn(webAppContext);
    when(webAppContext.getAutowireCapableBeanFactory()).thenReturn(beanFactory);
    when(webAppContext.getBean(IntegrationProperties.class)).thenReturn(properties);
    when(webAppContext.getBean(LogMessageSource.class)).thenReturn(logMessageSource);

    return filterConfig;
  }

  /**
   * Creates a ServletRequest with a properly formatted URI to avoid StringIndexOutOfBoundsException.
   * The path must contain at least one "/" after the webhook URL pattern to extract the integration type.
   *
   * @return A valid ServletRequest instance
   */
  @InterestingTestFactory
  public static ServletRequest createServletRequest() {
    MockHttpServletRequest request = new MockHttpServletRequest();
    // Set a proper path with integration type and additional path segments
    request.setContextPath("/integration-bridge");
    request.setRequestURI("/integration-bridge/integration/v1/whi/jira/webhook");
    request.setRemoteAddr("127.0.0.1");
    return request;
  }

  /**
   * Creates a properly initialized WebHookOriginCheckFilter with non-null spring context.
   * This avoids NullPointerException in getWhiteListByApplication.
   *
   * @return A valid WebHookOriginCheckFilter instance
   */
  @InterestingTestFactory
  public static WebHookOriginCheckFilter createWebHookOriginCheckFilter() throws Exception {
    WebHookOriginCheckFilter filter = new WebHookOriginCheckFilter();
    FilterConfig filterConfig = createFilterConfig();
    filter.init(filterConfig);
    return filter;
  }
}
