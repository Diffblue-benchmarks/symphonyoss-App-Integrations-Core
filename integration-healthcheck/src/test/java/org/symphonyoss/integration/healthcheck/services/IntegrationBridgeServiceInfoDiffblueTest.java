package org.symphonyoss.integration.healthcheck.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import org.springframework.boot.actuate.health.Status;

public class IntegrationBridgeServiceInfoDiffblueTest {
  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#getConnectivity()}
   */
  @Test
  public void testGetConnectivity() {
    // Arrange, Act and Assert
    assertEquals("UNKNOWN",
        (new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example")).getConnectivity());
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#getCurrentVersion()}
   */
  @Test
  public void testGetCurrentVersion() {
    // Arrange, Act and Assert
    assertEquals("N/A", (new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example")).getCurrentVersion());
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#getCurrentVersion()}
   */
  @Test
  public void testGetCurrentVersion2() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("foo");

    // Act and Assert
    assertEquals("foo", integrationBridgeServiceInfo.getCurrentVersion());
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#getCurrentVersion()}
   */
  @Test
  public void testGetCurrentVersion3() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("");

    // Act and Assert
    assertEquals("N/A", integrationBridgeServiceInfo.getCurrentVersion());
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#getMinVersion()}
   */
  @Test
  public void testGetMinVersion() {
    // Arrange, Act and Assert
    assertEquals("1.0.2", (new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example")).getMinVersion());
    assertEquals("N/A", (new IntegrationBridgeServiceInfo("", "https://example.org/example")).getMinVersion());
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#getCompatibility()}
   */
  @Test
  public void testGetCompatibility() {
    // Arrange, Act and Assert
    assertEquals(IntegrationBridgeServiceInfo.Compability.NOK,
        (new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example")).getCompatibility());
    assertEquals(IntegrationBridgeServiceInfo.Compability.UNKNOWN,
        (new IntegrationBridgeServiceInfo("", "https://example.org/example")).getCompatibility());
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#getCompatibility()}
   */
  @Test
  public void testGetCompatibility2() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("1.0.2");

    // Act and Assert
    assertEquals(IntegrationBridgeServiceInfo.Compability.OK, integrationBridgeServiceInfo.getCompatibility());
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#getCompatibility()}
   */
  @Test
  public void testGetCompatibility3() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("Min Version",
        "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("1.0.2");

    // Act and Assert
    assertEquals(IntegrationBridgeServiceInfo.Compability.NOK, integrationBridgeServiceInfo.getCompatibility());
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#getCompatibility()}
   */
  @Test
  public void testGetCompatibility4() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("Current Version");

    // Act and Assert
    assertEquals(IntegrationBridgeServiceInfo.Compability.NOK, integrationBridgeServiceInfo.getCompatibility());
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#getCompatibility()}
   */
  @Test
  public void testGetCompatibility5() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("1.0.242");

    // Act and Assert
    assertEquals(IntegrationBridgeServiceInfo.Compability.OK, integrationBridgeServiceInfo.getCompatibility());
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#getCompatibility()}
   */
  @Test
  public void testGetCompatibility6() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("421.0.2");

    // Act and Assert
    assertEquals(IntegrationBridgeServiceInfo.Compability.OK, integrationBridgeServiceInfo.getCompatibility());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link IntegrationBridgeServiceInfo#equals(Object)}
   *   <li>{@link IntegrationBridgeServiceInfo#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo2 = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");

    // Act and Assert
    assertEquals(integrationBridgeServiceInfo, integrationBridgeServiceInfo2);
    int expectedHashCodeResult = integrationBridgeServiceInfo.hashCode();
    assertEquals(expectedHashCodeResult, integrationBridgeServiceInfo2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link IntegrationBridgeServiceInfo#equals(Object)}
   *   <li>{@link IntegrationBridgeServiceInfo#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo(null,
        "https://example.org/example");
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo2 = new IntegrationBridgeServiceInfo(null,
        "https://example.org/example");

    // Act and Assert
    assertEquals(integrationBridgeServiceInfo, integrationBridgeServiceInfo2);
    int expectedHashCodeResult = integrationBridgeServiceInfo.hashCode();
    assertEquals(expectedHashCodeResult, integrationBridgeServiceInfo2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link IntegrationBridgeServiceInfo#equals(Object)}
   *   <li>{@link IntegrationBridgeServiceInfo#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("1.0.2");

    IntegrationBridgeServiceInfo integrationBridgeServiceInfo2 = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");
    integrationBridgeServiceInfo2.setCurrentVersion("1.0.2");

    // Act and Assert
    assertEquals(integrationBridgeServiceInfo, integrationBridgeServiceInfo2);
    int expectedHashCodeResult = integrationBridgeServiceInfo.hashCode();
    assertEquals(expectedHashCodeResult, integrationBridgeServiceInfo2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link IntegrationBridgeServiceInfo#equals(Object)}
   *   <li>{@link IntegrationBridgeServiceInfo#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");

    // Act and Assert
    assertEquals(integrationBridgeServiceInfo, integrationBridgeServiceInfo);
    int expectedHashCodeResult = integrationBridgeServiceInfo.hashCode();
    assertEquals(expectedHashCodeResult, integrationBridgeServiceInfo.hashCode());
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("Min Version",
        "https://example.org/example");

    // Act and Assert
    assertNotEquals(integrationBridgeServiceInfo,
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"));
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo(null,
        "https://example.org/example");

    // Act and Assert
    assertNotEquals(integrationBridgeServiceInfo,
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"));
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");
    integrationBridgeServiceInfo.setConnectivity(new Status("1.0.2"));

    // Act and Assert
    assertNotEquals(integrationBridgeServiceInfo,
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"));
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");
    integrationBridgeServiceInfo.setCurrentVersion("1.0.2");

    // Act and Assert
    assertNotEquals(integrationBridgeServiceInfo,
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"));
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");

    IntegrationBridgeServiceInfo integrationBridgeServiceInfo2 = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");
    integrationBridgeServiceInfo2.setCurrentVersion("1.0.2");

    // Act and Assert
    assertNotEquals(integrationBridgeServiceInfo, integrationBridgeServiceInfo2);
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");
    integrationBridgeServiceInfo.setConnectivity(null);

    // Act and Assert
    assertNotEquals(integrationBridgeServiceInfo,
        new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"));
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"), null);
  }

  /**
   * Method under test: {@link IntegrationBridgeServiceInfo#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new IntegrationBridgeServiceInfo("1.0.2", "https://example.org/example"),
        "Different type to IntegrationBridgeServiceInfo");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link IntegrationBridgeServiceInfo#setConnectivity(Status)}
   *   <li>{@link IntegrationBridgeServiceInfo#setCurrentVersion(String)}
   *   <li>{@link IntegrationBridgeServiceInfo#toString()}
   *   <li>{@link IntegrationBridgeServiceInfo#getUrl()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    IntegrationBridgeServiceInfo integrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");

    // Act
    integrationBridgeServiceInfo.setConnectivity(new Status("Code"));
    integrationBridgeServiceInfo.setCurrentVersion("1.0.2");
    String actualToStringResult = integrationBridgeServiceInfo.toString();

    // Assert that nothing has changed
    assertEquals("IntegrationBridgeServiceInfo{connectivity=Code, currentVersion='1.0.2', minVersion='1.0.2'}",
        actualToStringResult);
    assertEquals("https://example.org/example", integrationBridgeServiceInfo.getUrl());
  }

  /**
   * Method under test:
   * {@link IntegrationBridgeServiceInfo#IntegrationBridgeServiceInfo(String, String)}
   */
  @Test
  public void testNewIntegrationBridgeServiceInfo() {
    // Arrange and Act
    IntegrationBridgeServiceInfo actualIntegrationBridgeServiceInfo = new IntegrationBridgeServiceInfo("1.0.2",
        "https://example.org/example");

    // Assert
    assertEquals("1.0.2", actualIntegrationBridgeServiceInfo.getMinVersion());
    assertEquals("N/A", actualIntegrationBridgeServiceInfo.getCurrentVersion());
    assertEquals("UNKNOWN", actualIntegrationBridgeServiceInfo.getConnectivity());
    assertEquals("https://example.org/example", actualIntegrationBridgeServiceInfo.getUrl());
    assertEquals(IntegrationBridgeServiceInfo.Compability.NOK, actualIntegrationBridgeServiceInfo.getCompatibility());
  }
}
