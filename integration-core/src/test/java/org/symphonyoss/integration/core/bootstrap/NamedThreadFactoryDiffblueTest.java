package org.symphonyoss.integration.core.bootstrap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.utils.ValidateFactory;
import org.junit.Test;

public class NamedThreadFactoryDiffblueTest {
  /**
   * Test {@link NamedThreadFactory#NamedThreadFactory(String, boolean)}.
   *
   * <ul>
   *   <li>Then return newThread {@link Runnable} Name is {@code validString-0}.
   * </ul>
   *
   * <p>Method under test: {@link NamedThreadFactory#NamedThreadFactory(String, boolean)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void NamedThreadFactory.<init>(String, boolean)"})
  public void testNewNamedThreadFactory_thenReturnNewThreadRunnableNameIsValidString0() {
    // Arrange and Act
    Thread actualNewThreadResult =
        new NamedThreadFactory(ValidateFactory.createNonNullString(), true)
            .newThread(mock(Runnable.class));

    // Assert
    assertEquals("validString-0", actualNewThreadResult.getName());
    assertEquals(5, actualNewThreadResult.getPriority());
  }
}
