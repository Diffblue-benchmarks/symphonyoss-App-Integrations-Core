package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class IntegrationInstanceListDiffblueTest {
  /**
   * Test new {@link IntegrationInstanceList} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link IntegrationInstanceList}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void IntegrationInstanceList.<init>()"})
  public void testNewIntegrationInstanceList() {
    // Arrange, Act and Assert
    assertTrue(new IntegrationInstanceList().isEmpty());
  }
}
