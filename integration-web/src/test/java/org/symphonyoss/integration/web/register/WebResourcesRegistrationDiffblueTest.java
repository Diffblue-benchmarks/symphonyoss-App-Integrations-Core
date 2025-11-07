package org.symphonyoss.integration.web.register;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.servlet.MultipartConfigElement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.MultipartProperties;
import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.WebApplicationContext;
import org.symphonyoss.integration.web.filter.IntegrationMetricsFilter;
import org.symphonyoss.integration.web.filter.WebHookOriginCheckFilter;
import org.symphonyoss.integration.web.filter.WebHookTracingFilter;

@ContextConfiguration(classes = {WebResourcesRegistration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class WebResourcesRegistrationDiffblueTest {
  @MockBean
  private WebApplicationContext webApplicationContext;

  @Autowired
  private WebResourcesRegistration webResourcesRegistration;

  /**
   * Method under test:
   * {@link WebResourcesRegistration#webhookCheckOriginFilterRegistration()}
   */
  @Test
  public void testWebhookCheckOriginFilterRegistration() {
    // Arrange and Act
    FilterRegistrationBean actualWebhookCheckOriginFilterRegistrationResult = webResourcesRegistration
        .webhookCheckOriginFilterRegistration();

    // Assert
    assertTrue(actualWebhookCheckOriginFilterRegistrationResult.getFilter() instanceof WebHookOriginCheckFilter);
    assertTrue(actualWebhookCheckOriginFilterRegistrationResult.getInitParameters().isEmpty());
    assertTrue(actualWebhookCheckOriginFilterRegistrationResult.isAsyncSupported());
    assertTrue(actualWebhookCheckOriginFilterRegistrationResult.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualWebhookCheckOriginFilterRegistrationResult.getOrder());
  }

  /**
   * Method under test:
   * {@link WebResourcesRegistration#webhookTracingFilterRegistration()}
   */
  @Test
  public void testWebhookTracingFilterRegistration() {
    // Arrange and Act
    FilterRegistrationBean actualWebhookTracingFilterRegistrationResult = webResourcesRegistration
        .webhookTracingFilterRegistration();

    // Assert
    assertTrue(actualWebhookTracingFilterRegistrationResult.getFilter() instanceof WebHookTracingFilter);
    assertTrue(actualWebhookTracingFilterRegistrationResult.getInitParameters().isEmpty());
    assertTrue(actualWebhookTracingFilterRegistrationResult.isAsyncSupported());
    assertTrue(actualWebhookTracingFilterRegistrationResult.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualWebhookTracingFilterRegistrationResult.getOrder());
  }

  /**
   * Method under test:
   * {@link WebResourcesRegistration#integrationMetricsFilterRegistration()}
   */
  @Test
  public void testIntegrationMetricsFilterRegistration() {
    // Arrange and Act
    FilterRegistrationBean actualIntegrationMetricsFilterRegistrationResult = webResourcesRegistration
        .integrationMetricsFilterRegistration();

    // Assert
    assertTrue(actualIntegrationMetricsFilterRegistrationResult.getFilter() instanceof IntegrationMetricsFilter);
    Map<String, String> initParameters = actualIntegrationMetricsFilterRegistrationResult.getInitParameters();
    assertEquals(2, initParameters.size());
    assertEquals("/integration/metrics/", initParameters.get("ignore-url"));
    assertEquals("/integration/v1/whi/", initParameters.get("webhook-url"));
    assertTrue(actualIntegrationMetricsFilterRegistrationResult.isAsyncSupported());
    assertTrue(actualIntegrationMetricsFilterRegistrationResult.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualIntegrationMetricsFilterRegistrationResult.getOrder());
  }

  /**
   * Method under test:
   * {@link WebResourcesRegistration#apiServletRegistration(WebApplicationContext, MultipartProperties)}
   */
  @Test
  public void testApiServletRegistration() {
    // Arrange
    AnnotationConfigEmbeddedWebApplicationContext context = new AnnotationConfigEmbeddedWebApplicationContext();

    // Act
    ServletRegistrationBean actualApiServletRegistrationResult = webResourcesRegistration
        .apiServletRegistration(context, new MultipartProperties());

    // Assert
    Collection<String> urlMappings = actualApiServletRegistrationResult.getUrlMappings();
    assertEquals(1, urlMappings.size());
    assertTrue(urlMappings instanceof Set);
    MultipartConfigElement multipartConfig = actualApiServletRegistrationResult.getMultipartConfig();
    assertEquals("", multipartConfig.getLocation());
    assertEquals("api", actualApiServletRegistrationResult.getServletName());
    assertEquals(0, multipartConfig.getFileSizeThreshold());
    assertEquals(10485760L, multipartConfig.getMaxRequestSize());
    assertEquals(1048576L, multipartConfig.getMaxFileSize());
    assertTrue(urlMappings.contains("/integration/*"));
    assertTrue(actualApiServletRegistrationResult.getInitParameters().isEmpty());
    assertTrue(actualApiServletRegistrationResult.isAsyncSupported());
    assertTrue(actualApiServletRegistrationResult.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualApiServletRegistrationResult.getOrder());
  }

  /**
   * Method under test:
   * {@link WebResourcesRegistration#apiServletRegistration(WebApplicationContext, MultipartProperties)}
   */
  @Test
  public void testApiServletRegistration2() {
    // Arrange
    AnnotationConfigEmbeddedWebApplicationContext context = new AnnotationConfigEmbeddedWebApplicationContext();
    context.addApplicationListener(mock(ApplicationListener.class));

    // Act
    ServletRegistrationBean actualApiServletRegistrationResult = webResourcesRegistration
        .apiServletRegistration(context, new MultipartProperties());

    // Assert
    Collection<String> urlMappings = actualApiServletRegistrationResult.getUrlMappings();
    assertEquals(1, urlMappings.size());
    assertTrue(urlMappings instanceof Set);
    MultipartConfigElement multipartConfig = actualApiServletRegistrationResult.getMultipartConfig();
    assertEquals("", multipartConfig.getLocation());
    assertEquals("api", actualApiServletRegistrationResult.getServletName());
    assertEquals(0, multipartConfig.getFileSizeThreshold());
    assertEquals(10485760L, multipartConfig.getMaxRequestSize());
    assertEquals(1048576L, multipartConfig.getMaxFileSize());
    assertTrue(urlMappings.contains("/integration/*"));
    assertTrue(actualApiServletRegistrationResult.getInitParameters().isEmpty());
    assertTrue(actualApiServletRegistrationResult.isAsyncSupported());
    assertTrue(actualApiServletRegistrationResult.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualApiServletRegistrationResult.getOrder());
  }
}
