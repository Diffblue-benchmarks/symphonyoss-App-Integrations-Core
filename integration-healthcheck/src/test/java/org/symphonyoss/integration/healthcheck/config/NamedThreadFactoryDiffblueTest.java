package org.symphonyoss.integration.healthcheck.config;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class NamedThreadFactoryDiffblueTest {
  /**
   * Test {@link NamedThreadFactory#NamedThreadFactory(String, boolean)}.
   *
   * <p>Method under test: {@link NamedThreadFactory#NamedThreadFactory(String, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void NamedThreadFactory.<init>(String, boolean)"})
  public void testNewNamedThreadFactory() {
    // Arrange and Act
    Thread actualNewThreadResult =
        new NamedThreadFactory("Name", true).newThread(mock(Runnable.class));

    // Assert
    assertEquals("Name-0", actualNewThreadResult.getName());
    assertEquals(5, actualNewThreadResult.getPriority());
  }

  /**
   * Test {@link NamedThreadFactory#newThread(Runnable)}.
   *
   * <p>Method under test: {@link NamedThreadFactory#newThread(Runnable)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Thread NamedThreadFactory.newThread(Runnable)"})
  public void testNewThread() {
    // Arrange and Act
    Thread actualNewThreadResult =
        new NamedThreadFactory("Name", true).newThread(mock(Runnable.class));

    // Assert
    assertEquals("Name-0", actualNewThreadResult.getName());
    assertEquals(5, actualNewThreadResult.getPriority());
  }
}
