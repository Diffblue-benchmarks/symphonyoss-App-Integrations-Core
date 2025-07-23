package org.symphonyoss.integration.web.filter;

import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.apache.catalina.connector.Response;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import org.springframework.beans.factory.FactoryBeanNotInitializedException;
import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;

public class WebHookOriginCheckFilterDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link WebHookOriginCheckFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@code welcome}.
   *   <li>When {@link FilterChain} {@link FilterChain#doFilter(ServletRequest, ServletResponse)}
   *       does nothing.
   *   <li>Then calls {@link FilterChain#doFilter(ServletRequest, ServletResponse)}.
   * </ul>
   *
   * <p>Method under test: {@link WebHookOriginCheckFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void WebHookOriginCheckFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  public void testDoFilter_givenWelcome_whenFilterChainDoFilterDoesNothing_thenCallsDoFilter()
      throws IOException, ServletException {
    // Arrange
    WebHookOriginCheckFilter webHookOriginCheckFilter = new WebHookOriginCheckFilter();
    DefaultMultipartHttpServletRequest servletRequest =
        mock(DefaultMultipartHttpServletRequest.class);
    when(servletRequest.getContextPath()).thenReturn("https://example.org/example");
    when(servletRequest.getRequestURI()).thenReturn("welcome");
    Response servletResponse = new Response();
    FilterChain filterChain = mock(FilterChain.class);
    doNothing()
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    webHookOriginCheckFilter.doFilter(servletRequest, servletResponse, filterChain);

    // Assert
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
    verify(servletRequest).getContextPath();
    verify(servletRequest).getRequestURI();
  }

  /**
   * Test {@link WebHookOriginCheckFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Then throw {@link FactoryBeanNotInitializedException}.
   * </ul>
   *
   * <p>Method under test: {@link WebHookOriginCheckFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void WebHookOriginCheckFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  public void testDoFilter_thenThrowFactoryBeanNotInitializedException()
      throws IOException, ServletException {
    // Arrange
    WebHookOriginCheckFilter webHookOriginCheckFilter = new WebHookOriginCheckFilter();
    DefaultMultipartHttpServletRequest servletRequest =
        mock(DefaultMultipartHttpServletRequest.class);
    when(servletRequest.getContextPath()).thenReturn("https://example.org/example");
    when(servletRequest.getRequestURI()).thenReturn("welcome");
    Response servletResponse = new Response();
    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new FactoryBeanNotInitializedException(WebHookOriginCheckFilter.URL_PATTERN))
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    thrown.expect(FactoryBeanNotInitializedException.class);
    webHookOriginCheckFilter.doFilter(servletRequest, servletResponse, filterChain);
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
    verify(servletRequest).getContextPath();
    verify(servletRequest).getRequestURI();
  }
}
