package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CompanyCertStatusDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertStatus}
   *   <li>{@link CompanyCertStatus#setType(CompanyCertStatus.TypeEnum)}
   *   <li>{@link CompanyCertStatus#getType()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertStatus actualCompanyCertStatus = new CompanyCertStatus();
    actualCompanyCertStatus.setType(CompanyCertStatus.TypeEnum.TRUSTED);

    // Assert that nothing has changed
    assertEquals(CompanyCertStatus.TypeEnum.TRUSTED, actualCompanyCertStatus.getType());
  }
}
