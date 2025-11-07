package org.symphonyoss.integration.authentication;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Autowired
  private AppAuthenticationProxyImpl appAuthenticationProxyImpl;

  @Autowired
  private IntegrationProperties integrationProperties;

  @MockBean
  private LogMessageSource logMessageSource;

  @MockBean
  private PodAuthAppHttpApiClient podAuthAppHttpApiClient;

  /**
   * Method under test:
   * {@link AppAuthenticationProxyImpl#httpClientForApplication(String, ServiceName)}
   */
  @Test
  public void testHttpClientForApplication() {
    // Arrange, Act and Assert
    thrown.expect(UnregisteredAppAuthException.class);
    appAuthenticationProxyImpl.httpClientForApplication("https://example.org/example", ServiceName.POD_SESSION_MANAGER);
  }

  /**
   * Method under test:
   * {@link AppAuthenticationProxyImpl#authenticate(String, String)}
   */
  @Test
  public void testAuthenticate() throws RemoteApiException {
    // Arrange
    AppToken appToken = new AppToken("42", "ABC123", "ABC123");

    when(podAuthAppHttpApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenReturn(appToken);

    // Act
    AppToken actualAuthenticateResult = appAuthenticationProxyImpl.authenticate("42", "ABC123");

    // Assert
    verify(podAuthAppHttpApiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
    assertSame(appToken, actualAuthenticateResult);
  }

  /**
   * Method under test:
   * {@link AppAuthenticationProxyImpl#getPodPublicCertificate(String)}
   */
  @Test
  public void testGetPodPublicCertificate() throws RemoteApiException {
    // Arrange
    PodCertificate podCertificate = new PodCertificate();
    when(podAuthAppHttpApiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Class<Object>>any())).thenReturn(podCertificate);

    // Act
    PodCertificate actualPodPublicCertificate = appAuthenticationProxyImpl.getPodPublicCertificate("42");

    // Assert
    verify(podAuthAppHttpApiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    assertNull(actualPodPublicCertificate.getCertificate());
    assertSame(podCertificate, actualPodPublicCertificate);
  }
}
