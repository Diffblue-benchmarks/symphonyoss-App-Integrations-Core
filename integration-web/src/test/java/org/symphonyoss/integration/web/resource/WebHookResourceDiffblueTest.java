package org.symphonyoss.integration.web.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockMultipartHttpServletRequest;
import org.symphonyoss.integration.exception.authentication.ConnectivityException;
import org.symphonyoss.integration.webhook.WebHookPayload;
import org.symphonyoss.integration.webhook.exception.WebHookUnprocessableEntityException;

public class WebHookResourceDiffblueTest {
  /**
   * Method under test:
   * {@link WebHookResource#retrieveWebHookPayload(HttpServletRequest, String)}
   */
  @Test
  public void testRetrieveWebHookPayload() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    WebHookDispatcherResource webHookDispatcherResource = new WebHookDispatcherResource();

    // Act
    WebHookPayload actualRetrieveWebHookPayloadResult = webHookDispatcherResource
        .retrieveWebHookPayload(new MockHttpServletRequest(), "Not all who wander are lost");

    // Assert
    MediaType contentType = actualRetrieveWebHookPayloadResult.getContentType();
    assertEquals("*", contentType.getSubtype());
    assertEquals("*", contentType.getType());
    assertEquals("Not all who wander are lost", actualRetrieveWebHookPayloadResult.getBody());
    assertTrue(contentType.getParameters().isEmpty());
    assertTrue(actualRetrieveWebHookPayloadResult.getHeaders().isEmpty());
    assertTrue(actualRetrieveWebHookPayloadResult.getParameters().isEmpty());
    assertTrue(contentType.isWildcardSubtype());
    assertTrue(contentType.isWildcardType());
  }

  /**
   * Method under test:
   * {@link WebHookResource#retrieveWebHookPayload(HttpServletRequest, String)}
   */
  @Test
  public void testRetrieveWebHookPayload2() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    WebHookDispatcherResource webHookDispatcherResource = new WebHookDispatcherResource();

    // Act
    WebHookPayload actualRetrieveWebHookPayloadResult = webHookDispatcherResource
        .retrieveWebHookPayload(new MockMultipartHttpServletRequest(), "Not all who wander are lost");

    // Assert
    MediaType contentType = actualRetrieveWebHookPayloadResult.getContentType();
    assertEquals("*", contentType.getSubtype());
    assertEquals("*", contentType.getType());
    assertEquals("Not all who wander are lost", actualRetrieveWebHookPayloadResult.getBody());
    Map<String, String> headers = actualRetrieveWebHookPayloadResult.getHeaders();
    assertEquals(1, headers.size());
    assertEquals("multipart/form-data", headers.get("Content-Type"));
    assertTrue(contentType.getParameters().isEmpty());
    assertTrue(actualRetrieveWebHookPayloadResult.getParameters().isEmpty());
    assertTrue(contentType.isWildcardSubtype());
    assertTrue(contentType.isWildcardType());
  }

  /**
   * Method under test:
   * {@link WebHookResource#retrieveWebHookPayload(HttpServletRequest, String)}
   */
  @Test
  public void testRetrieveWebHookPayload3() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    WebHookDispatcherResource webHookDispatcherResource = new WebHookDispatcherResource();

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("Name", "42");

    // Act
    WebHookPayload actualRetrieveWebHookPayloadResult = webHookDispatcherResource.retrieveWebHookPayload(request,
        "Not all who wander are lost");

    // Assert
    MediaType contentType = actualRetrieveWebHookPayloadResult.getContentType();
    assertEquals("*", contentType.getSubtype());
    assertEquals("*", contentType.getType());
    Map<String, String> parameters = actualRetrieveWebHookPayloadResult.getParameters();
    assertEquals(1, parameters.size());
    assertEquals("42", parameters.get("Name"));
    assertEquals("Not all who wander are lost", actualRetrieveWebHookPayloadResult.getBody());
    assertTrue(contentType.getParameters().isEmpty());
    assertTrue(actualRetrieveWebHookPayloadResult.getHeaders().isEmpty());
    assertTrue(contentType.isWildcardSubtype());
    assertTrue(contentType.isWildcardType());
  }

  /**
   * Method under test: {@link WebHookResource#handleBadRequest(Exception)}
   */
  @Test
  public void testHandleBadRequest() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    WebHookDispatcherResource webHookDispatcherResource = new WebHookDispatcherResource();

    // Act
    ResponseEntity<String> actualHandleBadRequestResult = webHookDispatcherResource
        .handleBadRequest(new Exception("foo"));

    // Assert
    assertEquals("foo", actualHandleBadRequestResult.getBody());
    assertEquals(400, actualHandleBadRequestResult.getStatusCodeValue());
    assertEquals(HttpStatus.BAD_REQUEST, actualHandleBadRequestResult.getStatusCode());
    assertTrue(actualHandleBadRequestResult.hasBody());
    assertTrue(actualHandleBadRequestResult.getHeaders().isEmpty());
  }

  /**
   * Method under test: {@link WebHookResource#handleNotFound(Exception)}
   */
  @Test
  public void testHandleNotFound() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    WebHookDispatcherResource webHookDispatcherResource = new WebHookDispatcherResource();

    // Act
    ResponseEntity<String> actualHandleNotFoundResult = webHookDispatcherResource.handleNotFound(new Exception("foo"));

    // Assert
    assertNull(actualHandleNotFoundResult.getBody());
    assertEquals(404, actualHandleNotFoundResult.getStatusCodeValue());
    assertEquals(HttpStatus.NOT_FOUND, actualHandleNotFoundResult.getStatusCode());
    assertFalse(actualHandleNotFoundResult.hasBody());
    assertTrue(actualHandleNotFoundResult.getHeaders().isEmpty());
  }

  /**
   * Method under test:
   * {@link WebHookResource#handleConnectivityException(ConnectivityException)}
   */
  @Test
  public void testHandleConnectivityException() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    WebHookDispatcherResource webHookDispatcherResource = new WebHookDispatcherResource();

    // Act
    ResponseEntity<String> actualHandleConnectivityExceptionResult = webHookDispatcherResource
        .handleConnectivityException(new ConnectivityException("Component", "Service Name"));

    // Assert
    assertEquals(
        "\n" + "Component: Component\n" + "Message: Integration Bridge can't reach Service Name service!\n"
            + "Solutions: \n" + "No solution has been cataloged for troubleshooting this problem.\n",
        actualHandleConnectivityExceptionResult.getBody());
    assertEquals(503, actualHandleConnectivityExceptionResult.getStatusCodeValue());
    assertEquals(HttpStatus.SERVICE_UNAVAILABLE, actualHandleConnectivityExceptionResult.getStatusCode());
    assertTrue(actualHandleConnectivityExceptionResult.hasBody());
    assertTrue(actualHandleConnectivityExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Method under test:
   * {@link WebHookResource#handleConnectivityException(ConnectivityException)}
   */
  @Test
  public void testHandleConnectivityException2() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    WebHookDispatcherResource webHookDispatcherResource = new WebHookDispatcherResource();
    ConnectivityException ex = mock(ConnectivityException.class);
    when(ex.getMessage()).thenReturn("Not all who wander are lost");

    // Act
    ResponseEntity<String> actualHandleConnectivityExceptionResult = webHookDispatcherResource
        .handleConnectivityException(ex);

    // Assert
    verify(ex).getMessage();
    assertEquals("Not all who wander are lost", actualHandleConnectivityExceptionResult.getBody());
    assertEquals(503, actualHandleConnectivityExceptionResult.getStatusCodeValue());
    assertEquals(HttpStatus.SERVICE_UNAVAILABLE, actualHandleConnectivityExceptionResult.getStatusCode());
    assertTrue(actualHandleConnectivityExceptionResult.hasBody());
    assertTrue(actualHandleConnectivityExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Method under test:
   * {@link WebHookResource#handleServiceUnavailableException(Exception)}
   */
  @Test
  public void testHandleServiceUnavailableException() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    WebHookDispatcherResource webHookDispatcherResource = new WebHookDispatcherResource();

    // Act
    ResponseEntity<String> actualHandleServiceUnavailableExceptionResult = webHookDispatcherResource
        .handleServiceUnavailableException(new Exception("foo"));

    // Assert
    assertEquals("foo", actualHandleServiceUnavailableExceptionResult.getBody());
    assertEquals(503, actualHandleServiceUnavailableExceptionResult.getStatusCodeValue());
    assertEquals(HttpStatus.SERVICE_UNAVAILABLE, actualHandleServiceUnavailableExceptionResult.getStatusCode());
    assertTrue(actualHandleServiceUnavailableExceptionResult.hasBody());
    assertTrue(actualHandleServiceUnavailableExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Method under test:
   * {@link WebHookResource#handleWebHookUnprocessableEntityException(WebHookUnprocessableEntityException)}
   */
  @Test
  public void testHandleWebHookUnprocessableEntityException() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    WebHookDispatcherResource webHookDispatcherResource = new WebHookDispatcherResource();

    // Act
    ResponseEntity<String> actualHandleWebHookUnprocessableEntityExceptionResult = webHookDispatcherResource
        .handleWebHookUnprocessableEntityException(
            new WebHookUnprocessableEntityException("An error occurred", "Solutions"));

    // Assert
    assertEquals("\nComponent: Webhook Dispatcher\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualHandleWebHookUnprocessableEntityExceptionResult.getBody());
    assertEquals(422, actualHandleWebHookUnprocessableEntityExceptionResult.getStatusCodeValue());
    assertEquals(HttpStatus.UNPROCESSABLE_ENTITY,
        actualHandleWebHookUnprocessableEntityExceptionResult.getStatusCode());
    assertTrue(actualHandleWebHookUnprocessableEntityExceptionResult.hasBody());
    assertTrue(actualHandleWebHookUnprocessableEntityExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Method under test:
   * {@link WebHookResource#handleWebHookUnprocessableEntityException(WebHookUnprocessableEntityException)}
   */
  @Test
  public void testHandleWebHookUnprocessableEntityException2() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    WebHookDispatcherResource webHookDispatcherResource = new WebHookDispatcherResource();
    WebHookUnprocessableEntityException e = mock(WebHookUnprocessableEntityException.class);
    when(e.getMessage()).thenReturn("Not all who wander are lost");

    // Act
    ResponseEntity<String> actualHandleWebHookUnprocessableEntityExceptionResult = webHookDispatcherResource
        .handleWebHookUnprocessableEntityException(e);

    // Assert
    verify(e).getMessage();
    assertEquals("Not all who wander are lost", actualHandleWebHookUnprocessableEntityExceptionResult.getBody());
    assertEquals(422, actualHandleWebHookUnprocessableEntityExceptionResult.getStatusCodeValue());
    assertEquals(HttpStatus.UNPROCESSABLE_ENTITY,
        actualHandleWebHookUnprocessableEntityExceptionResult.getStatusCode());
    assertTrue(actualHandleWebHookUnprocessableEntityExceptionResult.hasBody());
    assertTrue(actualHandleWebHookUnprocessableEntityExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Method under test:
   * {@link WebHookResource#handleUnexpectedException(Exception)}
   */
  @Test
  public void testHandleUnexpectedException() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    WebHookDispatcherResource webHookDispatcherResource = new WebHookDispatcherResource();

    // Act
    ResponseEntity<String> actualHandleUnexpectedExceptionResult = webHookDispatcherResource
        .handleUnexpectedException(new Exception("foo"));

    // Assert
    assertEquals("Unexpected exception", actualHandleUnexpectedExceptionResult.getBody());
    assertEquals(500, actualHandleUnexpectedExceptionResult.getStatusCodeValue());
    assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, actualHandleUnexpectedExceptionResult.getStatusCode());
    assertTrue(actualHandleUnexpectedExceptionResult.hasBody());
    assertTrue(actualHandleUnexpectedExceptionResult.getHeaders().isEmpty());
  }
}
