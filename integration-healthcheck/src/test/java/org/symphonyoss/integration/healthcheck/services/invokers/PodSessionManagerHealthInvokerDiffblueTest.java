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
import org.symphonyoss.integration.healthcheck.services.indicators.ServiceHealthIndicator;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

@ContextConfiguration(classes = {PodSessionManagerHealthInvoker.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class PodSessionManagerHealthInvokerDiffblueTest {
  @MockBean
  private ApplicationEventPublisher applicationEventPublisher;

  @MockBean
  private AuthenticationProxy authenticationProxy;

  @Autowired
  private IntegrationProperties integrationProperties;

  @MockBean
  private LogMessageSource logMessageSource;

  @Autowired
  private PodSessionManagerHealthInvoker podSessionManagerHealthInvoker;

  @MockBean(name = "podSessionManagerHealthIndicator")
  private ServiceHealthIndicator serviceHealthIndicator;

  /**
   * Method under test:
   * {@link PodSessionManagerHealthInvoker#getFriendlyServiceName()}
   */
  @Test
  public void testGetFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("POD_SESSION_MANAGER", podSessionManagerHealthInvoker.getFriendlyServiceName());
  }

  /**
   * Method under test: {@link PodSessionManagerHealthInvoker#getMinVersion()}
   */
  @Test
  public void testGetMinVersion() {
    // Arrange, Act and Assert
    assertNull(podSessionManagerHealthInvoker.getMinVersion());
  }

  /**
   * Method under test: {@link PodSessionManagerHealthInvoker#getServiceBaseUrl()}
   */
  @Test
  public void testGetServiceBaseUrl() {
    // Arrange, Act and Assert
    assertEquals("", podSessionManagerHealthInvoker.getServiceBaseUrl());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link PodSessionManagerHealthInvoker#getHealthIndicator()}
   *   <li>{@link PodSessionManagerHealthInvoker#getServiceField()}
   *   <li>{@link PodSessionManagerHealthInvoker#getServiceName()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    PodSessionManagerHealthInvoker podSessionManagerHealthInvoker = new PodSessionManagerHealthInvoker();

    // Act
    ServiceHealthIndicator actualHealthIndicator = podSessionManagerHealthInvoker.getHealthIndicator();
    String actualServiceField = podSessionManagerHealthInvoker.getServiceField();

    // Assert
    assertEquals("sessionauth", actualServiceField);
    assertNull(actualHealthIndicator);
    assertEquals(ServiceName.POD, podSessionManagerHealthInvoker.getServiceName());
  }
}
