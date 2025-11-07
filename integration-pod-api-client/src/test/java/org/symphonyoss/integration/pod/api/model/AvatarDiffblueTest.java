package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AvatarDiffblueTest {
  /**
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
  public void testGettersAndSetters() {
    // Arrange and Act
    Avatar actualAvatar = new Avatar();
    actualAvatar.setSize("Size");
    actualAvatar.setUrl("https://example.org/example");
    String actualSize = actualAvatar.getSize();

    // Assert that nothing has changed
    assertEquals("Size", actualSize);
    assertEquals("https://example.org/example", actualAvatar.getUrl());
  }
}
