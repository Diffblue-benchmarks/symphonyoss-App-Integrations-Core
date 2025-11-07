package org.symphonyoss.integration.healthcheck.services.invokers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;
import org.symphonyoss.integration.healthcheck.services.IntegrationBridgeServiceInfo;
import org.symphonyoss.integration.healthcheck.services.indicators.ServiceHealthIndicator;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

@ContextConfiguration(classes = {KmAuthHealthInvoker.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class KmAuthHealthInvokerDiffblueTest {
  @MockBean
  private ApplicationEventPublisher applicationEventPublisher;

  @MockBean
  private AuthenticationProxy authenticationProxy;

  @Autowired
  private IntegrationProperties integrationProperties;

  @Autowired
  private KmAuthHealthInvoker kmAuthHealthInvoker;

  @MockBean
  private LogMessageSource logMessageSource;

  @MockBean(name = "kmAuthHealthIndicator")
  private ServiceHealthIndicator serviceHealthIndicator;

  /**
   * Method under test: {@link KmAuthHealthInvoker#getHealthCheckUrl()}
   */
  @Test
  public void testGetHealthCheckUrl() {
    // Arrange, Act and Assert
    assertEquals("/HealthCheck/aggregated", kmAuthHealthInvoker.getHealthCheckUrl());
  }

  /**
   * Method under test: {@link KmAuthHealthInvoker#getServiceBaseUrl()}
   */
  @Test
  public void testGetServiceBaseUrl() {
    // Arrange, Act and Assert
    assertEquals("", kmAuthHealthInvoker.getServiceBaseUrl());
  }

  /**
   * Method under test:
   * {@link KmAuthHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}
   */
  @Test
  public void testHandleHealthResponse() {
    // Arrange
    IntegrationBridgeServiceInfo service = new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    // Act
    kmAuthHealthInvoker.handleHealthResponse(service, "Health Response");

    // Assert
    assertEquals("DOWN", service.getConnectivity());
  }

  /**
   * Method under test:
   * {@link KmAuthHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}
   */
  @Test
  public void testHandleHealthResponse2() {
    // Arrange
    IntegrationBridgeServiceInfo service = new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    // Act
    kmAuthHealthInvoker.handleHealthResponse(service, "");

    // Assert
    assertEquals("DOWN", service.getConnectivity());
  }

  /**
   * Method under test:
   * {@link KmAuthHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}
   */
  @Test
  public void testHandleHealthResponse3() {
    // Arrange
    IntegrationBridgeServiceInfo service = new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    // Act
    kmAuthHealthInvoker.handleHealthResponse(service, "42");

    // Assert
    assertEquals("DOWN", service.getConnectivity());
  }

  /**
   * Method under test: {@link KmAuthHealthInvoker#getFriendlyServiceName()}
   */
  @Test
  public void testGetFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("KEY_MANAGER_AUTH", kmAuthHealthInvoker.getFriendlyServiceName());
  }

  /**
   * Method under test: {@link KmAuthHealthInvoker#getMinVersion()}
   */
  @Test
  public void testGetMinVersion() {
    // Arrange, Act and Assert
    assertNull(kmAuthHealthInvoker.getMinVersion());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link KmAuthHealthInvoker#getHealthIndicator()}
   *   <li>{@link KmAuthHealthInvoker#getServiceField()}
   *   <li>{@link KmAuthHealthInvoker#getServiceName()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    KmAuthHealthInvoker kmAuthHealthInvoker = new KmAuthHealthInvoker();

    // Act
    ServiceHealthIndicator actualHealthIndicator = kmAuthHealthInvoker.getHealthIndicator();
    String actualServiceField = kmAuthHealthInvoker.getServiceField();

    // Assert
    assertEquals("keyauth", actualServiceField);
    assertNull(actualHealthIndicator);
    assertEquals(ServiceName.KEY_MANAGER, kmAuthHealthInvoker.getServiceName());
  }
}
