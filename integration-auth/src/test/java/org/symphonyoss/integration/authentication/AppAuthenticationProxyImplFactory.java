/**
 * Copyright 2016-2017 Symphony Integrations - Symphony LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.symphonyoss.integration.authentication;

import com.diffblue.cover.annotations.InterestingTestFactory;
import org.symphonyoss.integration.auth.api.client.PodAuthAppHttpApiClient;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.ConnectionInfo;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

import java.lang.reflect.Field;

/**
 * Factory class for creating test instances of AppAuthenticationProxyImpl.
 * This factory provides objects configured to avoid MissingServiceConfigurationException.
 */
public class AppAuthenticationProxyImplFactory {

  /**
   * Creates an AppAuthenticationProxyImpl instance with properly configured IntegrationProperties.
   * This avoids MissingServiceConfigurationException errors during test creation.
   *
   * @return A valid AppAuthenticationProxyImpl instance
   */
  @InterestingTestFactory
  public static AppAuthenticationProxyImpl createAppAuthenticationProxyImpl() {
    AppAuthenticationProxyImpl proxy = new AppAuthenticationProxyImpl();

    // Create IntegrationProperties with at least one service configured
    // This ensures getServices() returns a non-empty map to avoid MissingServiceConfigurationException
    IntegrationProperties properties = new IntegrationProperties();
    ConnectionInfo podConnectionInfo = new ConnectionInfo();
    podConnectionInfo.setHost("localhost");
    podConnectionInfo.setPort("443");
    properties.setPod(podConnectionInfo);

    // Also set session manager to ensure multiple services are configured
    ConnectionInfo sessionManagerConnectionInfo = new ConnectionInfo();
    sessionManagerConnectionInfo.setHost("localhost");
    sessionManagerConnectionInfo.setPort("8444");
    properties.setPodSessionManager(sessionManagerConnectionInfo);

    // Use reflection to set the private fields
    try {
      Field propertiesField = AppAuthenticationProxyImpl.class.getDeclaredField("properties");
      propertiesField.setAccessible(true);
      propertiesField.set(proxy, properties);

      Field logMessageField = AppAuthenticationProxyImpl.class.getDeclaredField("logMessage");
      logMessageField.setAccessible(true);
      logMessageField.set(proxy, new LogMessageSource());

      Field podAuthAppHttpApiClientField = AppAuthenticationProxyImpl.class.getDeclaredField("podAuthAppHttpApiClient");
      podAuthAppHttpApiClientField.setAccessible(true);
      // Create a minimal PodAuthAppHttpApiClient to avoid null pointer issues
      // We can't easily mock it without introducing mockito dependencies, so we'll leave it null
      // The factory is primarily for testing registerApplication which doesn't use this field directly
      podAuthAppHttpApiClientField.set(proxy, null);

    } catch (Exception e) {
      throw new RuntimeException("Failed to create AppAuthenticationProxyImpl", e);
    }

    // Note: We don't call init() here as it would try to use the null podAuthAppHttpApiClient
    // The registerApplication method doesn't require the apiClient to be initialized

    return proxy;
  }
}
