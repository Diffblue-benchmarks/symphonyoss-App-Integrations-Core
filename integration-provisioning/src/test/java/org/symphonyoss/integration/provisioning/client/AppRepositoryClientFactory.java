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

package org.symphonyoss.integration.provisioning.client;

import com.diffblue.cover.annotations.InterestingTestFactory;
import org.mockito.Mockito;
import org.symphonyoss.integration.authentication.AuthenticationProxy;
import org.symphonyoss.integration.authentication.AuthenticationToken;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.pod.api.client.SymphonyHttpApiClient;
import org.symphonyoss.integration.pod.api.model.Envelope;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

/**
 * Factory class for creating test instances of AppRepositoryClient.
 * This factory provides objects configured to avoid NullPointerException.
 */
public class AppRepositoryClientFactory {

  /**
   * Creates an AppRepositoryClient instance with properly configured mock dependencies.
   * This avoids NullPointerException errors during test creation.
   *
   * @return A valid AppRepositoryClient instance
   */
  @InterestingTestFactory
  public static AppRepositoryClient createAppRepositoryClient() {
    AppRepositoryClient client = new AppRepositoryClient();

    try {
      // Create a mock AuthenticationProxy that returns a valid token
      AuthenticationProxy authProxy = Mockito.mock(AuthenticationProxy.class);
      AuthenticationToken token = new AuthenticationToken("testSessionToken", "testKeyManagerToken");
      when(authProxy.getToken(anyString())).thenReturn(token);
      when(authProxy.getSessionToken(anyString())).thenReturn("testSessionToken");
      when(authProxy.isAuthenticated(anyString())).thenReturn(true);

      // Create a mock SymphonyHttpApiClient that returns valid envelopes
      SymphonyHttpApiClient httpClient = Mockito.mock(SymphonyHttpApiClient.class);

      // Setup doGet to return an envelope with an empty list
      Envelope<List> envelope = new Envelope<>();
      envelope.setData(new ArrayList());
      when(httpClient.doGet(anyString(), any(Map.class), any(Map.class), any(Class.class)))
          .thenReturn(envelope);

      // Setup doPost to return an envelope
      Envelope postEnvelope = new Envelope<>();
      postEnvelope.setData(Collections.emptyList());
      when(httpClient.doPost(anyString(), any(Map.class), any(Map.class), any(), any(Class.class)))
          .thenReturn(postEnvelope);

      // Use reflection to set the private fields
      Field authProxyField = AppRepositoryClient.class.getDeclaredField("authenticationProxy");
      authProxyField.setAccessible(true);
      authProxyField.set(client, authProxy);

      Field clientField = AppRepositoryClient.class.getDeclaredField("client");
      clientField.setAccessible(true);
      clientField.set(client, httpClient);

    } catch (Exception e) {
      throw new RuntimeException("Failed to create AppRepositoryClient", e);
    }

    return client;
  }
}
