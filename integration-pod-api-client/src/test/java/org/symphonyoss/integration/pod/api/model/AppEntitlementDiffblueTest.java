package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class AppEntitlementDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
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
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AppEntitlement.<init>()",
    "String AppEntitlement.getAppId()",
    "String AppEntitlement.getAppName()",
    "Boolean AppEntitlement.getEnable()",
    "Boolean AppEntitlement.getInstall()",
    "Boolean AppEntitlement.getListed()",
    "void AppEntitlement.setAppId(String)",
    "void AppEntitlement.setAppName(String)",
    "void AppEntitlement.setEnable(Boolean)",
    "void AppEntitlement.setInstall(Boolean)",
    "void AppEntitlement.setListed(Boolean)"
  })
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

    // Assert
    assertEquals("42", actualAppId);
    assertEquals("App Name", actualAppName);
    assertTrue(actualEnable);
    assertTrue(actualInstall);
    assertTrue(actualAppEntitlement.getListed());
  }
}
