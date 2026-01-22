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
import org.symphonyoss.integration.auth.api.client.KmAuthHttpApiClient;
import org.symphonyoss.integration.auth.api.client.PodAuthHttpApiClient;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.ConnectionInfo;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

import java.lang.reflect.Field;

/**
 * Factory class for creating test instances of AuthenticationProxyImpl.
 * This factory provides objects configured to avoid MissingServiceConfigurationException.
 */
public class AuthenticationProxyImplFactory {

  /**
   * Creates an AuthenticationProxyImpl instance with properly configured IntegrationProperties.
   * This avoids MissingServiceConfigurationException errors during test creation.
   *
   * @return A valid AuthenticationProxyImpl instance
   */
  @InterestingTestFactory
  public static AuthenticationProxyImpl createAuthenticationProxyImpl() {
    AuthenticationProxyImpl proxy = new AuthenticationProxyImpl();

    // Create IntegrationProperties with at least one service configured
    IntegrationProperties properties = new IntegrationProperties();
    ConnectionInfo podConnectionInfo = new ConnectionInfo();
    podConnectionInfo.setHost("localhost");
    properties.setPod(podConnectionInfo);

    // Use reflection to set the private fields
    try {
      Field propertiesField = AuthenticationProxyImpl.class.getDeclaredField("properties");
      propertiesField.setAccessible(true);
      propertiesField.set(proxy, properties);

      Field logMessageField = AuthenticationProxyImpl.class.getDeclaredField("logMessage");
      logMessageField.setAccessible(true);
      logMessageField.set(proxy, new LogMessageSource());

      Field podAuthHttpApiClientField = AuthenticationProxyImpl.class.getDeclaredField("podAuthHttpApiClient");
      podAuthHttpApiClientField.setAccessible(true);
      podAuthHttpApiClientField.set(proxy, null);

      Field kmAuthHttpApiClientField = AuthenticationProxyImpl.class.getDeclaredField("kmAuthHttpApiClient");
      kmAuthHttpApiClientField.setAccessible(true);
      kmAuthHttpApiClientField.set(proxy, null);

    } catch (Exception e) {
      throw new RuntimeException("Failed to create AuthenticationProxyImpl", e);
    }

    return proxy;
  }
}
