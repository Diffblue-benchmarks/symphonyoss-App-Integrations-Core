package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CompanyCertInfoDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertInfo}
   *   <li>{@link CompanyCertInfo#setCommonName(String)}
   *   <li>{@link CompanyCertInfo#setExpiryDate(Long)}
   *   <li>{@link CompanyCertInfo#setFingerPrint(String)}
   *   <li>{@link CompanyCertInfo#setIssuerFingerPrint(String)}
   *   <li>{@link CompanyCertInfo#setLastSeen(Long)}
   *   <li>{@link CompanyCertInfo#setUpdatedAt(Long)}
   *   <li>{@link CompanyCertInfo#setUpdatedBy(Long)}
   *   <li>{@link CompanyCertInfo#getCommonName()}
   *   <li>{@link CompanyCertInfo#getExpiryDate()}
   *   <li>{@link CompanyCertInfo#getFingerPrint()}
   *   <li>{@link CompanyCertInfo#getIssuerFingerPrint()}
   *   <li>{@link CompanyCertInfo#getLastSeen()}
   *   <li>{@link CompanyCertInfo#getUpdatedAt()}
   *   <li>{@link CompanyCertInfo#getUpdatedBy()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertInfo actualCompanyCertInfo = new CompanyCertInfo();
    actualCompanyCertInfo.setCommonName("Common Name");
    actualCompanyCertInfo.setExpiryDate(1L);
    actualCompanyCertInfo.setFingerPrint("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09");
    actualCompanyCertInfo.setIssuerFingerPrint("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09");
    actualCompanyCertInfo.setLastSeen(1L);
    actualCompanyCertInfo.setUpdatedAt(1L);
    actualCompanyCertInfo.setUpdatedBy(1L);
    String actualCommonName = actualCompanyCertInfo.getCommonName();
    Long actualExpiryDate = actualCompanyCertInfo.getExpiryDate();
    String actualFingerPrint = actualCompanyCertInfo.getFingerPrint();
    String actualIssuerFingerPrint = actualCompanyCertInfo.getIssuerFingerPrint();
    Long actualLastSeen = actualCompanyCertInfo.getLastSeen();
    Long actualUpdatedAt = actualCompanyCertInfo.getUpdatedAt();
    Long actualUpdatedBy = actualCompanyCertInfo.getUpdatedBy();

    // Assert that nothing has changed
    assertEquals("Common Name", actualCommonName);
    assertEquals("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09", actualFingerPrint);
    assertEquals("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09", actualIssuerFingerPrint);
    assertEquals(1L, actualExpiryDate.longValue());
    assertEquals(1L, actualLastSeen.longValue());
    assertEquals(1L, actualUpdatedAt.longValue());
    assertEquals(1L, actualUpdatedBy.longValue());
  }
}
