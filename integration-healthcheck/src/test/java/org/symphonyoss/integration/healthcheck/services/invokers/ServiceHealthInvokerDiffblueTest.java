package org.symphonyoss.integration.healthcheck.services.invokers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.event.HealthCheckEventData;
import org.symphonyoss.integration.healthcheck.services.IntegrationBridgeServiceInfo;
import org.symphonyoss.integration.healthcheck.services.indicators.ServiceHealthIndicator;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

@ContextConfiguration(classes = {AgentHealthInvoker.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class ServiceHealthInvokerDiffblueTest {
  @MockBean
  private ApplicationEventPublisher applicationEventPublisher;

  @MockBean
  private AuthenticationProxy authenticationProxy;

  @Autowired
  private IntegrationProperties integrationProperties;

  @MockBean
  private LogMessageSource logMessageSource;

  @MockBean(name = "agentHealthIndicator")
  private ServiceHealthIndicator serviceHealthIndicator;

  @Autowired
  private ServiceHealthInvoker serviceHealthInvoker;

  /**
   * Method under test: {@link ServiceHealthInvoker#getHttpClient()}
   */
  @Test
  public void testGetHttpClient() {
    // Arrange, Act and Assert
    assertNull(serviceHealthInvoker.getHttpClient());
  }

  /**
   * Method under test:
   * {@link ServiceHealthInvoker#retrieveHealthResponse(Response)}
   */
  @Test
  public void testRetrieveHealthResponse() {
    // Arrange
    OutboundJaxrsResponse response = mock(OutboundJaxrsResponse.class);
    when(response.getStatus()).thenReturn(1);

    // Act
    String actualRetrieveHealthResponseResult = serviceHealthInvoker.retrieveHealthResponse(response);

    // Assert
    verify(response).getStatus();
    assertNull(actualRetrieveHealthResponseResult);
  }

  /**
   * Method under test:
   * {@link ServiceHealthInvoker#handleHealthCheckEvent(HealthCheckEventData)}
   */
  @Test
  public void testHandleHealthCheckEvent() {
    // Arrange
    HealthCheckEventData event = mock(HealthCheckEventData.class);
    when(event.getServiceName()).thenReturn("Service Name");

    // Act
    serviceHealthInvoker.handleHealthCheckEvent(event);

    // Assert
    verify(event).getServiceName();
  }

  /**
   * Method under test: {@link ServiceHealthInvoker#getHealthResponse(String)}
   */
  @Test
  public void testGetHealthResponse() {
    // Arrange, Act and Assert
    assertNull(serviceHealthInvoker.getHealthResponse("https://example.org/example"));
  }

  /**
   * Method under test:
   * {@link ServiceHealthInvoker#mountUserFriendlyServiceName()}
   */
  @Test
  public void testMountUserFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("AGENT", serviceHealthInvoker.mountUserFriendlyServiceName());
  }

  /**
   * Method under test:
   * {@link ServiceHealthInvoker#retrieveCurrentVersion(String)}
   */
  @Test
  public void testRetrieveCurrentVersion() {
    // Arrange, Act and Assert
    assertNull(serviceHealthInvoker.retrieveCurrentVersion("Health Response"));
    assertNull(serviceHealthInvoker.retrieveCurrentVersion("42"));
    assertNull(serviceHealthInvoker.retrieveCurrentVersion(""));
  }

  /**
   * Method under test:
   * {@link ServiceHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}
   */
  @Test
  public void testHandleHealthResponse() {
    // Arrange
    IntegrationBridgeServiceInfo service = new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    // Act
    serviceHealthInvoker.handleHealthResponse(service, "Health Response");

    // Assert
    assertEquals("UP", service.getConnectivity());
  }

  /**
   * Method under test:
   * {@link ServiceHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}
   */
  @Test
  public void testHandleHealthResponse2() {
    // Arrange
    IntegrationBridgeServiceInfo service = mock(IntegrationBridgeServiceInfo.class);
    doNothing().when(service).setConnectivity(Mockito.<Status>any());

    // Act
    serviceHealthInvoker.handleHealthResponse(service, "Health Response");

    // Assert
    verify(service).setConnectivity(isA(Status.class));
  }

  /**
   * Method under test: {@link ServiceHealthInvoker#getSemanticVersion(String)}
   */
  @Test
  public void testGetSemanticVersion() {
    // Arrange, Act and Assert
    assertEquals("1.0.2", serviceHealthInvoker.getSemanticVersion("1.0.2"));
    assertEquals("", serviceHealthInvoker.getSemanticVersion(""));
  }

  /**
   * Method under test:
   * {@link ServiceHealthInvoker#fireUpdatedServiceVersionEvent(String)}
   */
  @Test
  public void testFireUpdatedServiceVersionEvent() {
    // Arrange and Act
    serviceHealthInvoker.fireUpdatedServiceVersionEvent("1.0.2");

    // Assert
    assertTrue(serviceHealthInvoker instanceof AgentHealthInvoker);
    assertEquals("1.0.2", serviceHealthInvoker.getCurrentVersion());
  }

  /**
   * Method under test:
   * {@link ServiceHealthInvoker#fireUpdatedServiceVersionEvent(String)}
   */
  @Test
  public void testFireUpdatedServiceVersionEvent2() {
    // Arrange and Act
    serviceHealthInvoker.fireUpdatedServiceVersionEvent("");

    // Assert
    assertTrue(serviceHealthInvoker instanceof AgentHealthInvoker);
    assertEquals("", serviceHealthInvoker.getCurrentVersion());
  }

  /**
   * Method under test: {@link ServiceHealthInvoker#getCurrentVersion()}
   */
  @Test
  public void testGetCurrentVersion() {
    // Arrange, Act and Assert
    assertNull(serviceHealthInvoker.getCurrentVersion());
  }

  /**
   * Method under test: {@link ServiceHealthInvoker#getFriendlyServiceName()}
   */
  @Test
  public void testGetFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("AGENT", serviceHealthInvoker.getFriendlyServiceName());
  }
}
