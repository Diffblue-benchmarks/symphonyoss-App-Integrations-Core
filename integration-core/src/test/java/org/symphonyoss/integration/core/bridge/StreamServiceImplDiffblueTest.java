package org.symphonyoss.integration.core.bridge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.anyBoolean;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.agent.api.client.AgentApiClient;
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.authentication.AuthenticationToken;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.healthcheck.event.ServiceVersionUpdatedEventData;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.config.IntegrationInstance;
import org.symphonyoss.integration.model.message.Message;
import org.symphonyoss.integration.model.message.MessageMLVersion;
import org.symphonyoss.integration.model.stream.Stream;
import org.symphonyoss.integration.model.stream.StreamType;
import org.symphonyoss.integration.pod.api.client.PodHttpApiClient;

@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(classes = {StreamServiceImpl.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class StreamServiceImplDiffblueTest {
  @MockBean
  private AgentApiClient agentApiClient;

  @MockBean
  private AuthenticationProxy authenticationProxy;

  @MockBean
  private LogMessageSource logMessageSource;

  @MockBean
  private PodHttpApiClient podHttpApiClient;

  @Autowired
  private StreamServiceImpl streamServiceImpl;

  /**
   * Method under test: {@link StreamServiceImpl#getStreams(String)}
   */
  @Test
  public void testGetStreams() {
    // Arrange, Act and Assert
    assertTrue(streamServiceImpl.getStreams("Optional Properties").isEmpty());
    assertTrue(streamServiceImpl.getStreams("42").isEmpty());
    assertTrue(streamServiceImpl.getStreams("").isEmpty());
  }

  /**
   * Method under test: {@link StreamServiceImpl#getStreams(IntegrationInstance)}
   */
  @Test
  public void testGetStreams2() {
    // Arrange
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
    assertTrue(streamServiceImpl.getStreams(instance).isEmpty());
  }

  /**
   * Method under test: {@link StreamServiceImpl#getStreams(IntegrationInstance)}
   */
  @Test
  public void testGetStreams3() {
    // Arrange
    IntegrationInstance instance = mock(IntegrationInstance.class);
    when(instance.getOptionalProperties()).thenReturn("42");
    doNothing().when(instance).setActive(Mockito.<Boolean>any());
    doNothing().when(instance).setConfigurationId(Mockito.<String>any());
    doNothing().when(instance).setCreatedDate(Mockito.<Long>any());
    doNothing().when(instance).setCreatorId(Mockito.<String>any());
    doNothing().when(instance).setCreatorName(Mockito.<String>any());
    doNothing().when(instance).setInstanceId(Mockito.<String>any());
    doNothing().when(instance).setLastModifiedDate(Mockito.<Long>any());
    doNothing().when(instance).setName(Mockito.<String>any());
    doNothing().when(instance).setOptionalProperties(Mockito.<String>any());
    instance.setActive(true);
    instance.setConfigurationId("42");
    instance.setCreatedDate(1L);
    instance.setCreatorId("42");
    instance.setCreatorName("Creator Name");
    instance.setInstanceId("42");
    instance.setLastModifiedDate(1L);
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act
    List<String> actualStreams = streamServiceImpl.getStreams(instance);

    // Assert
    verify(instance).getOptionalProperties();
    verify(instance).setActive(anyBoolean());
    verify(instance).setConfigurationId(Mockito.<String>any());
    verify(instance).setCreatedDate(anyLong());
    verify(instance).setCreatorId(Mockito.<String>any());
    verify(instance).setCreatorName(Mockito.<String>any());
    verify(instance).setInstanceId(Mockito.<String>any());
    verify(instance).setLastModifiedDate(anyLong());
    verify(instance).setName(Mockito.<String>any());
    verify(instance).setOptionalProperties(Mockito.<String>any());
    assertTrue(actualStreams.isEmpty());
  }

  /**
   * Method under test: {@link StreamServiceImpl#getStreams(IntegrationInstance)}
   */
  @Test
  public void testGetStreams4() {
    // Arrange
    IntegrationInstance instance = mock(IntegrationInstance.class);
    when(instance.getOptionalProperties()).thenReturn("");
    doNothing().when(instance).setActive(Mockito.<Boolean>any());
    doNothing().when(instance).setConfigurationId(Mockito.<String>any());
    doNothing().when(instance).setCreatedDate(Mockito.<Long>any());
    doNothing().when(instance).setCreatorId(Mockito.<String>any());
    doNothing().when(instance).setCreatorName(Mockito.<String>any());
    doNothing().when(instance).setInstanceId(Mockito.<String>any());
    doNothing().when(instance).setLastModifiedDate(Mockito.<Long>any());
    doNothing().when(instance).setName(Mockito.<String>any());
    doNothing().when(instance).setOptionalProperties(Mockito.<String>any());
    instance.setActive(true);
    instance.setConfigurationId("42");
    instance.setCreatedDate(1L);
    instance.setCreatorId("42");
    instance.setCreatorName("Creator Name");
    instance.setInstanceId("42");
    instance.setLastModifiedDate(1L);
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act
    List<String> actualStreams = streamServiceImpl.getStreams(instance);

    // Assert
    verify(instance).getOptionalProperties();
    verify(instance).setActive(anyBoolean());
    verify(instance).setConfigurationId(Mockito.<String>any());
    verify(instance).setCreatedDate(anyLong());
    verify(instance).setCreatorId(Mockito.<String>any());
    verify(instance).setCreatorName(Mockito.<String>any());
    verify(instance).setInstanceId(Mockito.<String>any());
    verify(instance).setLastModifiedDate(anyLong());
    verify(instance).setName(Mockito.<String>any());
    verify(instance).setOptionalProperties(Mockito.<String>any());
    assertTrue(actualStreams.isEmpty());
  }

  /**
   * Method under test:
   * {@link StreamServiceImpl#getStreamType(IntegrationInstance)}
   */
  @Test
  public void testGetStreamType() {
    // Arrange
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
    assertEquals(StreamType.NONE, streamServiceImpl.getStreamType(instance));
  }

  /**
   * Method under test:
   * {@link StreamServiceImpl#getStreamType(IntegrationInstance)}
   */
  @Test
  public void testGetStreamType2() {
    // Arrange
    IntegrationInstance instance = mock(IntegrationInstance.class);
    when(instance.getOptionalProperties()).thenReturn("42");
    doNothing().when(instance).setActive(Mockito.<Boolean>any());
    doNothing().when(instance).setConfigurationId(Mockito.<String>any());
    doNothing().when(instance).setCreatedDate(Mockito.<Long>any());
    doNothing().when(instance).setCreatorId(Mockito.<String>any());
    doNothing().when(instance).setCreatorName(Mockito.<String>any());
    doNothing().when(instance).setInstanceId(Mockito.<String>any());
    doNothing().when(instance).setLastModifiedDate(Mockito.<Long>any());
    doNothing().when(instance).setName(Mockito.<String>any());
    doNothing().when(instance).setOptionalProperties(Mockito.<String>any());
    instance.setActive(true);
    instance.setConfigurationId("42");
    instance.setCreatedDate(1L);
    instance.setCreatorId("42");
    instance.setCreatorName("Creator Name");
    instance.setInstanceId("42");
    instance.setLastModifiedDate(1L);
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act
    StreamType actualStreamType = streamServiceImpl.getStreamType(instance);

    // Assert
    verify(instance).getOptionalProperties();
    verify(instance).setActive(anyBoolean());
    verify(instance).setConfigurationId(Mockito.<String>any());
    verify(instance).setCreatedDate(anyLong());
    verify(instance).setCreatorId(Mockito.<String>any());
    verify(instance).setCreatorName(Mockito.<String>any());
    verify(instance).setInstanceId(Mockito.<String>any());
    verify(instance).setLastModifiedDate(anyLong());
    verify(instance).setName(Mockito.<String>any());
    verify(instance).setOptionalProperties(Mockito.<String>any());
    assertEquals(StreamType.NONE, actualStreamType);
  }

  /**
   * Method under test:
   * {@link StreamServiceImpl#getStreamType(IntegrationInstance)}
   */
  @Test
  public void testGetStreamType3() {
    // Arrange
    IntegrationInstance instance = mock(IntegrationInstance.class);
    when(instance.getInstanceId()).thenReturn("42");
    when(instance.getOptionalProperties()).thenReturn("");
    doNothing().when(instance).setActive(Mockito.<Boolean>any());
    doNothing().when(instance).setConfigurationId(Mockito.<String>any());
    doNothing().when(instance).setCreatedDate(Mockito.<Long>any());
    doNothing().when(instance).setCreatorId(Mockito.<String>any());
    doNothing().when(instance).setCreatorName(Mockito.<String>any());
    doNothing().when(instance).setInstanceId(Mockito.<String>any());
    doNothing().when(instance).setLastModifiedDate(Mockito.<Long>any());
    doNothing().when(instance).setName(Mockito.<String>any());
    doNothing().when(instance).setOptionalProperties(Mockito.<String>any());
    instance.setActive(true);
    instance.setConfigurationId("42");
    instance.setCreatedDate(1L);
    instance.setCreatorId("42");
    instance.setCreatorName("Creator Name");
    instance.setInstanceId("42");
    instance.setLastModifiedDate(1L);
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act
    StreamType actualStreamType = streamServiceImpl.getStreamType(instance);

    // Assert
    verify(instance).getInstanceId();
    verify(instance).getOptionalProperties();
    verify(instance).setActive(anyBoolean());
    verify(instance).setConfigurationId(Mockito.<String>any());
    verify(instance).setCreatedDate(anyLong());
    verify(instance).setCreatorId(Mockito.<String>any());
    verify(instance).setCreatorName(Mockito.<String>any());
    verify(instance).setInstanceId(Mockito.<String>any());
    verify(instance).setLastModifiedDate(anyLong());
    verify(instance).setName(Mockito.<String>any());
    verify(instance).setOptionalProperties(Mockito.<String>any());
    assertEquals(StreamType.NONE, actualStreamType);
  }

  /**
   * Method under test:
   * {@link StreamServiceImpl#getStreamType(IntegrationInstance)}
   */
  @Test
  public void testGetStreamType4() {
    // Arrange
    IntegrationInstance instance = mock(IntegrationInstance.class);
    when(instance.getOptionalProperties()).thenReturn("42");
    doNothing().when(instance).setActive(Mockito.<Boolean>any());
    doNothing().when(instance).setConfigurationId(Mockito.<String>any());
    doNothing().when(instance).setCreatedDate(Mockito.<Long>any());
    doNothing().when(instance).setCreatorId(Mockito.<String>any());
    doNothing().when(instance).setCreatorName(Mockito.<String>any());
    doNothing().when(instance).setInstanceId(Mockito.<String>any());
    doNothing().when(instance).setLastModifiedDate(Mockito.<Long>any());
    doNothing().when(instance).setName(Mockito.<String>any());
    doNothing().when(instance).setOptionalProperties(Mockito.<String>any());
    instance.setActive(true);
    instance.setConfigurationId("42");
    instance.setCreatedDate(1L);
    instance.setCreatorId("42");
    instance.setCreatorName("Creator Name");
    instance.setInstanceId("42");
    instance.setLastModifiedDate(1L);
    instance.setName("Name");
    instance.setOptionalProperties("Optional Properties");

    // Act
    StreamType actualStreamType = streamServiceImpl.getStreamType(instance);

    // Assert
    verify(instance).getOptionalProperties();
    verify(instance).setActive(anyBoolean());
    verify(instance).setConfigurationId(Mockito.<String>any());
    verify(instance).setCreatedDate(anyLong());
    verify(instance).setCreatorId(Mockito.<String>any());
    verify(instance).setCreatorName(Mockito.<String>any());
    verify(instance).setInstanceId(Mockito.<String>any());
    verify(instance).setLastModifiedDate(anyLong());
    verify(instance).setName(Mockito.<String>any());
    verify(instance).setOptionalProperties(Mockito.<String>any());
    assertEquals(StreamType.NONE, actualStreamType);
  }

  /**
   * Method under test:
   * {@link StreamServiceImpl#postMessage(String, String, Message)}
   */
  @Test
  public void testPostMessage() throws RemoteApiException {
    // Arrange
    Message message = new Message();
    message.setData("/v2/stream/");
    message.setFormat(Message.FormatEnum.TEXT);
    message.setMessage("Not all who wander are lost");
    message.setTimestamp(10L);
    message.setVersion(MessageMLVersion.V1);
    when(agentApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenReturn(message);
    when(agentApiClient.escapeString(Mockito.<String>any())).thenReturn("Escape String");
    when(authenticationProxy.getToken(Mockito.<String>any())).thenReturn(new AuthenticationToken("ABC123", "ABC123"));

    Message messageSubmission = new Message();
    messageSubmission.setData("Data");
    messageSubmission.setFormat(Message.FormatEnum.TEXT);
    messageSubmission.setMessage("Not all who wander are lost");
    messageSubmission.setTimestamp(10L);
    messageSubmission.setVersion(MessageMLVersion.V1);

    // Act
    Message actualPostMessageResult = streamServiceImpl.postMessage("Integration User", "Stream", messageSubmission);

    // Assert
    verify(agentApiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
    verify(agentApiClient).escapeString(Mockito.<String>any());
    verify(authenticationProxy).getToken(Mockito.<String>any());
    assertSame(message, actualPostMessageResult);
  }

  /**
   * Method under test: {@link StreamServiceImpl#createIM(String, Long)}
   */
  @Test
  public void testCreateIM() throws RemoteApiException {
    // Arrange
    when(authenticationProxy.getSessionToken(Mockito.<String>any())).thenReturn("ABC123");

    Stream stream = new Stream();
    stream.setId("42");
    when(podHttpApiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenReturn(stream);

    // Act
    Stream actualCreateIMResult = streamServiceImpl.createIM("Integration User", 1L);

    // Assert
    verify(podHttpApiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Object.class),
        isA(Class.class));
    verify(authenticationProxy).getSessionToken(Mockito.<String>any());
    assertEquals("42", actualCreateIMResult.getId());
    assertSame(stream, actualCreateIMResult);
  }

  /**
   * Method under test:
   * {@link StreamServiceImpl#handleServiceVersionUpdatedEvent(ServiceVersionUpdatedEventData)}
   */
  @Test
  public void testHandleServiceVersionUpdatedEvent() {
    // Arrange
    ServiceVersionUpdatedEventData event = mock(ServiceVersionUpdatedEventData.class);
    when(event.getServiceName()).thenReturn("Service Name");

    // Act
    streamServiceImpl.handleServiceVersionUpdatedEvent(event);

    // Assert
    verify(event).getServiceName();
  }

  /**
   * Method under test:
   * {@link StreamServiceImpl#handleServiceVersionUpdatedEvent(ServiceVersionUpdatedEventData)}
   */
  @Test
  public void testHandleServiceVersionUpdatedEvent2() {
    // Arrange
    ServiceVersionUpdatedEventData event = mock(ServiceVersionUpdatedEventData.class);
    when(event.getNewVersion()).thenReturn("1.0.3");
    when(event.getServiceName()).thenReturn("AGENT");

    // Act
    streamServiceImpl.handleServiceVersionUpdatedEvent(event);

    // Assert
    verify(event).getNewVersion();
    verify(event).getServiceName();
  }
}
