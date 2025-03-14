package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserAuthorizationDataListDiffblueTest {
  /**
   * Test new {@link UserAuthorizationDataList} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link UserAuthorizationDataList}
   */
  @Test
  @MethodsUnderTest({"void UserAuthorizationDataList.<init>()"})
  public void testNewUserAuthorizationDataList() {
    // Arrange, Act and Assert
    assertTrue((new UserAuthorizationDataList()).isEmpty());
  }
}
