package org.symphonyoss.integration.authentication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.auth.api.client.PodAuthAppHttpApiClient;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;
import org.symphonyoss.integration.authentication.api.model.AppToken;
import org.symphonyoss.integration.authentication.api.model.PodCertificate;
import org.symphonyoss.integration.authentication.exception.UnregisteredAppAuthException;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

@ContextConfiguration(classes = {AppAuthenticationProxyImpl.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class AppAuthenticationProxyImplDiffblueTest {
  @Autowired private AppAuthenticationProxyImpl appAuthenticationProxyImpl;

  @Autowired private IntegrationProperties integrationProperties;

  @MockBean private LogMessageSource logMessageSource;

  @MockBean private PodAuthAppHttpApiClient podAuthAppHttpApiClient;

  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link AppAuthenticationProxyImpl#httpClientForApplication(String, ServiceName)}.
   *
   * <p>Method under test: {@link AppAuthenticationProxyImpl#httpClientForApplication(String,
   * ServiceName)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "javax.ws.rs.client.Client AppAuthenticationProxyImpl.httpClientForApplication(String, ServiceName)"
  })
  public void testHttpClientForApplication() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredAppAuthException.class);
    appAuthenticationProxyImpl.httpClientForApplication(
        "https://example.org/example", ServiceName.POD_SESSION_MANAGER);
  }

  /**
   * Test {@link AppAuthenticationProxyImpl#authenticate(String, String)}.
   *
   * <p>Method under test: {@link AppAuthenticationProxyImpl#authenticate(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"AppToken AppAuthenticationProxyImpl.authenticate(String, String)"})
  public void testAuthenticate() throws RemoteApiException {
    // Arrange
    AppToken appToken = new AppToken("42", "ABC123", "ABC123");

    when(podAuthAppHttpApiClient.doPost(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Object>any(),
            Mockito.<Class<Object>>any()))
        .thenReturn(appToken);

    // Act
    AppToken actualAuthenticateResult = appAuthenticationProxyImpl.authenticate("42", "ABC123");

    // Assert
    verify(podAuthAppHttpApiClient)
        .doPost(
            Mockito.<String>any(),
            isA(Map.class),
            isA(Map.class),
            isA(Object.class),
            isA(Class.class));
    assertSame(appToken, actualAuthenticateResult);
  }

  /**
   * Test {@link AppAuthenticationProxyImpl#getPodPublicCertificate(String)}.
   *
   * <ul>
   *   <li>Then return Certificate is {@code appId}.
   * </ul>
   *
   * <p>Method under test: {@link AppAuthenticationProxyImpl#getPodPublicCertificate(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"PodCertificate AppAuthenticationProxyImpl.getPodPublicCertificate(String)"})
  public void testGetPodPublicCertificate_thenReturnCertificateIsAppId() throws RemoteApiException {
    // Arrange
    PodCertificate podCertificate = new PodCertificate("appId");
    when(podAuthAppHttpApiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<Object>>any()))
        .thenReturn(podCertificate);

    // Act
    PodCertificate actualPodPublicCertificate =
        appAuthenticationProxyImpl.getPodPublicCertificate("42");

    // Assert
    verify(podAuthAppHttpApiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    assertEquals("appId", actualPodPublicCertificate.getCertificate());
    assertSame(podCertificate, actualPodPublicCertificate);
  }
}
