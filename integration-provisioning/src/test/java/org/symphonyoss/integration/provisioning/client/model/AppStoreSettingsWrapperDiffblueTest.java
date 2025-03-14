package org.symphonyoss.integration.provisioning.client.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class AppStoreSettingsWrapperDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link AppStoreSettingsWrapper}
   *   <li>{@link AppStoreSettingsWrapper#setAppType(String)}
   *   <li>{@link AppStoreSettingsWrapper#setEnabled(boolean)}
   *   <li>{@link AppStoreSettingsWrapper#setInstall(boolean)}
   *   <li>{@link AppStoreSettingsWrapper#setVisible(boolean)}
   *   <li>{@link AppStoreSettingsWrapper#getAppType()}
   *   <li>{@link AppStoreSettingsWrapper#isEnabled()}
   *   <li>{@link AppStoreSettingsWrapper#isInstall()}
   *   <li>{@link AppStoreSettingsWrapper#isVisible()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void AppStoreSettingsWrapper.<init>()", "String AppStoreSettingsWrapper.getAppType()",
      "boolean AppStoreSettingsWrapper.isEnabled()", "boolean AppStoreSettingsWrapper.isInstall()",
      "boolean AppStoreSettingsWrapper.isVisible()", "void AppStoreSettingsWrapper.setAppType(String)",
      "void AppStoreSettingsWrapper.setEnabled(boolean)", "void AppStoreSettingsWrapper.setInstall(boolean)",
      "void AppStoreSettingsWrapper.setVisible(boolean)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    AppStoreSettingsWrapper actualAppStoreSettingsWrapper = new AppStoreSettingsWrapper();
    actualAppStoreSettingsWrapper.setAppType("App Type");
    actualAppStoreSettingsWrapper.setEnabled(true);
    actualAppStoreSettingsWrapper.setInstall(true);
    actualAppStoreSettingsWrapper.setVisible(true);
    String actualAppType = actualAppStoreSettingsWrapper.getAppType();
    boolean actualIsEnabledResult = actualAppStoreSettingsWrapper.isEnabled();
    boolean actualIsInstallResult = actualAppStoreSettingsWrapper.isInstall();

    // Assert
    assertEquals("App Type", actualAppType);
    assertTrue(actualIsEnabledResult);
    assertTrue(actualIsInstallResult);
    assertTrue(actualAppStoreSettingsWrapper.isVisible());
  }
}
