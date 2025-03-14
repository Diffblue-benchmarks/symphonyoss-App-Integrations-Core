package org.symphonyoss.integration.healthcheck.services.indicators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.healthcheck.services.IntegrationBridgeServiceInfo;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

@ContextConfiguration(classes = {AgentHealthIndicator.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class ServiceHealthIndicatorDiffblueTest {
  @Autowired
  private IntegrationProperties integrationProperties;

  @MockBean
  private LogMessageSource logMessageSource;

  @Autowired
  private ServiceHealthIndicator serviceHealthIndicator;

  /**
   * Test {@link ServiceHealthIndicator#health()}.
   * <ul>
   *   <li>Given {@link ServiceHealthIndicator}.</li>
   *   <li>Then return Status Description is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ServiceHealthIndicator#health()}
   */
  @Test
  @MethodsUnderTest({"Health ServiceHealthIndicator.health()"})
  public void testHealth_givenServiceHealthIndicator_thenReturnStatusDescriptionIsEmptyString() {
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
   * Test {@link ServiceHealthIndicator#health()}.
   * <ul>
   *   <li>Then return Status Code is {@code UNKNOWN}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ServiceHealthIndicator#health()}
   */
  @Test
  @MethodsUnderTest({"Health ServiceHealthIndicator.health()"})
  public void testHealth_thenReturnStatusCodeIsUnknown() {
    // Arrange
    IntegrationBridgeServiceInfo serviceInfo = new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    serviceHealthIndicator.setServiceInfo(serviceInfo);

    // Act
    Health actualHealthResult = serviceHealthIndicator.health();

    // Assert
    Status status = actualHealthResult.getStatus();
    assertEquals("UNKNOWN", status.getCode());
    assertEquals("UNKNOWN", status.toString());
    Map<String, Object> details = actualHealthResult.getDetails();
    assertEquals(1, details.size());
    assertSame(serviceInfo, details.get("AGENT"));
  }

  /**
   * Test {@link ServiceHealthIndicator#getServiceInfo()}.
   * <p>
   * Method under test: {@link ServiceHealthIndicator#getServiceInfo()}
   */
  @Test
  @MethodsUnderTest({"IntegrationBridgeServiceInfo ServiceHealthIndicator.getServiceInfo()"})
  public void testGetServiceInfo() {
    // Arrange, Act and Assert
    assertNull(serviceHealthIndicator.getServiceInfo());
  }

  /**
   * Test {@link ServiceHealthIndicator#setServiceInfo(IntegrationBridgeServiceInfo)}.
   * <p>
   * Method under test: {@link ServiceHealthIndicator#setServiceInfo(IntegrationBridgeServiceInfo)}
   */
  @Test
  @MethodsUnderTest({"void ServiceHealthIndicator.setServiceInfo(IntegrationBridgeServiceInfo)"})
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
   * Test {@link ServiceHealthIndicator#mountUserFriendlyServiceName()}.
   * <p>
   * Method under test: {@link ServiceHealthIndicator#mountUserFriendlyServiceName()}
   */
  @Test
  @MethodsUnderTest({"String ServiceHealthIndicator.mountUserFriendlyServiceName()"})
  public void testMountUserFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("AGENT", serviceHealthIndicator.mountUserFriendlyServiceName());
  }

  /**
   * Test {@link ServiceHealthIndicator#getFriendlyServiceName()}.
   * <p>
   * Method under test: {@link ServiceHealthIndicator#getFriendlyServiceName()}
   */
  @Test
  @MethodsUnderTest({"String ServiceHealthIndicator.getFriendlyServiceName()"})
  public void testGetFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("AGENT", serviceHealthIndicator.getFriendlyServiceName());
  }
}
