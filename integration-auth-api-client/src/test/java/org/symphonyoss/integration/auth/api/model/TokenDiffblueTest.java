package org.symphonyoss.integration.auth.api.model;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class TokenDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Token}
   *   <li>{@link Token#setName(String)}
   *   <li>{@link Token#setToken(String)}
   *   <li>{@link Token#getName()}
   *   <li>{@link Token#getToken()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Token.<init>()",
    "String Token.getName()",
    "String Token.getToken()",
    "void Token.setName(String)",
    "void Token.setToken(String)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    Token actualToken = new Token();
    actualToken.setName("Name");
    actualToken.setToken("ABC123");
    String actualName = actualToken.getName();

    // Assert
    assertEquals("ABC123", actualToken.getToken());
    assertEquals("Name", actualName);
  }
}
