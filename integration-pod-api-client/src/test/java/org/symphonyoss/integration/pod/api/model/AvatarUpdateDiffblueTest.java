package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class AvatarUpdateDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link AvatarUpdate}
   *   <li>{@link AvatarUpdate#setImage(String)}
   *   <li>{@link AvatarUpdate#getImage()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void AvatarUpdate.<init>()", "String AvatarUpdate.getImage()",
      "void AvatarUpdate.setImage(String)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    AvatarUpdate actualAvatarUpdate = new AvatarUpdate();
    actualAvatarUpdate.setImage("Image");

    // Assert
    assertEquals("Image", actualAvatarUpdate.getImage());
  }
}
