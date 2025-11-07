package org.symphonyoss.integration.provisioning.client;

import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
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
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.authentication.AuthenticationToken;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.pod.api.client.SymphonyHttpApiClient;
import org.symphonyoss.integration.pod.api.model.Envelope;
import org.symphonyoss.integration.provisioning.client.model.AppStoreAssetsWrapper;
import org.symphonyoss.integration.provisioning.client.model.AppStoreSettingsWrapper;
import org.symphonyoss.integration.provisioning.client.model.AppStoreWrapper;
import org.symphonyoss.integration.provisioning.exception.AppRepositoryClientException;

@ContextConfiguration(classes = {AppRepositoryClient.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class AppRepositoryClientDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Autowired
  private AppRepositoryClient appRepositoryClient;

  @MockBean
  private AuthenticationProxy authenticationProxy;

  @MockBean
  private SymphonyHttpApiClient symphonyHttpApiClient;

  /**
   * Method under test: {@link AppRepositoryClient#getAppsAvailable(String)}
   */
  @Test
  public void testGetAppsAvailable() throws RemoteApiException, AppRepositoryClientException {
    // Arrange
    when(authenticationProxy.getToken(Mockito.<String>any())).thenReturn(new AuthenticationToken("ABC123", "ABC123"));
    when(symphonyHttpApiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Class<Object>>any()))
            .thenThrow(new RemoteApiException(1, "An error occurred"));

    // Act and Assert
    thrown.expect(AppRepositoryClientException.class);
    appRepositoryClient.getAppsAvailable("42");
    verify(symphonyHttpApiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(authenticationProxy).getToken(Mockito.<String>any());
  }

  /**
   * Method under test: {@link AppRepositoryClient#getAppsAvailable(String)}
   */
  @Test
  public void testGetAppsAvailable2() throws RemoteApiException, AppRepositoryClientException {
    // Arrange
    AuthenticationToken authenticationToken = mock(AuthenticationToken.class);
    when(authenticationToken.getSessionToken()).thenReturn("ABC123");
    when(authenticationProxy.getToken(Mockito.<String>any())).thenReturn(authenticationToken);
    when(symphonyHttpApiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Class<Object>>any())).thenReturn(new Envelope<>());

    // Act
    List actualAppsAvailable = appRepositoryClient.getAppsAvailable("42");

    // Assert
    verify(symphonyHttpApiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(authenticationProxy).getToken(Mockito.<String>any());
    verify(authenticationToken).getSessionToken();
    assertNull(actualAppsAvailable);
  }

  /**
   * Method under test:
   * {@link AppRepositoryClient#getAppByAppGroupId(String, String)}
   */
  @Test
  public void testGetAppByAppGroupId() throws RemoteApiException, AppRepositoryClientException {
    // Arrange
    when(authenticationProxy.getToken(Mockito.<String>any())).thenReturn(new AuthenticationToken("ABC123", "ABC123"));
    when(symphonyHttpApiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Class<Object>>any()))
            .thenThrow(new RemoteApiException(1, "An error occurred"));

    // Act and Assert
    thrown.expect(AppRepositoryClientException.class);
    appRepositoryClient.getAppByAppGroupId("42", "42");
    verify(symphonyHttpApiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(authenticationProxy).getToken(Mockito.<String>any());
  }

  /**
   * Method under test:
   * {@link AppRepositoryClient#getAppByAppGroupId(String, String)}
   */
  @Test
  public void testGetAppByAppGroupId2() throws RemoteApiException, AppRepositoryClientException {
    // Arrange
    AuthenticationToken authenticationToken = mock(AuthenticationToken.class);
    when(authenticationToken.getSessionToken()).thenReturn("ABC123");
    when(authenticationProxy.getToken(Mockito.<String>any())).thenReturn(authenticationToken);
    Envelope<Object> envelope = mock(Envelope.class);
    when(envelope.getData()).thenReturn(new ArrayList<>());
    when(symphonyHttpApiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Class<Object>>any())).thenReturn(envelope);

    // Act
    Map<String, Object> actualAppByAppGroupId = appRepositoryClient.getAppByAppGroupId("42", "42");

    // Assert
    verify(symphonyHttpApiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(authenticationProxy).getToken(Mockito.<String>any());
    verify(authenticationToken).getSessionToken();
    verify(envelope).getData();
    assertNull(actualAppByAppGroupId);
  }

  /**
   * Method under test:
   * {@link AppRepositoryClient#createNewApp(AppStoreWrapper, String)}
   */
  @Test
  public void testCreateNewApp() throws RemoteApiException, AppRepositoryClientException {
    // Arrange
    when(authenticationProxy.getToken(Mockito.<String>any())).thenReturn(new AuthenticationToken("ABC123", "ABC123"));
    when(symphonyHttpApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenReturn("Do Post");

    AppStoreAssetsWrapper assets = new AppStoreAssetsWrapper();
    assets.setIconUrl("https://example.org/example");
    assets.setLoadUrl("https://example.org/example");

    AppStoreSettingsWrapper settings = new AppStoreSettingsWrapper();
    settings.setAppType("App Type");
    settings.setEnabled(true);
    settings.setInstall(true);
    settings.setVisible(true);

    AppStoreWrapper appStoreApp = new AppStoreWrapper();
    appStoreApp.setAppGroupId("42");
    appStoreApp.setAssets(assets);
    appStoreApp.setDescription("The characteristics of someone or something");
    appStoreApp.setDomain("Domain");
    appStoreApp.setEnabled(true);
    appStoreApp.setId("42");
    appStoreApp.setName("Name");
    appStoreApp.setPublisher("Publisher");
    appStoreApp.setSettings(settings);
    appStoreApp.setSymphonyManaged(true);
    appStoreApp.setType("Type");
    appStoreApp.setVersion("1.0.2");

    // Act
    appRepositoryClient.createNewApp(appStoreApp, "42");

    // Assert
    verify(symphonyHttpApiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
    verify(authenticationProxy).getToken(Mockito.<String>any());
  }

  /**
   * Method under test:
   * {@link AppRepositoryClient#createNewApp(AppStoreWrapper, String)}
   */
  @Test
  public void testCreateNewApp2() throws RemoteApiException, AppRepositoryClientException {
    // Arrange
    when(authenticationProxy.getToken(Mockito.<String>any())).thenReturn(new AuthenticationToken("ABC123", "ABC123"));
    when(symphonyHttpApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any()))
            .thenThrow(new RemoteApiException(1, "An error occurred"));

    AppStoreAssetsWrapper assets = new AppStoreAssetsWrapper();
    assets.setIconUrl("https://example.org/example");
    assets.setLoadUrl("https://example.org/example");

    AppStoreSettingsWrapper settings = new AppStoreSettingsWrapper();
    settings.setAppType("App Type");
    settings.setEnabled(true);
    settings.setInstall(true);
    settings.setVisible(true);

    AppStoreWrapper appStoreApp = new AppStoreWrapper();
    appStoreApp.setAppGroupId("42");
    appStoreApp.setAssets(assets);
    appStoreApp.setDescription("The characteristics of someone or something");
    appStoreApp.setDomain("Domain");
    appStoreApp.setEnabled(true);
    appStoreApp.setId("42");
    appStoreApp.setName("Name");
    appStoreApp.setPublisher("Publisher");
    appStoreApp.setSettings(settings);
    appStoreApp.setSymphonyManaged(true);
    appStoreApp.setType("Type");
    appStoreApp.setVersion("1.0.2");

    // Act and Assert
    thrown.expect(AppRepositoryClientException.class);
    appRepositoryClient.createNewApp(appStoreApp, "42");
    verify(symphonyHttpApiClient, atLeast(1)).doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        isA(Map.class), isA(Object.class), isA(Class.class));
    verify(authenticationProxy, atLeast(1)).getToken(Mockito.<String>any());
  }

  /**
   * Method under test:
   * {@link AppRepositoryClient#updateApp(AppStoreWrapper, String)}
   */
  @Test
  public void testUpdateApp() throws RemoteApiException, AppRepositoryClientException {
    // Arrange
    when(authenticationProxy.getToken(Mockito.<String>any())).thenReturn(new AuthenticationToken("ABC123", "ABC123"));
    when(symphonyHttpApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenReturn("Do Post");

    AppStoreAssetsWrapper assets = new AppStoreAssetsWrapper();
    assets.setIconUrl("https://example.org/example");
    assets.setLoadUrl("https://example.org/example");

    AppStoreSettingsWrapper settings = new AppStoreSettingsWrapper();
    settings.setAppType("App Type");
    settings.setEnabled(true);
    settings.setInstall(true);
    settings.setVisible(true);

    AppStoreWrapper appStoreApp = new AppStoreWrapper();
    appStoreApp.setAppGroupId("42");
    appStoreApp.setAssets(assets);
    appStoreApp.setDescription("The characteristics of someone or something");
    appStoreApp.setDomain("Domain");
    appStoreApp.setEnabled(true);
    appStoreApp.setId("42");
    appStoreApp.setName("Name");
    appStoreApp.setPublisher("Publisher");
    appStoreApp.setSettings(settings);
    appStoreApp.setSymphonyManaged(true);
    appStoreApp.setType("Type");
    appStoreApp.setVersion("1.0.2");

    // Act
    appRepositoryClient.updateApp(appStoreApp, "42");

    // Assert
    verify(symphonyHttpApiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
    verify(authenticationProxy).getToken(Mockito.<String>any());
  }

  /**
   * Method under test:
   * {@link AppRepositoryClient#updateApp(AppStoreWrapper, String)}
   */
  @Test
  public void testUpdateApp2() throws RemoteApiException, AppRepositoryClientException {
    // Arrange
    when(authenticationProxy.getToken(Mockito.<String>any())).thenReturn(new AuthenticationToken("ABC123", "ABC123"));
    when(symphonyHttpApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any()))
            .thenThrow(new RemoteApiException(1, "An error occurred"));

    AppStoreAssetsWrapper assets = new AppStoreAssetsWrapper();
    assets.setIconUrl("https://example.org/example");
    assets.setLoadUrl("https://example.org/example");

    AppStoreSettingsWrapper settings = new AppStoreSettingsWrapper();
    settings.setAppType("App Type");
    settings.setEnabled(true);
    settings.setInstall(true);
    settings.setVisible(true);

    AppStoreWrapper appStoreApp = new AppStoreWrapper();
    appStoreApp.setAppGroupId("42");
    appStoreApp.setAssets(assets);
    appStoreApp.setDescription("The characteristics of someone or something");
    appStoreApp.setDomain("Domain");
    appStoreApp.setEnabled(true);
    appStoreApp.setId("42");
    appStoreApp.setName("Name");
    appStoreApp.setPublisher("Publisher");
    appStoreApp.setSettings(settings);
    appStoreApp.setSymphonyManaged(true);
    appStoreApp.setType("Type");
    appStoreApp.setVersion("1.0.2");

    // Act and Assert
    thrown.expect(AppRepositoryClientException.class);
    appRepositoryClient.updateApp(appStoreApp, "42");
    verify(symphonyHttpApiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
    verify(authenticationProxy).getToken(Mockito.<String>any());
  }
}
