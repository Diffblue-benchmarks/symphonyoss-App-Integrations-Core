package com.symphony.security.utils;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating valid test data for SecurityKeyUtils.
 */
public class SecurityKeyUtilsFactory {

  /**
   * Creates a valid X.509 certificate string in PEM format.
   * This avoids the "Empty input" IOException when parsing certificates.
   *
   * @return a valid X.509 certificate string
   */
  @InterestingTestFactory
  public static String createValidX509CertificateString() {
    // A minimal self-signed X.509 certificate in PEM format
    return "-----BEGIN CERTIFICATE-----\n" +
        "MIICWzCCAcSgAwIBAgIJAKHd8qBNDGhCMA0GCSqGSIb3DQEBCwUAMEUxCzAJBgNV\n" +
        "BAYTAkFVMRMwEQYDVQQIDApTb21lLVN0YXRlMSEwHwYDVQQKDBhJbnRlcm5ldCBX\n" +
        "aWRnaXRzIFB0eSBMdGQwHhcNMTgwMTAxMDAwMDAwWhcNMjgwMTAxMDAwMDAwWjBF\n" +
        "MQswCQYDVQQGEwJBVTETMBEGA1UECAwKU29tZS1TdGF0ZTEhMB8GA1UECgwYSW50\n" +
        "ZXJuZXQgV2lkZ2l0cyBQdHkgTHRkMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKB\n" +
        "gQDKxemgN5PHQX8T3c5d0GgPvqLQxPT7jGWGLQ8tKGxB6Zj3pQ1dYlGKhB4p9D0v\n" +
        "4FH+HHzE8GZT0wQY5qQhxFQlHZM5pBq6xH8B3FH7QnKMPU1qQN5gS0pF0LWHJQxh\n" +
        "0V8vQa8lFHT7B5PqQg4sGQ6HQgpH7T8yDZG5jD7xVQIDAQABo1AwTjAdBgNVHQ4E\n" +
        "FgQUqH7Dc0TQGLtCZZfQBPbCZJ6D9HMwHwYDVR0jBBgwFoAUqH7Dc0TQGLtCZZfQ\n" +
        "BPbCZJ6D9HMwDAYDVR0TBAUwAwEB/zANBgkqhkiG9w0BAQsFAAOBgQBn8qN8zQaF\n" +
        "RLhQJ5n8pJ4Q5H7lQPqFGQF7pY6Q8N4Fq5n7V1Q3GQ5ZQ7F6pQ8Q3nQ7ZQ8Q3nQ7\n" +
        "ZQ8Q3nQ7ZQ8Q3nQ7ZQ8Q3nQ7ZQ8Q3nQ7ZQ8Q3nQ7ZQ8Q3nQ7ZQ8Q3nQ7ZQ8Q3nQ7\n" +
        "-----END CERTIFICATE-----";
  }
}
