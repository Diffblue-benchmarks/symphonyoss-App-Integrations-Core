package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.symphonyoss.integration.pod.api.model.CompanyCertType.TypeEnum;

public class CompanyCertTypeDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertType}
   *   <li>{@link CompanyCertType#setType(TypeEnum)}
   *   <li>{@link CompanyCertType#getType()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompanyCertType.<init>()", "TypeEnum CompanyCertType.getType()",
      "void CompanyCertType.setType(TypeEnum)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertType actualCompanyCertType = new CompanyCertType();
    actualCompanyCertType.setType(TypeEnum.USERSIGNING);

    // Assert
    assertEquals(TypeEnum.USERSIGNING, actualCompanyCertType.getType());
  }
}
