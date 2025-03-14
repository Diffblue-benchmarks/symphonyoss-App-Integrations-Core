package org.symphonyoss.integration.auth.api.client;

import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.Test;
import org.mockito.Mockito;
import org.symphonyoss.integration.api.client.AppAuthenticationProxyApiClient;
import org.symphonyoss.integration.auth.api.model.Token;
import org.symphonyoss.integration.exception.RemoteApiException;

public class AuthenticationApiClientDiffblueTest {
  /**
   * Test {@link AuthenticationApiClient#authenticate(String)}.
   * <ul>
   *   <li>Given {@link Token} (default constructor) Name is {@code /v1/authenticate}.</li>
   *   <li>Then return {@link Token} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticationApiClient#authenticate(String)}
   */
  @Test
  @MethodsUnderTest({"Token AuthenticationApiClient.authenticate(String)"})
  public void testAuthenticate_givenTokenNameIsV1Authenticate_thenReturnToken() throws RemoteApiException {
    // Arrange
    Token token = new Token();
    token.setName("/v1/authenticate");
    token.setToken("ABC123");
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
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
