package org.symphonyoss.integration.healthcheck.services.indicators;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
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

@ContextConfiguration(classes = {KmAuthHealthIndicator.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class KmAuthHealthIndicatorDiffblueTest {
  @Autowired private IntegrationProperties integrationProperties;

  @Autowired private KmAuthHealthIndicator kmAuthHealthIndicator;

  @MockBean private LogMessageSource logMessageSource;

  /**
   * Test {@link KmAuthHealthIndicator#getServiceName()}.
   *
   * <p>Method under test: {@link KmAuthHealthIndicator#getServiceName()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ServiceName KmAuthHealthIndicator.getServiceName()"})
  public void testGetServiceName() {
    // Arrange, Act and Assert
    assertEquals(ServiceName.KEY_MANAGER, new KmAuthHealthIndicator().getServiceName());
  }

  /**
   * Test {@link KmAuthHealthIndicator#getFriendlyServiceName()}.
   *
   * <p>Method under test: {@link KmAuthHealthIndicator#getFriendlyServiceName()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String KmAuthHealthIndicator.getFriendlyServiceName()"})
  public void testGetFriendlyServiceName() {
    // Arrange, Act and Assert
    assertEquals("KEY_MANAGER_AUTH", kmAuthHealthIndicator.getFriendlyServiceName());
  }
}
