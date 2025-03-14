package org.symphonyoss.integration.agent.api.client;

import static org.mockito.Mockito.mock;
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
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link BaseMessageApiClient#validateParams(String, String, String, Message)}.
   * <ul>
   *   <li>Then throw {@link RemoteApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BaseMessageApiClient#validateParams(String, String, String, Message)}
   */
  @Test
  @MethodsUnderTest({"void BaseMessageApiClient.validateParams(String, String, String, Message)"})
  public void testValidateParams_thenThrowRemoteApiException() throws RemoteApiException {
    // Arrange
    V2MessageApiClient v2MessageApiClient = new V2MessageApiClient(
        new AppAuthenticationProxyApiClient(mock(EntitySerializer.class), mock(AppAuthenticationProxy.class),
            ServiceName.POD_SESSION_MANAGER),
        mock(LogMessageSource.class));

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
}
