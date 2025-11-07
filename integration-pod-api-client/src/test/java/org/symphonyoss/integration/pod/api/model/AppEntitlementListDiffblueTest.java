package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppEntitlementListDiffblueTest {
  /**
   * Method under test: default or parameterless constructor of
   * {@link AppEntitlementList}
   */
  @Test
  public void testNewAppEntitlementList() {
    // Arrange, Act and Assert
    assertTrue((new AppEntitlementList()).isEmpty());
  }
}
