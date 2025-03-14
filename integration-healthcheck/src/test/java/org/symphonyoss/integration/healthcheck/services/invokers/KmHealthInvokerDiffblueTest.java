package org.symphonyoss.integration.healthcheck.services.invokers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
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

@ContextConfiguration(classes = {KmHealthInvoker.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class KmHealthInvokerDiffblueTest {
  @MockBean
  private AuthenticationProxy authenticationProxy;

  @Autowired
  private IntegrationProperties integrationProperties;

  @Autowired
  private KmHealthInvoker kmHealthInvoker;

  @MockBean
  private LogMessageSource logMessageSource;

  @MockBean(name = "kmHealthIndicator")
  private ServiceHealthIndicator serviceHealthIndicator;

  /**
   * Test {@link KmHealthInvoker#getHealthCheckUrl()}.
   * <p>
   * Method under test: {@link KmHealthInvoker#getHealthCheckUrl()}
   */
  @Test
  @MethodsUnderTest({"java.lang.String KmHealthInvoker.getHealthCheckUrl()"})
  public void testGetHealthCheckUrl() {
    // Arrange, Act and Assert
    assertEquals(KmHealthInvoker.KM_URL_PATH, kmHealthInvoker.getHealthCheckUrl());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link KmHealthInvoker#getHealthIndicator()}
   *   <li>{@link KmHealthInvoker#getServiceName()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"ServiceHealthIndicator KmHealthInvoker.getHealthIndicator()",
      "ServiceName KmHealthInvoker.getServiceName()"})
  public void testGettersAndSetters() {
    // Arrange
    KmHealthInvoker kmHealthInvoker = new KmHealthInvoker();

    // Act
    ServiceHealthIndicator actualHealthIndicator = kmHealthInvoker.getHealthIndicator();

    // Assert
    assertNull(actualHealthIndicator);
    assertEquals(ServiceName.KEY_MANAGER, kmHealthInvoker.getServiceName());
  }

  /**
   * Test {@link KmHealthInvoker#getServiceBaseUrl()}.
   * <p>
   * Method under test: {@link KmHealthInvoker#getServiceBaseUrl()}
   */
  @Test
  @MethodsUnderTest({"java.lang.String KmHealthInvoker.getServiceBaseUrl()"})
  public void testGetServiceBaseUrl() {
    // Arrange, Act and Assert
    assertEquals("", kmHealthInvoker.getServiceBaseUrl());
  }
}
