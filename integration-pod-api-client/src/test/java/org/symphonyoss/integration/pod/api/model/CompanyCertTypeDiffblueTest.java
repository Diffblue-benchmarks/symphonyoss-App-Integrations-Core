package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CompanyCertTypeDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertType}
   *   <li>{@link CompanyCertType#setType(CompanyCertType.TypeEnum)}
   *   <li>{@link CompanyCertType#getType()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertType actualCompanyCertType = new CompanyCertType();
    actualCompanyCertType.setType(CompanyCertType.TypeEnum.USERSIGNING);

    // Assert that nothing has changed
    assertEquals(CompanyCertType.TypeEnum.USERSIGNING, actualCompanyCertType.getType());
  }
}
