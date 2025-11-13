package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
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
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.config.IntegrationInstance;
import org.symphonyoss.integration.pod.api.model.IntegrationInstanceList;
import org.symphonyoss.integration.pod.api.model.IntegrationInstanceSubmissionUpdate;

@ContextConfiguration(classes = {IntegrationInstanceAdminApiClient.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseIntegrationInstanceApiClientDiffblueTest {
  @Autowired private BaseIntegrationInstanceApiClient baseIntegrationInstanceApiClient;

  @MockBean private HttpApiClient httpApiClient;

  @MockBean private LogMessageSource logMessageSource;

  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}.
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.updateInstance(String, IntegrationInstanceSubmissionUpdate)"
  })
  public void testUpdateInstance() throws RemoteApiException {
    // Arrange
    when(httpApiClient.doPut(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Object>any(),
            Mockito.<Class<IntegrationInstance>>any()))
        .thenThrow(new RemoteApiException(1, "An error occurred"));
    when(httpApiClient.escapeString(Mockito.<String>any()))
        .thenReturn("https://example.org/example");

    IntegrationInstanceSubmissionUpdate instance = new IntegrationInstanceSubmissionUpdate();
    instance.setConfigurationId("42");
    instance.setInstanceId("42");
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.updateInstance("ABC123", instance);
    verify(httpApiClient)
        .doPut(
            Mockito.<String>any(),
            isA(Map.class),
            isA(Map.class),
            isA(Object.class),
            isA(Class.class));
    verify(httpApiClient, atLeast(1)).escapeString(Mockito.<String>any());
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}.
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.updateInstance(String, IntegrationInstanceSubmissionUpdate)"
  })
  public void testUpdateInstance2() throws RemoteApiException {
    // Arrange
    IntegrationInstanceAdminApiClient integrationInstanceAdminApiClient =
        new IntegrationInstanceAdminApiClient(
            new IntegrationHttpApiClient(), mock(LogMessageSource.class));

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    integrationInstanceAdminApiClient.updateInstance("ABC123", null);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}.
   *
   * <ul>
   *   <li>Given empty string.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.updateInstance(String, IntegrationInstanceSubmissionUpdate)"
  })
  public void testUpdateInstance_givenEmptyString() throws RemoteApiException {
    // Arrange
    IntegrationInstanceSubmissionUpdate instance = new IntegrationInstanceSubmissionUpdate();
    instance.setConfigurationId("");
    instance.setInstanceId("42");
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.updateInstance("ABC123", instance);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.updateInstance(String, IntegrationInstanceSubmissionUpdate)"
  })
  public void testUpdateInstance_givenNull_whenNull_thenThrowRemoteApiException()
      throws RemoteApiException {
    // Arrange
    IntegrationInstanceSubmissionUpdate instance = new IntegrationInstanceSubmissionUpdate();
    instance.setConfigurationId(null);
    instance.setInstanceId("42");
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.updateInstance(null, instance);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}.
   *
   * <ul>
   *   <li>Then return {@link IntegrationInstance} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.updateInstance(String, IntegrationInstanceSubmissionUpdate)"
  })
  public void testUpdateInstance_thenReturnIntegrationInstance() throws RemoteApiException {
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

    HttpApiClient apiClient = mock(HttpApiClient.class);
    when(apiClient.doPut(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Object>any(),
            Mockito.<Class<IntegrationInstance>>any()))
        .thenReturn(integrationInstance);
    when(apiClient.escapeString(Mockito.<String>any())).thenReturn("https://example.org/example");
    IntegrationInstanceAdminApiClient integrationInstanceAdminApiClient =
        new IntegrationInstanceAdminApiClient(apiClient, new LogMessageSource());

    IntegrationInstanceSubmissionUpdate instance = new IntegrationInstanceSubmissionUpdate();
    instance.setConfigurationId("42");
    instance.setInstanceId("42");
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act
    IntegrationInstance actualUpdateInstanceResult =
        integrationInstanceAdminApiClient.updateInstance("ABC123", instance);

    // Assert
    verify(apiClient)
        .doPut(
            Mockito.<String>any(),
            isA(Map.class),
            isA(Map.class),
            isA(Object.class),
            isA(Class.class));
    verify(apiClient, atLeast(1)).escapeString(Mockito.<String>any());
    assertSame(integrationInstance, actualUpdateInstanceResult);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}.
   *
   * <ul>
   *   <li>When {@link IntegrationInstanceSubmissionUpdate} (default constructor) ConfigurationId is
   *       {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.updateInstance(String, IntegrationInstanceSubmissionUpdate)"
  })
  public void testUpdateInstance_whenIntegrationInstanceSubmissionUpdateConfigurationIdIsNull()
      throws RemoteApiException {
    // Arrange
    IntegrationInstanceSubmissionUpdate instance = new IntegrationInstanceSubmissionUpdate();
    instance.setConfigurationId(null);
    instance.setInstanceId("42");
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.updateInstance("ABC123", instance);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}.
   *
   * <ul>
   *   <li>When {@link IntegrationInstanceSubmissionUpdate} (default constructor) InstanceId is
   *       {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#updateInstance(String,
   * IntegrationInstanceSubmissionUpdate)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.updateInstance(String, IntegrationInstanceSubmissionUpdate)"
  })
  public void testUpdateInstance_whenIntegrationInstanceSubmissionUpdateInstanceIdIsNull()
      throws RemoteApiException {
    // Arrange
    IntegrationInstanceSubmissionUpdate instance = new IntegrationInstanceSubmissionUpdate();
    instance.setConfigurationId("42");
    instance.setInstanceId(null);
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.updateInstance("ABC123", instance);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#listInstances(String, String, int, int)}.
   *
   * <ul>
   *   <li>Given {@link HttpApiClient}.
   *   <li>When {@code ABC123}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#listInstances(String, String,
   * int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstanceList BaseIntegrationInstanceApiClient.listInstances(String, String, int, int)"
  })
  public void testListInstances_givenHttpApiClient_whenAbc123_thenThrowRemoteApiException()
      throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.listInstances("ABC123", null, 2, 1);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#listInstances(String, String, int, int)}.
   *
   * <ul>
   *   <li>Given {@link HttpApiClient}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#listInstances(String, String,
   * int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstanceList BaseIntegrationInstanceApiClient.listInstances(String, String, int, int)"
  })
  public void testListInstances_givenHttpApiClient_whenNull_thenThrowRemoteApiException()
      throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.listInstances(null, "42", 2, 1);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#listInstances(String, String, int, int)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#listInstances(String, String,
   * int, int)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstanceList BaseIntegrationInstanceApiClient.listInstances(String, String, int, int)"
  })
  public void testListInstances_thenReturnNull() throws RemoteApiException {
    // Arrange
    when(httpApiClient.escapeString(Mockito.<String>any()))
        .thenReturn("https://example.org/example");

    // Act
    IntegrationInstanceList actualListInstancesResult =
        baseIntegrationInstanceApiClient.listInstances("ABC123", "42", 2, 1);

    // Assert
    verify(httpApiClient).escapeString(Mockito.<String>any());
    assertNull(actualListInstancesResult);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#getInstanceById(String, String, String)}.
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#getInstanceById(String, String,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.getInstanceById(String, String, String)"
  })
  public void testGetInstanceById() throws RemoteApiException {
    // Arrange
    when(httpApiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<IntegrationInstance>>any()))
        .thenThrow(new RemoteApiException(1, "An error occurred"));
    when(httpApiClient.escapeString(Mockito.<String>any()))
        .thenReturn("https://example.org/example");

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.getInstanceById("ABC123", "42", "42");
    verify(httpApiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(httpApiClient, atLeast(1)).escapeString(Mockito.<String>any());
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#getInstanceById(String, String, String)}.
   *
   * <ul>
   *   <li>Given {@link HttpApiClient}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#getInstanceById(String, String,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.getInstanceById(String, String, String)"
  })
  public void testGetInstanceById_givenHttpApiClient_whenNull_thenThrowRemoteApiException()
      throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.getInstanceById(null, "42", "42");
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#getInstanceById(String, String, String)}.
   *
   * <ul>
   *   <li>Given {@link HttpApiClient}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#getInstanceById(String, String,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.getInstanceById(String, String, String)"
  })
  public void testGetInstanceById_givenHttpApiClient_whenNull_thenThrowRemoteApiException2()
      throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.getInstanceById("ABC123", "42", null);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#getInstanceById(String, String, String)}.
   *
   * <ul>
   *   <li>Given {@link HttpApiClient}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#getInstanceById(String, String,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.getInstanceById(String, String, String)"
  })
  public void testGetInstanceById_givenHttpApiClient_whenNull_thenThrowRemoteApiException3()
      throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.getInstanceById("ABC123", null, null);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#getInstanceById(String, String, String)}.
   *
   * <ul>
   *   <li>Then return {@link IntegrationInstance} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#getInstanceById(String, String,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.getInstanceById(String, String, String)"
  })
  public void testGetInstanceById_thenReturnIntegrationInstance() throws RemoteApiException {
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
    when(httpApiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<IntegrationInstance>>any()))
        .thenReturn(integrationInstance);
    when(httpApiClient.escapeString(Mockito.<String>any()))
        .thenReturn("https://example.org/example");

    // Act
    IntegrationInstance actualInstanceById =
        baseIntegrationInstanceApiClient.getInstanceById("ABC123", "42", "42");

    // Assert
    verify(httpApiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(httpApiClient, atLeast(1)).escapeString(Mockito.<String>any());
    assertSame(integrationInstance, actualInstanceById);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#activateInstance(String, String, String)}.
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#activateInstance(String, String,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.activateInstance(String, String, String)"
  })
  public void testActivateInstance() throws RemoteApiException {
    // Arrange
    when(httpApiClient.doPost(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Object>any(),
            Mockito.<Class<IntegrationInstance>>any()))
        .thenThrow(new RemoteApiException(1, "An error occurred"));
    when(httpApiClient.escapeString(Mockito.<String>any()))
        .thenReturn("https://example.org/example");

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.activateInstance("ABC123", "42", "42");
    verify(httpApiClient)
        .doPost(
            Mockito.<String>any(),
            isA(Map.class),
            isA(Map.class),
            Mockito.<Object>any(),
            isA(Class.class));
    verify(httpApiClient, atLeast(1)).escapeString(Mockito.<String>any());
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#activateInstance(String, String, String)}.
   *
   * <ul>
   *   <li>Given {@link HttpApiClient}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#activateInstance(String, String,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.activateInstance(String, String, String)"
  })
  public void testActivateInstance_givenHttpApiClient_whenNull_thenThrowRemoteApiException()
      throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.activateInstance(null, "42", "42");
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#activateInstance(String, String, String)}.
   *
   * <ul>
   *   <li>Given {@link HttpApiClient}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#activateInstance(String, String,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.activateInstance(String, String, String)"
  })
  public void testActivateInstance_givenHttpApiClient_whenNull_thenThrowRemoteApiException2()
      throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.activateInstance("ABC123", "42", null);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#activateInstance(String, String, String)}.
   *
   * <ul>
   *   <li>Given {@link HttpApiClient}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#activateInstance(String, String,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.activateInstance(String, String, String)"
  })
  public void testActivateInstance_givenHttpApiClient_whenNull_thenThrowRemoteApiException3()
      throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.activateInstance("ABC123", null, null);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#activateInstance(String, String, String)}.
   *
   * <ul>
   *   <li>Then return {@link IntegrationInstance} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#activateInstance(String, String,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.activateInstance(String, String, String)"
  })
  public void testActivateInstance_thenReturnIntegrationInstance() throws RemoteApiException {
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
    when(httpApiClient.doPost(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Object>any(),
            Mockito.<Class<IntegrationInstance>>any()))
        .thenReturn(integrationInstance);
    when(httpApiClient.escapeString(Mockito.<String>any()))
        .thenReturn("https://example.org/example");

    // Act
    IntegrationInstance actualActivateInstanceResult =
        baseIntegrationInstanceApiClient.activateInstance("ABC123", "42", "42");

    // Assert
    verify(httpApiClient)
        .doPost(
            Mockito.<String>any(),
            isA(Map.class),
            isA(Map.class),
            Mockito.<Object>any(),
            isA(Class.class));
    verify(httpApiClient, atLeast(1)).escapeString(Mockito.<String>any());
    assertSame(integrationInstance, actualActivateInstanceResult);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#deactivateInstance(String, String, String)}.
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#deactivateInstance(String,
   * String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.deactivateInstance(String, String, String)"
  })
  public void testDeactivateInstance() throws RemoteApiException {
    // Arrange
    when(httpApiClient.doPost(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Object>any(),
            Mockito.<Class<IntegrationInstance>>any()))
        .thenThrow(new RemoteApiException(1, "An error occurred"));
    when(httpApiClient.escapeString(Mockito.<String>any()))
        .thenReturn("https://example.org/example");

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.deactivateInstance("ABC123", "42", "42");
    verify(httpApiClient)
        .doPost(
            Mockito.<String>any(),
            isA(Map.class),
            isA(Map.class),
            Mockito.<Object>any(),
            isA(Class.class));
    verify(httpApiClient, atLeast(1)).escapeString(Mockito.<String>any());
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#deactivateInstance(String, String, String)}.
   *
   * <ul>
   *   <li>Given {@link HttpApiClient}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#deactivateInstance(String,
   * String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.deactivateInstance(String, String, String)"
  })
  public void testDeactivateInstance_givenHttpApiClient_whenNull_thenThrowRemoteApiException()
      throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.deactivateInstance(null, "42", "42");
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#deactivateInstance(String, String, String)}.
   *
   * <ul>
   *   <li>Given {@link HttpApiClient}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#deactivateInstance(String,
   * String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.deactivateInstance(String, String, String)"
  })
  public void testDeactivateInstance_givenHttpApiClient_whenNull_thenThrowRemoteApiException2()
      throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.deactivateInstance("ABC123", "42", null);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#deactivateInstance(String, String, String)}.
   *
   * <ul>
   *   <li>Given {@link HttpApiClient}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#deactivateInstance(String,
   * String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.deactivateInstance(String, String, String)"
  })
  public void testDeactivateInstance_givenHttpApiClient_whenNull_thenThrowRemoteApiException3()
      throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    baseIntegrationInstanceApiClient.deactivateInstance("ABC123", null, null);
  }

  /**
   * Test {@link BaseIntegrationInstanceApiClient#deactivateInstance(String, String, String)}.
   *
   * <ul>
   *   <li>Then return {@link IntegrationInstance} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link BaseIntegrationInstanceApiClient#deactivateInstance(String,
   * String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance BaseIntegrationInstanceApiClient.deactivateInstance(String, String, String)"
  })
  public void testDeactivateInstance_thenReturnIntegrationInstance() throws RemoteApiException {
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
    when(httpApiClient.doPost(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Object>any(),
            Mockito.<Class<IntegrationInstance>>any()))
        .thenReturn(integrationInstance);
    when(httpApiClient.escapeString(Mockito.<String>any()))
        .thenReturn("https://example.org/example");

    // Act
    IntegrationInstance actualDeactivateInstanceResult =
        baseIntegrationInstanceApiClient.deactivateInstance("ABC123", "42", "42");

    // Assert
    verify(httpApiClient)
        .doPost(
            Mockito.<String>any(),
            isA(Map.class),
            isA(Map.class),
            Mockito.<Object>any(),
            isA(Class.class));
    verify(httpApiClient, atLeast(1)).escapeString(Mockito.<String>any());
    assertSame(integrationInstance, actualDeactivateInstanceResult);
  }
}
