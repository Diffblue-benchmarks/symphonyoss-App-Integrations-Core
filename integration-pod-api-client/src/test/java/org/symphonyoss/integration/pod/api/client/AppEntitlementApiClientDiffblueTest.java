package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.pod.api.model.AppEntitlement;
import org.symphonyoss.integration.pod.api.model.AppEntitlementList;

@ContextConfiguration(classes = {AppEntitlementApiClient.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class AppEntitlementApiClientDiffblueTest {
  @Autowired
  private AppEntitlementApiClient appEntitlementApiClient;

  @MockBean
  private HttpApiClient httpApiClient;

  @MockBean
  private LogMessageSource logMessageSource;

  /**
   * Test {@link AppEntitlementApiClient#updateAppEntitlement(String, AppEntitlement)}.
   * <ul>
   *   <li>Given {@link AppEntitlement} (default constructor) AppId is {@code 42}.</li>
   *   <li>Then return {@link AppEntitlement} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link AppEntitlementApiClient#updateAppEntitlement(String, AppEntitlement)}
   */
  @Test
  @MethodsUnderTest({"AppEntitlement AppEntitlementApiClient.updateAppEntitlement(String, AppEntitlement)"})
  public void testUpdateAppEntitlement_givenAppEntitlementAppIdIs42_thenReturnAppEntitlement()
      throws RemoteApiException {
    // Arrange
    AppEntitlement appEntitlement = new AppEntitlement();
    appEntitlement.setAppId("42");
    appEntitlement.setAppName("App Name");
    appEntitlement.setEnable(true);
    appEntitlement.setInstall(true);
    appEntitlement.setListed(true);
    AppEntitlementList appEntitlementList = mock(AppEntitlementList.class);
    when(appEntitlementList.isEmpty()).thenReturn(false);
    when(appEntitlementList.get(anyInt())).thenReturn(appEntitlement);
    when(httpApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any()))
            .thenReturn(appEntitlementList);

    AppEntitlement entitlement = new AppEntitlement();
    entitlement.setAppId("42");
    entitlement.setAppName("App Name");
    entitlement.setEnable(true);
    entitlement.setInstall(true);
    entitlement.setListed(true);

    // Act
    AppEntitlement actualUpdateAppEntitlementResult = appEntitlementApiClient.updateAppEntitlement("ABC123",
        entitlement);

    // Assert
    verify(appEntitlementList).get(anyInt());
    verify(appEntitlementList).isEmpty();
    verify(httpApiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
    assertSame(appEntitlement, actualUpdateAppEntitlementResult);
  }

  /**
   * Test {@link AppEntitlementApiClient#updateAppEntitlement(String, AppEntitlement)}.
   * <ul>
   *   <li>Given {@link HttpApiClient} {@link HttpApiClient#doPost(String, Map, Map, Object, Class)} return {@link AppEntitlementList} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link AppEntitlementApiClient#updateAppEntitlement(String, AppEntitlement)}
   */
  @Test
  @MethodsUnderTest({"AppEntitlement AppEntitlementApiClient.updateAppEntitlement(String, AppEntitlement)"})
  public void testUpdateAppEntitlement_givenHttpApiClientDoPostReturnAppEntitlementList() throws RemoteApiException {
    // Arrange
    when(httpApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any()))
            .thenReturn(new AppEntitlementList());

    AppEntitlement entitlement = new AppEntitlement();
    entitlement.setAppId("42");
    entitlement.setAppName("App Name");
    entitlement.setEnable(true);
    entitlement.setInstall(true);
    entitlement.setListed(true);

    // Act
    AppEntitlement actualUpdateAppEntitlementResult = appEntitlementApiClient.updateAppEntitlement("ABC123",
        entitlement);

    // Assert
    verify(httpApiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
    assertNull(actualUpdateAppEntitlementResult);
  }

  /**
   * Test {@link AppEntitlementApiClient#updateAppEntitlement(String, AppEntitlement)}.
   * <ul>
   *   <li>Given {@link HttpApiClient} {@link HttpApiClient#doPost(String, Map, Map, Object, Class)} return {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AppEntitlementApiClient#updateAppEntitlement(String, AppEntitlement)}
   */
  @Test
  @MethodsUnderTest({"AppEntitlement AppEntitlementApiClient.updateAppEntitlement(String, AppEntitlement)"})
  public void testUpdateAppEntitlement_givenHttpApiClientDoPostReturnNull_thenReturnNull() throws RemoteApiException {
    // Arrange
    when(httpApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenReturn(null);

    AppEntitlement entitlement = new AppEntitlement();
    entitlement.setAppId("42");
    entitlement.setAppName("App Name");
    entitlement.setEnable(true);
    entitlement.setInstall(true);
    entitlement.setListed(true);

    // Act
    AppEntitlement actualUpdateAppEntitlementResult = appEntitlementApiClient.updateAppEntitlement("ABC123",
        entitlement);

    // Assert
    verify(httpApiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
    assertNull(actualUpdateAppEntitlementResult);
  }
}
