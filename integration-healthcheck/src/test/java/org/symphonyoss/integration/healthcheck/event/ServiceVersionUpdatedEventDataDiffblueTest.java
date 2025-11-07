package org.symphonyoss.integration.healthcheck.event;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ServiceVersionUpdatedEventDataDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>
   * {@link ServiceVersionUpdatedEventData#ServiceVersionUpdatedEventData(String, String, String)}
   *   <li>{@link ServiceVersionUpdatedEventData#getNewVersion()}
   *   <li>{@link ServiceVersionUpdatedEventData#getOldVersion()}
   *   <li>{@link ServiceVersionUpdatedEventData#getServiceName()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    ServiceVersionUpdatedEventData actualServiceVersionUpdatedEventData = new ServiceVersionUpdatedEventData(
        "Service Name", "1.0.1", "1.0.3");
    String actualNewVersion = actualServiceVersionUpdatedEventData.getNewVersion();
    String actualOldVersion = actualServiceVersionUpdatedEventData.getOldVersion();

    // Assert
    assertEquals("1.0.1", actualOldVersion);
    assertEquals("1.0.3", actualNewVersion);
    assertEquals("Service Name", actualServiceVersionUpdatedEventData.getServiceName());
  }
}
