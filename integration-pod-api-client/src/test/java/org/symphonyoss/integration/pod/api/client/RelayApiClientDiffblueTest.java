package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.isA;
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
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RelayApiClient#RelayApiClient(HttpApiClient, LogMessageSource)}
   *   <li>{@link RelayApiClient#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RelayApiClient.<init>(HttpApiClient, LogMessageSource)",
    "HttpApiClient RelayApiClient.getApiClient()"
  })
  public void testGettersAndSetters() {
    // Arrange
    IntegrationHttpApiClient apiClient = new IntegrationHttpApiClient();
    LogMessageSource logMessage = new LogMessageSource();

    // Act
    RelayApiClient actualRelayApiClient = new RelayApiClient(apiClient, logMessage);
    HttpApiClient actualApiClient = actualRelayApiClient.getApiClient();

    // Assert
    assertTrue(actualApiClient instanceof IntegrationHttpApiClient);
    assertSame(logMessage, actualRelayApiClient.getLogMessage());
    assertSame(apiClient, actualApiClient);
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
  public void testGetUserAccountKeyManagerData() throws RemoteApiException {
    // Arrange
    when(httpApiClient.doGet(
            Mockito.<String>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Map<String, String>>any(),
            Mockito.<Class<UserKeyManagerData>>any()))
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
            Mockito.<Class<UserKeyManagerData>>any()))
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
            Mockito.<Class<UserKeyManagerData>>any()))
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
   *   <li>When {@code ABC123}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserKeyManagerData RelayApiClient.getUserAccountKeyManagerData(String, String)"
  })
  public void testGetUserAccountKeyManagerData_givenHttpApiClient_whenAbc123_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(relayApiClient.getUserAccountKeyManagerData("ABC123", "Km Session"));
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
            Mockito.<Class<UserKeyManagerData>>any()))
        .thenThrow(new RemoteApiException(403, "An error occurred"));

    // Act and Assert
    thrown.expect(ForbiddenAuthException.class);
    relayApiClient.getUserAccountKeyManagerData("ABC123", "Km Session");
    verify(httpApiClient)
        .doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
  }

  /**
   * Test {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link UnexpectedAuthException}.
   * </ul>
   *
   * <p>Method under test: {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserKeyManagerData RelayApiClient.getUserAccountKeyManagerData(String, String)"
  })
  public void testGetUserAccountKeyManagerData_whenNull_thenThrowUnexpectedAuthException() {
    // Arrange, Act and Assert
    thrown.expect(UnexpectedAuthException.class);
    relayApiClient.getUserAccountKeyManagerData(null, "Km Session");
  }

  /**
   * Test {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link UnexpectedAuthException}.
   * </ul>
   *
   * <p>Method under test: {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UserKeyManagerData RelayApiClient.getUserAccountKeyManagerData(String, String)"
  })
  public void testGetUserAccountKeyManagerData_whenNull_thenThrowUnexpectedAuthException2() {
    // Arrange, Act and Assert
    thrown.expect(UnexpectedAuthException.class);
    relayApiClient.getUserAccountKeyManagerData("ABC123", null);
  }
}
