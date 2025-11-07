package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UserAuthorizationDataListDiffblueTest {
  /**
   * Test new {@link UserAuthorizationDataList} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link UserAuthorizationDataList}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void UserAuthorizationDataList.<init>()"})
  public void testNewUserAuthorizationDataList() {
    // Arrange, Act and Assert
    assertTrue((new UserAuthorizationDataList()).isEmpty());
  }
}
