package org.symphonyoss.integration.healthcheck.services.indicators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.healthcheck.services.IntegrationBridgeServiceInfo;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(classes = {AgentHealthIndicator.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class ServiceHealthIndicatorDiffblueTest {
  @MockBean
  private ApplicationEventPublisher applicationEventPublisher;

  @Autowired
  private IntegrationProperties integrationProperties;

  @MockBean
  private LogMessageSource logMessageSource;

  @Autowired
  private ServiceHealthIndicator serviceHealthIndicator;

  /**
   * Method under test: {@link ServiceHealthIndicator#health()}
   */
  @Test
  public void testHealth() {
    // Arrange and Act
    Health actualHealthResult = serviceHealthIndicator.health();

    // Assert
    Status status = actualHealthResult.getStatus();
    assertEquals("", status.getDescription());
    assertEquals("DOWN", status.getCode());
    assertEquals("DOWN", status.toString());
    assertTrue(actualHealthResult.getDetails().isEmpty());
  }

  /**
   * Method under test: {@link ServiceHealthIndicator#getServiceInfo()}
   */
  @Test
  public void testGetServiceInfo() {
    // Arrange, Act and Assert
    assertNull(serviceHealthIndicator.getServiceInfo());
  }

  /**
   * Method under test:
   * {@link ServiceHealthIndicator#setServiceInfo(IntegrationBridgeServiceInfo)}
   */
  @Test
  public void testSetServiceInfo() {
    // Arrange
    IntegrationBridgeServiceInfo serviceInfo = new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    // Act
    serviceHealthIndicator.setServiceInfo(serviceInfo);

    // Assert
    assertTrue(serviceHealthIndicator instanceof AgentHealthIndicator);
    assertSame(serviceInfo, serviceHealthIndicator.getServiceInfo());
  }

  /**
   * Method under test:
   * {@link ServiceHealthIndicator#setServiceInfo(IntegrationBridgeServiceInfo)}
   */
  @Test
  public void testSetServiceInfo2() {
    // Arrange
    IntegrationBridgeServiceInfo serviceInfo = mock(IntegrationBridgeServiceInfo.class);

    // Act
    serviceHealthIndicator.setServiceInfo(serviceInfo);

    // Assert
    assertTrue(serviceHealthIndicator instanceof AgentHealthIndicator);
    assertSame(serviceInfo, serviceHealthIndicator.getServiceInfo());
  }

  /**
   * Method under test:
   * {@link ServiceHealthIndicator#mountUserFriendlyServiceName()}
   */
  @Test
  public void testMountUserFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("AGENT", serviceHealthIndicator.mountUserFriendlyServiceName());
  }

  /**
   * Method under test: {@link ServiceHealthIndicator#getFriendlyServiceName()}
   */
  @Test
  public void testGetFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("AGENT", serviceHealthIndicator.getFriendlyServiceName());
  }
}
