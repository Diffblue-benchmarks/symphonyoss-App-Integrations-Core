package org.symphonyoss.integration.web.metrics;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.codahale.metrics.Timer;
import org.junit.Test;

public class RequestMetricsControllerDiffblueTest {
  /**
   * Method under test:
   * {@link RequestMetricsController#startIntegrationExecution(String)}
   */
  @Test
  public void testStartIntegrationExecution() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange, Act and Assert
    assertNull((new RequestMetricsController()).startIntegrationExecution("Integration"));
  }

  /**
   * Method under test:
   * {@link RequestMetricsController#finishIntegrationExecution(Timer.Context)}
   */
  @Test
  public void testFinishIntegrationExecution() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    RequestMetricsController requestMetricsController = new RequestMetricsController();
    Timer.Context context = mock(Timer.Context.class);
    doNothing().when(context).close();

    // Act
    requestMetricsController.finishIntegrationExecution(context);

    // Assert
    verify(context).close();
  }
}
