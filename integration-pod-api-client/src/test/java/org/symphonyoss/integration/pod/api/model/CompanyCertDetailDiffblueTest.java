package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class CompanyCertDetailDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertDetail}
   *   <li>{@link CompanyCertDetail#setCompanyCertAttributes(CompanyCertAttributes)}
   *   <li>{@link CompanyCertDetail#setCompanyCertInfo(CompanyCertInfo)}
   *   <li>{@link CompanyCertDetail#getCompanyCertAttributes()}
   *   <li>{@link CompanyCertDetail#getCompanyCertInfo()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertDetail actualCompanyCertDetail = new CompanyCertDetail();
    CompanyCertStatus status = new CompanyCertStatus();
    status.setType(CompanyCertStatus.TypeEnum.TRUSTED);
    CompanyCertType type = new CompanyCertType();
    type.setType(CompanyCertType.TypeEnum.USERSIGNING);
    CompanyCertAttributes companyCertAttributes = new CompanyCertAttributes();
    companyCertAttributes.setName("Name");
    companyCertAttributes.setStatus(status);
    companyCertAttributes.setType(type);
    actualCompanyCertDetail.setCompanyCertAttributes(companyCertAttributes);
    CompanyCertInfo companyCertInfo = new CompanyCertInfo();
    companyCertInfo.setCommonName("Common Name");
    companyCertInfo.setExpiryDate(1L);
    companyCertInfo.setFingerPrint("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09");
    companyCertInfo.setIssuerFingerPrint("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09");
    companyCertInfo.setLastSeen(1L);
    companyCertInfo.setUpdatedAt(1L);
    companyCertInfo.setUpdatedBy(1L);
    actualCompanyCertDetail.setCompanyCertInfo(companyCertInfo);
    CompanyCertAttributes actualCompanyCertAttributes = actualCompanyCertDetail.getCompanyCertAttributes();

    // Assert that nothing has changed
    assertSame(companyCertAttributes, actualCompanyCertAttributes);
    assertSame(companyCertInfo, actualCompanyCertDetail.getCompanyCertInfo());
  }
}
