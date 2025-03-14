package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class AvatarDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link Avatar}
   *   <li>{@link Avatar#setSize(String)}
   *   <li>{@link Avatar#setUrl(String)}
   *   <li>{@link Avatar#getSize()}
   *   <li>{@link Avatar#getUrl()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void Avatar.<init>()", "String Avatar.getSize()", "String Avatar.getUrl()",
      "void Avatar.setSize(String)", "void Avatar.setUrl(String)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    Avatar actualAvatar = new Avatar();
    actualAvatar.setSize("Size");
    actualAvatar.setUrl("https://example.org/example");
    String actualSize = actualAvatar.getSize();

    // Assert
    assertEquals("Size", actualSize);
    assertEquals("https://example.org/example", actualAvatar.getUrl());
  }
}
