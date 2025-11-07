package org.symphonyoss.integration.core.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.entity.model.User;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.pod.api.client.PodHttpApiClient;
import org.symphonyoss.integration.pod.api.client.SymphonyHttpApiClient;
import org.symphonyoss.integration.service.IntegrationBridge;

@ContextConfiguration(classes = {UserServiceImpl.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplDiffblueTest {
  @MockBean
  private AuthenticationProxy authenticationProxy;

  @MockBean
  private IntegrationBridge integrationBridge;

  @MockBean
  private LogMessageSource logMessageSource;

  @MockBean
  private PodHttpApiClient podHttpApiClient;

  @MockBean
  private SymphonyHttpApiClient symphonyHttpApiClient;

  @Autowired
  private UserServiceImpl userServiceImpl;

  /**
   * Method under test: {@link UserServiceImpl#getUserByUserId(String, Long)}
   */
  @Test
  public void testGetUserByUserId() throws RemoteApiException {
    // Arrange
    when(authenticationProxy.getSessionToken(Mockito.<String>any())).thenReturn("ABC123");
    when(podHttpApiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Class<Object>>any()))
            .thenThrow(new RemoteApiException(1, "An error occurred"));

    // Act
    User actualUserByUserId = userServiceImpl.getUserByUserId("Integration User", 1L);

    // Assert
    verify(podHttpApiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(authenticationProxy).getSessionToken(Mockito.<String>any());
    assertNull(actualUserByUserId);
  }

  /**
   * Method under test: {@link UserServiceImpl#getUserByUserId(String, Long)}
   */
  @Test
  public void testGetUserByUserId2() {
    // Arrange
    when(authenticationProxy.getSessionToken(Mockito.<String>any())).thenReturn(null);

    // Act
    User actualUserByUserId = userServiceImpl.getUserByUserId("Integration User", 1L);

    // Assert
    verify(authenticationProxy).getSessionToken(Mockito.<String>any());
    assertNull(actualUserByUserId);
  }

  /**
   * Method under test: {@link UserServiceImpl#getUserByUserId(String, Long)}
   */
  @Test
  public void testGetUserByUserId3() {
    // Arrange, Act and Assert
    assertNull(userServiceImpl.getUserByUserId("Integration User", null));
  }

  /**
   * Method under test: {@link UserServiceImpl#getUserByUserName(String, String)}
   */
  @Test
  public void testGetUserByUserName() throws RemoteApiException {
    // Arrange
    when(authenticationProxy.getSessionToken(Mockito.<String>any())).thenReturn("ABC123");
    when(podHttpApiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Class<Object>>any()))
            .thenThrow(new RemoteApiException(1, "An error occurred"));

    // Act
    User actualUserByUserName = userServiceImpl.getUserByUserName("Integration User", "janedoe");

    // Assert
    verify(podHttpApiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(authenticationProxy).getSessionToken(Mockito.<String>any());
    assertEquals("janedoe", actualUserByUserName.getUsername());
    assertNull(actualUserByUserName.getId());
    assertNull(actualUserByUserName.getDisplayName());
    assertNull(actualUserByUserName.getEmailAddress());
  }

  /**
   * Method under test: {@link UserServiceImpl#getUserByUserName(String, String)}
   */
  @Test
  public void testGetUserByUserName2() {
    // Arrange, Act and Assert
    assertNull(userServiceImpl.getUserByUserName("Integration User", ""));
  }

  /**
   * Method under test: {@link UserServiceImpl#getUserByEmail(String, String)}
   */
  @Test
  public void testGetUserByEmail() throws RemoteApiException {
    // Arrange
    when(authenticationProxy.getSessionToken(Mockito.<String>any())).thenReturn("ABC123");
    when(podHttpApiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Class<Object>>any()))
            .thenThrow(new RemoteApiException(1, "An error occurred"));

    // Act
    User actualUserByEmail = userServiceImpl.getUserByEmail("Integration User", "jane.doe@example.org");

    // Assert
    verify(podHttpApiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    verify(authenticationProxy).getSessionToken(Mockito.<String>any());
    assertEquals("jane.doe@example.org", actualUserByEmail.getEmailAddress());
    assertNull(actualUserByEmail.getId());
    assertNull(actualUserByEmail.getDisplayName());
    assertNull(actualUserByEmail.getUsername());
  }

  /**
   * Method under test: {@link UserServiceImpl#getUserByEmail(String, String)}
   */
  @Test
  public void testGetUserByEmail2() {
    // Arrange, Act and Assert
    assertNull(userServiceImpl.getUserByEmail("Integration User", ""));
  }
}
