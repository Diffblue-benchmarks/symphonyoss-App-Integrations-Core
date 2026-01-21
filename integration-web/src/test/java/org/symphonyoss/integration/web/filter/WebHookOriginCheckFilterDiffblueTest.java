package org.symphonyoss.integration.web.filter;

import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

public class WebHookOriginCheckFilterDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link WebHookOriginCheckFilter}
   *   <li>{@link WebHookOriginCheckFilter#destroy()}
   *   <li>{@link WebHookOriginCheckFilter#getLogMessage()}
   *   <li>{@link WebHookOriginCheckFilter#getProperties()}
   *   <li>{@link WebHookOriginCheckFilter#getSpringContext()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void WebHookOriginCheckFilter.<init>()",
    "void WebHookOriginCheckFilter.destroy()",
    "LogMessageSource WebHookOriginCheckFilter.getLogMessage()",
    "IntegrationProperties WebHookOriginCheckFilter.getProperties()",
    "org.springframework.web.context.WebApplicationContext WebHookOriginCheckFilter.getSpringContext()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    WebHookOriginCheckFilter actualWebHookOriginCheckFilter = new WebHookOriginCheckFilter();
    actualWebHookOriginCheckFilter.destroy();
    LogMessageSource actualLogMessage = actualWebHookOriginCheckFilter.getLogMessage();
    IntegrationProperties actualProperties = actualWebHookOriginCheckFilter.getProperties();

    // Assert
    assertNull(actualWebHookOriginCheckFilter.getSpringContext());
    assertNull(actualLogMessage);
    assertNull(actualProperties);
  }
}
