package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.pod.api.model.AppEntitlement;

@ContextConfiguration(classes = {AppEntitlementApiClient.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class AppEntitlementApiClientDiffblueTest {
  @Autowired private AppEntitlementApiClient appEntitlementApiClient;

  @MockBean private HttpApiClient httpApiClient;

  @MockBean private LogMessageSource logMessageSource;

  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link AppEntitlementApiClient#updateAppEntitlement(String, AppEntitlement)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@code ABC123}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AppEntitlementApiClient#updateAppEntitlement(String,
   * AppEntitlement)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "AppEntitlement AppEntitlementApiClient.updateAppEntitlement(String, AppEntitlement)"
  })
  public void testUpdateAppEntitlement_given42_whenAbc123_thenReturnNull()
      throws RemoteApiException {
    // Arrange
    AppEntitlement entitlement = new AppEntitlement();
    entitlement.setAppId("42");
    entitlement.setAppName("App Name");
    entitlement.setEnable(true);
    entitlement.setInstall(true);
    entitlement.setListed(true);

    // Act and Assert
    assertNull(appEntitlementApiClient.updateAppEntitlement("ABC123", entitlement));
  }

  /**
   * Test {@link AppEntitlementApiClient#updateAppEntitlement(String, AppEntitlement)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AppEntitlementApiClient#updateAppEntitlement(String,
   * AppEntitlement)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "AppEntitlement AppEntitlementApiClient.updateAppEntitlement(String, AppEntitlement)"
  })
  public void testUpdateAppEntitlement_given42_whenNull_thenThrowRemoteApiException()
      throws RemoteApiException {
    // Arrange
    AppEntitlement entitlement = new AppEntitlement();
    entitlement.setAppId("42");
    entitlement.setAppName("App Name");
    entitlement.setEnable(true);
    entitlement.setInstall(true);
    entitlement.setListed(true);

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    appEntitlementApiClient.updateAppEntitlement(null, entitlement);
  }

  /**
   * Test {@link AppEntitlementApiClient#updateAppEntitlement(String, AppEntitlement)}.
   *
   * <ul>
   *   <li>When {@code ABC123}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link AppEntitlementApiClient#updateAppEntitlement(String,
   * AppEntitlement)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "AppEntitlement AppEntitlementApiClient.updateAppEntitlement(String, AppEntitlement)"
  })
  public void testUpdateAppEntitlement_whenAbc123_thenThrowRemoteApiException()
      throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    appEntitlementApiClient.updateAppEntitlement("ABC123", null);
  }
}
