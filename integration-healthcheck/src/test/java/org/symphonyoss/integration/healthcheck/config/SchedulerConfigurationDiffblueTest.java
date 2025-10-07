package org.symphonyoss.integration.healthcheck.config;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {SchedulerConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class SchedulerConfigurationDiffblueTest {
  @Autowired private SchedulerConfiguration schedulerConfiguration;

  /**
   * Test {@link SchedulerConfiguration#configureTasks(ScheduledTaskRegistrar)}.
   *
   * <ul>
   *   <li>Given {@link SchedulerConfiguration} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link SchedulerConfiguration#configureTasks(ScheduledTaskRegistrar)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void SchedulerConfiguration.configureTasks(ScheduledTaskRegistrar)"})
  public void testConfigureTasks_givenSchedulerConfiguration() {
    // Arrange
    SchedulerConfiguration schedulerConfiguration = new SchedulerConfiguration();
    ScheduledTaskRegistrar scheduledTaskRegistrar = new ScheduledTaskRegistrar();

    // Act
    schedulerConfiguration.configureTasks(scheduledTaskRegistrar);

    // Assert
    assertTrue(scheduledTaskRegistrar.getScheduler() instanceof ConcurrentTaskScheduler);
  }

  /**
   * Test {@link SchedulerConfiguration#configureTasks(ScheduledTaskRegistrar)}.
   *
   * <ul>
   *   <li>Then {@link ScheduledTaskRegistrar} (default constructor) Scheduler {@link
   *       ConcurrentTaskScheduler}.
   * </ul>
   *
   * <p>Method under test: {@link SchedulerConfiguration#configureTasks(ScheduledTaskRegistrar)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void SchedulerConfiguration.configureTasks(ScheduledTaskRegistrar)"})
  public void testConfigureTasks_thenScheduledTaskRegistrarSchedulerConcurrentTaskScheduler() {
    // Arrange
    ScheduledTaskRegistrar scheduledTaskRegistrar = new ScheduledTaskRegistrar();

    // Act
    schedulerConfiguration.configureTasks(scheduledTaskRegistrar);

    // Assert
    assertTrue(scheduledTaskRegistrar.getScheduler() instanceof ConcurrentTaskScheduler);
  }
}
