package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UserAuthorizationDataListDiffblueTest {
  /**
   * Method under test: default or parameterless constructor of
   * {@link UserAuthorizationDataList}
   */
  @Test
  public void testNewUserAuthorizationDataList() {
    // Arrange, Act and Assert
    assertTrue((new UserAuthorizationDataList()).isEmpty());
  }
}
