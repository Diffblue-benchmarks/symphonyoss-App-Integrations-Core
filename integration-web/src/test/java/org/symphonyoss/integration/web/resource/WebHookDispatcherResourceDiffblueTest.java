package org.symphonyoss.integration.web.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.servlet.http.HttpServletRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.service.IntegrationBridge;
import org.symphonyoss.integration.service.IntegrationService;

@ContextConfiguration(classes = {WebHookDispatcherResource.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class WebHookDispatcherResourceDiffblueTest {
  @MockBean
  private IntegrationBridge integrationBridge;

  @MockBean(name = "remoteIntegrationService")
  private IntegrationService integrationService;

  @MockBean
  private LogMessageSource logMessageSource;

  @Autowired
  private WebHookDispatcherResource webHookDispatcherResource;

  /**
   * Method under test:
   * {@link WebHookDispatcherResource#handleRemoteApiException(RemoteApiException)}
   */
  @Test
  public void testHandleRemoteApiException() {
    // Arrange and Act
    ResponseEntity<String> actualHandleRemoteApiExceptionResult = webHookDispatcherResource
        .handleRemoteApiException(new RemoteApiException(1, "An error occurred"));

    // Assert
    assertEquals(
        "\n" + "Component: Commons\n" + "Message: An error occurred\n" + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualHandleRemoteApiExceptionResult.getBody());
    assertEquals(1, actualHandleRemoteApiExceptionResult.getStatusCodeValue());
    assertTrue(actualHandleRemoteApiExceptionResult.hasBody());
    assertTrue(actualHandleRemoteApiExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Method under test:
   * {@link WebHookDispatcherResource#handleRemoteApiException(RemoteApiException)}
   */
  @Test
  public void testHandleRemoteApiException2() {
    // Arrange
    RemoteApiException e = mock(RemoteApiException.class);
    when(e.getCode()).thenReturn(1);
    when(e.getMessage()).thenReturn("Not all who wander are lost");

    // Act
    ResponseEntity<String> actualHandleRemoteApiExceptionResult = webHookDispatcherResource.handleRemoteApiException(e);

    // Assert
    verify(e, atLeast(1)).getMessage();
    verify(e).getCode();
    assertEquals("Not all who wander are lost", actualHandleRemoteApiExceptionResult.getBody());
    assertEquals(1, actualHandleRemoteApiExceptionResult.getStatusCodeValue());
    assertTrue(actualHandleRemoteApiExceptionResult.hasBody());
    assertTrue(actualHandleRemoteApiExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Method under test:
   * {@link WebHookDispatcherResource#handleFormRequest(String, String, String, HttpServletRequest)}
   */
  @Test
  public void testHandleFormRequest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/42/42/42");

    // Act
    ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(webHookDispatcherResource)
        .build()
        .perform(requestBuilder);

    // Assert
    actualPerformResult.andExpect(MockMvcResultMatchers.status().isNotFound());
  }

  /**
   * Method under test:
   * {@link WebHookDispatcherResource#handleFormRequest(String, String, HttpServletRequest)}
   */
  @Test
  public void testHandleFormRequest2() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/42/42");

    // Act
    ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(webHookDispatcherResource)
        .build()
        .perform(requestBuilder);

    // Assert
    actualPerformResult.andExpect(MockMvcResultMatchers.status().isNotFound());
  }

  /**
   * Method under test:
   * {@link WebHookDispatcherResource#handleHeadRequest(String, String)}
   */
  @Test
  public void testHandleHeadRequest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.head("/42/42");

    // Act
    ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(webHookDispatcherResource)
        .build()
        .perform(requestBuilder);

    // Assert
    actualPerformResult.andExpect(MockMvcResultMatchers.status().isNotFound());
  }

  /**
   * Method under test:
   * {@link WebHookDispatcherResource#handleHeadRequest(String, String, String)}
   */
  @Test
  public void testHandleHeadRequest2() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.head("/42/42/42");

    // Act
    ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(webHookDispatcherResource)
        .build()
        .perform(requestBuilder);

    // Assert
    actualPerformResult.andExpect(MockMvcResultMatchers.status().isNotFound());
  }

  /**
   * Method under test:
   * {@link WebHookDispatcherResource#handleRequest(String, String, String, String, HttpServletRequest)}
   */
  @Test
  public void testHandleRequest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder contentTypeResult = MockMvcRequestBuilders.post("/42/42/42")
        .contentType(MediaType.APPLICATION_JSON);
    MockHttpServletRequestBuilder requestBuilder = contentTypeResult
        .content((new ObjectMapper()).writeValueAsString("foo"));

    // Act
    ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(webHookDispatcherResource)
        .build()
        .perform(requestBuilder);

    // Assert
    actualPerformResult.andExpect(MockMvcResultMatchers.status().isNotFound());
  }

  /**
   * Method under test:
   * {@link WebHookDispatcherResource#handleRequest(String, String, String, HttpServletRequest)}
   */
  @Test
  public void testHandleRequest2() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder contentTypeResult = MockMvcRequestBuilders.post("/42/42")
        .contentType(MediaType.APPLICATION_JSON);
    MockHttpServletRequestBuilder requestBuilder = contentTypeResult
        .content((new ObjectMapper()).writeValueAsString("foo"));

    // Act
    ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(webHookDispatcherResource)
        .build()
        .perform(requestBuilder);

    // Assert
    actualPerformResult.andExpect(MockMvcResultMatchers.status().isNotFound());
  }
}
