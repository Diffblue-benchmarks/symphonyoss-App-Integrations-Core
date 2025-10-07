package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.integration.pod.api.model.CompanyCertStatus.TypeEnum;

public class CompanyCertAttributesDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
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
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CompanyCertAttributes.<init>()",
    "String CompanyCertAttributes.getName()",
    "CompanyCertStatus CompanyCertAttributes.getStatus()",
    "CompanyCertType CompanyCertAttributes.getType()",
    "void CompanyCertAttributes.setName(String)",
    "void CompanyCertAttributes.setStatus(CompanyCertStatus)",
    "void CompanyCertAttributes.setType(CompanyCertType)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertAttributes actualCompanyCertAttributes = new CompanyCertAttributes();
    actualCompanyCertAttributes.setName("Name");
    CompanyCertStatus status = new CompanyCertStatus();
    status.setType(TypeEnum.TRUSTED);
    actualCompanyCertAttributes.setStatus(status);
    CompanyCertType type = new CompanyCertType();
    type.setType(CompanyCertType.TypeEnum.USERSIGNING);
    actualCompanyCertAttributes.setType(type);
    String actualName = actualCompanyCertAttributes.getName();
    CompanyCertStatus actualStatus = actualCompanyCertAttributes.getStatus();
    CompanyCertType actualType = actualCompanyCertAttributes.getType();

    // Assert
    assertEquals("Name", actualName);
    assertEquals(TypeEnum.TRUSTED, actualStatus.getType());
    assertEquals(CompanyCertType.TypeEnum.USERSIGNING, actualType.getType());
    assertSame(status, actualStatus);
    assertSame(type, actualType);
  }
}
