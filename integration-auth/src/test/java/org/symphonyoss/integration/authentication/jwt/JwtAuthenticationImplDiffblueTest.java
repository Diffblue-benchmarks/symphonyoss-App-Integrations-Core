package org.symphonyoss.integration.authentication.jwt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.symphonyoss.integration.authentication.api.model.JwtPayload;

public class JwtAuthenticationImplDiffblueTest {
  /**
   * Method under test: {@link JwtAuthenticationImpl#getJwtToken(String, String)}
   */
  @Test
  public void testGetJwtToken() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange, Act and Assert
    assertNull((new JwtAuthenticationImpl()).getJwtToken("42", "JaneDoe"));
    assertNull((new JwtAuthenticationImpl()).getJwtToken("42", ""));
  }

  /**
   * Method under test: {@link JwtAuthenticationImpl#getUserId(JwtPayload)}
   */
  @Test
  public void testGetUserId() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    JwtAuthenticationImpl jwtAuthenticationImpl = new JwtAuthenticationImpl();

    JwtPayload token = new JwtPayload();
    token.setUserId("42");

    // Act and Assert
    assertEquals(42L, jwtAuthenticationImpl.getUserId(token).longValue());
  }

  /**
   * Method under test: {@link JwtAuthenticationImpl#getUserId(JwtPayload)}
   */
  @Test
  public void testGetUserId2() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    JwtAuthenticationImpl jwtAuthenticationImpl = new JwtAuthenticationImpl();
    JwtPayload token = mock(JwtPayload.class);
    when(token.getUserId()).thenReturn("42");

    // Act
    Long actualUserId = jwtAuthenticationImpl.getUserId(token);

    // Assert
    verify(token).getUserId();
    assertEquals(42L, actualUserId.longValue());
  }

  /**
   * Method under test: {@link JwtAuthenticationImpl#checkPodInfo(String, String)}
   */
  @Test
  public void testCheckPodInfo() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange, Act and Assert
    assertFalse((new JwtAuthenticationImpl()).checkPodInfo("42", null));
    assertFalse((new JwtAuthenticationImpl()).checkPodInfo("42", ""));
  }
}
