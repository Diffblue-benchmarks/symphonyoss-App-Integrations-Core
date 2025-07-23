package org.symphonyoss.integration.healthcheck.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.springframework.boot.actuate.health.Status;
import org.symphonyoss.integration.healthcheck.services.IntegrationBridgeServiceInfo.Compability;

public class IntegrationBridgeServiceInfoDiffblueTest {
  /**
   * Test {@link IntegrationBridgeServiceInfo#IntegrationBridgeServiceInfo(String, String)}.
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#IntegrationBridgeServiceInfo(String,
   * String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void IntegrationBridgeServiceInfo.<init>(String, String)"})
  public void testNewIntegrationBridgeServiceInfo() {
    // Arrange and Act
    IntegrationBridgeServiceInfo actualIntegrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    // Assert
    assertEquals("1.0.2", actualIntegrationBridgeServiceInfo.getMinVersion());
    assertEquals("N/A", actualIntegrationBridgeServiceInfo.getCurrentVersion());
    assertEquals("UNKNOWN", actualIntegrationBridgeServiceInfo.getConnectivity());
    assertEquals("https://example.org/example", actualIntegrationBridgeServiceInfo.getUrl());
    assertEquals(Compability.NOK, actualIntegrationBridgeServiceInfo.getCompatibility());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getConnectivity()}.
   *
   * <ul>
   *   <li>Then return {@code UNKNOWN}.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getConnectivity()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String IntegrationBridgeServiceInfo.getConnectivity()"})
  public void testGetConnectivity_thenReturnUnknown() {
    // Arrange, Act and Assert
    assertEquals(
        "UNKNOWN",
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example").getConnectivity());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getCurrentVersion()}.
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getCurrentVersion()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String IntegrationBridgeServiceInfo.getCurrentVersion()"})
  public void testGetCurrentVersion() {
    // Arrange, Act and Assert
    assertEquals(
        "N/A",
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example")
            .getCurrentVersion());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getCurrentVersion()}.
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getCurrentVersion()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String IntegrationBridgeServiceInfo.getCurrentVersion()"})
  public void testGetCurrentVersion2() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("");

    // Act and Assert
    assertEquals("N/A", integrationBridgeServiceInfo.getCurrentVersion());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getCurrentVersion()}.
   *
   * <ul>
   *   <li>Then return {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getCurrentVersion()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String IntegrationBridgeServiceInfo.getCurrentVersion()"})
  public void testGetCurrentVersion_thenReturnFoo() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("foo");

    // Act and Assert
    assertEquals("foo", integrationBridgeServiceInfo.getCurrentVersion());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getMinVersion()}.
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getMinVersion()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String IntegrationBridgeServiceInfo.getMinVersion()"})
  public void testGetMinVersion() {
    // Arrange, Act and Assert
    assertEquals(
        "N/A", new IntegrationBridgeServiceInfo("", "https://example.org/example").getMinVersion());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getMinVersion()}.
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getMinVersion()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String IntegrationBridgeServiceInfo.getMinVersion()"})
  public void testGetMinVersion2() {
    // Arrange, Act and Assert
    assertEquals(
        "N/A",
        new IntegrationBridgeServiceInfo(null, "https://example.org/example").getMinVersion());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getMinVersion()}.
   *
   * <ul>
   *   <li>Then return {@code 1.0.2}.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getMinVersion()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String IntegrationBridgeServiceInfo.getMinVersion()"})
  public void testGetMinVersion_thenReturn102() {
    // Arrange, Act and Assert
    assertEquals(
        "1.0.2",
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example").getMinVersion());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getCompatibility()}.
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getCompatibility()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Compability IntegrationBridgeServiceInfo.getCompatibility()"})
  public void testGetCompatibility() {
    // Arrange, Act and Assert
    assertEquals(
        Compability.NOK,
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example")
            .getCompatibility());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getCompatibility()}.
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getCompatibility()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Compability IntegrationBridgeServiceInfo.getCompatibility()"})
  public void testGetCompatibility2() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("foo");

    // Act and Assert
    assertEquals(Compability.NOK, integrationBridgeServiceInfo.getCompatibility());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getCompatibility()}.
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getCompatibility()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Compability IntegrationBridgeServiceInfo.getCompatibility()"})
  public void testGetCompatibility3() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("1.0.2");

    // Act and Assert
    assertEquals(Compability.OK, integrationBridgeServiceInfo.getCompatibility());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getCompatibility()}.
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getCompatibility()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Compability IntegrationBridgeServiceInfo.getCompatibility()"})
  public void testGetCompatibility4() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("Min Version", "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("1.0.2");

    // Act and Assert
    assertEquals(Compability.NOK, integrationBridgeServiceInfo.getCompatibility());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getCompatibility()}.
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getCompatibility()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Compability IntegrationBridgeServiceInfo.getCompatibility()"})
  public void testGetCompatibility5() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("1.0.242");

    // Act and Assert
    assertEquals(Compability.OK, integrationBridgeServiceInfo.getCompatibility());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getCompatibility()}.
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getCompatibility()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Compability IntegrationBridgeServiceInfo.getCompatibility()"})
  public void testGetCompatibility6() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("421.0.2");

    // Act and Assert
    assertEquals(Compability.OK, integrationBridgeServiceInfo.getCompatibility());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#getCompatibility()}.
   *
   * <ul>
   *   <li>Then return {@code UNKNOWN}.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#getCompatibility()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Compability IntegrationBridgeServiceInfo.getCompatibility()"})
  public void testGetCompatibility_thenReturnUnknown() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("", "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("");

    // Act and Assert
    assertEquals(Compability.UNKNOWN, integrationBridgeServiceInfo.getCompatibility());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IntegrationBridgeServiceInfo#setConnectivity(Status)}
   *   <li>{@link IntegrationBridgeServiceInfo#setCurrentVersion(String)}
   *   <li>{@link IntegrationBridgeServiceInfo#toString()}
   *   <li>{@link IntegrationBridgeServiceInfo#getUrl()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String IntegrationBridgeServiceInfo.getUrl()",
    "void IntegrationBridgeServiceInfo.setConnectivity(Status)",
    "void IntegrationBridgeServiceInfo.setCurrentVersion(String)",
    "String IntegrationBridgeServiceInfo.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    // Act
    integrationBridgeServiceInfo.setConnectivity(new Status("Code"));
    integrationBridgeServiceInfo.setCurrentVersion("1.0.2");
    String actualToStringResult = integrationBridgeServiceInfo.toString();

    // Assert
    assertEquals(
        "IntegrationBridgeServiceInfo{connectivity=Code, currentVersion='1.0.2', minVersion='1.0.2'}",
        actualToStringResult);
    assertEquals("https://example.org/example", integrationBridgeServiceInfo.getUrl());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#equals(Object)}, and {@link
   * IntegrationBridgeServiceInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IntegrationBridgeServiceInfo#equals(Object)}
   *   <li>{@link IntegrationBridgeServiceInfo#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IntegrationBridgeServiceInfo.equals(Object)",
    "int IntegrationBridgeServiceInfo.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo2 =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    // Act and Assert
    assertEquals(integrationBridgeServiceInfo, integrationBridgeServiceInfo2);
    int expectedHashCodeResult = integrationBridgeServiceInfo.hashCode();
    assertEquals(expectedHashCodeResult, integrationBridgeServiceInfo2.hashCode());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#equals(Object)}, and {@link
   * IntegrationBridgeServiceInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IntegrationBridgeServiceInfo#equals(Object)}
   *   <li>{@link IntegrationBridgeServiceInfo#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IntegrationBridgeServiceInfo.equals(Object)",
    "int IntegrationBridgeServiceInfo.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo(null, "https://example.org/example");
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo2 =
        new IntegrationBridgeServiceInfo(null, "https://example.org/example");

    // Act and Assert
    assertEquals(integrationBridgeServiceInfo, integrationBridgeServiceInfo2);
    int expectedHashCodeResult = integrationBridgeServiceInfo.hashCode();
    assertEquals(expectedHashCodeResult, integrationBridgeServiceInfo2.hashCode());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#equals(Object)}, and {@link
   * IntegrationBridgeServiceInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IntegrationBridgeServiceInfo#equals(Object)}
   *   <li>{@link IntegrationBridgeServiceInfo#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IntegrationBridgeServiceInfo.equals(Object)",
    "int IntegrationBridgeServiceInfo.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("1.0.2");

    IntegrationBridgeServiceInfo integrationBridgeServiceInfo2 =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");
    integrationBridgeServiceInfo2.setCurrentVersion("1.0.2");

    // Act and Assert
    assertEquals(integrationBridgeServiceInfo, integrationBridgeServiceInfo2);
    int expectedHashCodeResult = integrationBridgeServiceInfo.hashCode();
    assertEquals(expectedHashCodeResult, integrationBridgeServiceInfo2.hashCode());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#equals(Object)}, and {@link
   * IntegrationBridgeServiceInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IntegrationBridgeServiceInfo#equals(Object)}
   *   <li>{@link IntegrationBridgeServiceInfo#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IntegrationBridgeServiceInfo.equals(Object)",
    "int IntegrationBridgeServiceInfo.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    // Act and Assert
    assertEquals(integrationBridgeServiceInfo, integrationBridgeServiceInfo);
    int expectedHashCodeResult = integrationBridgeServiceInfo.hashCode();
    assertEquals(expectedHashCodeResult, integrationBridgeServiceInfo.hashCode());
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IntegrationBridgeServiceInfo.equals(Object)",
    "int IntegrationBridgeServiceInfo.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("Min Version", "https://example.org/example");

    // Act and Assert
    assertNotEquals(
        integrationBridgeServiceInfo,
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"));
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IntegrationBridgeServiceInfo.equals(Object)",
    "int IntegrationBridgeServiceInfo.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo(null, "https://example.org/example");

    // Act and Assert
    assertNotEquals(
        integrationBridgeServiceInfo,
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"));
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IntegrationBridgeServiceInfo.equals(Object)",
    "int IntegrationBridgeServiceInfo.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");
    integrationBridgeServiceInfo.setConnectivity(new Status("1.0.2"));

    // Act and Assert
    assertNotEquals(
        integrationBridgeServiceInfo,
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"));
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IntegrationBridgeServiceInfo.equals(Object)",
    "int IntegrationBridgeServiceInfo.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("1.0.2");

    // Act and Assert
    assertNotEquals(
        integrationBridgeServiceInfo,
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"));
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IntegrationBridgeServiceInfo.equals(Object)",
    "int IntegrationBridgeServiceInfo.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");

    IntegrationBridgeServiceInfo integrationBridgeServiceInfo2 =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");
    integrationBridgeServiceInfo2.setCurrentVersion("1.0.2");

    // Act and Assert
    assertNotEquals(integrationBridgeServiceInfo, integrationBridgeServiceInfo2);
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IntegrationBridgeServiceInfo.equals(Object)",
    "int IntegrationBridgeServiceInfo.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo =
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example");
    integrationBridgeServiceInfo.setConnectivity(null);

    // Act and Assert
    assertNotEquals(
        integrationBridgeServiceInfo,
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"));
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IntegrationBridgeServiceInfo.equals(Object)",
    "int IntegrationBridgeServiceInfo.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"), null);
  }

  /**
   * Test {@link IntegrationBridgeServiceInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IntegrationBridgeServiceInfo.equals(Object)",
    "int IntegrationBridgeServiceInfo.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"),
        "Different type to IntegrationBridgeServiceInfo");
  }
}
