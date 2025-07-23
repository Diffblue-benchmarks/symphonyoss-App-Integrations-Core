package org.symphonyoss.integration.provisioning.client.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class AppStoreWrapperDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AppStoreWrapper}
   *   <li>{@link AppStoreWrapper#setAppGroupId(String)}
   *   <li>{@link AppStoreWrapper#setAssets(AppStoreAssetsWrapper)}
   *   <li>{@link AppStoreWrapper#setDescription(String)}
   *   <li>{@link AppStoreWrapper#setDomain(String)}
   *   <li>{@link AppStoreWrapper#setEnabled(Boolean)}
   *   <li>{@link AppStoreWrapper#setId(String)}
   *   <li>{@link AppStoreWrapper#setName(String)}
   *   <li>{@link AppStoreWrapper#setPublisher(String)}
   *   <li>{@link AppStoreWrapper#setSettings(AppStoreSettingsWrapper)}
   *   <li>{@link AppStoreWrapper#setSymphonyManaged(Boolean)}
   *   <li>{@link AppStoreWrapper#setType(String)}
   *   <li>{@link AppStoreWrapper#setVersion(String)}
   *   <li>{@link AppStoreWrapper#getAppGroupId()}
   *   <li>{@link AppStoreWrapper#getAssets()}
   *   <li>{@link AppStoreWrapper#getDescription()}
   *   <li>{@link AppStoreWrapper#getDomain()}
   *   <li>{@link AppStoreWrapper#getEnabled()}
   *   <li>{@link AppStoreWrapper#getId()}
   *   <li>{@link AppStoreWrapper#getName()}
   *   <li>{@link AppStoreWrapper#getPublisher()}
   *   <li>{@link AppStoreWrapper#getSettings()}
   *   <li>{@link AppStoreWrapper#getSymphonyManaged()}
   *   <li>{@link AppStoreWrapper#getType()}
   *   <li>{@link AppStoreWrapper#getVersion()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AppStoreWrapper.<init>()",
    "String AppStoreWrapper.getAppGroupId()",
    "AppStoreAssetsWrapper AppStoreWrapper.getAssets()",
    "String AppStoreWrapper.getDescription()",
    "String AppStoreWrapper.getDomain()",
    "Boolean AppStoreWrapper.getEnabled()",
    "String AppStoreWrapper.getId()",
    "String AppStoreWrapper.getName()",
    "String AppStoreWrapper.getPublisher()",
    "AppStoreSettingsWrapper AppStoreWrapper.getSettings()",
    "Boolean AppStoreWrapper.getSymphonyManaged()",
    "String AppStoreWrapper.getType()",
    "String AppStoreWrapper.getVersion()",
    "void AppStoreWrapper.setAppGroupId(String)",
    "void AppStoreWrapper.setAssets(AppStoreAssetsWrapper)",
    "void AppStoreWrapper.setDescription(String)",
    "void AppStoreWrapper.setDomain(String)",
    "void AppStoreWrapper.setEnabled(Boolean)",
    "void AppStoreWrapper.setId(String)",
    "void AppStoreWrapper.setName(String)",
    "void AppStoreWrapper.setPublisher(String)",
    "void AppStoreWrapper.setSettings(AppStoreSettingsWrapper)",
    "void AppStoreWrapper.setSymphonyManaged(Boolean)",
    "void AppStoreWrapper.setType(String)",
    "void AppStoreWrapper.setVersion(String)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    AppStoreWrapper actualAppStoreWrapper = new AppStoreWrapper();
    actualAppStoreWrapper.setAppGroupId("42");
    AppStoreAssetsWrapper assets = new AppStoreAssetsWrapper();
    assets.setIconUrl("https://example.org/example");
    assets.setLoadUrl("https://example.org/example");
    actualAppStoreWrapper.setAssets(assets);
    actualAppStoreWrapper.setDescription("The characteristics of someone or something");
    actualAppStoreWrapper.setDomain("Domain");
    actualAppStoreWrapper.setEnabled(true);
    actualAppStoreWrapper.setId("42");
    actualAppStoreWrapper.setName("Name");
    actualAppStoreWrapper.setPublisher("Publisher");
    AppStoreSettingsWrapper settings = new AppStoreSettingsWrapper();
    settings.setAppType("App Type");
    settings.setEnabled(true);
    settings.setInstall(true);
    settings.setVisible(true);
    actualAppStoreWrapper.setSettings(settings);
    actualAppStoreWrapper.setSymphonyManaged(true);
    actualAppStoreWrapper.setType("Type");
    actualAppStoreWrapper.setVersion("1.0.2");
    String actualAppGroupId = actualAppStoreWrapper.getAppGroupId();
    AppStoreAssetsWrapper actualAssets = actualAppStoreWrapper.getAssets();
    String actualDescription = actualAppStoreWrapper.getDescription();
    String actualDomain = actualAppStoreWrapper.getDomain();
    Boolean actualEnabled = actualAppStoreWrapper.getEnabled();
    String actualId = actualAppStoreWrapper.getId();
    String actualName = actualAppStoreWrapper.getName();
    String actualPublisher = actualAppStoreWrapper.getPublisher();
    AppStoreSettingsWrapper actualSettings = actualAppStoreWrapper.getSettings();
    Boolean actualSymphonyManaged = actualAppStoreWrapper.getSymphonyManaged();
    String actualType = actualAppStoreWrapper.getType();

    // Assert
    assertEquals("1.0.2", actualAppStoreWrapper.getVersion());
    assertEquals("42", actualAppGroupId);
    assertEquals("42", actualId);
    assertEquals("Domain", actualDomain);
    assertEquals("Name", actualName);
    assertEquals("Publisher", actualPublisher);
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals("Type", actualType);
    assertTrue(actualEnabled);
    assertTrue(actualSymphonyManaged);
    assertSame(assets, actualAssets);
    assertSame(settings, actualSettings);
  }
}
