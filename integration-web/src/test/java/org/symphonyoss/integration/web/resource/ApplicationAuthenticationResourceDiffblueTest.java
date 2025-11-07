package org.symphonyoss.integration.web.resource;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.symphonyoss.integration.authentication.api.jwt.JwtAuthentication;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.service.IntegrationBridge;

@ContextConfiguration(classes = {ApplicationAuthenticationResource.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationAuthenticationResourceDiffblueTest {
  @Autowired
  private ApplicationAuthenticationResource applicationAuthenticationResource;

  @MockBean
  private IntegrationBridge integrationBridge;

  @MockBean
  private JwtAuthentication jwtAuthentication;

  @MockBean
  private LogMessageSource logMessageSource;

  /**
   * Method under test:
   * {@link ApplicationAuthenticationResource#authenticate(String, String)}
   */
  @Test
  public void testAuthenticate() throws Exception {
    // Arrange
    when(logMessageSource.getMessage(Mockito.<String>any(), (String[]) any()))
        .thenReturn("Not all who wander are lost");
    MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/v1/application/42/jwt/authenticate");
    postResult.characterEncoding("https://example.org/example");
    MockHttpServletRequestBuilder contentTypeResult = postResult.contentType(MediaType.APPLICATION_JSON);
    MockHttpServletRequestBuilder requestBuilder = contentTypeResult
        .content((new ObjectMapper()).writeValueAsString("foo"));

    // Act
    ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(applicationAuthenticationResource)
        .build()
        .perform(requestBuilder);

    // Assert
    actualPerformResult.andExpect(MockMvcResultMatchers.status().is(415));
  }

  /**
   * Method under test:
   * {@link ApplicationAuthenticationResource#validate(String, String)}
   */
  @Test
  public void testValidate() throws Exception {
    // Arrange
    when(logMessageSource.getMessage(Mockito.<String>any(), (String[]) any()))
        .thenReturn("Not all who wander are lost");
    MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/v1/application/42/jwt/validate");
    postResult.characterEncoding("https://example.org/example");
    MockHttpServletRequestBuilder contentTypeResult = postResult.contentType(MediaType.APPLICATION_JSON);
    MockHttpServletRequestBuilder requestBuilder = contentTypeResult
        .content((new ObjectMapper()).writeValueAsString("foo"));

    // Act
    ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(applicationAuthenticationResource)
        .build()
        .perform(requestBuilder);

    // Assert
    actualPerformResult.andExpect(MockMvcResultMatchers.status().is(415));
  }

  /**
   * Method under test:
   * {@link ApplicationAuthenticationResource#validateTokens(String, String)}
   */
  @Test
  public void testValidateTokens() throws Exception {
    // Arrange
    when(logMessageSource.getMessage(Mockito.<String>any(), (String[]) any()))
        .thenReturn("Not all who wander are lost");
    MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/v1/application/42/jwt/tokens/validate");
    postResult.characterEncoding("https://example.org/example");
    MockHttpServletRequestBuilder contentTypeResult = postResult.contentType(MediaType.APPLICATION_JSON);
    MockHttpServletRequestBuilder requestBuilder = contentTypeResult
        .content((new ObjectMapper()).writeValueAsString("foo"));

    // Act
    ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(applicationAuthenticationResource)
        .build()
        .perform(requestBuilder);

    // Assert
    actualPerformResult.andExpect(MockMvcResultMatchers.status().is(415));
  }
}
