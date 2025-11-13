package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.integration.pod.api.model.CompanyCertStatus.TypeEnum;

public class CompanyCertDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCert}
   *   <li>{@link CompanyCert#setAttributes(CompanyCertAttributes)}
   *   <li>{@link CompanyCert#setPem(String)}
   *   <li>{@link CompanyCert#getAttributes()}
   *   <li>{@link CompanyCert#getPem()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CompanyCert.<init>()",
    "CompanyCertAttributes CompanyCert.getAttributes()",
    "String CompanyCert.getPem()",
    "void CompanyCert.setAttributes(CompanyCertAttributes)",
    "void CompanyCert.setPem(String)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCert actualCompanyCert = new CompanyCert();
    CompanyCertStatus status = new CompanyCertStatus();
    status.setType(TypeEnum.TRUSTED);
    CompanyCertType type = new CompanyCertType();
    type.setType(CompanyCertType.TypeEnum.USERSIGNING);
    CompanyCertAttributes attributes = new CompanyCertAttributes();
    attributes.setName("Name");
    attributes.setStatus(status);
    attributes.setType(type);
    actualCompanyCert.setAttributes(attributes);
    actualCompanyCert.setPem("Pem");
    CompanyCertAttributes actualAttributes = actualCompanyCert.getAttributes();

    // Assert
    assertEquals("Pem", actualCompanyCert.getPem());
    assertSame(attributes, actualAttributes);
  }
}
