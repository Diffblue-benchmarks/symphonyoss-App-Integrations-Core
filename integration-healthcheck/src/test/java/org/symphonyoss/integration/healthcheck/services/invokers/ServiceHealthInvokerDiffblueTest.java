package org.symphonyoss.integration.healthcheck.services.invokers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.healthcheck.services.IntegrationBridgeServiceInfo;
import org.symphonyoss.integration.healthcheck.services.indicators.ServiceHealthIndicator;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

@ContextConfiguration(classes = {AgentHealthInvoker.class, IntegrationProperties.class})
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@RunWith(SpringJUnit4ClassRunner.class)
public class ServiceHealthInvokerDiffblueTest {
  @MockBean private ApplicationEventPublisher applicationEventPublisher;

  @MockBean private AuthenticationProxy authenticationProxy;

  @Autowired private IntegrationProperties integrationProperties;

  @MockBean private LogMessageSource logMessageSource;

  @MockBean(name = "agentHealthIndicator")
  private ServiceHealthIndicator serviceHealthIndicator;

  @Autowired private ServiceHealthInvoker serviceHealthInvoker;

  /**
   * Test {@link ServiceHealthInvoker#getHttpClient()}.
   *
   * <p>Method under test: {@link ServiceHealthInvoker#getHttpClient()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"javax.ws.rs.client.Client ServiceHealthInvoker.getHttpClient()"})
  public void testGetHttpClient() {
    // Arrange, Act and Assert
    assertNull(serviceHealthInvoker.getHttpClient());
  }

  /**
   * Test {@link ServiceHealthInvoker#retrieveHealthResponse(Response)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ServiceHealthInvoker#retrieveHealthResponse(Response)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ServiceHealthInvoker.retrieveHealthResponse(Response)"})
  public void testRetrieveHealthResponse_givenOne_thenReturnNull() {
    // Arrange
    OutboundJaxrsResponse response = mock(OutboundJaxrsResponse.class);
    when(response.getStatus()).thenReturn(1);

    // Act
    String actualRetrieveHealthResponseResult =
        serviceHealthInvoker.retrieveHealthResponse(response);

    // Assert
    verify(response).getStatus();
    assertNull(actualRetrieveHealthResponseResult);
  }

  /**
   * Test {@link ServiceHealthInvoker#getHealthResponse(String)}.
   *
   * <p>Method under test: {@link ServiceHealthInvoker#getHealthResponse(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ServiceHealthInvoker.getHealthResponse(String)"})
  public void testGetHealthResponse() {
    // Arrange, Act and Assert
    assertNull(serviceHealthInvoker.getHealthResponse("https://example.org/example"));
  }

  /**
   * Test {@link ServiceHealthInvoker#mountUserFriendlyServiceName()}.
   *
   * <p>Method under test: {@link ServiceHealthInvoker#mountUserFriendlyServiceName()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ServiceHealthInvoker.mountUserFriendlyServiceName()"})
  public void testMountUserFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("AGENT", serviceHealthInvoker.mountUserFriendlyServiceName());
  }

  /**
   * Test {@link ServiceHealthInvoker#retrieveCurrentVersion(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ServiceHealthInvoker#retrieveCurrentVersion(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ServiceHealthInvoker.retrieveCurrentVersion(String)"})
  public void testRetrieveCurrentVersion_when42() {
    // Arrange, Act and Assert
    assertNull(serviceHealthInvoker.retrieveCurrentVersion("42"));
  }

  /**
   * Test {@link ServiceHealthInvoker#retrieveCurrentVersion(String)}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link ServiceHealthInvoker#retrieveCurrentVersion(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ServiceHealthInvoker.retrieveCurrentVersion(String)"})
  public void testRetrieveCurrentVersion_whenEmptyString() {
    // Arrange, Act and Assert
    assertNull(serviceHealthInvoker.retrieveCurrentVersion(""));
  }

  /**
   * Test {@link ServiceHealthInvoker#retrieveCurrentVersion(String)}.
   *
   * <ul>
   *   <li>When {@code Health Response}.
   * </ul>
   *
   * <p>Method under test: {@link ServiceHealthInvoker#retrieveCurrentVersion(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ServiceHealthInvoker.retrieveCurrentVersion(String)"})
  public void testRetrieveCurrentVersion_whenHealthResponse() {
    // Arrange, Act and Assert
    assertNull(serviceHealthInvoker.retrieveCurrentVersion("Health Response"));
  }

  /**
   * Test {@link ServiceHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}.
   *
   * <p>Method under test: {@link
   * ServiceHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ServiceHealthInvoker.handleHealthResponse(IntegrationBridgeServiceInfo, String)"
  })
  public void testHandleHealthResponse() {
    // Arrange
    IntegrationBridgeServiceInfo service =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    // Act
    serviceHealthInvoker.handleHealthResponse(service, "Health Response");

    // Assert
    assertEquals("UP", service.getConnectivity());
  }

  /**
   * Test {@link ServiceHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}.
   *
   * <ul>
   *   <li>Then calls {@link IntegrationBridgeServiceInfo#setConnectivity(Status)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ServiceHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ServiceHealthInvoker.handleHealthResponse(IntegrationBridgeServiceInfo, String)"
  })
  public void testHandleHealthResponse_thenCallsSetConnectivity() {
    // Arrange
    IntegrationBridgeServiceInfo service = mock(IntegrationBridgeServiceInfo.class);
    doNothing().when(service).setConnectivity(Mockito.<Status>any());

    // Act
    serviceHealthInvoker.handleHealthResponse(service, "Health Response");

    // Assert
    verify(service).setConnectivity(isA(Status.class));
  }

  /**
   * Test {@link ServiceHealthInvoker#getSemanticVersion(String)}.
   *
   * <ul>
   *   <li>When {@code 1.0.2}.
   *   <li>Then return {@code 1.0.2}.
   * </ul>
   *
   * <p>Method under test: {@link ServiceHealthInvoker#getSemanticVersion(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ServiceHealthInvoker.getSemanticVersion(String)"})
  public void testGetSemanticVersion_when102_thenReturn102() {
    // Arrange, Act and Assert
    assertEquals("1.0.2", serviceHealthInvoker.getSemanticVersion("1.0.2"));
  }

  /**
   * Test {@link ServiceHealthInvoker#getSemanticVersion(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link ServiceHealthInvoker#getSemanticVersion(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ServiceHealthInvoker.getSemanticVersion(String)"})
  public void testGetSemanticVersion_whenEmptyString_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", serviceHealthInvoker.getSemanticVersion(""));
  }

  /**
   * Test {@link ServiceHealthInvoker#getSemanticVersion(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link ServiceHealthInvoker#getSemanticVersion(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ServiceHealthInvoker.getSemanticVersion(String)"})
  public void testGetSemanticVersion_whenNull_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", serviceHealthInvoker.getSemanticVersion(null));
  }

  /**
   * Test {@link ServiceHealthInvoker#fireUpdatedServiceVersionEvent(String)}.
   *
   * <p>Method under test: {@link ServiceHealthInvoker#fireUpdatedServiceVersionEvent(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ServiceHealthInvoker.fireUpdatedServiceVersionEvent(String)"})
  public void testFireUpdatedServiceVersionEvent() {
    // Arrange
    serviceHealthInvoker.fireUpdatedServiceVersionEvent("");

    // Act
    serviceHealthInvoker.fireUpdatedServiceVersionEvent("");

    // Assert that nothing has changed
    assertTrue(serviceHealthInvoker instanceof AgentHealthInvoker);
    assertEquals("", serviceHealthInvoker.getCurrentVersion());
  }

  /**
   * Test {@link ServiceHealthInvoker#fireUpdatedServiceVersionEvent(String)}.
   *
   * <ul>
   *   <li>Then {@link ServiceHealthInvoker} CurrentVersion is {@code 1.0.2}.
   * </ul>
   *
   * <p>Method under test: {@link ServiceHealthInvoker#fireUpdatedServiceVersionEvent(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ServiceHealthInvoker.fireUpdatedServiceVersionEvent(String)"})
  public void testFireUpdatedServiceVersionEvent_thenServiceHealthInvokerCurrentVersionIs102() {
    // Arrange and Act
    serviceHealthInvoker.fireUpdatedServiceVersionEvent("1.0.2");

    // Assert
    assertTrue(serviceHealthInvoker instanceof AgentHealthInvoker);
    assertEquals("1.0.2", serviceHealthInvoker.getCurrentVersion());
  }

  /**
   * Test {@link ServiceHealthInvoker#getCurrentVersion()}.
   *
   * <p>Method under test: {@link ServiceHealthInvoker#getCurrentVersion()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ServiceHealthInvoker.getCurrentVersion()"})
  public void testGetCurrentVersion() {
    // Arrange, Act and Assert
    assertNull(serviceHealthInvoker.getCurrentVersion());
  }

  /**
   * Test {@link ServiceHealthInvoker#getFriendlyServiceName()}.
   *
   * <p>Method under test: {@link ServiceHealthInvoker#getFriendlyServiceName()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ServiceHealthInvoker.getFriendlyServiceName()"})
  public void testGetFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("AGENT", serviceHealthInvoker.getFriendlyServiceName());
  }
}
