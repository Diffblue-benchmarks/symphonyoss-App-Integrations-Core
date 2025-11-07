package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppEntitlementDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link AppEntitlement}
   *   <li>{@link AppEntitlement#setAppId(String)}
   *   <li>{@link AppEntitlement#setAppName(String)}
   *   <li>{@link AppEntitlement#setEnable(Boolean)}
   *   <li>{@link AppEntitlement#setInstall(Boolean)}
   *   <li>{@link AppEntitlement#setListed(Boolean)}
   *   <li>{@link AppEntitlement#getAppId()}
   *   <li>{@link AppEntitlement#getAppName()}
   *   <li>{@link AppEntitlement#getEnable()}
   *   <li>{@link AppEntitlement#getInstall()}
   *   <li>{@link AppEntitlement#getListed()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    AppEntitlement actualAppEntitlement = new AppEntitlement();
    actualAppEntitlement.setAppId("42");
    actualAppEntitlement.setAppName("App Name");
    actualAppEntitlement.setEnable(true);
    actualAppEntitlement.setInstall(true);
    actualAppEntitlement.setListed(true);
    String actualAppId = actualAppEntitlement.getAppId();
    String actualAppName = actualAppEntitlement.getAppName();
    Boolean actualEnable = actualAppEntitlement.getEnable();
    Boolean actualInstall = actualAppEntitlement.getInstall();

    // Assert that nothing has changed
    assertEquals("42", actualAppId);
    assertEquals("App Name", actualAppName);
    assertTrue(actualEnable);
    assertTrue(actualInstall);
    assertTrue(actualAppEntitlement.getListed());
  }
}
