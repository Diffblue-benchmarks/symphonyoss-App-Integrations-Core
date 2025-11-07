package org.symphonyoss.integration.agent.api.client;

import static org.mockito.Mockito.mock;
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
import org.symphonyoss.integration.model.message.MessageMLVersion;

public class BaseMessageApiClientDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test:
   * {@link BaseMessageApiClient#validateParams(String, String, String, Message)}
   */
  @Test
  public void testValidateParams() throws RemoteApiException {
    // Arrange
    V2MessageApiClient v2MessageApiClient = new V2MessageApiClient(
        new AppAuthenticationProxyApiClient(mock(EntitySerializer.class), mock(AppAuthenticationProxy.class),
            ServiceName.POD_SESSION_MANAGER),
        mock(LogMessageSource.class));

    Message message = new Message();
    message.setData("Data");
    message.setFormat(Message.FormatEnum.TEXT);
    message.setMessage("Not all who wander are lost");
    message.setTimestamp(10L);
    message.setVersion(MessageMLVersion.V1);

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    v2MessageApiClient.validateParams(null, "ABC123", "42", message);
  }
}
