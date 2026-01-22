package org.symphonyoss.integration.web.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.exception.IntegrationUnavailableException;
import org.symphonyoss.integration.exception.authentication.ConnectivityException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.config.IntegrationInstance;
import org.symphonyoss.integration.service.IntegrationBridge;
import org.symphonyoss.integration.service.IntegrationService;
import org.symphonyoss.integration.webhook.WebHookPayload;
import org.symphonyoss.integration.webhook.exception.WebHookUnprocessableEntityException;

@ContextConfiguration(classes = {WebHookDispatcherResource.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class WebHookResourceDiffblueTest {
  @MockBean private IntegrationBridge integrationBridge;

  @MockBean(name = "remoteIntegrationService")
  private IntegrationService integrationService;

  @MockBean private LogMessageSource logMessageSource;

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Autowired private WebHookResource webHookResource;

  /**
   * Test {@link WebHookResource#getWebHookIntegration(String)}.
   *
   * <p>Method under test: {@link WebHookResource#getWebHookIntegration(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.symphonyoss.integration.webhook.WebHookIntegration WebHookResource.getWebHookIntegration(String)"
  })
  public void testGetWebHookIntegration() {
    // Arrange
    when(integrationBridge.getIntegrationById(Mockito.<String>any()))
        .thenThrow(new IntegrationUnavailableException("Webhook Dispatcher"));

    // Act and Assert
    thrown.expect(IntegrationUnavailableException.class);
    webHookResource.getWebHookIntegration("42");
    verify(integrationBridge).getIntegrationById(Mockito.<String>any());
  }

  /**
   * Test {@link WebHookResource#getWebHookIntegration(String)}.
   *
   * <ul>
   *   <li>Given {@link IntegrationBridge} {@link IntegrationBridge#getIntegrationById(String)}
   *       return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebHookResource#getWebHookIntegration(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.symphonyoss.integration.webhook.WebHookIntegration WebHookResource.getWebHookIntegration(String)"
  })
  public void testGetWebHookIntegration_givenIntegrationBridgeGetIntegrationByIdReturnNull() {
    // Arrange
    when(integrationBridge.getIntegrationById(Mockito.<String>any())).thenReturn(null);

    // Act and Assert
    thrown.expect(IntegrationUnavailableException.class);
    webHookResource.getWebHookIntegration("42");
    verify(integrationBridge).getIntegrationById(Mockito.<String>any());
  }

  /**
   * Test {@link WebHookResource#checkIntegrationAvailability(String)}.
   *
   * <p>Method under test: {@link WebHookResource#checkIntegrationAvailability(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.symphonyoss.integration.webhook.WebHookIntegration WebHookResource.checkIntegrationAvailability(String)"
  })
  public void testCheckIntegrationAvailability() {
    // Arrange
    when(integrationBridge.getIntegrationById(Mockito.<String>any()))
        .thenThrow(new IntegrationUnavailableException("Webhook Dispatcher"));

    // Act and Assert
    thrown.expect(IntegrationUnavailableException.class);
    webHookResource.checkIntegrationAvailability("42");
    verify(integrationBridge).getIntegrationById(Mockito.<String>any());
  }

  /**
   * Test {@link WebHookResource#checkIntegrationAvailability(String)}.
   *
   * <p>Method under test: {@link WebHookResource#checkIntegrationAvailability(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.symphonyoss.integration.webhook.WebHookIntegration WebHookResource.checkIntegrationAvailability(String)"
  })
  public void testCheckIntegrationAvailability2() {
    // Arrange
    when(integrationBridge.getIntegrationById(Mockito.<String>any())).thenReturn(null);

    // Act and Assert
    thrown.expect(IntegrationUnavailableException.class);
    webHookResource.checkIntegrationAvailability("42");
    verify(integrationBridge).getIntegrationById(Mockito.<String>any());
  }

  /**
   * Test {@link WebHookResource#getConfigurationInstance(String, String, String)}.
   *
   * <ul>
   *   <li>Then return {@link IntegrationInstance} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link WebHookResource#getConfigurationInstance(String, String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance WebHookResource.getConfigurationInstance(String, String, String)"
  })
  public void testGetConfigurationInstance_thenReturnIntegrationInstance() {
    // Arrange
    IntegrationInstance integrationInstance = new IntegrationInstance();
    integrationInstance.setActive(true);
    integrationInstance.setConfigurationId("42");
    integrationInstance.setCreatedDate(1L);
    integrationInstance.setCreatorId("42");
    integrationInstance.setCreatorName("Creator Name");
    integrationInstance.setInstanceId("42");
    integrationInstance.setLastModifiedDate(1L);
    integrationInstance.setName("Name");
    integrationInstance.setOptionalProperties("Optional Properties");
    when(integrationService.getInstanceById(
            Mockito.<String>any(), Mockito.<String>any(), Mockito.<String>any()))
        .thenReturn(integrationInstance);

    // Act
    IntegrationInstance actualConfigurationInstance =
        webHookResource.getConfigurationInstance("42", "42", "Configuration Type");

    // Assert
    verify(integrationService)
        .getInstanceById(Mockito.<String>any(), Mockito.<String>any(), Mockito.<String>any());
    assertSame(integrationInstance, actualConfigurationInstance);
  }

  /**
   * Test {@link WebHookResource#getConfigurationInstance(String, String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link IntegrationUnavailableException}.
   * </ul>
   *
   * <p>Method under test: {@link WebHookResource#getConfigurationInstance(String, String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance WebHookResource.getConfigurationInstance(String, String, String)"
  })
  public void testGetConfigurationInstance_thenThrowIntegrationUnavailableException() {
    // Arrange
    when(integrationService.getInstanceById(
            Mockito.<String>any(), Mockito.<String>any(), Mockito.<String>any()))
        .thenThrow(new IntegrationUnavailableException("Configuration Type"));

    // Act and Assert
    thrown.expect(IntegrationUnavailableException.class);
    webHookResource.getConfigurationInstance("42", "42", "Configuration Type");
    verify(integrationService)
        .getInstanceById(Mockito.<String>any(), Mockito.<String>any(), Mockito.<String>any());
  }

  /**
   * Test {@link WebHookResource#getIntegrationBridge()}.
   *
   * <p>Method under test: {@link WebHookResource#getIntegrationBridge()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"IntegrationBridge WebHookResource.getIntegrationBridge()"})
  public void testGetIntegrationBridge() {
    // Arrange, Act and Assert
    assertNull(new WebHookDispatcherResource().getIntegrationBridge());
  }

  /**
   * Test {@link WebHookResource#getIntegrationService()}.
   *
   * <p>Method under test: {@link WebHookResource#getIntegrationService()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"IntegrationService WebHookResource.getIntegrationService()"})
  public void testGetIntegrationService() {
    // Arrange, Act and Assert
    assertNull(new WebHookDispatcherResource().getIntegrationService());
  }

  /**
   * Test {@link WebHookResource#isCircuitClosed()}.
   *
   * <p>Method under test: {@link WebHookResource#isCircuitClosed()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WebHookResource.isCircuitClosed()"})
  public void testIsCircuitClosed() {
    // Arrange, Act and Assert
    assertTrue(webHookResource.isCircuitClosed());
  }

  /**
   * Test {@link WebHookResource#retrieveWebHookPayload(HttpServletRequest, String)}.
   *
   * <ul>
   *   <li>Given {@code Name}.
   *   <li>Then return ContentType Subtype is {@code *}.
   * </ul>
   *
   * <p>Method under test: {@link WebHookResource#retrieveWebHookPayload(HttpServletRequest,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "WebHookPayload WebHookResource.retrieveWebHookPayload(HttpServletRequest, String)"
  })
  public void testRetrieveWebHookPayload_givenName_thenReturnContentTypeSubtypeIsAsterisk() {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("Name", "42");

    // Act
    WebHookPayload actualRetrieveWebHookPayloadResult =
        webHookResource.retrieveWebHookPayload(request, "Not all who wander are lost");

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
   * Test {@link WebHookResource#retrieveWebHookPayload(HttpServletRequest, String)}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>Then return Headers size is one.
   * </ul>
   *
   * <p>Method under test: {@link WebHookResource#retrieveWebHookPayload(HttpServletRequest,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "WebHookPayload WebHookResource.retrieveWebHookPayload(HttpServletRequest, String)"
  })
  public void testRetrieveWebHookPayload_givenValue_thenReturnHeadersSizeIsOne() {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addHeader("42", "Value");
    request.addParameter("Name", "42");

    // Act
    WebHookPayload actualRetrieveWebHookPayloadResult =
        webHookResource.retrieveWebHookPayload(request, "Not all who wander are lost");

    // Assert
    Map<String, String> parameters = actualRetrieveWebHookPayloadResult.getParameters();
    assertEquals(1, parameters.size());
    assertEquals("42", parameters.get("Name"));
    Map<String, String> headers = actualRetrieveWebHookPayloadResult.getHeaders();
    assertEquals(1, headers.size());
    assertEquals("Value", headers.get("42"));
  }

  /**
   * Test {@link WebHookResource#retrieveWebHookPayload(HttpServletRequest, String)}.
   *
   * <ul>
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()}.
   *   <li>Then return Parameters Empty.
   * </ul>
   *
   * <p>Method under test: {@link WebHookResource#retrieveWebHookPayload(HttpServletRequest,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "WebHookPayload WebHookResource.retrieveWebHookPayload(HttpServletRequest, String)"
  })
  public void testRetrieveWebHookPayload_whenMockHttpServletRequest_thenReturnParametersEmpty() {
    // Arrange and Act
    WebHookPayload actualRetrieveWebHookPayloadResult =
        webHookResource.retrieveWebHookPayload(
            new MockHttpServletRequest(), "Not all who wander are lost");

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
   * Test {@link WebHookResource#handleBadRequest(Exception)}.
   *
   * <ul>
   *   <li>When {@link Exception#Exception()}.
   *   <li>Then return Body is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebHookResource#handleBadRequest(Exception)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ResponseEntity WebHookResource.handleBadRequest(Exception)"})
  public void testHandleBadRequest_whenException_thenReturnBodyIsNull() {
    // Arrange and Act
    ResponseEntity<String> actualHandleBadRequestResult =
        webHookResource.handleBadRequest(new Exception());

    // Assert
    assertNull(actualHandleBadRequestResult.getBody());
    assertEquals(400, actualHandleBadRequestResult.getStatusCodeValue());
    assertEquals(HttpStatus.BAD_REQUEST, actualHandleBadRequestResult.getStatusCode());
    assertFalse(actualHandleBadRequestResult.hasBody());
    assertTrue(actualHandleBadRequestResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link WebHookResource#handleNotFound(Exception)}.
   *
   * <ul>
   *   <li>When {@link Exception#Exception()}.
   *   <li>Then return Body is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebHookResource#handleNotFound(Exception)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ResponseEntity WebHookResource.handleNotFound(Exception)"})
  public void testHandleNotFound_whenException_thenReturnBodyIsNull() {
    // Arrange and Act
    ResponseEntity<String> actualHandleNotFoundResult =
        webHookResource.handleNotFound(new Exception());

    // Assert
    assertNull(actualHandleNotFoundResult.getBody());
    assertEquals(404, actualHandleNotFoundResult.getStatusCodeValue());
    assertEquals(HttpStatus.NOT_FOUND, actualHandleNotFoundResult.getStatusCode());
    assertFalse(actualHandleNotFoundResult.hasBody());
    assertTrue(actualHandleNotFoundResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link WebHookResource#handleConnectivityException(ConnectivityException)}.
   *
   * <ul>
   *   <li>Then return Body is a string.
   * </ul>
   *
   * <p>Method under test: {@link
   * WebHookResource#handleConnectivityException(ConnectivityException)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ResponseEntity WebHookResource.handleConnectivityException(ConnectivityException)"
  })
  public void testHandleConnectivityException_thenReturnBodyIsAString() {
    // Arrange
    WebHookDispatcherResource webHookDispatcherResource = new WebHookDispatcherResource();

    // Act
    ResponseEntity<String> actualHandleConnectivityExceptionResult =
        webHookDispatcherResource.handleConnectivityException(
            new ConnectivityException("Component", "Service Name"));

    // Assert
    assertEquals(
        "\n"
            + "Component: Component\n"
            + "Message: Integration Bridge can't reach Service Name service!\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualHandleConnectivityExceptionResult.getBody());
    assertEquals(503, actualHandleConnectivityExceptionResult.getStatusCodeValue());
    assertEquals(
        HttpStatus.SERVICE_UNAVAILABLE, actualHandleConnectivityExceptionResult.getStatusCode());
    assertFalse(webHookDispatcherResource.isCircuitClosed());
    assertTrue(actualHandleConnectivityExceptionResult.hasBody());
    assertTrue(actualHandleConnectivityExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link WebHookResource#handleServiceUnavailableException(Exception)}.
   *
   * <ul>
   *   <li>When {@link Exception#Exception()}.
   *   <li>Then return Body is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebHookResource#handleServiceUnavailableException(Exception)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ResponseEntity WebHookResource.handleServiceUnavailableException(Exception)"})
  public void testHandleServiceUnavailableException_whenException_thenReturnBodyIsNull() {
    // Arrange and Act
    ResponseEntity<String> actualHandleServiceUnavailableExceptionResult =
        webHookResource.handleServiceUnavailableException(new Exception());

    // Assert
    assertNull(actualHandleServiceUnavailableExceptionResult.getBody());
    assertEquals(503, actualHandleServiceUnavailableExceptionResult.getStatusCodeValue());
    assertEquals(
        HttpStatus.SERVICE_UNAVAILABLE,
        actualHandleServiceUnavailableExceptionResult.getStatusCode());
    assertFalse(actualHandleServiceUnavailableExceptionResult.hasBody());
    assertTrue(actualHandleServiceUnavailableExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link
   * WebHookResource#handleWebHookUnprocessableEntityException(WebHookUnprocessableEntityException)}.
   *
   * <p>Method under test: {@link
   * WebHookResource#handleWebHookUnprocessableEntityException(WebHookUnprocessableEntityException)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ResponseEntity WebHookResource.handleWebHookUnprocessableEntityException(WebHookUnprocessableEntityException)"
  })
  public void testHandleWebHookUnprocessableEntityException() {
    // Arrange and Act
    ResponseEntity<String> actualHandleWebHookUnprocessableEntityExceptionResult =
        webHookResource.handleWebHookUnprocessableEntityException(
            new WebHookUnprocessableEntityException("An error occurred", "Solutions"));

    // Assert
    assertEquals(
        "\nComponent: Webhook Dispatcher\nMessage: An error occurred\nSolutions: \nSolutions\n",
        actualHandleWebHookUnprocessableEntityExceptionResult.getBody());
    assertEquals(422, actualHandleWebHookUnprocessableEntityExceptionResult.getStatusCodeValue());
    assertEquals(
        HttpStatus.UNPROCESSABLE_ENTITY,
        actualHandleWebHookUnprocessableEntityExceptionResult.getStatusCode());
    assertTrue(actualHandleWebHookUnprocessableEntityExceptionResult.hasBody());
    assertTrue(actualHandleWebHookUnprocessableEntityExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link WebHookResource#handleUnexpectedException(Exception)}.
   *
   * <ul>
   *   <li>When {@link Exception#Exception()}.
   *   <li>Then return Body is {@code Unexpected exception}.
   * </ul>
   *
   * <p>Method under test: {@link WebHookResource#handleUnexpectedException(Exception)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ResponseEntity WebHookResource.handleUnexpectedException(Exception)"})
  public void testHandleUnexpectedException_whenException_thenReturnBodyIsUnexpectedException() {
    // Arrange and Act
    ResponseEntity<String> actualHandleUnexpectedExceptionResult =
        webHookResource.handleUnexpectedException(new Exception());

    // Assert
    assertEquals("Unexpected exception", actualHandleUnexpectedExceptionResult.getBody());
    assertEquals(500, actualHandleUnexpectedExceptionResult.getStatusCodeValue());
    assertEquals(
        HttpStatus.INTERNAL_SERVER_ERROR, actualHandleUnexpectedExceptionResult.getStatusCode());
    assertTrue(actualHandleUnexpectedExceptionResult.hasBody());
    assertTrue(actualHandleUnexpectedExceptionResult.getHeaders().isEmpty());
  }
}
