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

package org.symphonyoss.integration.agent.api.client;

import com.diffblue.cover.annotations.InterestingTestFactory;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;
import org.symphonyoss.integration.model.yaml.ProxyConnectionInfo;
import org.symphonyoss.integration.model.yaml.Application;

import java.lang.reflect.Field;

/**
 * Factory class to create test instances of AgentApiClient for Diffblue Cover.
 * This factory provides properly initialized instances to avoid NullPointerExceptions
 * during test generation.
 */
public class AgentApiClientFactory {

  /**
   * Creates an AgentApiClient instance with minimal configuration to avoid NullPointerException
   * in getBasePath method.
   *
   * @return a properly initialized AgentApiClient
   */
  @InterestingTestFactory
  public static AgentApiClient createAgentApiClientForGetBasePath() {
    AgentApiClient client = new AgentApiClient();

    try {
      // Create IntegrationProperties and set fields using reflection
      IntegrationProperties properties = createIntegrationPropertiesWithAgentUrl("https://test-agent.symphony.com");

      // Use reflection to set the private properties field
      Field propertiesField = AgentApiClient.class.getDeclaredField("properties");
      propertiesField.setAccessible(true);
      propertiesField.set(client, properties);

    } catch (Exception e) {
      throw new RuntimeException("Failed to create AgentApiClient for testing", e);
    }

    return client;
  }

  /**
   * Creates an AgentApiClient instance with proxy configuration to avoid NullPointerException
   * in getProxy method.
   *
   * @return a properly initialized AgentApiClient with proxy settings
   */
  @InterestingTestFactory
  public static AgentApiClient createAgentApiClientForGetProxy() {
    AgentApiClient client = new AgentApiClient();

    try {
      // Create IntegrationProperties with agent and proxy using reflection
      IntegrationProperties properties = createIntegrationPropertiesWithAgentAndProxy();

      // Use reflection to set the private properties field
      Field propertiesField = AgentApiClient.class.getDeclaredField("properties");
      propertiesField.setAccessible(true);
      propertiesField.set(client, properties);

    } catch (Exception e) {
      throw new RuntimeException("Failed to create AgentApiClient with proxy for testing", e);
    }

    return client;
  }

  /**
   * Helper method to create IntegrationProperties with agentUrl using reflection.
   */
  private static IntegrationProperties createIntegrationPropertiesWithAgentUrl(String url) throws Exception {
    IntegrationProperties properties = new IntegrationProperties();

    // Try to find and set the agentUrl field using reflection
    try {
      Field agentUrlField = IntegrationProperties.class.getDeclaredField("agentUrl");
      agentUrlField.setAccessible(true);
      agentUrlField.set(properties, url);
    } catch (NoSuchFieldException e) {
      // Field might have a different name, try alternatives
      for (Field field : IntegrationProperties.class.getDeclaredFields()) {
        if (field.getName().toLowerCase().contains("agent") &&
            field.getName().toLowerCase().contains("url")) {
          field.setAccessible(true);
          field.set(properties, url);
          break;
        }
      }
    }

    return properties;
  }

  /**
   * Helper method to create IntegrationProperties with agent and proxy using reflection.
   */
  private static IntegrationProperties createIntegrationPropertiesWithAgentAndProxy() throws Exception {
    IntegrationProperties properties = createIntegrationPropertiesWithAgentUrl("https://test-agent.symphony.com");

    // Create Application with proxy
    Application agent = new Application();
    ProxyConnectionInfo proxy = new ProxyConnectionInfo();

    // Set agent field in properties using reflection
    try {
      Field agentField = IntegrationProperties.class.getDeclaredField("agent");
      agentField.setAccessible(true);
      agentField.set(properties, agent);
    } catch (NoSuchFieldException e) {
      // Try to find any field that might be the agent
      for (Field field : IntegrationProperties.class.getDeclaredFields()) {
        if (field.getType().equals(Application.class) ||
            field.getName().toLowerCase().contains("agent")) {
          field.setAccessible(true);
          field.set(properties, agent);
          break;
        }
      }
    }

    // Set proxy in agent using reflection
    try {
      Field proxyField = Application.class.getDeclaredField("proxy");
      proxyField.setAccessible(true);
      proxyField.set(agent, proxy);
    } catch (NoSuchFieldException e) {
      // Try to find any field that might be the proxy
      for (Field field : Application.class.getDeclaredFields()) {
        if (field.getType().equals(ProxyConnectionInfo.class) ||
            field.getName().toLowerCase().contains("proxy")) {
          field.setAccessible(true);
          field.set(agent, proxy);
          break;
        }
      }
    }

    return properties;
  }
}
