package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class CompanyCertDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCert}
   *   <li>{@link CompanyCert#setAttributes(CompanyCertAttributes)}
   *   <li>{@link CompanyCert#setPem(String)}
   *   <li>{@link CompanyCert#getAttributes()}
   *   <li>{@link CompanyCert#getPem()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCert actualCompanyCert = new CompanyCert();
    CompanyCertStatus status = new CompanyCertStatus();
    status.setType(CompanyCertStatus.TypeEnum.TRUSTED);
    CompanyCertType type = new CompanyCertType();
    type.setType(CompanyCertType.TypeEnum.USERSIGNING);
    CompanyCertAttributes attributes = new CompanyCertAttributes();
    attributes.setName("Name");
    attributes.setStatus(status);
    attributes.setType(type);
    actualCompanyCert.setAttributes(attributes);
    actualCompanyCert.setPem("Pem");
    CompanyCertAttributes actualAttributes = actualCompanyCert.getAttributes();

    // Assert that nothing has changed
    assertEquals("Pem", actualCompanyCert.getPem());
    assertSame(attributes, actualAttributes);
  }
}
