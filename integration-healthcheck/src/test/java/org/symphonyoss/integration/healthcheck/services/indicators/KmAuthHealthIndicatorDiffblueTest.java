package org.symphonyoss.integration.healthcheck.services.indicators;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

@ContextConfiguration(classes = {KmAuthHealthIndicator.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class KmAuthHealthIndicatorDiffblueTest {
  @MockBean
  private ApplicationEventPublisher applicationEventPublisher;

  @Autowired
  private IntegrationProperties integrationProperties;

  @Autowired
  private KmAuthHealthIndicator kmAuthHealthIndicator;

  @MockBean
  private LogMessageSource logMessageSource;

  /**
   * Method under test: {@link KmAuthHealthIndicator#getServiceName()}
   */
  @Test
  public void testGetServiceName() {
    // Arrange, Act and Assert
    assertEquals(ServiceName.KEY_MANAGER, (new KmAuthHealthIndicator()).getServiceName());
  }

  /**
   * Method under test: {@link KmAuthHealthIndicator#getFriendlyServiceName()}
   */
  @Test
  public void testGetFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("KEY_MANAGER_AUTH", kmAuthHealthIndicator.getFriendlyServiceName());
  }
}
