package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class IntegrationSubmissionCreateDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link IntegrationSubmissionCreate}
   *   <li>{@link IntegrationSubmissionCreate#setData(Map)}
   *   <li>{@link IntegrationSubmissionCreate#setDescription(String)}
   *   <li>{@link IntegrationSubmissionCreate#setName(String)}
   *   <li>{@link IntegrationSubmissionCreate#setType(String)}
   *   <li>{@link IntegrationSubmissionCreate#setUsername(String)}
   *   <li>{@link IntegrationSubmissionCreate#getData()}
   *   <li>{@link IntegrationSubmissionCreate#getDescription()}
   *   <li>{@link IntegrationSubmissionCreate#getName()}
   *   <li>{@link IntegrationSubmissionCreate#getType()}
   *   <li>{@link IntegrationSubmissionCreate#getUsername()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void IntegrationSubmissionCreate.<init>()", "Map IntegrationSubmissionCreate.getData()",
      "String IntegrationSubmissionCreate.getDescription()", "String IntegrationSubmissionCreate.getName()",
      "String IntegrationSubmissionCreate.getType()", "String IntegrationSubmissionCreate.getUsername()",
      "void IntegrationSubmissionCreate.setData(Map)", "void IntegrationSubmissionCreate.setDescription(String)",
      "void IntegrationSubmissionCreate.setName(String)", "void IntegrationSubmissionCreate.setType(String)",
      "void IntegrationSubmissionCreate.setUsername(String)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    IntegrationSubmissionCreate actualIntegrationSubmissionCreate = new IntegrationSubmissionCreate();
    HashMap<String, Object> data = new HashMap<>();
    actualIntegrationSubmissionCreate.setData(data);
    actualIntegrationSubmissionCreate.setDescription("The characteristics of someone or something");
    actualIntegrationSubmissionCreate.setName("Name");
    actualIntegrationSubmissionCreate.setType("Type");
    actualIntegrationSubmissionCreate.setUsername("janedoe");
    Map<String, Object> actualData = actualIntegrationSubmissionCreate.getData();
    String actualDescription = actualIntegrationSubmissionCreate.getDescription();
    String actualName = actualIntegrationSubmissionCreate.getName();
    String actualType = actualIntegrationSubmissionCreate.getType();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals("Type", actualType);
    assertEquals("janedoe", actualIntegrationSubmissionCreate.getUsername());
    assertTrue(actualData.isEmpty());
    assertSame(data, actualData);
  }
}
