package org.symphonyoss.integration.web.filter;

import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

@RunWith(MockitoJUnitRunner.class)
public class IntegrationMetricsFilterDiffblueTest {
  @InjectMocks private IntegrationMetricsFilter integrationMetricsFilter;

  @Mock private List<String> list;

  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link IntegrationMetricsFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then calls {@link List#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationMetricsFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void IntegrationMetricsFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  public void testDoFilter_givenArrayListAddFoo_thenCallsIterator()
      throws IOException, ServletException {
    // Arrange
    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("foo");
    Iterator<String> iteratorResult = stringList.iterator();
    when(list.isEmpty()).thenReturn(false);
    when(list.iterator()).thenReturn(iteratorResult);
    MockHttpServletRequest servletRequest = new MockHttpServletRequest();
    MockHttpServletResponse servletResponse = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doNothing()
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    integrationMetricsFilter.doFilter(servletRequest, servletResponse, filterChain);

    // Assert
    verify(list).isEmpty();
    verify(list).iterator();
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link IntegrationMetricsFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@link List} {@link List#isEmpty()} return {@code true}.
   *   <li>Then calls {@link List#isEmpty()}.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationMetricsFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void IntegrationMetricsFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  public void testDoFilter_givenListIsEmptyReturnTrue_thenCallsIsEmpty()
      throws IOException, ServletException {
    // Arrange
    when(list.isEmpty()).thenReturn(true);
    MockHttpServletRequest servletRequest = new MockHttpServletRequest();
    MockHttpServletResponse servletResponse = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doNothing()
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    integrationMetricsFilter.doFilter(servletRequest, servletResponse, filterChain);

    // Assert
    verify(list).isEmpty();
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link IntegrationMetricsFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@link ServletException#ServletException()}.
   *   <li>Then throw {@link ServletException}.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationMetricsFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void IntegrationMetricsFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  public void testDoFilter_givenServletException_thenThrowServletException()
      throws IOException, ServletException {
    // Arrange
    when(list.isEmpty()).thenReturn(true);
    MockHttpServletRequest servletRequest = new MockHttpServletRequest();
    MockHttpServletResponse servletResponse = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new ServletException())
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    thrown.expect(ServletException.class);
    integrationMetricsFilter.doFilter(servletRequest, servletResponse, filterChain);
    verify(list).isEmpty();
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link IntegrationMetricsFilter}
   *   <li>{@link IntegrationMetricsFilter#destroy()}
   *   <li>{@link IntegrationMetricsFilter#getIgnoreList()}
   *   <li>{@link IntegrationMetricsFilter#getIntegrationUrlParam()}
   *   <li>{@link IntegrationMetricsFilter#getMetricsController()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void IntegrationMetricsFilter.<init>()",
    "void IntegrationMetricsFilter.destroy()",
    "List IntegrationMetricsFilter.getIgnoreList()",
    "String IntegrationMetricsFilter.getIntegrationUrlParam()",
    "org.symphonyoss.integration.web.metrics.RequestMetricsController IntegrationMetricsFilter.getMetricsController()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    IntegrationMetricsFilter actualIntegrationMetricsFilter = new IntegrationMetricsFilter();
    actualIntegrationMetricsFilter.destroy();
    List<String> actualIgnoreList = actualIntegrationMetricsFilter.getIgnoreList();
    String actualIntegrationUrlParam = actualIntegrationMetricsFilter.getIntegrationUrlParam();

    // Assert
    assertNull(actualIntegrationUrlParam);
    assertNull(actualIgnoreList);
    assertNull(actualIntegrationMetricsFilter.getMetricsController());
  }
}
