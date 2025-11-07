package org.symphonyoss.integration.provisioning.client.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppStoreAssetsWrapperDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link AppStoreAssetsWrapper}
   *   <li>{@link AppStoreAssetsWrapper#setIconUrl(String)}
   *   <li>{@link AppStoreAssetsWrapper#setLoadUrl(String)}
   *   <li>{@link AppStoreAssetsWrapper#getIconUrl()}
   *   <li>{@link AppStoreAssetsWrapper#getLoadUrl()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    AppStoreAssetsWrapper actualAppStoreAssetsWrapper = new AppStoreAssetsWrapper();
    actualAppStoreAssetsWrapper.setIconUrl("https://example.org/example");
    actualAppStoreAssetsWrapper.setLoadUrl("https://example.org/example");
    String actualIconUrl = actualAppStoreAssetsWrapper.getIconUrl();

    // Assert that nothing has changed
    assertEquals("https://example.org/example", actualIconUrl);
    assertEquals("https://example.org/example", actualAppStoreAssetsWrapper.getLoadUrl());
  }
}
