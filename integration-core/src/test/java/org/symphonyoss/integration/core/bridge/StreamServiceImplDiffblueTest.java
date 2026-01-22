package org.symphonyoss.integration.core.bridge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.utils.ValidateFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.agent.api.client.AgentApiClient;
import org.symphonyoss.integration.api.client.EntitySerializer;
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.authentication.AuthenticationToken;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.config.IntegrationInstance;
import org.symphonyoss.integration.model.message.Message;
import org.symphonyoss.integration.model.message.Message.FormatEnum;
import org.symphonyoss.integration.model.message.MessageMLVersion;
import org.symphonyoss.integration.model.stream.Stream;
import org.symphonyoss.integration.model.stream.StreamType;
import org.symphonyoss.integration.pod.api.client.PodHttpApiClient;

@ContextConfiguration(classes = {StreamServiceImpl.class})
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@RunWith(SpringJUnit4ClassRunner.class)
public class StreamServiceImplDiffblueTest {
  @MockBean private AgentApiClient agentApiClient;

  @MockBean private AuthenticationProxy authenticationProxy;

  @MockBean private LogMessageSource logMessageSource;

  @MockBean private PodHttpApiClient podHttpApiClient;

  @Autowired private StreamServiceImpl streamServiceImpl;

  /**
   * Test {@link StreamServiceImpl#getStreams(IntegrationInstance)} with {@code instance}.
   *
   * <ul>
   *   <li>Given {@link AgentApiClient}.
   * </ul>
   *
   * <p>Method under test: {@link StreamServiceImpl#getStreams(IntegrationInstance)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List StreamServiceImpl.getStreams(IntegrationInstance)"})
  public void testGetStreamsWithInstance_givenAgentApiClient() {
    // Arrange
    IntegrationInstance instance = new IntegrationInstance();
    instance.setActive(true);
    instance.setConfigurationId(ValidateFactory.createNonNullString());
    instance.setCreatedDate(1L);
    instance.setCreatorId(ValidateFactory.createNonNullString());
    instance.setCreatorName(ValidateFactory.createNonNullString());
    instance.setInstanceId(ValidateFactory.createNonNullString());
    instance.setLastModifiedDate(1L);
    instance.setName(ValidateFactory.createNonNullString());
    instance.setOptionalProperties(null);

    // Act and Assert
    assertTrue(streamServiceImpl.getStreams(instance).isEmpty());
  }

  /**
   * Test {@link StreamServiceImpl#getStreams(IntegrationInstance)} with {@code instance}.
   *
   * <ul>
   *   <li>Given {@link StreamServiceImpl} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link StreamServiceImpl#getStreams(IntegrationInstance)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List StreamServiceImpl.getStreams(IntegrationInstance)"})
  public void testGetStreamsWithInstance_givenStreamServiceImpl() {
    // Arrange
    StreamServiceImpl streamServiceImpl = new StreamServiceImpl();

    IntegrationInstance instance = new IntegrationInstance();
    instance.setActive(true);
    instance.setConfigurationId(ValidateFactory.createNonNullString());
    instance.setCreatedDate(1L);
    instance.setCreatorId(ValidateFactory.createNonNullString());
    instance.setCreatorName(ValidateFactory.createNonNullString());
    instance.setInstanceId(ValidateFactory.createNonNullString());
    instance.setLastModifiedDate(1L);
    instance.setName(ValidateFactory.createNonNullString());
    instance.setOptionalProperties("42");

    // Act and Assert
    assertTrue(streamServiceImpl.getStreams(instance).isEmpty());
  }

  /**
   * Test {@link StreamServiceImpl#getStreams(String)} with {@code optionalProperties}.
   *
   * <ul>
   *   <li>Given {@link AgentApiClient}.
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StreamServiceImpl#getStreams(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List StreamServiceImpl.getStreams(String)"})
  public void testGetStreamsWithOptionalProperties_givenAgentApiClient_whenNull() {
    // Arrange, Act and Assert
    assertTrue(streamServiceImpl.getStreams((String) null).isEmpty());
  }

  /**
   * Test {@link StreamServiceImpl#getStreams(String)} with {@code optionalProperties}.
   *
   * <ul>
   *   <li>Given {@link StreamServiceImpl} (default constructor).
   *   <li>When {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link StreamServiceImpl#getStreams(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List StreamServiceImpl.getStreams(String)"})
  public void testGetStreamsWithOptionalProperties_givenStreamServiceImpl_when42() {
    // Arrange, Act and Assert
    assertTrue(new StreamServiceImpl().getStreams("42").isEmpty());
  }

  /**
   * Test {@link StreamServiceImpl#getStreamType(IntegrationInstance)}.
   *
   * <ul>
   *   <li>Given {@link AgentApiClient}.
   * </ul>
   *
   * <p>Method under test: {@link StreamServiceImpl#getStreamType(IntegrationInstance)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"StreamType StreamServiceImpl.getStreamType(IntegrationInstance)"})
  public void testGetStreamType_givenAgentApiClient() {
    // Arrange
    IntegrationInstance instance = new IntegrationInstance();
    instance.setActive(true);
    instance.setConfigurationId(ValidateFactory.createNonNullString());
    instance.setCreatedDate(1L);
    instance.setCreatorId(ValidateFactory.createNonNullString());
    instance.setCreatorName(ValidateFactory.createNonNullString());
    instance.setInstanceId(ValidateFactory.createNonNullString());
    instance.setLastModifiedDate(1L);
    instance.setName(ValidateFactory.createNonNullString());
    instance.setOptionalProperties(null);

    // Act and Assert
    assertEquals(StreamType.NONE, streamServiceImpl.getStreamType(instance));
  }

  /**
   * Test {@link StreamServiceImpl#getStreamType(IntegrationInstance)}.
   *
   * <ul>
   *   <li>Given {@link StreamServiceImpl} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link StreamServiceImpl#getStreamType(IntegrationInstance)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"StreamType StreamServiceImpl.getStreamType(IntegrationInstance)"})
  public void testGetStreamType_givenStreamServiceImpl() {
    // Arrange
    StreamServiceImpl streamServiceImpl = new StreamServiceImpl();

    IntegrationInstance instance = new IntegrationInstance();
    instance.setActive(true);
    instance.setConfigurationId(ValidateFactory.createNonNullString());
    instance.setCreatedDate(1L);
    instance.setCreatorId(ValidateFactory.createNonNullString());
    instance.setCreatorName(ValidateFactory.createNonNullString());
    instance.setInstanceId(ValidateFactory.createNonNullString());
    instance.setLastModifiedDate(1L);
    instance.setName(ValidateFactory.createNonNullString());
    instance.setOptionalProperties("42");

    // Act and Assert
    assertEquals(StreamType.NONE, streamServiceImpl.getStreamType(instance));
  }

  /**
   * Test {@link StreamServiceImpl#postMessage(String, String, Message)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StreamServiceImpl#postMessage(String, String, Message)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Message StreamServiceImpl.postMessage(String, String, Message)"})
  public void testPostMessage_thenReturnNull() throws RemoteApiException {
    // Arrange
    when(agentApiClient.escapeString(Mockito.<String>any()))
        .thenReturn(ValidateFactory.createNonNullString());
    String sessionToken = ValidateFactory.createNonNullString();
    when(authenticationProxy.getToken(Mockito.<String>any()))
        .thenReturn(new AuthenticationToken(sessionToken, ValidateFactory.createNonNullString()));
    String integrationUser = ValidateFactory.createNonNullString();
    String stream = ValidateFactory.createNonNullString();

    Message messageSubmission = new Message();
    messageSubmission.setData(ValidateFactory.createNonNullString());
    messageSubmission.setFormat(FormatEnum.TEXT);
    messageSubmission.setMessage(ValidateFactory.createNonNullString());
    messageSubmission.setTimestamp(10L);
    messageSubmission.setVersion(MessageMLVersion.V1);

    // Act
    Message actualPostMessageResult =
        streamServiceImpl.postMessage(integrationUser, stream, messageSubmission);

    // Assert
    verify(agentApiClient).escapeString(Mockito.<String>any());
    verify(authenticationProxy).getToken(Mockito.<String>any());
    assertNull(actualPostMessageResult);
  }

  /**
   * Test {@link StreamServiceImpl#createIM(String, Long)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StreamServiceImpl#createIM(String, Long)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream StreamServiceImpl.createIM(String, Long)"})
  public void testCreateIM_thenReturnNull() throws RemoteApiException {
    // Arrange
    when(authenticationProxy.getSessionToken(Mockito.<String>any()))
        .thenReturn(ValidateFactory.createNonNullString());

    // Act
    Stream actualCreateIMResult =
        streamServiceImpl.createIM(ValidateFactory.createNonNullString(), 1L);

    // Assert
    verify(authenticationProxy).getSessionToken(Mockito.<String>any());
    assertNull(actualCreateIMResult);
  }
}
