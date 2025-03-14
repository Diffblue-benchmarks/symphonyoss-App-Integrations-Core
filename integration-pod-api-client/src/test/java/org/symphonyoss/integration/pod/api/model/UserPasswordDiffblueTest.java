package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserPasswordDiffblueTest {
  /**
   * Test {@link UserPassword#gethSalt()}.
   * <p>
   * Method under test: {@link UserPassword#gethSalt()}
   */
  @Test
  @MethodsUnderTest({"String UserPassword.gethSalt()"})
  public void testGethSalt() {
    // Arrange, Act and Assert
    assertNull((new UserPassword()).gethSalt());
  }

  /**
   * Test {@link UserPassword#gethPassword()}.
   * <p>
   * Method under test: {@link UserPassword#gethPassword()}
   */
  @Test
  @MethodsUnderTest({"String UserPassword.gethPassword()"})
  public void testGethPassword() {
    // Arrange, Act and Assert
    assertNull((new UserPassword()).gethPassword());
  }

  /**
   * Test getters and setters.
   * <p>
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
  @MethodsUnderTest({"void UserPassword.<init>()", "String UserPassword.getKhPassword()",
      "String UserPassword.getKhSalt()", "void UserPassword.setKhPassword(String)",
      "void UserPassword.setKhSalt(String)", "void UserPassword.sethPassword(String)",
      "void UserPassword.sethSalt(String)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    UserPassword actualUserPassword = new UserPassword();
    actualUserPassword.setKhPassword("iloveyou");
    actualUserPassword.setKhSalt("Kh Salt");
    actualUserPassword.sethPassword("iloveyou");
    actualUserPassword.sethSalt("H Salt");
    String actualKhPassword = actualUserPassword.getKhPassword();

    // Assert
    assertEquals("Kh Salt", actualUserPassword.getKhSalt());
    assertEquals("iloveyou", actualKhPassword);
  }
}
