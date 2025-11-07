package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AvatarUpdateDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link AvatarUpdate}
   *   <li>{@link AvatarUpdate#setImage(String)}
   *   <li>{@link AvatarUpdate#getImage()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    AvatarUpdate actualAvatarUpdate = new AvatarUpdate();
    actualAvatarUpdate.setImage("Image");

    // Assert that nothing has changed
    assertEquals("Image", actualAvatarUpdate.getImage());
  }
}
