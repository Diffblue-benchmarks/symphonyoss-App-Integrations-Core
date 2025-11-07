package org.symphonyoss.integration.provisioning.client.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppStoreSettingsWrapperDiffblueTest {
  /**
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

    // Assert that nothing has changed
    assertEquals("App Type", actualAppType);
    assertTrue(actualIsEnabledResult);
    assertTrue(actualIsInstallResult);
    assertTrue(actualAppStoreSettingsWrapper.isVisible());
  }
}
