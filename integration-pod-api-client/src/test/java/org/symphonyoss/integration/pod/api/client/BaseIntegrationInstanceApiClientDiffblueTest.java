package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
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
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.config.IntegrationInstance;
import org.symphonyoss.integration.pod.api.model.IntegrationInstanceList;
import org.symphonyoss.integration.pod.api.model.IntegrationInstanceSubmissionUpdate;

@ContextConfiguration(classes = {IntegrationInstanceAdminApiClient.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseIntegrationInstanceApiClientDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Autowired
  private BaseIntegrationInstanceApiClient baseIntegrationInstanceApiClient;

  @MockBean
  private HttpApiClient httpApiClient;

  @MockBean
  private LogMessageSource logMessageSource;

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#updateInstance(String, IntegrationInstanceSubmissionUpdate)}
   */
  @Test
  public void testUpdateInstance() throws RemoteApiException {
    // Arrange
    IntegrationInstance integrationInstance = new IntegrationInstance();
    integrationInstance.setActive(true);
    integrationInstance.setConfigurationId("42");
    integrationInstance.setCreatedDate(1L);
    integrationInstance.setCreatorId("42");
    integrationInstance.setCreatorName("/v1/admin");
    integrationInstance.setInstanceId("42");
    integrationInstance.setLastModifiedDate(1L);
    integrationInstance.setName("/v1/admin");
    integrationInstance.setOptionalProperties("/v1/admin");
    when(httpApiClient.doPut(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any()))
            .thenReturn(integrationInstance);
    when(httpApiClient.escapeString(Mockito.<String>any())).thenReturn("https://example.org/example");

    IntegrationInstanceSubmissionUpdate instance = new IntegrationInstanceSubmissionUpdate();
    instance.setConfigurationId("42");
    instance.setInstanceId("42");
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act
    IntegrationInstance actualUpdateInstanceResult = baseIntegrationInstanceApiClient.updateInstance("ABC123",
        instance);

    // Assert
    verify(httpApiClient).doPut(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
    verify(httpApiClient, atLeast(1)).escapeString(Mockito.<String>any());
    assertSame(integrationInstance, actualUpdateInstanceResult);
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#updateInstance(String, IntegrationInstanceSubmissionUpdate)}
   */
  @Test
  public void testUpdateInstance2() throws RemoteApiException {
    // Arrange
    IntegrationInstanceSubmissionUpdate instance = mock(IntegrationInstanceSubmissionUpdate.class);
    when(instance.getConfigurationId()).thenReturn(null);
    when(instance.getInstanceId()).thenReturn("42");
    doNothing().when(instance).setConfigurationId(Mockito.<String>any());
    doNothing().when(instance).setInstanceId(Mockito.<String>any());
    doNothing().when(instance).setName(Mockito.<String>any());
    doNothing().when(instance).setOptionalProperties(Mockito.<String>any());
    instance.setConfigurationId("42");
    instance.setInstanceId("42");
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.updateInstance("ABC123", instance);
    verify(instance).getConfigurationId();
    verify(instance).getInstanceId();
    verify(instance).setConfigurationId(Mockito.<String>any());
    verify(instance).setInstanceId(Mockito.<String>any());
    verify(instance).setName(Mockito.<String>any());
    verify(instance).setOptionalProperties(Mockito.<String>any());
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#updateInstance(String, IntegrationInstanceSubmissionUpdate)}
   */
  @Test
  public void testUpdateInstance3() throws RemoteApiException {
    // Arrange
    IntegrationInstanceSubmissionUpdate instance = mock(IntegrationInstanceSubmissionUpdate.class);
    when(instance.getConfigurationId()).thenReturn("");
    when(instance.getInstanceId()).thenReturn("42");
    doNothing().when(instance).setConfigurationId(Mockito.<String>any());
    doNothing().when(instance).setInstanceId(Mockito.<String>any());
    doNothing().when(instance).setName(Mockito.<String>any());
    doNothing().when(instance).setOptionalProperties(Mockito.<String>any());
    instance.setConfigurationId("42");
    instance.setInstanceId("42");
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.updateInstance("ABC123", instance);
    verify(instance).getConfigurationId();
    verify(instance).getInstanceId();
    verify(instance).setConfigurationId(Mockito.<String>any());
    verify(instance).setInstanceId(Mockito.<String>any());
    verify(instance).setName(Mockito.<String>any());
    verify(instance).setOptionalProperties(Mockito.<String>any());
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#updateInstance(String, IntegrationInstanceSubmissionUpdate)}
   */
  @Test
  public void testUpdateInstance4() throws RemoteApiException {
    // Arrange
    IntegrationInstanceSubmissionUpdate instance = mock(IntegrationInstanceSubmissionUpdate.class);
    when(instance.getConfigurationId()).thenReturn("42");
    when(instance.getInstanceId()).thenReturn(null);
    doNothing().when(instance).setConfigurationId(Mockito.<String>any());
    doNothing().when(instance).setInstanceId(Mockito.<String>any());
    doNothing().when(instance).setName(Mockito.<String>any());
    doNothing().when(instance).setOptionalProperties(Mockito.<String>any());
    instance.setConfigurationId("42");
    instance.setInstanceId("42");
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.updateInstance("ABC123", instance);
    verify(instance).getConfigurationId();
    verify(instance).getInstanceId();
    verify(instance).setConfigurationId(Mockito.<String>any());
    verify(instance).setInstanceId(Mockito.<String>any());
    verify(instance).setName(Mockito.<String>any());
    verify(instance).setOptionalProperties(Mockito.<String>any());
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#listInstances(String, String, int, int)}
   */
  @Test
  public void testListInstances() throws RemoteApiException {
    // Arrange
    IntegrationInstanceList integrationInstanceList = new IntegrationInstanceList();
    when(httpApiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Class<Object>>any())).thenReturn(integrationInstanceList);
    when(httpApiClient.escapeString(Mockito.<String>any())).thenReturn("https://example.org/example");

    // Act
    IntegrationInstanceList actualListInstancesResult = baseIntegrationInstanceApiClient.listInstances("ABC123", "42",
        2, 1);

    // Assert
    verify(httpApiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(httpApiClient).escapeString(Mockito.<String>any());
    assertTrue(actualListInstancesResult.isEmpty());
    assertSame(integrationInstanceList, actualListInstancesResult);
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#listInstances(String, String, int, int)}
   */
  @Test
  public void testListInstances2() throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.listInstances("ABC123", null, 2, 1);
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#getInstanceById(String, String, String)}
   */
  @Test
  public void testGetInstanceById() throws RemoteApiException {
    // Arrange
    IntegrationInstance integrationInstance = new IntegrationInstance();
    integrationInstance.setActive(true);
    integrationInstance.setConfigurationId("42");
    integrationInstance.setCreatedDate(1L);
    integrationInstance.setCreatorId("42");
    integrationInstance.setCreatorName("/v1/admin");
    integrationInstance.setInstanceId("42");
    integrationInstance.setLastModifiedDate(1L);
    integrationInstance.setName("/v1/admin");
    integrationInstance.setOptionalProperties("/v1/admin");
    when(httpApiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Class<Object>>any())).thenReturn(integrationInstance);
    when(httpApiClient.escapeString(Mockito.<String>any())).thenReturn("https://example.org/example");

    // Act
    IntegrationInstance actualInstanceById = baseIntegrationInstanceApiClient.getInstanceById("ABC123", "42", "42");

    // Assert
    verify(httpApiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(httpApiClient, atLeast(1)).escapeString(Mockito.<String>any());
    assertSame(integrationInstance, actualInstanceById);
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#getInstanceById(String, String, String)}
   */
  @Test
  public void testGetInstanceById2() throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.getInstanceById("ABC123", null, "42");
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#getInstanceById(String, String, String)}
   */
  @Test
  public void testGetInstanceById3() throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.getInstanceById("ABC123", "42", null);
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#activateInstance(String, String, String)}
   */
  @Test
  public void testActivateInstance() throws RemoteApiException {
    // Arrange
    IntegrationInstance integrationInstance = new IntegrationInstance();
    integrationInstance.setActive(true);
    integrationInstance.setConfigurationId("42");
    integrationInstance.setCreatedDate(1L);
    integrationInstance.setCreatorId("42");
    integrationInstance.setCreatorName("/v1/admin");
    integrationInstance.setInstanceId("42");
    integrationInstance.setLastModifiedDate(1L);
    integrationInstance.setName("/v1/admin");
    integrationInstance.setOptionalProperties("/v1/admin");
    when(httpApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any()))
            .thenReturn(integrationInstance);
    when(httpApiClient.escapeString(Mockito.<String>any())).thenReturn("https://example.org/example");

    // Act
    IntegrationInstance actualActivateInstanceResult = baseIntegrationInstanceApiClient.activateInstance("ABC123", "42",
        "42");

    // Assert
    verify(httpApiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), Mockito.<Object>any(),
        isA(Class.class));
    verify(httpApiClient, atLeast(1)).escapeString(Mockito.<String>any());
    assertSame(integrationInstance, actualActivateInstanceResult);
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#activateInstance(String, String, String)}
   */
  @Test
  public void testActivateInstance2() throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.activateInstance("ABC123", null, "42");
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#activateInstance(String, String, String)}
   */
  @Test
  public void testActivateInstance3() throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.activateInstance("ABC123", "42", null);
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#deactivateInstance(String, String, String)}
   */
  @Test
  public void testDeactivateInstance() throws RemoteApiException {
    // Arrange
    IntegrationInstance integrationInstance = new IntegrationInstance();
    integrationInstance.setActive(true);
    integrationInstance.setConfigurationId("42");
    integrationInstance.setCreatedDate(1L);
    integrationInstance.setCreatorId("42");
    integrationInstance.setCreatorName("/v1/admin");
    integrationInstance.setInstanceId("42");
    integrationInstance.setLastModifiedDate(1L);
    integrationInstance.setName("/v1/admin");
    integrationInstance.setOptionalProperties("/v1/admin");
    when(httpApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any()))
            .thenReturn(integrationInstance);
    when(httpApiClient.escapeString(Mockito.<String>any())).thenReturn("https://example.org/example");

    // Act
    IntegrationInstance actualDeactivateInstanceResult = baseIntegrationInstanceApiClient.deactivateInstance("ABC123",
        "42", "42");

    // Assert
    verify(httpApiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), Mockito.<Object>any(),
        isA(Class.class));
    verify(httpApiClient, atLeast(1)).escapeString(Mockito.<String>any());
    assertSame(integrationInstance, actualDeactivateInstanceResult);
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#deactivateInstance(String, String, String)}
   */
  @Test
  public void testDeactivateInstance2() throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.deactivateInstance("ABC123", null, "42");
  }

  /**
   * Method under test:
   * {@link BaseIntegrationInstanceApiClient#deactivateInstance(String, String, String)}
   */
  @Test
  public void testDeactivateInstance3() throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.deactivateInstance("ABC123", "42", null);
  }
}
