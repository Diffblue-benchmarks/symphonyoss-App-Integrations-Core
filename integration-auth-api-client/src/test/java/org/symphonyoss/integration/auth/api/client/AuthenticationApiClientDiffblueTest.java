package org.symphonyoss.integration.auth.api.client;

import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Map;
import org.junit.Test;
import org.mockito.Mockito;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.auth.api.model.Token;
import org.symphonyoss.integration.exception.RemoteApiException;

public class AuthenticationApiClientDiffblueTest {
  /**
   * Method under test: {@link AuthenticationApiClient#authenticate(String)}
   */
  @Test
  public void testAuthenticate() throws RemoteApiException {
    // Arrange
    Token token = new Token();
    token.setName("/v1/authenticate");
    token.setToken("ABC123");
    HttpApiClient apiClient = mock(HttpApiClient.class);
    when(apiClient.doPost(Mockito.<String>any(), Mockito.<Map<String, String>>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenReturn(token);

    // Act
    Token actualAuthenticateResult = (new AuthenticationApiClient(apiClient)).authenticate("42");

    // Assert
    verify(apiClient).doPost(Mockito.<String>any(), isA(Map.class), isA(Map.class), Mockito.<Object>any(),
        isA(Class.class));
    assertSame(token, actualAuthenticateResult);
  }
}
