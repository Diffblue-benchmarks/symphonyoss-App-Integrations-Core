package org.symphonyoss.integration.web.metrics;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.codahale.metrics.Timer;
import com.codahale.metrics.Timer.Context;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RequestMetricsControllerDiffblueTest {
  @InjectMocks
  private RequestMetricsController requestMetricsController;

  /**
   * Test {@link RequestMetricsController#startIntegrationExecution(String)}.
   * <ul>
   *   <li>When {@code Integration}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RequestMetricsController#startIntegrationExecution(String)}
   */
  @Test
  @MethodsUnderTest({"Context RequestMetricsController.startIntegrationExecution(String)"})
  public void testStartIntegrationExecution_whenIntegration_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(requestMetricsController.startIntegrationExecution("Integration"));
  }

  /**
   * Test {@link RequestMetricsController#finishIntegrationExecution(Context)}.
   * <ul>
   *   <li>When {@link Context} {@link Context#close()} does nothing.</li>
   *   <li>Then calls {@link Context#close()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RequestMetricsController#finishIntegrationExecution(Context)}
   */
  @Test
  @MethodsUnderTest({"void RequestMetricsController.finishIntegrationExecution(Context)"})
  public void testFinishIntegrationExecution_whenContextCloseDoesNothing_thenCallsClose() {
    // Arrange
    Context context = mock(Context.class);
    doNothing().when(context).close();

    // Act
    requestMetricsController.finishIntegrationExecution(context);

    // Assert
    verify(context).close();
  }
}
