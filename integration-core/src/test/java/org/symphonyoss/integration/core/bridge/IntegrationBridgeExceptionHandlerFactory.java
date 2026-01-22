package org.symphonyoss.integration.core.bridge;

import com.diffblue.cover.annotations.InterestingTestFactory;
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.pod.api.client.PodHttpApiClient;
import org.symphonyoss.integration.service.IntegrationService;
import org.symphonyoss.integration.service.StreamService;

import java.lang.reflect.Field;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Factory class for creating valid IntegrationBridgeExceptionHandler instances for testing.
 */
public class IntegrationBridgeExceptionHandlerFactory {

  /**
   * Creates a valid IntegrationBridgeExceptionHandler instance with initialized dependencies.
   *
   * @return a valid IntegrationBridgeExceptionHandler instance
   */
  @InterestingTestFactory
  public static IntegrationBridgeExceptionHandler createIntegrationBridgeExceptionHandler() {
    IntegrationBridgeExceptionHandler handler = new IntegrationBridgeExceptionHandler();

    try {
      // Initialize authenticationProxy
      AuthenticationProxy authProxy = mock(AuthenticationProxy.class);
      Field authField = IntegrationBridgeExceptionHandler.class.getDeclaredField("authenticationProxy");
      authField.setAccessible(true);
      authField.set(handler, authProxy);

      // Initialize integrationService
      IntegrationService integrationService = mock(IntegrationService.class);
      Field integrationServiceField = IntegrationBridgeExceptionHandler.class.getDeclaredField("integrationService");
      integrationServiceField.setAccessible(true);
      integrationServiceField.set(handler, integrationService);

      // Initialize streamService
      StreamService streamService = mock(StreamService.class);
      Field streamServiceField = IntegrationBridgeExceptionHandler.class.getDeclaredField("streamService");
      streamServiceField.setAccessible(true);
      streamServiceField.set(handler, streamService);

      // Initialize podApiClient
      PodHttpApiClient podApiClient = mock(PodHttpApiClient.class);
      Field podApiClientField = IntegrationBridgeExceptionHandler.class.getDeclaredField("podApiClient");
      podApiClientField.setAccessible(true);
      podApiClientField.set(handler, podApiClient);

      // Initialize logMessage with a mock that returns non-null values
      LogMessageSource logMessage = mock(LogMessageSource.class);
      when(logMessage.getMessage(anyString())).thenReturn("Test message");
      when(logMessage.getMessage(anyString(), anyString())).thenReturn("Test message");
      when(logMessage.getMessage(anyString(), anyString(), anyString())).thenReturn("Test message");
      Field logMessageField = IntegrationBridgeExceptionHandler.class.getDeclaredField("logMessage");
      logMessageField.setAccessible(true);
      logMessageField.set(handler, logMessage);

      // Call init() to initialize usersApi
      handler.init();

    } catch (NoSuchFieldException | IllegalAccessException e) {
      throw new RuntimeException("Failed to initialize IntegrationBridgeExceptionHandler", e);
    }

    return handler;
  }
}
