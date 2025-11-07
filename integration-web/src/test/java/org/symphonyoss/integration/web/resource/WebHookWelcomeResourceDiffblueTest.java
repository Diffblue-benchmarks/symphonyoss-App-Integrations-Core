package org.symphonyoss.integration.web.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
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
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.service.IntegrationBridge;
import org.symphonyoss.integration.service.IntegrationService;

@ContextConfiguration(classes = {WebHookWelcomeResource.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class WebHookWelcomeResourceDiffblueTest {
  @MockBean
  private IntegrationBridge integrationBridge;

  @MockBean(name = "remoteIntegrationService")
  private IntegrationService integrationService;

  @MockBean
  private LogMessageSource logMessageSource;

  @Autowired
  private WebHookWelcomeResource webHookWelcomeResource;

  /**
   * Method under test:
   * {@link WebHookWelcomeResource#handleWelcomeRequest(String, String, String)}
   */
  @Test
  public void testHandleWelcomeRequest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder contentTypeResult = MockMvcRequestBuilders.post("/42/42/welcome")
        .contentType(MediaType.APPLICATION_JSON);
    MockHttpServletRequestBuilder requestBuilder = contentTypeResult
        .content((new ObjectMapper()).writeValueAsString("foo"));

    // Act
    ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(webHookWelcomeResource)
        .build()
        .perform(requestBuilder);

    // Assert
    actualPerformResult.andExpect(MockMvcResultMatchers.status().isNotFound());
  }

  /**
   * Method under test:
   * {@link WebHookWelcomeResource#handleWelcomeRequest(String, String, String, String)}
   */
  @Test
  public void testHandleWelcomeRequest2() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder contentTypeResult = MockMvcRequestBuilders.post("/42/42/42/welcome")
        .contentType(MediaType.APPLICATION_JSON);
    MockHttpServletRequestBuilder requestBuilder = contentTypeResult
        .content((new ObjectMapper()).writeValueAsString("foo"));

    // Act
    ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(webHookWelcomeResource)
        .build()
        .perform(requestBuilder);

    // Assert
    actualPerformResult.andExpect(MockMvcResultMatchers.status().isNotFound());
  }
}
