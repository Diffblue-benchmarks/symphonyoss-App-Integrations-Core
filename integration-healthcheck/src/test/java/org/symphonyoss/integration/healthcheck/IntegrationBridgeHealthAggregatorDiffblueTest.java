package org.symphonyoss.integration.healthcheck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.boot.actuate.health.Status;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {IntegrationBridgeHealthAggregator.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class IntegrationBridgeHealthAggregatorDiffblueTest {
  @Autowired private IntegrationBridgeHealthAggregator integrationBridgeHealthAggregator;

  /**
   * Test {@link IntegrationBridgeHealthAggregator#aggregate(Map)}.
   *
   * <ul>
   *   <li>Given {@code services}.
   *   <li>Then return Details size is four.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationBridgeHealthAggregator#aggregate(Map)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Health IntegrationBridgeHealthAggregator.aggregate(Map)"})
  public void testAggregate_givenServices_thenReturnDetailsSizeIsFour() {
    // Arrange
    HashMap<String, Health> healths = new HashMap<>();

    Builder statusResult = Health.status(new Status("applications"));
    healths.put("services", statusResult.status(new Status("Code")).build());

    Builder statusResult2 = Health.status(new Status("applications"));
    healths.put("applications", statusResult2.status(new Status("Code")).build());

    // Act
    Health actualAggregateResult = integrationBridgeHealthAggregator.aggregate(healths);

    // Assert
    Map<String, Object> details = actualAggregateResult.getDetails();
    assertEquals(4, details.size());
    Object getResult = details.get("applications");
    assertTrue(getResult instanceof List);
    Object getResult2 = details.get("services");
    assertTrue(getResult2 instanceof Map);
    assertEquals("Success", details.get("message"));
    assertEquals("Unknown Version", details.get("version"));
    assertTrue(((List<Object>) getResult).isEmpty());
    assertTrue(((Map<Object, Object>) getResult2).isEmpty());
    assertSame(Status.UP, actualAggregateResult.getStatus());
  }
}
