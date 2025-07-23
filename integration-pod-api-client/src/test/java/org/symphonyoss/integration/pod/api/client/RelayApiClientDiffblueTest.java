package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
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
import org.symphonyoss.integration.api.client.AppAuthenticationProxyApiClient;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.exception.authentication.ForbiddenAuthException;
import org.symphonyoss.integration.exception.authentication.UnauthorizedUserException;
import org.symphonyoss.integration.exception.authentication.UnexpectedAuthException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.UserKeyManagerData;

@ContextConfiguration(classes = {RelayApiClient.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class RelayApiClientDiffblueTest {
  @MockBean private HttpApiClient httpApiClient;

  @MockBean private LogMessageSource logMessageSource;

  @Autowired private RelayApiClient relayApiClient;

  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}.
   *
   * <p>Method under test: {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserKeyManagerData RelayApiClient.getUserAccountKeyManagerData(String, String)"
  })
  public void testGetUserAccountKeyManagerData() throws RemoteApiException {
    // Arrange
    when(httpApiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<Object>>any()))
        .thenThrow(new UnauthorizedUserException("An error occurred"));

    // Act and Assert
    thrown.expect(UnauthorizedUserException.class);
    relayApiClient.getUserAccountKeyManagerData("ABC123", "Km Session");
    verify(httpApiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }

  /**
   * Test {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}.
   *
   * <p>Method under test: {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserKeyManagerData RelayApiClient.getUserAccountKeyManagerData(String, String)"
  })
  public void testGetUserAccountKeyManagerData2() throws RemoteApiException {
    // Arrange
    when(httpApiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<Object>>any()))
        .thenThrow(new RemoteApiException(4, "An error occurred"));

    // Act and Assert
    thrown.expect(UnexpectedAuthException.class);
    relayApiClient.getUserAccountKeyManagerData("ABC123", "Km Session");
    verify(httpApiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }

  /**
   * Test {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}.
   *
   * <p>Method under test: {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserKeyManagerData RelayApiClient.getUserAccountKeyManagerData(String, String)"
  })
  public void testGetUserAccountKeyManagerData3() throws RemoteApiException {
    // Arrange
    when(httpApiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<Object>>any()))
        .thenThrow(new RemoteApiException(401, "An error occurred"));

    // Act and Assert
    thrown.expect(UnauthorizedUserException.class);
    relayApiClient.getUserAccountKeyManagerData("ABC123", "Km Session");
    verify(httpApiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }

  /**
   * Test {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}.
   *
   * <ul>
   *   <li>Given {@link HttpApiClient}.
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserKeyManagerData RelayApiClient.getUserAccountKeyManagerData(String, String)"
  })
  public void testGetUserAccountKeyManagerData_givenHttpApiClient_whenNull() {
    // Arrange, Act and Assert
    thrown.expect(UnexpectedAuthException.class);
    relayApiClient.getUserAccountKeyManagerData(null, "Km Session");
  }

  /**
   * Test {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}.
   *
   * <ul>
   *   <li>Given {@link HttpApiClient}.
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserKeyManagerData RelayApiClient.getUserAccountKeyManagerData(String, String)"
  })
  public void testGetUserAccountKeyManagerData_givenHttpApiClient_whenNull2() {
    // Arrange, Act and Assert
    thrown.expect(UnexpectedAuthException.class);
    relayApiClient.getUserAccountKeyManagerData("ABC123", null);
  }

  /**
   * Test {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}.
   *
   * <ul>
   *   <li>Then return {@link UserKeyManagerData} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserKeyManagerData RelayApiClient.getUserAccountKeyManagerData(String, String)"
  })
  public void testGetUserAccountKeyManagerData_thenReturnUserKeyManagerData()
      throws RemoteApiException {
    // Arrange
    UserKeyManagerData userKeyManagerData = new UserKeyManagerData();
    userKeyManagerData.setCertificate("/relay/keys/me");
    userKeyManagerData.setPrivateKey("/relay/keys/me");
    userKeyManagerData.setPrivateKeySignature("/relay/keys/me");
    userKeyManagerData.setPublicKey("/relay/keys/me");
    userKeyManagerData.setPublicKeySignature("/relay/keys/me");
    userKeyManagerData.setStatus("/relay/keys/me");
    userKeyManagerData.setUserId(1L);
    AppAuthenticationProxyApiClient apiClient = mock(AppAuthenticationProxyApiClient.class);
    when(apiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<Object>>any()))
        .thenReturn(userKeyManagerData);

    // Act
    UserKeyManagerData actualUserAccountKeyManagerData =
        new RelayApiClient(apiClient, new LogMessageSource())
            .getUserAccountKeyManagerData("ABC123", "Km Session");

    // Assert
    verify(apiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    assertSame(userKeyManagerData, actualUserAccountKeyManagerData);
  }

  /**
   * Test {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link ForbiddenAuthException}.
   * </ul>
   *
   * <p>Method under test: {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserKeyManagerData RelayApiClient.getUserAccountKeyManagerData(String, String)"
  })
  public void testGetUserAccountKeyManagerData_thenThrowForbiddenAuthException()
      throws RemoteApiException {
    // Arrange
    when(httpApiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<Object>>any()))
        .thenThrow(new RemoteApiException(403, "An error occurred"));

    // Act and Assert
    thrown.expect(ForbiddenAuthException.class);
    relayApiClient.getUserAccountKeyManagerData("ABC123", "Km Session");
    verify(httpApiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }
}
