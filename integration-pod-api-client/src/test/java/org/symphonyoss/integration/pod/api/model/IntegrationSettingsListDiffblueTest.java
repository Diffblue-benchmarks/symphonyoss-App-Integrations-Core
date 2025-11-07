package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class IntegrationSettingsListDiffblueTest {
  /**
   * Test new {@link IntegrationSettingsList} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link IntegrationSettingsList}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IntegrationSettingsList.<init>()"})
  public void testNewIntegrationSettingsList() {
    // Arrange, Act and Assert
    assertTrue((new IntegrationSettingsList()).isEmpty());
  }
}
