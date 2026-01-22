package org.symphonyoss.integration.web.metrics;

import com.codahale.metrics.Counter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;
import com.diffblue.cover.annotations.InterestingTestFactory;

import java.lang.reflect.Field;

/**
 * Factory class for creating valid objects for RequestMetricsController testing.
 * This factory provides objects that avoid common exceptions during test generation.
 */
public class RequestMetricsControllerFactory {

  /**
   * Creates a properly initialized RequestMetricsController with non-null metricsRegistry.
   * This avoids NullPointerException in startRequest and finishRequest methods.
   *
   * @return A valid RequestMetricsController instance
   */
  @InterestingTestFactory
  public static RequestMetricsController createRequestMetricsController() throws Exception {
    RequestMetricsController controller = new RequestMetricsController();
    MetricRegistry metricRegistry = new MetricRegistry();

    // Use reflection to set the metricsRegistry field
    Field metricsRegistryField = RequestMetricsController.class.getDeclaredField("metricsRegistry");
    metricsRegistryField.setAccessible(true);
    metricsRegistryField.set(controller, metricRegistry);

    // Initialize the controller to set up metrics
    controller.init();

    return controller;
  }

  /**
   * Creates a valid Timer.Context for testing.
   * This provides a non-null context for finishRequest method.
   *
   * @return A valid Timer.Context instance
   */
  @InterestingTestFactory
  public static Timer.Context createTimerContext() {
    MetricRegistry registry = new MetricRegistry();
    Timer timer = registry.timer("test.timer");
    return timer.time();
  }
}
