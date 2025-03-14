package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
import org.symphonyoss.integration.pod.api.model.IntegrationInstanceSubmissionCreate;

@ContextConfiguration(classes = {IntegrationInstanceApiClient.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class IntegrationInstanceApiClientDiffblueTest {
  @MockBean
  private HttpApiClient httpApiClient;

  @Autowired
  private IntegrationInstanceApiClient integrationInstanceApiClient;

  @MockBean
  private LogMessageSource logMessageSource;

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link IntegrationInstanceApiClient#IntegrationInstanceApiClient(HttpApiClient, LogMessageSource)}
   *   <li>{@link IntegrationInstanceApiClient#getApiPathPrefix()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void IntegrationInstanceApiClient.<init>(HttpApiClient, LogMessageSource)",
      "String IntegrationInstanceApiClient.getApiPathPrefix()"})
  public void testGettersAndSetters() {
    // Arrange
    IntegrationHttpApiClient apiClient = new IntegrationHttpApiClient();

    // Act and Assert
    assertEquals("/v1", (new IntegrationInstanceApiClient(apiClient, new LogMessageSource())).getApiPathPrefix());
  }

  /**
   * Test {@link IntegrationInstanceApiClient#createInstance(String, IntegrationInstanceSubmissionCreate)}.
   * <ul>
   *   <li>Given empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link IntegrationInstanceApiClient#createInstance(String, IntegrationInstanceSubmissionCreate)}
   */
  @Test
  @MethodsUnderTest({
      "IntegrationInstance IntegrationInstanceApiClient.createInstance(String, IntegrationInstanceSubmissionCreate)"})
  public void testCreateInstance_givenEmptyString() throws RemoteApiException {
    // Arrange
    IntegrationInstanceSubmissionCreate instance = mock(IntegrationInstanceSubmissionCreate.class);
    when(instance.getConfigurationId()).thenReturn("");
    doNothing().when(instance).setConfigurationId(Mockito.<String>any());
    doNothing().when(instance).setCreatorId(Mockito.<String>any());
    doNothing().when(instance).setName(Mockito.<String>any());
    doNothing().when(instance).setOptionalProperties(Mockito.<String>any());
    instance.setConfigurationId("42");
    instance.setCreatorId("42");
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    integrationInstanceApiClient.createInstance("ABC123", instance);
    verify(instance).getConfigurationId();
    verify(instance).setConfigurationId(Mockito.<String>any());
    verify(instance).setCreatorId(Mockito.<String>any());
    verify(instance).setName(Mockito.<String>any());
    verify(instance).setOptionalProperties(Mockito.<String>any());
  }

  /**
   * Test {@link IntegrationInstanceApiClient#createInstance(String, IntegrationInstanceSubmissionCreate)}.
   * <ul>
   *   <li>Given {@link LogMessageSource}.</li>
   *   <li>Then return {@link IntegrationInstance} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link IntegrationInstanceApiClient#createInstance(String, IntegrationInstanceSubmissionCreate)}
   */
  @Test
  @MethodsUnderTest({
      "IntegrationInstance IntegrationInstanceApiClient.createInstance(String, IntegrationInstanceSubmissionCreate)"})
  public void testCreateInstance_givenLogMessageSource_thenReturnIntegrationInstance() throws RemoteApiException {
    // Arrange
    IntegrationInstance integrationInstance = new IntegrationInstance();
    integrationInstance.setActive(true);
    integrationInstance.setConfigurationId("42");
    integrationInstance.setCreatedDate(1L);
    integrationInstance.setCreatorId("42");
    integrationInstance.setCreatorName("/v1/configuration/");
    integrationInstance.setInstanceId("42");
    integrationInstance.setLastModifiedDate(1L);
    integrationInstance.setName("/v1/configuration/");
    integrationInstance.setOptionalProperties("/v1/configuration/");
    when(httpApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any()))
            .thenReturn(integrationInstance);
    when(httpApiClient.escapeString(Mockito.<String>any())).thenReturn("https://example.org/example");

    IntegrationInstanceSubmissionCreate instance = new IntegrationInstanceSubmissionCreate();
    instance.setConfigurationId("42");
    instance.setCreatorId("42");
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act
    IntegrationInstance actualCreateInstanceResult = integrationInstanceApiClient.createInstance("ABC123", instance);

    // Assert
    verify(httpApiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
    verify(httpApiClient).escapeString(Mockito.<String>any());
    assertSame(integrationInstance, actualCreateInstanceResult);
  }

  /**
   * Test {@link IntegrationInstanceApiClient#createInstance(String, IntegrationInstanceSubmissionCreate)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IntegrationInstanceApiClient#createInstance(String, IntegrationInstanceSubmissionCreate)}
   */
  @Test
  @MethodsUnderTest({
      "IntegrationInstance IntegrationInstanceApiClient.createInstance(String, IntegrationInstanceSubmissionCreate)"})
  public void testCreateInstance_givenNull() throws RemoteApiException {
    // Arrange
    IntegrationInstanceSubmissionCreate instance = mock(IntegrationInstanceSubmissionCreate.class);
    when(instance.getConfigurationId()).thenReturn(null);
    doNothing().when(instance).setConfigurationId(Mockito.<String>any());
    doNothing().when(instance).setCreatorId(Mockito.<String>any());
    doNothing().when(instance).setName(Mockito.<String>any());
    doNothing().when(instance).setOptionalProperties(Mockito.<String>any());
    instance.setConfigurationId("42");
    instance.setCreatorId("42");
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    integrationInstanceApiClient.createInstance("ABC123", instance);
    verify(instance).getConfigurationId();
    verify(instance).setConfigurationId(Mockito.<String>any());
    verify(instance).setCreatorId(Mockito.<String>any());
    verify(instance).setName(Mockito.<String>any());
    verify(instance).setOptionalProperties(Mockito.<String>any());
  }
}
