package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegrationInstanceSubmissionCreateDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of
   * {@link IntegrationInstanceSubmissionCreate}
   *   <li>{@link IntegrationInstanceSubmissionCreate#setConfigurationId(String)}
   *   <li>{@link IntegrationInstanceSubmissionCreate#setCreatorId(String)}
   *   <li>{@link IntegrationInstanceSubmissionCreate#setName(String)}
   *   <li>{@link IntegrationInstanceSubmissionCreate#setOptionalProperties(String)}
   *   <li>{@link IntegrationInstanceSubmissionCreate#getConfigurationId()}
   *   <li>{@link IntegrationInstanceSubmissionCreate#getCreatorId()}
   *   <li>{@link IntegrationInstanceSubmissionCreate#getName()}
   *   <li>{@link IntegrationInstanceSubmissionCreate#getOptionalProperties()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    IntegrationInstanceSubmissionCreate actualIntegrationInstanceSubmissionCreate = new IntegrationInstanceSubmissionCreate();
    actualIntegrationInstanceSubmissionCreate.setConfigurationId("42");
    actualIntegrationInstanceSubmissionCreate.setCreatorId("42");
    actualIntegrationInstanceSubmissionCreate.setName("Name");
    actualIntegrationInstanceSubmissionCreate.setOptionalProperties("Optional Properties");
    String actualConfigurationId = actualIntegrationInstanceSubmissionCreate.getConfigurationId();
    String actualCreatorId = actualIntegrationInstanceSubmissionCreate.getCreatorId();
    String actualName = actualIntegrationInstanceSubmissionCreate.getName();

    // Assert that nothing has changed
    assertEquals("42", actualConfigurationId);
    assertEquals("42", actualCreatorId);
    assertEquals("Name", actualName);
    assertEquals("Optional Properties", actualIntegrationInstanceSubmissionCreate.getOptionalProperties());
  }
}
