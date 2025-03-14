package org.symphonyoss.integration.provisioning.client.model;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class AppStoreAssetsWrapperDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
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
  @MethodsUnderTest({"void AppStoreAssetsWrapper.<init>()", "String AppStoreAssetsWrapper.getIconUrl()",
      "String AppStoreAssetsWrapper.getLoadUrl()", "void AppStoreAssetsWrapper.setIconUrl(String)",
      "void AppStoreAssetsWrapper.setLoadUrl(String)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    AppStoreAssetsWrapper actualAppStoreAssetsWrapper = new AppStoreAssetsWrapper();
    actualAppStoreAssetsWrapper.setIconUrl("https://example.org/example");
    actualAppStoreAssetsWrapper.setLoadUrl("https://example.org/example");
    String actualIconUrl = actualAppStoreAssetsWrapper.getIconUrl();

    // Assert
    assertEquals("https://example.org/example", actualIconUrl);
    assertEquals("https://example.org/example", actualAppStoreAssetsWrapper.getLoadUrl());
  }
}
