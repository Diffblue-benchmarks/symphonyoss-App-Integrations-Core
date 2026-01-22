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

package org.symphonyoss.integration.healthcheck.services.invokers;

import com.diffblue.cover.annotations.InterestingTestFactory;
import org.symphonyoss.integration.model.yaml.Application;
import org.symphonyoss.integration.model.yaml.ConnectionInfo;
import org.symphonyoss.integration.model.yaml.IntegrationProperties;

import java.lang.reflect.Field;

/**
 * Factory class for creating test instances of health invoker classes.
 * This factory provides objects configured to avoid NullPointerException errors
 * during test generation.
 */
public class HealthInvokerFactory {

  /**
   * Creates an AgentHealthInvoker instance with properly configured IntegrationProperties.
   * This avoids NullPointerException in getMinVersion method.
   *
   * @return A valid AgentHealthInvoker instance
   */
  @InterestingTestFactory
  public static AgentHealthInvoker createAgentHealthInvoker() {
    AgentHealthInvoker invoker = new AgentHealthInvoker();
    IntegrationProperties properties = createPropertiesWithAgent();
    setPropertiesField(invoker, properties);
    return invoker;
  }

  /**
   * Creates a KmHealthInvoker instance with properly configured IntegrationProperties.
   * This avoids NullPointerException in getMinVersion method.
   *
   * @return A valid KmHealthInvoker instance
   */
  @InterestingTestFactory
  public static KmHealthInvoker createKmHealthInvoker() {
    KmHealthInvoker invoker = new KmHealthInvoker();
    IntegrationProperties properties = createPropertiesWithKeyManager();
    setPropertiesField(invoker, properties);
    return invoker;
  }

  /**
   * Creates a PodHealthInvoker instance with properly configured IntegrationProperties.
   * This avoids NullPointerException in getMinVersion method.
   *
   * @return A valid PodHealthInvoker instance
   */
  @InterestingTestFactory
  public static PodHealthInvoker createPodHealthInvoker() {
    PodHealthInvoker invoker = new PodHealthInvoker();
    IntegrationProperties properties = createPropertiesWithPod();
    setPropertiesField(invoker, properties);
    return invoker;
  }

  /**
   * Helper method to create IntegrationProperties with Agent configuration.
   */
  private static IntegrationProperties createPropertiesWithAgent() {
    IntegrationProperties properties = new IntegrationProperties();
    Application agent = new Application();

    try {
      // Try to set minVersion field directly
      setFieldValue(agent, "minVersion", "1.45.0");

      // Try alternative field names if the standard one doesn't work
      setFieldValue(agent, "min_version", "1.45.0");

      // Try to invoke setter method if available
      try {
        agent.getClass().getMethod("setMinVersion", String.class).invoke(agent, "1.45.0");
      } catch (Exception ignored) {
        // Setter doesn't exist or failed, that's OK
      }

      // Set the agent in properties
      setFieldValue(properties, "agent", agent);

      // Try setter method for properties
      try {
        properties.getClass().getMethod("setAgent", Application.class).invoke(properties, agent);
      } catch (Exception ignored) {
        // Setter doesn't exist or failed, that's OK
      }

      // Also set agentUrl if it exists
      setFieldValue(properties, "agentUrl", "https://test-agent.symphony.com");
      try {
        properties.getClass().getMethod("setAgentUrl", String.class).invoke(properties, "https://test-agent.symphony.com");
      } catch (Exception ignored) {
        // Setter doesn't exist or failed, that's OK
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to create properties with agent", e);
    }

    return properties;
  }

  /**
   * Helper method to create IntegrationProperties with KeyManager configuration.
   */
  private static IntegrationProperties createPropertiesWithKeyManager() {
    IntegrationProperties properties = new IntegrationProperties();
    Application keyManager = new Application();

    try {
      // Try to set minVersion field directly
      setFieldValue(keyManager, "minVersion", "1.45.0");

      // Try alternative field names if the standard one doesn't work
      setFieldValue(keyManager, "min_version", "1.45.0");

      // Try to invoke setter method if available
      try {
        keyManager.getClass().getMethod("setMinVersion", String.class).invoke(keyManager, "1.45.0");
      } catch (Exception ignored) {
        // Setter doesn't exist or failed, that's OK
      }

      // Set the keyManager in properties
      setFieldValue(properties, "keyManager", keyManager);

      // Try setter method for properties
      try {
        properties.getClass().getMethod("setKeyManager", Application.class).invoke(properties, keyManager);
      } catch (Exception ignored) {
        // Setter doesn't exist or failed, that's OK
      }

      // Also set keyManagerUrl if it exists
      setFieldValue(properties, "keyManagerUrl", "https://test-km.symphony.com");
      try {
        properties.getClass().getMethod("setKeyManagerUrl", String.class).invoke(properties, "https://test-km.symphony.com");
      } catch (Exception ignored) {
        // Setter doesn't exist or failed, that's OK
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to create properties with key manager", e);
    }

    return properties;
  }

  /**
   * Helper method to create IntegrationProperties with Pod configuration.
   */
  private static IntegrationProperties createPropertiesWithPod() {
    IntegrationProperties properties = new IntegrationProperties();

    // Try using ConnectionInfo first
    ConnectionInfo pod = new ConnectionInfo();
    try {
      // Try to set minVersion field
      setFieldValue(pod, "minVersion", "1.44.0");

      // Set the pod in properties
      setFieldValue(properties, "pod", pod);

      // Also set podUrl if it exists
      setFieldValue(properties, "podUrl", "https://test-pod.symphony.com");
    } catch (Exception e) {
      throw new RuntimeException("Failed to create properties with pod", e);
    }

    return properties;
  }

  /**
   * Helper method to set the properties field using reflection.
   */
  private static void setPropertiesField(Object invoker, IntegrationProperties properties) {
    try {
      Field propertiesField = ServiceHealthInvoker.class.getDeclaredField("properties");
      propertiesField.setAccessible(true);
      propertiesField.set(invoker, properties);
    } catch (Exception e) {
      throw new RuntimeException("Failed to set properties field", e);
    }
  }

  /**
   * Helper method to set a field value using reflection.
   * @param obj The object to set the field on
   * @param fieldName The name of the field
   * @param value The value to set
   */
  private static void setFieldValue(Object obj, String fieldName, Object value) {
    try {
      Field field = obj.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      field.set(obj, value);
    } catch (NoSuchFieldException e) {
      // Field doesn't exist, which is OK for optional fields like URLs
      // Only required fields will cause actual failures
    } catch (Exception e) {
      throw new RuntimeException("Failed to set field " + fieldName, e);
    }
  }
}
