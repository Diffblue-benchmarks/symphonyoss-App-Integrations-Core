package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class IntegrationInstanceListDiffblueTest {
  /**
   * Method under test: default or parameterless constructor of
   * {@link IntegrationInstanceList}
   */
  @Test
  public void testNewIntegrationInstanceList() {
    // Arrange, Act and Assert
    assertTrue((new IntegrationInstanceList()).isEmpty());
  }
}
