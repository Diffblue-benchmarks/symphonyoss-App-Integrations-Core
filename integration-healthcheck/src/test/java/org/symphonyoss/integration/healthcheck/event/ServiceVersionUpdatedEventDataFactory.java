package org.symphonyoss.integration.healthcheck.event;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating valid ServiceVersionUpdatedEventData instances for testing.
 */
public class ServiceVersionUpdatedEventDataFactory {

  /**
   * Creates a valid ServiceVersionUpdatedEventData instance with a valid semantic version.
   * The version format follows semantic versioning (MAJOR.MINOR.PATCH).
   *
   * @return a valid ServiceVersionUpdatedEventData instance with valid semver
   */
  @InterestingTestFactory
  public static ServiceVersionUpdatedEventData createServiceVersionUpdatedEventData() {
    return new ServiceVersionUpdatedEventData("AGENT", "1.45.0", "1.46.0");
  }

  /**
   * Creates a valid ServiceVersionUpdatedEventData instance with a different service name.
   *
   * @return a valid ServiceVersionUpdatedEventData instance for POD service
   */
  @InterestingTestFactory
  public static ServiceVersionUpdatedEventData createPodServiceVersionUpdatedEventData() {
    return new ServiceVersionUpdatedEventData("POD", "1.0.0", "1.1.0");
  }

  /**
   * Creates a valid ServiceVersionUpdatedEventData instance with version below 1.46.0.
   *
   * @return a valid ServiceVersionUpdatedEventData instance with older version
   */
  @InterestingTestFactory
  public static ServiceVersionUpdatedEventData createLegacyVersionEventData() {
    return new ServiceVersionUpdatedEventData("AGENT", "1.44.0", "1.45.0");
  }
}
