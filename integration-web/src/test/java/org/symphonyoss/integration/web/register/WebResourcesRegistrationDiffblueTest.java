package org.symphonyoss.integration.web.register;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import org.junit.Test;
import org.springframework.boot.autoconfigure.web.MultipartProperties;
import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.web.context.WebApplicationContext;
import org.symphonyoss.integration.web.filter.IntegrationMetricsFilter;
import org.symphonyoss.integration.web.filter.WebHookOriginCheckFilter;
import org.symphonyoss.integration.web.filter.WebHookTracingFilter;

public class WebResourcesRegistrationDiffblueTest {
  /**
   * Test {@link WebResourcesRegistration#webhookCheckOriginFilterRegistration()}.
   *
   * <ul>
   *   <li>Given {@link WebResourcesRegistration} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link WebResourcesRegistration#webhookCheckOriginFilterRegistration()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FilterRegistrationBean WebResourcesRegistration.webhookCheckOriginFilterRegistration()"
  })
  public void testWebhookCheckOriginFilterRegistration_givenWebResourcesRegistration() {
    // Arrange and Act
    FilterRegistrationBean actualWebhookCheckOriginFilterRegistrationResult =
        new WebResourcesRegistration().webhookCheckOriginFilterRegistration();

    // Assert
    Collection servletNames = actualWebhookCheckOriginFilterRegistrationResult.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection urlPatterns = actualWebhookCheckOriginFilterRegistrationResult.getUrlPatterns();
    assertEquals(1, urlPatterns.size());
    assertTrue(urlPatterns instanceof Set);
    Filter filter = actualWebhookCheckOriginFilterRegistrationResult.getFilter();
    assertTrue(filter instanceof WebHookOriginCheckFilter);
    assertNull(((WebHookOriginCheckFilter) filter).getSpringContext());
    assertNull(((WebHookOriginCheckFilter) filter).getLogMessage());
    assertNull(((WebHookOriginCheckFilter) filter).getProperties());
    assertFalse(actualWebhookCheckOriginFilterRegistrationResult.isMatchAfter());
    assertTrue(servletNames.isEmpty());
    assertTrue(actualWebhookCheckOriginFilterRegistrationResult.getInitParameters().isEmpty());
    assertTrue(actualWebhookCheckOriginFilterRegistrationResult.isAsyncSupported());
    assertTrue(actualWebhookCheckOriginFilterRegistrationResult.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualWebhookCheckOriginFilterRegistrationResult.getOrder());
    assertEquals(
        servletNames,
        actualWebhookCheckOriginFilterRegistrationResult.getServletRegistrationBeans());
  }

  /**
   * Test {@link WebResourcesRegistration#webhookTracingFilterRegistration()}.
   *
   * <ul>
   *   <li>Given {@link WebResourcesRegistration} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link WebResourcesRegistration#webhookTracingFilterRegistration()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FilterRegistrationBean WebResourcesRegistration.webhookTracingFilterRegistration()"
  })
  public void testWebhookTracingFilterRegistration_givenWebResourcesRegistration() {
    // Arrange and Act
    FilterRegistrationBean actualWebhookTracingFilterRegistrationResult =
        new WebResourcesRegistration().webhookTracingFilterRegistration();

    // Assert
    Collection servletNames = actualWebhookTracingFilterRegistrationResult.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection urlPatterns = actualWebhookTracingFilterRegistrationResult.getUrlPatterns();
    assertEquals(1, urlPatterns.size());
    assertTrue(urlPatterns instanceof Set);
    Filter filter = actualWebhookTracingFilterRegistrationResult.getFilter();
    assertTrue(filter instanceof WebHookTracingFilter);
    assertFalse(actualWebhookTracingFilterRegistrationResult.isMatchAfter());
    assertFalse(((WebHookTracingFilter) filter).isInitialized());
    assertTrue(servletNames.isEmpty());
    assertTrue(actualWebhookTracingFilterRegistrationResult.getInitParameters().isEmpty());
    assertTrue(actualWebhookTracingFilterRegistrationResult.isAsyncSupported());
    assertTrue(actualWebhookTracingFilterRegistrationResult.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualWebhookTracingFilterRegistrationResult.getOrder());
    assertEquals(
        servletNames, actualWebhookTracingFilterRegistrationResult.getServletRegistrationBeans());
  }

  /**
   * Test {@link WebResourcesRegistration#integrationMetricsFilterRegistration()}.
   *
   * <ul>
   *   <li>Given {@link WebResourcesRegistration} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link WebResourcesRegistration#integrationMetricsFilterRegistration()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FilterRegistrationBean WebResourcesRegistration.integrationMetricsFilterRegistration()"
  })
  public void testIntegrationMetricsFilterRegistration_givenWebResourcesRegistration() {
    // Arrange and Act
    FilterRegistrationBean actualIntegrationMetricsFilterRegistrationResult =
        new WebResourcesRegistration().integrationMetricsFilterRegistration();

    // Assert
    Collection servletNames = actualIntegrationMetricsFilterRegistrationResult.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection urlPatterns = actualIntegrationMetricsFilterRegistrationResult.getUrlPatterns();
    assertEquals(1, urlPatterns.size());
    assertTrue(urlPatterns instanceof Set);
    Filter filter = actualIntegrationMetricsFilterRegistrationResult.getFilter();
    assertTrue(filter instanceof IntegrationMetricsFilter);
    Map<String, String> initParameters =
        actualIntegrationMetricsFilterRegistrationResult.getInitParameters();
    assertEquals(2, initParameters.size());
    assertEquals("/integration/metrics/", initParameters.get("ignore-url"));
    assertEquals("/integration/v1/whi/", initParameters.get("webhook-url"));
    assertNull(((IntegrationMetricsFilter) filter).getIntegrationUrlParam());
    assertNull(((IntegrationMetricsFilter) filter).getIgnoreList());
    assertNull(((IntegrationMetricsFilter) filter).getMetricsController());
    assertFalse(actualIntegrationMetricsFilterRegistrationResult.isMatchAfter());
    assertTrue(servletNames.isEmpty());
    assertTrue(actualIntegrationMetricsFilterRegistrationResult.isAsyncSupported());
    assertTrue(actualIntegrationMetricsFilterRegistrationResult.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualIntegrationMetricsFilterRegistrationResult.getOrder());
    assertEquals(
        servletNames,
        actualIntegrationMetricsFilterRegistrationResult.getServletRegistrationBeans());
  }

  /**
   * Test {@link WebResourcesRegistration#apiServletRegistration(WebApplicationContext,
   * MultipartProperties)}.
   *
   * <ul>
   *   <li>Given {@link WebResourcesRegistration} (default constructor).
   *   <li>When {@link MultipartProperties} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link
   * WebResourcesRegistration#apiServletRegistration(WebApplicationContext, MultipartProperties)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ServletRegistrationBean WebResourcesRegistration.apiServletRegistration(WebApplicationContext, MultipartProperties)"
  })
  public void testApiServletRegistration_givenWebResourcesRegistration_whenMultipartProperties() {
    // Arrange
    WebResourcesRegistration webResourcesRegistration = new WebResourcesRegistration();
    AnnotationConfigEmbeddedWebApplicationContext context =
        new AnnotationConfigEmbeddedWebApplicationContext();

    // Act
    ServletRegistrationBean actualApiServletRegistrationResult =
        webResourcesRegistration.apiServletRegistration(context, new MultipartProperties());

    // Assert
    Collection<String> urlMappings = actualApiServletRegistrationResult.getUrlMappings();
    assertEquals(1, urlMappings.size());
    assertTrue(urlMappings instanceof Set);
    MultipartConfigElement multipartConfig =
        actualApiServletRegistrationResult.getMultipartConfig();
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
