package org.symphonyoss.integration.provisioning.client;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.authentication.AuthenticationToken;
import org.symphonyoss.integration.pod.api.client.SymphonyHttpApiClient;
import org.symphonyoss.integration.provisioning.client.model.AppStoreAssetsWrapper;
import org.symphonyoss.integration.provisioning.client.model.AppStoreSettingsWrapper;
import org.symphonyoss.integration.provisioning.client.model.AppStoreWrapper;
import org.symphonyoss.integration.provisioning.exception.AppRepositoryClientException;

@ContextConfiguration(classes = {AppRepositoryClient.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class AppRepositoryClientDiffblueTest {
  @Autowired private AppRepositoryClient appRepositoryClient;

  @MockBean private AuthenticationProxy authenticationProxy;

  @MockBean private SymphonyHttpApiClient symphonyHttpApiClient;

  /**
   * Test {@link AppRepositoryClient#createNewApp(AppStoreWrapper, String)}.
   *
   * <ul>
   *   <li>Then calls {@link AuthenticationProxy#getToken(String)}.
   * </ul>
   *
   * <p>Method under test: {@link AppRepositoryClient#createNewApp(AppStoreWrapper, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void AppRepositoryClient.createNewApp(AppStoreWrapper, String)"})
  public void testCreateNewApp_thenCallsGetToken() throws AppRepositoryClientException {
    // Arrange
    when(authenticationProxy.getToken(Mockito.<String>any()))
        .thenReturn(new AuthenticationToken("ABC123", "ABC123"));

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
    verify(authenticationProxy).getToken(Mockito.<String>any());
  }

  /**
   * Test {@link AppRepositoryClient#updateApp(AppStoreWrapper, String)}.
   *
   * <ul>
   *   <li>Then calls {@link AuthenticationProxy#getToken(String)}.
   * </ul>
   *
   * <p>Method under test: {@link AppRepositoryClient#updateApp(AppStoreWrapper, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void AppRepositoryClient.updateApp(AppStoreWrapper, String)"})
  public void testUpdateApp_thenCallsGetToken() throws AppRepositoryClientException {
    // Arrange
    when(authenticationProxy.getToken(Mockito.<String>any()))
        .thenReturn(new AuthenticationToken("ABC123", "ABC123"));

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
    verify(authenticationProxy).getToken(Mockito.<String>any());
  }

  /**
   * Test {@link AppRepositoryClient#updateApp(AppStoreWrapper, String)}.
   *
   * <ul>
   *   <li>Then calls {@link AuthenticationProxy#getToken(String)}.
   * </ul>
   *
   * <p>Method under test: {@link AppRepositoryClient#updateApp(AppStoreWrapper, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void AppRepositoryClient.updateApp(AppStoreWrapper, String)"})
  public void testUpdateApp_thenCallsGetToken2() throws AppRepositoryClientException {
    // Arrange
    when(authenticationProxy.getToken(Mockito.<String>any()))
        .thenReturn(new AuthenticationToken("ABC123", "ABC123"));

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
    appStoreApp.setId(null);
    appStoreApp.setName("Name");
    appStoreApp.setPublisher("Publisher");
    appStoreApp.setSettings(settings);
    appStoreApp.setSymphonyManaged(true);
    appStoreApp.setType("Type");
    appStoreApp.setVersion("1.0.2");

    // Act
    appRepositoryClient.updateApp(appStoreApp, "42");

    // Assert
    verify(authenticationProxy).getToken(Mockito.<String>any());
  }
}
