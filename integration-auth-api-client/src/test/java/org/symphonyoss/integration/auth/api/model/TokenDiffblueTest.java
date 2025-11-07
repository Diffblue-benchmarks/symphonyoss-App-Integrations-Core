package org.symphonyoss.integration.auth.api.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TokenDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link Token}
   *   <li>{@link Token#setName(String)}
   *   <li>{@link Token#setToken(String)}
   *   <li>{@link Token#getName()}
   *   <li>{@link Token#getToken()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    Token actualToken = new Token();
    actualToken.setName("Name");
    actualToken.setToken("ABC123");
    String actualName = actualToken.getName();

    // Assert that nothing has changed
    assertEquals("ABC123", actualToken.getToken());
    assertEquals("Name", actualName);
  }
}
