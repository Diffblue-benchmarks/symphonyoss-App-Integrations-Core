package org.symphonyoss.integration.config;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.core.env.Environment;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.symphonyoss.integration.config.exception.InitializationConfigException;
import org.symphonyoss.integration.config.exception.InvalidConfigurationIdException;
import org.symphonyoss.integration.config.exception.InvalidInstanceIdException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.config.IntegrationInstance;
import org.symphonyoss.integration.model.config.IntegrationSettings;

@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@RunWith(MockitoJUnitRunner.class)
public class LocalIntegrationServiceDiffblueTest {
  @Mock private Environment environment;

  @InjectMocks private LocalIntegrationService localIntegrationService;

  @Mock private LogMessageSource logMessageSource;

  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link LocalIntegrationService#init()}.
   *
   * <p>Method under test: {@link LocalIntegrationService#init()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void LocalIntegrationService.init()"})
  public void testInit() {
    // Arrange
    InitializationConfigException initializationConfigException =
        new InitializationConfigException("An error occurred", new Throwable(), "config.filename");
    when(environment.getProperty(Mockito.<String>any(), Mockito.<String>any()))
        .thenThrow(initializationConfigException);

    // Act and Assert
    thrown.expect(InitializationConfigException.class);
    localIntegrationService.init();
    verify(environment).getProperty(Mockito.<String>any(), Mockito.<String>any());
  }

  /**
   * Test {@link LocalIntegrationService#init()}.
   *
   * <ul>
   *   <li>Given {@link Environment} {@link Environment#getProperty(String, String)} return empty
   *       string.
   * </ul>
   *
   * <p>Method under test: {@link LocalIntegrationService#init()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void LocalIntegrationService.init()"})
  public void testInit_givenEnvironmentGetPropertyReturnEmptyString() {
    // Arrange
    when(environment.getProperty(Mockito.<String>any(), Mockito.<String>any())).thenReturn("");

    // Act and Assert
    thrown.expect(InitializationConfigException.class);
    localIntegrationService.init();
    verify(environment).getProperty(Mockito.<String>any(), Mockito.<String>any());
  }

  /**
   * Test {@link LocalIntegrationService#init()}.
   *
   * <ul>
   *   <li>Given {@link Environment} {@link Environment#getProperty(String, String)} return {@code
   *       Property}.
   * </ul>
   *
   * <p>Method under test: {@link LocalIntegrationService#init()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void LocalIntegrationService.init()"})
  public void testInit_givenEnvironmentGetPropertyReturnProperty() {
    // Arrange
    when(environment.getProperty(Mockito.<String>any(), Mockito.<String>any()))
        .thenReturn("Property");

    // Act and Assert
    thrown.expect(InitializationConfigException.class);
    localIntegrationService.init();
    verify(environment).getProperty(Mockito.<String>any(), Mockito.<String>any());
  }

  /**
   * Test {@link LocalIntegrationService#getIntegrationById(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link InvalidConfigurationIdException}.
   * </ul>
   *
   * <p>Method under test: {@link LocalIntegrationService#getIntegrationById(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationSettings LocalIntegrationService.getIntegrationById(String, String)"
  })
  public void testGetIntegrationById_whenNull_thenThrowInvalidConfigurationIdException() {
    // Arrange, Act and Assert
    thrown.expect(InvalidConfigurationIdException.class);
    localIntegrationService.getIntegrationById(null, "42");
  }

  /**
   * Test {@link LocalIntegrationService#getIntegrationByType(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link InvalidConfigurationIdException}.
   * </ul>
   *
   * <p>Method under test: {@link LocalIntegrationService#getIntegrationByType(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationSettings LocalIntegrationService.getIntegrationByType(String, String)"
  })
  public void testGetIntegrationByType_whenNull_thenThrowInvalidConfigurationIdException() {
    // Arrange, Act and Assert
    thrown.expect(InvalidConfigurationIdException.class);
    localIntegrationService.getIntegrationByType(null, "42");
  }

  /**
   * Test {@link LocalIntegrationService#save(IntegrationInstance, String)} with {@code instance},
   * {@code userId}.
   *
   * <ul>
   *   <li>When {@link IntegrationInstance} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link LocalIntegrationService#save(IntegrationInstance, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance LocalIntegrationService.save(IntegrationInstance, String)"
  })
  public void testSaveWithInstanceUserId_whenIntegrationInstance() {
    // Arrange, Act and Assert
    thrown.expect(InvalidInstanceIdException.class);
    localIntegrationService.save(new IntegrationInstance(), "42");
  }

  /**
   * Test {@link LocalIntegrationService#save(IntegrationInstance, String)} with {@code instance},
   * {@code userId}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link InvalidInstanceIdException}.
   * </ul>
   *
   * <p>Method under test: {@link LocalIntegrationService#save(IntegrationInstance, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance LocalIntegrationService.save(IntegrationInstance, String)"
  })
  public void testSaveWithInstanceUserId_whenNull_thenThrowInvalidInstanceIdException() {
    // Arrange, Act and Assert
    thrown.expect(InvalidInstanceIdException.class);
    localIntegrationService.save((IntegrationInstance) null, "42");
  }

  /**
   * Test {@link LocalIntegrationService#save(IntegrationSettings, String)} with {@code settings},
   * {@code usedId}.
   *
   * <ul>
   *   <li>When {@link IntegrationSettings} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link LocalIntegrationService#save(IntegrationSettings, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationSettings LocalIntegrationService.save(IntegrationSettings, String)"
  })
  public void testSaveWithSettingsUsedId_whenIntegrationSettings() {
    // Arrange, Act and Assert
    thrown.expect(InvalidConfigurationIdException.class);
    localIntegrationService.save(new IntegrationSettings(), "42");
  }

  /**
   * Test {@link LocalIntegrationService#save(IntegrationSettings, String)} with {@code settings},
   * {@code usedId}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link InvalidConfigurationIdException}.
   * </ul>
   *
   * <p>Method under test: {@link LocalIntegrationService#save(IntegrationSettings, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationSettings LocalIntegrationService.save(IntegrationSettings, String)"
  })
  public void testSaveWithSettingsUsedId_whenNull_thenThrowInvalidConfigurationIdException() {
    // Arrange, Act and Assert
    thrown.expect(InvalidConfigurationIdException.class);
    localIntegrationService.save((IntegrationSettings) null, "42");
  }

  /**
   * Test {@link LocalIntegrationService#getInstanceById(String, String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link InvalidInstanceIdException}.
   * </ul>
   *
   * <p>Method under test: {@link LocalIntegrationService#getInstanceById(String, String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IntegrationInstance LocalIntegrationService.getInstanceById(String, String, String)"
  })
  public void testGetInstanceById_whenNull_thenThrowInvalidInstanceIdException() {
    // Arrange, Act and Assert
    thrown.expect(InvalidInstanceIdException.class);
    localIntegrationService.getInstanceById("42", null, "42");
  }
}
