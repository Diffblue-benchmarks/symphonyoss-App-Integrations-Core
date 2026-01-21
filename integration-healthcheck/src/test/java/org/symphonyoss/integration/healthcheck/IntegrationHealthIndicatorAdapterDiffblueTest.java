package org.symphonyoss.integration.healthcheck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.Test;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.symphonyoss.integration.Integration;
import org.symphonyoss.integration.healthcheck.application.TestWebHookIntegration;
import org.symphonyoss.integration.model.healthcheck.IntegrationHealth;

public class IntegrationHealthIndicatorAdapterDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IntegrationHealthIndicatorAdapter#IntegrationHealthIndicatorAdapter(Integration)}
   *   <li>{@link IntegrationHealthIndicatorAdapter#getIntegration()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void IntegrationHealthIndicatorAdapter.<init>(Integration)",
    "Integration IntegrationHealthIndicatorAdapter.getIntegration()"
  })
  public void testGettersAndSetters() {
    // Arrange
    TestWebHookIntegration integration = new TestWebHookIntegration();

    // Act and Assert
    assertSame(integration, new IntegrationHealthIndicatorAdapter(integration).getIntegration());
  }

  /**
   * Test {@link IntegrationHealthIndicatorAdapter#health()}.
   *
   * <ul>
   *   <li>Then return Details size is one.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationHealthIndicatorAdapter#health()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Health IntegrationHealthIndicatorAdapter.health()"})
  public void testHealth_thenReturnDetailsSizeIsOne() {
    // Arrange
    TestWebHookIntegration integration = new TestWebHookIntegration();
    integration.onCreate("Integration");

    // Act
    Health actualHealthResult = new IntegrationHealthIndicatorAdapter(integration).health();

    // Assert
    Map<String, Object> details = actualHealthResult.getDetails();
    assertEquals(1, details.size());
    Object getResult = details.get("detail");
    assertTrue(getResult instanceof IntegrationHealth);
    Status status = actualHealthResult.getStatus();
    assertEquals("", status.getDescription());
    assertEquals("INACTIVE", status.getCode());
    assertEquals("INACTIVE", status.toString());
    assertEquals("INACTIVE", ((IntegrationHealth) getResult).getStatus());
    assertEquals("Integration", ((IntegrationHealth) getResult).getName());
    assertEquals("N/A", ((IntegrationHealth) getResult).getVersion());
    assertNull(((IntegrationHealth) getResult).getLatestPostTimestamp());
    assertNull(((IntegrationHealth) getResult).getMessage());
    assertNull(((IntegrationHealth) getResult).getConfigurator());
    assertNull(((IntegrationHealth) getResult).getFlags());
  }
}
