package org.symphonyoss.integration.agent.api.client;

import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.symphonyoss.integration.api.client.AppAuthenticationProxyApiClient;
import org.symphonyoss.integration.api.client.EntitySerializer;
import org.symphonyoss.integration.authentication.api.AppAuthenticationProxy;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.message.Message;
import org.symphonyoss.integration.model.message.Message.FormatEnum;
import org.symphonyoss.integration.model.message.MessageMLVersion;

public class BaseMessageApiClientDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link BaseMessageApiClient#validateParams(String, String, String, Message)}.
   *
   * <ul>
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link BaseMessageApiClient#validateParams(String, String, String,
   * Message)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void BaseMessageApiClient.validateParams(String, String, String, Message)"})
  public void testValidateParams_thenDoesNotThrow() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient =
        new AppAuthenticationProxyApiClient(
            mock(EntitySerializer.class),
            mock(AppAuthenticationProxy.class),
            ServiceName.POD_SESSION_MANAGER);
    V2MessageApiClient v2MessageApiClient =
        new V2MessageApiClient(apiClient, new LogMessageSource());

    Message message = new Message();
    message.setData("Data");
    message.setFormat(FormatEnum.TEXT);
    message.setMessage("Not all who wander are lost");
    message.setTimestamp(10L);
    message.setVersion(MessageMLVersion.V1);

    // Act and Assert
    v2MessageApiClient.validateParams("ABC123", "ABC123", "42", message);
  }

  /**
   * Test {@link BaseMessageApiClient#validateParams(String, String, String, Message)}.
   *
   * <ul>
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseMessageApiClient#validateParams(String, String, String,
   * Message)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void BaseMessageApiClient.validateParams(String, String, String, Message)"})
  public void testValidateParams_thenThrowRemoteApiException() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient =
        new AppAuthenticationProxyApiClient(
            mock(EntitySerializer.class),
            mock(AppAuthenticationProxy.class),
            ServiceName.POD_SESSION_MANAGER);
    V2MessageApiClient v2MessageApiClient =
        new V2MessageApiClient(apiClient, mock(LogMessageSource.class));

    Message message = new Message();
    message.setData("Data");
    message.setFormat(FormatEnum.TEXT);
    message.setMessage("Not all who wander are lost");
    message.setTimestamp(10L);
    message.setVersion(MessageMLVersion.V1);

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    v2MessageApiClient.validateParams(null, "ABC123", "42", message);
  }

  /**
   * Test {@link BaseMessageApiClient#validateParams(String, String, String, Message)}.
   *
   * <ul>
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseMessageApiClient#validateParams(String, String, String,
   * Message)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void BaseMessageApiClient.validateParams(String, String, String, Message)"})
  public void testValidateParams_thenThrowRemoteApiException2() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient =
        new AppAuthenticationProxyApiClient(
            mock(EntitySerializer.class),
            mock(AppAuthenticationProxy.class),
            ServiceName.POD_SESSION_MANAGER);
    V2MessageApiClient v2MessageApiClient =
        new V2MessageApiClient(apiClient, mock(LogMessageSource.class));

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    v2MessageApiClient.validateParams("ABC123", "ABC123", "42", null);
  }

  /**
   * Test {@link BaseMessageApiClient#validateParams(String, String, String, Message)}.
   *
   * <ul>
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseMessageApiClient#validateParams(String, String, String,
   * Message)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void BaseMessageApiClient.validateParams(String, String, String, Message)"})
  public void testValidateParams_thenThrowRemoteApiException3() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient =
        new AppAuthenticationProxyApiClient(
            mock(EntitySerializer.class),
            mock(AppAuthenticationProxy.class),
            ServiceName.POD_SESSION_MANAGER);
    V2MessageApiClient v2MessageApiClient =
        new V2MessageApiClient(apiClient, mock(LogMessageSource.class));

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    v2MessageApiClient.validateParams("ABC123", null, "42", null);
  }

  /**
   * Test {@link BaseMessageApiClient#validateParams(String, String, String, Message)}.
   *
   * <ul>
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseMessageApiClient#validateParams(String, String, String,
   * Message)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void BaseMessageApiClient.validateParams(String, String, String, Message)"})
  public void testValidateParams_thenThrowRemoteApiException4() throws RemoteApiException {
    // Arrange
    AppAuthenticationProxyApiClient apiClient =
        new AppAuthenticationProxyApiClient(
            mock(EntitySerializer.class),
            mock(AppAuthenticationProxy.class),
            ServiceName.POD_SESSION_MANAGER);
    V2MessageApiClient v2MessageApiClient =
        new V2MessageApiClient(apiClient, mock(LogMessageSource.class));

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    v2MessageApiClient.validateParams("ABC123", "ABC123", null, null);
  }
}
