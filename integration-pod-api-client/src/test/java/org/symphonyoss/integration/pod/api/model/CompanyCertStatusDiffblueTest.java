package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.symphonyoss.integration.pod.api.model.CompanyCertStatus.TypeEnum;

public class CompanyCertStatusDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertStatus}
   *   <li>{@link CompanyCertStatus#setType(TypeEnum)}
   *   <li>{@link CompanyCertStatus#getType()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompanyCertStatus.<init>()", "TypeEnum CompanyCertStatus.getType()",
      "void CompanyCertStatus.setType(TypeEnum)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertStatus actualCompanyCertStatus = new CompanyCertStatus();
    actualCompanyCertStatus.setType(TypeEnum.TRUSTED);

    // Assert
    assertEquals(TypeEnum.TRUSTED, actualCompanyCertStatus.getType());
  }
}
