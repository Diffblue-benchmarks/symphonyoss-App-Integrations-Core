package org.symphonyoss.integration.healthcheck.config;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.PeriodicTrigger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {SchedulerConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class SchedulerConfigurationDiffblueTest {
  @Autowired
  private SchedulerConfiguration schedulerConfiguration;

  /**
   * Method under test:
   * {@link SchedulerConfiguration#configureTasks(ScheduledTaskRegistrar)}
   */
  @Test
  public void testConfigureTasks() {
    // Arrange
    ScheduledTaskRegistrar scheduledTaskRegistrar = new ScheduledTaskRegistrar();

    // Act
    schedulerConfiguration.configureTasks(scheduledTaskRegistrar);

    // Assert
    assertTrue(scheduledTaskRegistrar.getScheduler() instanceof ConcurrentTaskScheduler);
  }

  /**
   * Method under test:
   * {@link SchedulerConfiguration#configureTasks(ScheduledTaskRegistrar)}
   */
  @Test
  public void testConfigureTasks2() {
    // Arrange
    ScheduledTaskRegistrar scheduledTaskRegistrar = new ScheduledTaskRegistrar();
    Runnable task = mock(Runnable.class);
    scheduledTaskRegistrar.addTriggerTask(task, new PeriodicTrigger(1L));

    // Act
    schedulerConfiguration.configureTasks(scheduledTaskRegistrar);

    // Assert
    assertTrue(scheduledTaskRegistrar.getScheduler() instanceof ConcurrentTaskScheduler);
  }
}
