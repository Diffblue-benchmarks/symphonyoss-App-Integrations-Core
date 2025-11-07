package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.pod.api.model.CompanyCert;
import org.symphonyoss.integration.pod.api.model.CompanyCertAttributes;
import org.symphonyoss.integration.pod.api.model.CompanyCertDetail;
import org.symphonyoss.integration.pod.api.model.CompanyCertInfo;
import org.symphonyoss.integration.pod.api.model.CompanyCertStatus;
import org.symphonyoss.integration.pod.api.model.CompanyCertStatus.TypeEnum;
import org.symphonyoss.integration.pod.api.model.CompanyCertType;

@ContextConfiguration(classes = {SecurityApiClient.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class SecurityApiClientDiffblueTest {
  @MockBean
  private HttpApiClient httpApiClient;

  @MockBean
  private LogMessageSource logMessageSource;

  @Autowired
  private SecurityApiClient securityApiClient;

  /**
   * Test {@link SecurityApiClient#createCompanyCert(String, CompanyCert)}.
   * <ul>
   *   <li>Given {@link LogMessageSource}.</li>
   *   <li>Then return {@link CompanyCertDetail} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link SecurityApiClient#createCompanyCert(String, CompanyCert)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"CompanyCertDetail SecurityApiClient.createCompanyCert(String, CompanyCert)"})
  public void testCreateCompanyCert_givenLogMessageSource_thenReturnCompanyCertDetail() throws RemoteApiException {
    // Arrange
    CompanyCertStatus status = new CompanyCertStatus();
    status.setType(TypeEnum.TRUSTED);

    CompanyCertType type = new CompanyCertType();
    type.setType(CompanyCertType.TypeEnum.USERSIGNING);

    CompanyCertAttributes companyCertAttributes = new CompanyCertAttributes();
    companyCertAttributes.setName("/v2/companycert/create");
    companyCertAttributes.setStatus(status);
    companyCertAttributes.setType(type);

    CompanyCertInfo companyCertInfo = new CompanyCertInfo();
    companyCertInfo.setCommonName("/v2/companycert/create");
    companyCertInfo.setExpiryDate(5L);
    companyCertInfo.setFingerPrint("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09");
    companyCertInfo.setIssuerFingerPrint("b6:03:0e:39:97:9e:d0:e7:24:ce:a3:77:3e:01:42:09");
    companyCertInfo.setLastSeen(5L);
    companyCertInfo.setUpdatedAt(5L);
    companyCertInfo.setUpdatedBy(5L);

    CompanyCertDetail companyCertDetail = new CompanyCertDetail();
    companyCertDetail.setCompanyCertAttributes(companyCertAttributes);
    companyCertDetail.setCompanyCertInfo(companyCertInfo);
    when(httpApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any()))
            .thenReturn(companyCertDetail);

    CompanyCertStatus status2 = new CompanyCertStatus();
    status2.setType(TypeEnum.TRUSTED);

    CompanyCertType type2 = new CompanyCertType();
    type2.setType(CompanyCertType.TypeEnum.USERSIGNING);

    CompanyCertAttributes attributes = new CompanyCertAttributes();
    attributes.setName("Name");
    attributes.setStatus(status2);
    attributes.setType(type2);

    CompanyCert cert = new CompanyCert();
    cert.setAttributes(attributes);
    cert.setPem("Pem");

    // Act
    CompanyCertDetail actualCreateCompanyCertResult = securityApiClient.createCompanyCert("ABC123", cert);

    // Assert
    verify(httpApiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
    assertSame(companyCertDetail, actualCreateCompanyCertResult);
  }
}
