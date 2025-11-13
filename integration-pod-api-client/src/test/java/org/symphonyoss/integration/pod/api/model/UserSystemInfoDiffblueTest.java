package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.integration.pod.api.model.UserSystemInfo.StatusEnum;

public class UserSystemInfoDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserSystemInfo}
   *   <li>{@link UserSystemInfo#setCreatedBy(String)}
   *   <li>{@link UserSystemInfo#setCreatedDate(Long)}
   *   <li>{@link UserSystemInfo#setId(Long)}
   *   <li>{@link UserSystemInfo#setLastLoginDate(Long)}
   *   <li>{@link UserSystemInfo#setLastPasswordReset(Long)}
   *   <li>{@link UserSystemInfo#setLastUpdatedDate(Long)}
   *   <li>{@link UserSystemInfo#setStatus(StatusEnum)}
   *   <li>{@link UserSystemInfo#getCreatedBy()}
   *   <li>{@link UserSystemInfo#getCreatedDate()}
   *   <li>{@link UserSystemInfo#getId()}
   *   <li>{@link UserSystemInfo#getLastLoginDate()}
   *   <li>{@link UserSystemInfo#getLastPasswordReset()}
   *   <li>{@link UserSystemInfo#getLastUpdatedDate()}
   *   <li>{@link UserSystemInfo#getStatus()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserSystemInfo.<init>()",
    "String UserSystemInfo.getCreatedBy()",
    "Long UserSystemInfo.getCreatedDate()",
    "Long UserSystemInfo.getId()",
    "Long UserSystemInfo.getLastLoginDate()",
    "Long UserSystemInfo.getLastPasswordReset()",
    "Long UserSystemInfo.getLastUpdatedDate()",
    "StatusEnum UserSystemInfo.getStatus()",
    "void UserSystemInfo.setCreatedBy(String)",
    "void UserSystemInfo.setCreatedDate(Long)",
    "void UserSystemInfo.setId(Long)",
    "void UserSystemInfo.setLastLoginDate(Long)",
    "void UserSystemInfo.setLastPasswordReset(Long)",
    "void UserSystemInfo.setLastUpdatedDate(Long)",
    "void UserSystemInfo.setStatus(StatusEnum)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    UserSystemInfo actualUserSystemInfo = new UserSystemInfo();
    actualUserSystemInfo.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
    actualUserSystemInfo.setCreatedDate(1L);
    actualUserSystemInfo.setId(1L);
    actualUserSystemInfo.setLastLoginDate(1L);
    actualUserSystemInfo.setLastPasswordReset(1L);
    actualUserSystemInfo.setLastUpdatedDate(1L);
    actualUserSystemInfo.setStatus(StatusEnum.ENABLED);
    String actualCreatedBy = actualUserSystemInfo.getCreatedBy();
    Long actualCreatedDate = actualUserSystemInfo.getCreatedDate();
    Long actualId = actualUserSystemInfo.getId();
    Long actualLastLoginDate = actualUserSystemInfo.getLastLoginDate();
    Long actualLastPasswordReset = actualUserSystemInfo.getLastPasswordReset();
    Long actualLastUpdatedDate = actualUserSystemInfo.getLastUpdatedDate();
    StatusEnum actualStatus = actualUserSystemInfo.getStatus();

    // Assert
    assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
    assertEquals(1L, actualCreatedDate.longValue());
    assertEquals(1L, actualId.longValue());
    assertEquals(1L, actualLastLoginDate.longValue());
    assertEquals(1L, actualLastPasswordReset.longValue());
    assertEquals(1L, actualLastUpdatedDate.longValue());
    assertEquals(StatusEnum.ENABLED, actualStatus);
  }
}
