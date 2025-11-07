package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UserPasswordDiffblueTest {
  /**
   * Method under test: {@link UserPassword#gethSalt()}
   */
  @Test
  public void testGethSalt() {
    // Arrange, Act and Assert
    assertNull((new UserPassword()).gethSalt());
  }

  /**
   * Method under test: {@link UserPassword#gethPassword()}
   */
  @Test
  public void testGethPassword() {
    // Arrange, Act and Assert
    assertNull((new UserPassword()).gethPassword());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserPassword}
   *   <li>{@link UserPassword#setKhPassword(String)}
   *   <li>{@link UserPassword#setKhSalt(String)}
   *   <li>{@link UserPassword#sethPassword(String)}
   *   <li>{@link UserPassword#sethSalt(String)}
   *   <li>{@link UserPassword#getKhPassword()}
   *   <li>{@link UserPassword#getKhSalt()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    UserPassword actualUserPassword = new UserPassword();
    actualUserPassword.setKhPassword("iloveyou");
    actualUserPassword.setKhSalt("Kh Salt");
    actualUserPassword.sethPassword("iloveyou");
    actualUserPassword.sethSalt("H Salt");
    String actualKhPassword = actualUserPassword.getKhPassword();

    // Assert that nothing has changed
    assertEquals("Kh Salt", actualUserPassword.getKhSalt());
    assertEquals("iloveyou", actualKhPassword);
  }
}
