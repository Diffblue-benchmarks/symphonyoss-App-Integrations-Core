package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class CompanyCertAttributesDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertAttributes}
   *   <li>{@link CompanyCertAttributes#setName(String)}
   *   <li>{@link CompanyCertAttributes#setStatus(CompanyCertStatus)}
   *   <li>{@link CompanyCertAttributes#setType(CompanyCertType)}
   *   <li>{@link CompanyCertAttributes#getName()}
   *   <li>{@link CompanyCertAttributes#getStatus()}
   *   <li>{@link CompanyCertAttributes#getType()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertAttributes actualCompanyCertAttributes = new CompanyCertAttributes();
    actualCompanyCertAttributes.setName("Name");
    CompanyCertStatus status = new CompanyCertStatus();
    status.setType(CompanyCertStatus.TypeEnum.TRUSTED);
    actualCompanyCertAttributes.setStatus(status);
    CompanyCertType type = new CompanyCertType();
    type.setType(CompanyCertType.TypeEnum.USERSIGNING);
    actualCompanyCertAttributes.setType(type);
    String actualName = actualCompanyCertAttributes.getName();
    CompanyCertStatus actualStatus = actualCompanyCertAttributes.getStatus();
    CompanyCertType actualType = actualCompanyCertAttributes.getType();

    // Assert that nothing has changed
    assertEquals("Name", actualName);
    assertEquals(CompanyCertStatus.TypeEnum.TRUSTED, actualStatus.getType());
    assertEquals(CompanyCertType.TypeEnum.USERSIGNING, actualType.getType());
    assertSame(status, actualStatus);
    assertSame(type, actualType);
  }
}
