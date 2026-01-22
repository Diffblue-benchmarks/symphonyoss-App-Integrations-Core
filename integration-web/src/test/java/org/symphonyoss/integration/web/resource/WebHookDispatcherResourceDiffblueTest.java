package org.symphonyoss.integration.web.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.service.IntegrationBridge;
import org.symphonyoss.integration.service.IntegrationService;

@ContextConfiguration(classes = {WebHookDispatcherResource.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class WebHookDispatcherResourceDiffblueTest {
  @MockBean private IntegrationBridge integrationBridge;

  @MockBean(name = "remoteIntegrationService")
  private IntegrationService integrationService;

  @MockBean private LogMessageSource logMessageSource;

  @Autowired private WebHookDispatcherResource webHookDispatcherResource;

  /**
   * Test {@link WebHookDispatcherResource#handleRemoteApiException(RemoteApiException)}.
   *
   * <ul>
   *   <li>Then return Body is a string.
   * </ul>
   *
   * <p>Method under test: {@link
   * WebHookDispatcherResource#handleRemoteApiException(RemoteApiException)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ResponseEntity WebHookDispatcherResource.handleRemoteApiException(RemoteApiException)"
  })
  public void testHandleRemoteApiException_thenReturnBodyIsAString() {
    // Arrange and Act
    ResponseEntity<String> actualHandleRemoteApiExceptionResult =
        webHookDispatcherResource.handleRemoteApiException(
            new RemoteApiException(1, "An error occurred"));

    // Assert
    assertEquals(
        "\n"
            + "Component: Commons\n"
            + "Message: An error occurred\n"
            + "Solutions: \n"
            + "No solution has been cataloged for troubleshooting this problem.\n",
        actualHandleRemoteApiExceptionResult.getBody());
    assertEquals(1, actualHandleRemoteApiExceptionResult.getStatusCodeValue());
    assertTrue(actualHandleRemoteApiExceptionResult.hasBody());
    assertTrue(actualHandleRemoteApiExceptionResult.getHeaders().isEmpty());
  }

  /**
   * Test {@link WebHookDispatcherResource#getLogMessage()}.
   *
   * <p>Method under test: {@link WebHookDispatcherResource#getLogMessage()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"LogMessageSource WebHookDispatcherResource.getLogMessage()"})
  public void testGetLogMessage() {
    // Arrange, Act and Assert
    assertNull(new WebHookDispatcherResource().getLogMessage());
  }
}
