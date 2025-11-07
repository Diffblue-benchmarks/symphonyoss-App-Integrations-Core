package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AppEntitlementListDiffblueTest {
  /**
   * Test new {@link AppEntitlementList} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link AppEntitlementList}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AppEntitlementList.<init>()"})
  public void testNewAppEntitlementList() {
    // Arrange, Act and Assert
    assertTrue((new AppEntitlementList()).isEmpty());
  }
}
