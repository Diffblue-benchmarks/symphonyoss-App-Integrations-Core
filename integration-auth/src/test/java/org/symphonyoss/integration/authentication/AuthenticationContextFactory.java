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
import org.symphonyoss.integration.model.yaml.ConnectionInfo;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

import java.security.KeyStore;
import java.security.KeyStoreException;

/**
 * Factory class for creating test instances needed by AuthenticationContext and related classes.
 * This factory provides objects that avoid common exceptions during test generation.
 */
public class AuthenticationContextFactory {

  /**
   * Creates a valid KeyStore instance using the default PKCS12 type.
   * This avoids KeyStoreException: foo not found errors.
   *
   * @return A valid KeyStore instance
   */
  @InterestingTestFactory
  public static KeyStore createKeyStore() {
    try {
      KeyStore keyStore = KeyStore.getInstance("PKCS12");
      keyStore.load(null, null);
      return keyStore;
    } catch (Exception e) {
      throw new RuntimeException("Failed to create KeyStore", e);
    }
  }

  /**
   * Creates an IntegrationProperties instance with at least one service configured.
   * This avoids MissingServiceConfigurationException errors.
   *
   * @return An IntegrationProperties instance with POD service configured
   */
  @InterestingTestFactory
  public static IntegrationProperties createIntegrationProperties() {
    IntegrationProperties properties = new IntegrationProperties();
    ConnectionInfo podConnectionInfo = new ConnectionInfo();
    podConnectionInfo.setHost("localhost");
    podConnectionInfo.setPort("443");
    properties.setPod(podConnectionInfo);

    return properties;
  }

  /**
   * Creates an AppAuthenticationContext with valid parameters.
   *
   * @return A valid AppAuthenticationContext instance
   */
  @InterestingTestFactory
  public static AppAuthenticationContext createAppAuthenticationContext() {
    return new AppAuthenticationContext(
        "test-app-id",
        null,
        null,
        null,
        createIntegrationProperties()
    );
  }

  /**
   * Creates a UserAuthenticationContext with valid parameters.
   *
   * @return A valid UserAuthenticationContext instance
   */
  @InterestingTestFactory
  public static UserAuthenticationContext createUserAuthenticationContext() {
    return new UserAuthenticationContext(
        "test-user-id",
        null,
        null,
        null,
        createIntegrationProperties()
    );
  }
}
