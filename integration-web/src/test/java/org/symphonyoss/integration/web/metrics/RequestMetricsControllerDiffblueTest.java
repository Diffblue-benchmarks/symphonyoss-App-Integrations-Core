package org.symphonyoss.integration.web.metrics;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.codahale.metrics.Counter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.Timer;
import com.codahale.metrics.Timer.Context;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RequestMetricsControllerDiffblueTest {
  @Mock private Counter counter;

  @Mock private Meter meter;

  @InjectMocks private RequestMetricsController requestMetricsController;

  @Mock private Timer timer;

  /**
   * Test {@link RequestMetricsController#startRequest()}.
   *
   * <p>Method under test: {@link RequestMetricsController#startRequest()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Context RequestMetricsController.startRequest()"})
  public void testStartRequest() {
    // Arrange
    doNothing().when(counter).inc();
    when(timer.time()).thenReturn(null);

    // Act
    Context actualStartRequestResult = requestMetricsController.startRequest();

    // Assert
    verify(counter).inc();
    verify(timer).time();
    assertNull(actualStartRequestResult);
  }

  /**
   * Test {@link RequestMetricsController#startIntegrationExecution(String)}.
   *
   * <ul>
   *   <li>Given {@link RequestMetricsController} (default constructor).
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RequestMetricsController#startIntegrationExecution(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Context RequestMetricsController.startIntegrationExecution(String)"})
  public void testStartIntegrationExecution_givenRequestMetricsController_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new RequestMetricsController().startIntegrationExecution("Integration"));
  }

  /**
   * Test {@link RequestMetricsController#finishRequest(Context, int)}.
   *
   * <ul>
   *   <li>Given {@link Meter} {@link Meter#mark()} does nothing.
   *   <li>Then calls {@link Meter#mark()}.
   * </ul>
   *
   * <p>Method under test: {@link RequestMetricsController#finishRequest(Context, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void RequestMetricsController.finishRequest(Context, int)"})
  public void testFinishRequest_givenMeterMarkDoesNothing_thenCallsMark() {
    // Arrange
    doNothing().when(counter).dec();
    doNothing().when(meter).mark();

    Context context = mock(Context.class);
    doNothing().when(context).close();

    // Act
    requestMetricsController.finishRequest(context, 1);

    // Assert
    verify(counter).dec();
    verify(meter).mark();
    verify(context).close();
  }

  /**
   * Test {@link RequestMetricsController#finishRequest(Context, int)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RequestMetricsController#finishRequest(Context, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void RequestMetricsController.finishRequest(Context, int)"})
  public void testFinishRequest_whenNull() {
    // Arrange
    doNothing().when(counter).dec();

    // Act
    requestMetricsController.finishRequest(null, 1);

    // Assert
    verify(counter).dec();
  }

  /**
   * Test {@link RequestMetricsController#finishIntegrationExecution(Context)}.
   *
   * <ul>
   *   <li>Given {@link RequestMetricsController} (default constructor).
   *   <li>Then calls {@link Context#close()}.
   * </ul>
   *
   * <p>Method under test: {@link RequestMetricsController#finishIntegrationExecution(Context)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void RequestMetricsController.finishIntegrationExecution(Context)"})
  public void testFinishIntegrationExecution_givenRequestMetricsController_thenCallsClose() {
    // Arrange
    RequestMetricsController requestMetricsController = new RequestMetricsController();

    Context context = mock(Context.class);
    doNothing().when(context).close();

    // Act
    requestMetricsController.finishIntegrationExecution(context);

    // Assert
    verify(context).close();
  }
}
