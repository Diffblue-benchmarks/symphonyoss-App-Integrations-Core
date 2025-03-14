package org.symphonyoss.integration.healthcheck.services.indicators;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

@ContextConfiguration(classes = {PodSessionManagerHealthIndicator.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class PodSessionManagerHealthIndicatorDiffblueTest {
  @Autowired
  private IntegrationProperties integrationProperties;

  @MockBean
  private LogMessageSource logMessageSource;

  @Autowired
  private PodSessionManagerHealthIndicator podSessionManagerHealthIndicator;

  /**
   * Test {@link PodSessionManagerHealthIndicator#getServiceName()}.
   * <p>
   * Method under test: {@link PodSessionManagerHealthIndicator#getServiceName()}
   */
  @Test
  @MethodsUnderTest({"ServiceName PodSessionManagerHealthIndicator.getServiceName()"})
  public void testGetServiceName() {
    // Arrange, Act and Assert
    assertEquals(ServiceName.POD, (new PodSessionManagerHealthIndicator()).getServiceName());
  }

  /**
   * Test {@link PodSessionManagerHealthIndicator#getFriendlyServiceName()}.
   * <p>
   * Method under test: {@link PodSessionManagerHealthIndicator#getFriendlyServiceName()}
   */
  @Test
  @MethodsUnderTest({"java.lang.String PodSessionManagerHealthIndicator.getFriendlyServiceName()"})
  public void testGetFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("POD_SESSION_MANAGER", podSessionManagerHealthIndicator.getFriendlyServiceName());
  }
}
