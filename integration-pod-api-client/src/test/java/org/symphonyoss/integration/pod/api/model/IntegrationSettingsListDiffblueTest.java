package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class IntegrationSettingsListDiffblueTest {
  /**
   * Method under test: default or parameterless constructor of
   * {@link IntegrationSettingsList}
   */
  @Test
  public void testNewIntegrationSettingsList() {
    // Arrange, Act and Assert
    assertTrue((new IntegrationSettingsList()).isEmpty());
  }
}
