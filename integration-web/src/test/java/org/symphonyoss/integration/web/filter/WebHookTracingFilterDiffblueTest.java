package org.symphonyoss.integration.web.filter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import org.springframework.mock.web.MockHttpServletResponse;

public class WebHookTracingFilterDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link WebHookTracingFilter}
   *   <li>{@link WebHookTracingFilter#init(FilterConfig)}
   *   <li>{@link WebHookTracingFilter#destroy()}
   *   <li>{@link WebHookTracingFilter#isInitialized()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void WebHookTracingFilter.<init>()",
    "void WebHookTracingFilter.destroy()",
    "void WebHookTracingFilter.init(FilterConfig)",
    "boolean WebHookTracingFilter.isInitialized()"
  })
  public void testGettersAndSetters() throws ServletException {
    // Arrange and Act
    WebHookTracingFilter actualWebHookTracingFilter = new WebHookTracingFilter();
    actualWebHookTracingFilter.init(WebHookOriginCheckFilterFactory.createFilterConfig());
    actualWebHookTracingFilter.destroy();

    // Assert
    assertTrue(actualWebHookTracingFilter.isInitialized());
  }

  /**
   * Test {@link WebHookTracingFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@link ServletException#ServletException()}.
   *   <li>Then throw {@link ServletException}.
   * </ul>
   *
   * <p>Method under test: {@link WebHookTracingFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void WebHookTracingFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  public void testDoFilter_givenServletException_thenThrowServletException()
      throws IOException, ServletException {
    // Arrange
    WebHookTracingFilter webHookTracingFilter = new WebHookTracingFilter();
    ServletRequest servletRequest = WebHookOriginCheckFilterFactory.createServletRequest();
    MockHttpServletResponse servletResponse = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new ServletException())
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    thrown.expect(ServletException.class);
    webHookTracingFilter.doFilter(servletRequest, servletResponse, filterChain);
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link WebHookTracingFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Then {@link MockHttpServletResponse} (default constructor) HeaderNames size is one.
   * </ul>
   *
   * <p>Method under test: {@link WebHookTracingFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void WebHookTracingFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  public void testDoFilter_thenMockHttpServletResponseHeaderNamesSizeIsOne()
      throws IOException, ServletException {
    // Arrange
    WebHookTracingFilter webHookTracingFilter = new WebHookTracingFilter();
    ServletRequest servletRequest = WebHookOriginCheckFilterFactory.createServletRequest();
    MockHttpServletResponse servletResponse = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doNothing()
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    webHookTracingFilter.doFilter(servletRequest, servletResponse, filterChain);

    // Assert
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
    Collection<String> headerNames = servletResponse.getHeaderNames();
    assertEquals(1, headerNames.size());
    assertTrue(headerNames instanceof Set);
    assertTrue(headerNames.contains("X-Trace-Id"));
  }
}
