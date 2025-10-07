package org.symphonyoss.integration.agent.api.client;

import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import org.symphonyoss.integration.api.client.EntitySerializer;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.message.Message;
import org.symphonyoss.integration.model.message.Message.FormatEnum;
import org.symphonyoss.integration.model.message.MessageMLVersion;

public class V4MessageApiClientDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link V4MessageApiClient#postMessage(String, String, String, Message)}.
   *
   * <ul>
   *   <li>Given {@link Message} (default constructor) Data is {@code /v4/stream/}.
   *   <li>Then return {@link Message} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V4MessageApiClient#postMessage(String, String, String, Message)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Message V4MessageApiClient.postMessage(String, String, String, Message)"})
  public void testPostMessage_givenMessageDataIsV4Stream_thenReturnMessage()
      throws RemoteApiException {
    // Arrange
    Message message = new Message();
    message.setData("/v4/stream/");
    message.setFormat(FormatEnum.TEXT);
    message.setMessage("Not all who wander are lost");
    message.setTimestamp(10L);
    message.setVersion(MessageMLVersion.V1);

    HttpApiClient apiClient = mock(HttpApiClient.class);
    when(apiClient.doPost(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Object>any(),
            Mockito.<Class<Object>>any()))
        .thenReturn(message);
    when(apiClient.escapeString(Mockito.<String>any())).thenReturn("https://example.org/example");
    doNothing().when(apiClient).setEntitySerializer(Mockito.<EntitySerializer>any());
    V4MessageApiClient v4MessageApiClient =
        new V4MessageApiClient(apiClient, new LogMessageSource());

    Message message2 = new Message();
    message2.setData("Data");
    message2.setFormat(FormatEnum.TEXT);
    message2.setMessage("Not all who wander are lost");
    message2.setTimestamp(10L);
    message2.setVersion(MessageMLVersion.V1);

    // Act
    Message actualPostMessageResult =
        v4MessageApiClient.postMessage("ABC123", "ABC123", "42", message2);

    // Assert
    verify(apiClient)
        .doPost(
            Mockito.<String>any(),
            isA(Map.class),
            isA(Map.class),
            isA(Object.class),
            isA(Class.class));
    verify(apiClient).escapeString(Mockito.<String>any());
    verify(apiClient).setEntitySerializer(isA(EntitySerializer.class));
    assertSame(message, actualPostMessageResult);
  }

  /**
   * Test {@link V4MessageApiClient#postMessage(String, String, String, Message)}.
   *
   * <ul>
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link V4MessageApiClient#postMessage(String, String, String, Message)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Message V4MessageApiClient.postMessage(String, String, String, Message)"})
  public void testPostMessage_thenThrowRemoteApiException() throws RemoteApiException {
    // Arrange
    HttpApiClient apiClient = mock(HttpApiClient.class);
    when(apiClient.doPost(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Object>any(),
            Mockito.<Class<Object>>any()))
        .thenThrow(new RemoteApiException(1, "An error occurred"));
    when(apiClient.escapeString(Mockito.<String>any())).thenReturn("https://example.org/example");
    doNothing().when(apiClient).setEntitySerializer(Mockito.<EntitySerializer>any());
    V4MessageApiClient v4MessageApiClient =
        new V4MessageApiClient(apiClient, new LogMessageSource());

    Message message = new Message();
    message.setData("");
    message.setFormat(FormatEnum.TEXT);
    message.setMessage("Not all who wander are lost");
    message.setTimestamp(10L);
    message.setVersion(MessageMLVersion.V1);

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    v4MessageApiClient.postMessage("ABC123", "ABC123", "42", message);
    verify(apiClient)
        .doPost(
            Mockito.<String>any(),
            isA(Map.class),
            isA(Map.class),
            isA(Object.class),
            isA(Class.class));
    verify(apiClient).escapeString(Mockito.<String>any());
    verify(apiClient).setEntitySerializer(isA(EntitySerializer.class));
  }

  /**
   * Test {@link V4MessageApiClient#postMessage(String, String, String, Message)}.
   *
   * <ul>
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link V4MessageApiClient#postMessage(String, String, String, Message)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Message V4MessageApiClient.postMessage(String, String, String, Message)"})
  public void testPostMessage_thenThrowRemoteApiException2() throws RemoteApiException {
    // Arrange
    HttpApiClient apiClient = mock(HttpApiClient.class);
    when(apiClient.doPost(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Object>any(),
            Mockito.<Class<Object>>any()))
        .thenThrow(new RemoteApiException(1, "An error occurred"));
    when(apiClient.escapeString(Mockito.<String>any())).thenReturn("https://example.org/example");
    doNothing().when(apiClient).setEntitySerializer(Mockito.<EntitySerializer>any());
    V4MessageApiClient v4MessageApiClient =
        new V4MessageApiClient(apiClient, new LogMessageSource());

    Message message = new Message();
    message.setData(null);
    message.setFormat(FormatEnum.TEXT);
    message.setMessage("Not all who wander are lost");
    message.setTimestamp(10L);
    message.setVersion(MessageMLVersion.V1);

    // Act and Assert
    thrown.expect(RemoteApiException.class);
    v4MessageApiClient.postMessage("ABC123", "ABC123", "42", message);
    verify(apiClient)
        .doPost(
            Mockito.<String>any(),
            isA(Map.class),
            isA(Map.class),
            isA(Object.class),
            isA(Class.class));
    verify(apiClient).escapeString(Mockito.<String>any());
    verify(apiClient).setEntitySerializer(isA(EntitySerializer.class));
  }
}
