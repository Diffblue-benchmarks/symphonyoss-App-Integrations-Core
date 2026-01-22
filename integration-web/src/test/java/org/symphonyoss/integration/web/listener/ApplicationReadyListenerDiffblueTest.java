package org.symphonyoss.integration.web.listener;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class ApplicationReadyListenerDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ApplicationReadyListener}
   *   <li>{@link ApplicationReadyListener#isInitialized()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApplicationReadyListener.<init>()",
    "boolean ApplicationReadyListener.isInitialized()"
  })
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertTrue(new ApplicationReadyListener().isInitialized());
  }
}
