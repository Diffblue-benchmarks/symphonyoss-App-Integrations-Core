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
import org.symphonyoss.integration.healthcheck.services.indicators.ServiceHealthIndicator;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

@ContextConfiguration(classes = {PodHealthInvoker.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class PodHealthInvokerDiffblueTest {
  @MockBean private AuthenticationProxy authenticationProxy;

  @Autowired private IntegrationProperties integrationProperties;

  @MockBean private LogMessageSource logMessageSource;

  @Autowired private PodHealthInvoker podHealthInvoker;

  @MockBean(name = "podHealthIndicator")
  private ServiceHealthIndicator serviceHealthIndicator;

  /**
   * Test {@link PodHealthInvoker#getMinVersion()}.
   *
   * <ul>
   *   <li>Given createPodHealthInvoker.
   *   <li>Then return {@code 1.44.0}.
   * </ul>
   *
   * <p>Method under test: {@link PodHealthInvoker#getMinVersion()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String PodHealthInvoker.getMinVersion()"})
  public void testGetMinVersion_givenCreatePodHealthInvoker_thenReturn1440() {
    // Arrange, Act and Assert
    assertEquals("1.44.0", HealthInvokerFactory.createPodHealthInvoker().getMinVersion());
  }

  /**
   * Test {@link PodHealthInvoker#getHealthCheckUrl()}.
   *
   * <p>Method under test: {@link PodHealthInvoker#getHealthCheckUrl()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String PodHealthInvoker.getHealthCheckUrl()"})
  public void testGetHealthCheckUrl() {
    // Arrange, Act and Assert
    assertEquals("/webcontroller/HealthCheck/version", podHealthInvoker.getHealthCheckUrl());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PodHealthInvoker#getHealthIndicator()}
   *   <li>{@link PodHealthInvoker#getServiceName()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ServiceHealthIndicator PodHealthInvoker.getHealthIndicator()",
    "ServiceName PodHealthInvoker.getServiceName()"
  })
  public void testGettersAndSetters() {
    // Arrange
    PodHealthInvoker podHealthInvoker = new PodHealthInvoker();

    // Act
    ServiceHealthIndicator actualHealthIndicator = podHealthInvoker.getHealthIndicator();

    // Assert
    assertNull(actualHealthIndicator);
    assertEquals(ServiceName.POD, podHealthInvoker.getServiceName());
  }

  /**
   * Test {@link PodHealthInvoker#getServiceBaseUrl()}.
   *
   * <p>Method under test: {@link PodHealthInvoker#getServiceBaseUrl()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String PodHealthInvoker.getServiceBaseUrl()"})
  public void testGetServiceBaseUrl() {
    // Arrange, Act and Assert
    assertEquals("", podHealthInvoker.getServiceBaseUrl());
  }
}
