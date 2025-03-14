package org.symphonyoss.integration.config;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.exception.config.RemoteConfigurationException;
import org.symphonyoss.integration.model.config.IntegrationInstance;

@RunWith(MockitoJUnitRunner.class)
public class RemoteIntegrationServiceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Mock
  private AuthenticationProxy authenticationProxy;

  @InjectMocks
  private RemoteIntegrationService remoteIntegrationService;

  /**
   * Test {@link RemoteIntegrationService#save(IntegrationInstance, String)} with {@code instance}, {@code userId}.
   * <ul>
   *   <li>Then throw {@link RemoteConfigurationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RemoteIntegrationService#save(IntegrationInstance, String)}
   */
  @Test
  @MethodsUnderTest({"IntegrationInstance RemoteIntegrationService.save(IntegrationInstance, String)"})
  public void testSaveWithInstanceUserId_thenThrowRemoteConfigurationException() {
    // Arrange
    when(authenticationProxy.getSessionToken(Mockito.<String>any()))
        .thenThrow(new RemoteConfigurationException("An error occurred", new Throwable(), "Solutions"));

    IntegrationInstance instance = new IntegrationInstance();
    instance.setActive(true);
    instance.setConfigurationId("42");
    instance.setCreatedDate(1L);
    instance.setCreatorId("42");
    instance.setCreatorName("Creator Name");
    instance.setInstanceId("42");
    instance.setLastModifiedDate(1L);
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act and Assert
    thrown.expect(RemoteConfigurationException.class);
    remoteIntegrationService.save(instance, "42");
    verify(authenticationProxy).getSessionToken(Mockito.<String>any());
  }
}
