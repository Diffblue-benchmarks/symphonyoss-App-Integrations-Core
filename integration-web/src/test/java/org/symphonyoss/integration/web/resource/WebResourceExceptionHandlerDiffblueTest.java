package org.symphonyoss.integration.web.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.symphonyoss.integration.exception.IntegrationUnavailableException;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.exception.authentication.AuthenticationException;
import org.symphonyoss.integration.exception.authentication.ForbiddenAuthException;
import org.symphonyoss.integration.exception.authentication.MissingRequiredParameterException;
import org.symphonyoss.integration.exception.authentication.UnauthorizedUserException;
import org.symphonyoss.integration.model.ErrorResponse;

public class WebResourceExceptionHandlerDiffblueTest {
  /**
   * Test {@link WebResourceExceptionHandler#handleUnavailableException(IntegrationUnavailableException)}.
   * <ul>
   *   <li>Then return Body Message is a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link WebResourceExceptionHandler#handleUnavailableException(IntegrationUnavailableException)}
   */
  @Test
  @MethodsUnderTest({
      "ResponseEntity WebResourceExceptionHandler.handleUnavailableException(IntegrationUnavailableException)"})
  public void testHandleUnavailableException_thenReturnBodyMessageIsAString() {
    // Arrange
    WebResourceExceptionHandler webResourceExceptionHandler = new WebResourceExceptionHandler();

    // Act
    ResponseEntity<ErrorResponse> actualHandleUnavailableExceptionResult = webResourceExceptionHandler
        .handleUnavailableException(new IntegrationUnavailableException("Configuration Type"));

    // Assert
    ErrorResponse body = actualHandleUnavailableExceptionResult.getBody();
    assertEquals(
        "\n" + "Component: Webhook Dispatcher\n" + "Message: Configuration Configuration Type unavailable\n"
            + "Solutions: \n" + "No solution has been cataloged for troubleshooting this problem.\n",
        body.getMessage());
    assertNull(body.getProperties());
    assertEquals(503, actualHandleUnavailableExceptionResult.getStatusCodeValue());
    assertEquals(503, body.getStatus());
    assertEquals(HttpStatus.SERVICE_UNAVAILABLE, actualHandleUnavailableExceptionResult.getStatusCode());
    assertTrue(actualHandleUnavailableExceptionResult.hasBody());
    assertTrue(actualHandleUnavailableExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link WebResourceExceptionHandler#handleRemoteAPIException(RemoteApiException)}.
   * <ul>
   *   <li>Then return Body Message is a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link WebResourceExceptionHandler#handleRemoteAPIException(RemoteApiException)}
   */
  @Test
  @MethodsUnderTest({"ResponseEntity WebResourceExceptionHandler.handleRemoteAPIException(RemoteApiException)"})
  public void testHandleRemoteAPIException_thenReturnBodyMessageIsAString() {
    // Arrange
    WebResourceExceptionHandler webResourceExceptionHandler = new WebResourceExceptionHandler();

    // Act
    ResponseEntity<ErrorResponse> actualHandleRemoteAPIExceptionResult = webResourceExceptionHandler
        .handleRemoteAPIException(new RemoteApiException(1, "An error occurred"));

    // Assert
    ErrorResponse body = actualHandleRemoteAPIExceptionResult.getBody();
    assertEquals("\n" + "Component: Commons\n" + "Message: An error occurred\n" + "Solutions: \n"
        + "No solution has been cataloged for troubleshooting this problem.\n", body.getMessage());
    assertNull(body.getProperties());
    assertEquals(1, actualHandleRemoteAPIExceptionResult.getStatusCodeValue());
    assertEquals(1, body.getStatus());
    assertTrue(actualHandleRemoteAPIExceptionResult.hasBody());
    assertTrue(actualHandleRemoteAPIExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link WebResourceExceptionHandler#handleUnauthorizedException(UnauthorizedUserException)}.
   * <ul>
   *   <li>Then return Body Message is a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link WebResourceExceptionHandler#handleUnauthorizedException(UnauthorizedUserException)}
   */
  @Test
  @MethodsUnderTest({
      "ResponseEntity WebResourceExceptionHandler.handleUnauthorizedException(UnauthorizedUserException)"})
  public void testHandleUnauthorizedException_thenReturnBodyMessageIsAString() {
    // Arrange
    WebResourceExceptionHandler webResourceExceptionHandler = new WebResourceExceptionHandler();

    // Act
    ResponseEntity<ErrorResponse> actualHandleUnauthorizedExceptionResult = webResourceExceptionHandler
        .handleUnauthorizedException(new UnauthorizedUserException("An error occurred"));

    // Assert
    ErrorResponse body = actualHandleUnauthorizedExceptionResult.getBody();
    assertEquals("\n" + "Component: Authentication Proxy\n" + "Message: An error occurred\n" + "Solutions: \n"
        + "No solution has been cataloged for troubleshooting this problem.\n", body.getMessage());
    assertNull(body.getProperties());
    assertEquals(401, actualHandleUnauthorizedExceptionResult.getStatusCodeValue());
    assertEquals(401, body.getStatus());
    assertEquals(HttpStatus.UNAUTHORIZED, actualHandleUnauthorizedExceptionResult.getStatusCode());
    assertTrue(actualHandleUnauthorizedExceptionResult.hasBody());
    assertTrue(actualHandleUnauthorizedExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link WebResourceExceptionHandler#handleForbiddenException(AuthenticationException)}.
   * <ul>
   *   <li>Then return Body Message is a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link WebResourceExceptionHandler#handleForbiddenException(AuthenticationException)}
   */
  @Test
  @MethodsUnderTest({"ResponseEntity WebResourceExceptionHandler.handleForbiddenException(AuthenticationException)"})
  public void testHandleForbiddenException_thenReturnBodyMessageIsAString() {
    // Arrange
    WebResourceExceptionHandler webResourceExceptionHandler = new WebResourceExceptionHandler();

    // Act
    ResponseEntity<ErrorResponse> actualHandleForbiddenExceptionResult = webResourceExceptionHandler
        .handleForbiddenException(new ForbiddenAuthException("0123456789ABCDEF"));

    // Assert
    ErrorResponse body = actualHandleForbiddenExceptionResult.getBody();
    assertEquals("\n" + "Component: Authentication Proxy\n" + "Message: 0123456789ABCDEF\n" + "Solutions: \n"
        + "No solution has been cataloged for troubleshooting this problem.\n", body.getMessage());
    assertNull(body.getProperties());
    assertEquals(403, actualHandleForbiddenExceptionResult.getStatusCodeValue());
    assertEquals(403, body.getStatus());
    assertEquals(HttpStatus.FORBIDDEN, actualHandleForbiddenExceptionResult.getStatusCode());
    assertTrue(actualHandleForbiddenExceptionResult.hasBody());
    assertTrue(actualHandleForbiddenExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link WebResourceExceptionHandler#handleMissingRequiredParameterException(MissingRequiredParameterException)}.
   * <p>
   * Method under test: {@link WebResourceExceptionHandler#handleMissingRequiredParameterException(MissingRequiredParameterException)}
   */
  @Test
  @MethodsUnderTest({
      "ResponseEntity WebResourceExceptionHandler.handleMissingRequiredParameterException(MissingRequiredParameterException)"})
  public void testHandleMissingRequiredParameterException() {
    // Arrange
    WebResourceExceptionHandler webResourceExceptionHandler = new WebResourceExceptionHandler();

    // Act
    ResponseEntity<ErrorResponse> actualHandleMissingRequiredParameterExceptionResult = webResourceExceptionHandler
        .handleMissingRequiredParameterException(
            new MissingRequiredParameterException("An error occurred", "Solutions"));

    // Assert
    ErrorResponse body = actualHandleMissingRequiredParameterExceptionResult.getBody();
    assertEquals("\nComponent: Authentication Proxy\nMessage: An error occurred\nSolutions: \nSolutions\n",
        body.getMessage());
    assertNull(body.getProperties());
    assertEquals(400, actualHandleMissingRequiredParameterExceptionResult.getStatusCodeValue());
    assertEquals(400, body.getStatus());
    assertEquals(HttpStatus.BAD_REQUEST, actualHandleMissingRequiredParameterExceptionResult.getStatusCode());
    assertTrue(actualHandleMissingRequiredParameterExceptionResult.hasBody());
    assertTrue(actualHandleMissingRequiredParameterExceptionResult.getHeaders().isEmpty());
  }
}
