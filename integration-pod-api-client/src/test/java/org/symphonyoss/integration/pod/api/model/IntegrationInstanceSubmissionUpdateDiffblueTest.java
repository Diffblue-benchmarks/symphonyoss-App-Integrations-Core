package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegrationInstanceSubmissionUpdateDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link IntegrationInstanceSubmissionUpdate}
   *   <li>{@link IntegrationInstanceSubmissionUpdate#setConfigurationId(String)}
   *   <li>{@link IntegrationInstanceSubmissionUpdate#setInstanceId(String)}
   *   <li>{@link IntegrationInstanceSubmissionUpdate#setName(String)}
   *   <li>{@link IntegrationInstanceSubmissionUpdate#setOptionalProperties(String)}
   *   <li>{@link IntegrationInstanceSubmissionUpdate#getConfigurationId()}
   *   <li>{@link IntegrationInstanceSubmissionUpdate#getInstanceId()}
   *   <li>{@link IntegrationInstanceSubmissionUpdate#getName()}
   *   <li>{@link IntegrationInstanceSubmissionUpdate#getOptionalProperties()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    IntegrationInstanceSubmissionUpdate actualIntegrationInstanceSubmissionUpdate = new IntegrationInstanceSubmissionUpdate();
    actualIntegrationInstanceSubmissionUpdate.setConfigurationId("42");
    actualIntegrationInstanceSubmissionUpdate.setInstanceId("42");
    actualIntegrationInstanceSubmissionUpdate.setName("Name");
    actualIntegrationInstanceSubmissionUpdate.setOptionalProperties("Optional Properties");
    String actualConfigurationId = actualIntegrationInstanceSubmissionUpdate.getConfigurationId();
    String actualInstanceId = actualIntegrationInstanceSubmissionUpdate.getInstanceId();
    String actualName = actualIntegrationInstanceSubmissionUpdate.getName();

    // Assert that nothing has changed
    assertEquals("42", actualConfigurationId);
    assertEquals("42", actualInstanceId);
    assertEquals("Name", actualName);
    assertEquals("Optional Properties", actualIntegrationInstanceSubmissionUpdate.getOptionalProperties());
  }
}
