package org.symphonyoss.integration.provisioning;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;
import org.symphonyoss.integration.provisioning.service.AppKeyPairService;
import org.symphonyoss.integration.provisioning.service.ApplicationService;
import org.symphonyoss.integration.provisioning.service.CompanyCertificateService;
import org.symphonyoss.integration.provisioning.service.ConfigurationProvisioningService;
import org.symphonyoss.integration.provisioning.service.UserKeyPairService;
import org.symphonyoss.integration.provisioning.service.UserService;

@ContextConfiguration(classes = {IntegrationProvisioningService.class, IntegrationProperties.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class IntegrationProvisioningServiceDiffblueTest {
  @MockBean
  private AppKeyPairService appKeyPairService;

  @Autowired
  private ApplicationContext applicationContext;

  @MockBean
  private ApplicationService applicationService;

  @MockBean
  private CompanyCertificateService companyCertificateService;

  @MockBean
  private ConfigurationProvisioningService configurationProvisioningService;

  @Autowired
  private IntegrationProperties integrationProperties;

  @Autowired
  private IntegrationProvisioningService integrationProvisioningService;

  @MockBean
  private LogMessageSource logMessageSource;

  @MockBean
  private UserKeyPairService userKeyPairService;

  @MockBean
  private UserService userService;

  /**
   * Test {@link IntegrationProvisioningService#configure()}.
   * <p>
   * Method under test: {@link IntegrationProvisioningService#configure()}
   */
  @Test
  @MethodsUnderTest({"boolean IntegrationProvisioningService.configure()"})
  public void testConfigure() {
    // Arrange, Act and Assert
    assertTrue(integrationProvisioningService.configure());
  }
}
