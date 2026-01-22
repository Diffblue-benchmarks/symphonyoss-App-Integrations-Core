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
import org.symphonyoss.integration.exception.RemoteApiException;

/**
 * Factory class for creating test instances of RemoteApiException.
 * This factory provides RemoteApiException objects for testing purposes.
 */
public class RemoteApiExceptionFactory {

  /**
   * Creates a RemoteApiException instance with default values.
   * This factory method helps Diffblue Cover create tests that need RemoteApiException objects.
   *
   * @return A valid RemoteApiException instance
   */
  @InterestingTestFactory
  public static RemoteApiException createRemoteApiException() {
    return new RemoteApiException(500, "An error occurred");
  }

  /**
   * Creates a RemoteApiException instance for unauthorized errors.
   *
   * @return A RemoteApiException with 401 status code
   */
  @InterestingTestFactory
  public static RemoteApiException createUnauthorizedRemoteApiException() {
    return new RemoteApiException(401, "Unauthorized");
  }

  /**
   * Creates a RemoteApiException instance for forbidden errors.
   *
   * @return A RemoteApiException with 403 status code
   */
  @InterestingTestFactory
  public static RemoteApiException createForbiddenRemoteApiException() {
    return new RemoteApiException(403, "Forbidden");
  }
}
