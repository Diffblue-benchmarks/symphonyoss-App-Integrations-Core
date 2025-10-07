package org.symphonyoss.integration.healthcheck.services.invokers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
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
  @MockBean private AuthenticationProxy authenticationProxy;

  @Autowired private IntegrationProperties integrationProperties;

  @Autowired private KmAuthHealthInvoker kmAuthHealthInvoker;

  @MockBean private LogMessageSource logMessageSource;

  @MockBean(name = "kmAuthHealthIndicator")
  private ServiceHealthIndicator serviceHealthIndicator;

  /**
   * Test {@link KmAuthHealthInvoker#getHealthCheckUrl()}.
   *
   * <p>Method under test: {@link KmAuthHealthInvoker#getHealthCheckUrl()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String KmAuthHealthInvoker.getHealthCheckUrl()"})
  public void testGetHealthCheckUrl() {
    // Arrange, Act and Assert
    assertEquals("/HealthCheck/aggregated", kmAuthHealthInvoker.getHealthCheckUrl());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link KmAuthHealthInvoker#getHealthIndicator()}
   *   <li>{@link KmAuthHealthInvoker#getServiceField()}
   *   <li>{@link KmAuthHealthInvoker#getServiceName()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ServiceHealthIndicator KmAuthHealthInvoker.getHealthIndicator()",
    "String KmAuthHealthInvoker.getServiceField()",
    "ServiceName KmAuthHealthInvoker.getServiceName()"
  })
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

  /**
   * Test {@link KmAuthHealthInvoker#getServiceBaseUrl()}.
   *
   * <p>Method under test: {@link KmAuthHealthInvoker#getServiceBaseUrl()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String KmAuthHealthInvoker.getServiceBaseUrl()"})
  public void testGetServiceBaseUrl() {
    // Arrange, Act and Assert
    assertEquals("", kmAuthHealthInvoker.getServiceBaseUrl());
  }

  /**
   * Test {@link KmAuthHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link
   * KmAuthHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void KmAuthHealthInvoker.handleHealthResponse(IntegrationBridgeServiceInfo, String)"
  })
  public void testHandleHealthResponse_when42() {
    // Arrange
    IntegrationBridgeServiceInfo service =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    // Act
    kmAuthHealthInvoker.handleHealthResponse(service, "42");

    // Assert
    assertEquals("DOWN", service.getConnectivity());
  }

  /**
   * Test {@link KmAuthHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link
   * KmAuthHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void KmAuthHealthInvoker.handleHealthResponse(IntegrationBridgeServiceInfo, String)"
  })
  public void testHandleHealthResponse_whenEmptyString() {
    // Arrange
    IntegrationBridgeServiceInfo service =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    // Act
    kmAuthHealthInvoker.handleHealthResponse(service, "");

    // Assert
    assertEquals("DOWN", service.getConnectivity());
  }

  /**
   * Test {@link KmAuthHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}.
   *
   * <ul>
   *   <li>When {@code Health Response}.
   * </ul>
   *
   * <p>Method under test: {@link
   * KmAuthHealthInvoker#handleHealthResponse(IntegrationBridgeServiceInfo, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void KmAuthHealthInvoker.handleHealthResponse(IntegrationBridgeServiceInfo, String)"
  })
  public void testHandleHealthResponse_whenHealthResponse() {
    // Arrange
    IntegrationBridgeServiceInfo service =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    // Act
    kmAuthHealthInvoker.handleHealthResponse(service, "Health Response");

    // Assert
    assertEquals("DOWN", service.getConnectivity());
  }

  /**
   * Test {@link KmAuthHealthInvoker#getFriendlyServiceName()}.
   *
   * <p>Method under test: {@link KmAuthHealthInvoker#getFriendlyServiceName()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String KmAuthHealthInvoker.getFriendlyServiceName()"})
  public void testGetFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("KEY_MANAGER_AUTH", kmAuthHealthInvoker.getFriendlyServiceName());
  }

  /**
   * Test {@link KmAuthHealthInvoker#getMinVersion()}.
   *
   * <p>Method under test: {@link KmAuthHealthInvoker#getMinVersion()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String KmAuthHealthInvoker.getMinVersion()"})
  public void testGetMinVersion() {
    // Arrange, Act and Assert
    assertNull(kmAuthHealthInvoker.getMinVersion());
  }
}
