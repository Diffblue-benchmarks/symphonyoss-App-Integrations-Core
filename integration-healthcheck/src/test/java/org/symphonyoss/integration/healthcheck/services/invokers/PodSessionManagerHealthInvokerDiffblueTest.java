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

@ContextConfiguration(classes = {PodSessionManagerHealthInvoker.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class PodSessionManagerHealthInvokerDiffblueTest {
  @MockBean private AuthenticationProxy authenticationProxy;

  @Autowired private IntegrationProperties integrationProperties;

  @MockBean private LogMessageSource logMessageSource;

  @Autowired private PodSessionManagerHealthInvoker podSessionManagerHealthInvoker;

  @MockBean(name = "podSessionManagerHealthIndicator")
  private ServiceHealthIndicator serviceHealthIndicator;

  /**
   * Test {@link PodSessionManagerHealthInvoker#getFriendlyServiceName()}.
   *
   * <p>Method under test: {@link PodSessionManagerHealthInvoker#getFriendlyServiceName()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PodSessionManagerHealthInvoker.getFriendlyServiceName()"})
  public void testGetFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("POD_SESSION_MANAGER", podSessionManagerHealthInvoker.getFriendlyServiceName());
  }

  /**
   * Test {@link PodSessionManagerHealthInvoker#getMinVersion()}.
   *
   * <p>Method under test: {@link PodSessionManagerHealthInvoker#getMinVersion()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PodSessionManagerHealthInvoker.getMinVersion()"})
  public void testGetMinVersion() {
    // Arrange, Act and Assert
    assertNull(podSessionManagerHealthInvoker.getMinVersion());
  }

  /**
   * Test {@link PodSessionManagerHealthInvoker#getServiceBaseUrl()}.
   *
   * <p>Method under test: {@link PodSessionManagerHealthInvoker#getServiceBaseUrl()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PodSessionManagerHealthInvoker.getServiceBaseUrl()"})
  public void testGetServiceBaseUrl() {
    // Arrange, Act and Assert
    assertEquals("", podSessionManagerHealthInvoker.getServiceBaseUrl());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PodSessionManagerHealthInvoker#getHealthIndicator()}
   *   <li>{@link PodSessionManagerHealthInvoker#getServiceField()}
   *   <li>{@link PodSessionManagerHealthInvoker#getServiceName()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ServiceHealthIndicator PodSessionManagerHealthInvoker.getHealthIndicator()",
    "String PodSessionManagerHealthInvoker.getServiceField()",
    "ServiceName PodSessionManagerHealthInvoker.getServiceName()"
  })
  public void testGettersAndSetters() {
    // Arrange
    PodSessionManagerHealthInvoker podSessionManagerHealthInvoker =
        new PodSessionManagerHealthInvoker();

    // Act
    ServiceHealthIndicator actualHealthIndicator =
        podSessionManagerHealthInvoker.getHealthIndicator();
    String actualServiceField = podSessionManagerHealthInvoker.getServiceField();

    // Assert
    assertEquals("sessionauth", actualServiceField);
    assertNull(actualHealthIndicator);
    assertEquals(ServiceName.POD, podSessionManagerHealthInvoker.getServiceName());
  }
}
