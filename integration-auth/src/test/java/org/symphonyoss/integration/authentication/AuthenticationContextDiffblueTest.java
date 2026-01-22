package org.symphonyoss.integration.authentication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.security.Provider;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.ws.rs.RuntimeType;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.Configuration;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.JerseyClient;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.symphonyoss.integration.authentication.api.enums.ServiceName;
import org.symphonyoss.integration.authentication.exception.MissingClientException;

public class AuthenticationContextDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link AuthenticationContext#httpClientForContext(ServiceName)}.
   *
   * <p>Method under test: {@link AuthenticationContext#httpClientForContext(ServiceName)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Client AuthenticationContext.httpClientForContext(ServiceName)"})
  public void testHttpClientForContext() {
    // Arrange and Act
    Client actualHttpClientForContextResult =
        AuthenticationContextFactory.createAppAuthenticationContext()
            .httpClientForContext(ServiceName.POD);

    // Assert
    Configuration configuration = actualHttpClientForContextResult.getConfiguration();
    assertTrue(
        ((ClientConfig) configuration).getConnectorProvider() instanceof ApacheConnectorProvider);
    assertTrue(actualHttpClientForContextResult instanceof JerseyClient);
    SSLContext sslContext = actualHttpClientForContextResult.getSslContext();
    assertEquals("TLS", sslContext.getProtocol());
    assertNull(actualHttpClientForContextResult.getHostnameVerifier());
    assertNull(((ClientConfig) configuration).getConnector());
    assertEquals(1, configuration.getClasses().size());
    Provider provider = sslContext.getProvider();
    assertEquals(39, provider.size());
    assertEquals(4, configuration.getPropertyNames().size());
    Map<String, Object> properties = configuration.getProperties();
    assertEquals(4, properties.size());
    assertEquals(RuntimeType.CLIENT, configuration.getRuntimeType());
    assertFalse(((JerseyClient) actualHttpClientForContextResult).isClosed());
    assertTrue(provider.containsKey("Alg.Alias.KeyManagerFactory.PKIX"));
    assertTrue(provider.containsKey("Alg.Alias.Signature.OID.1.2.840.113549.1.1.2"));
    assertTrue(provider.containsKey("Provider.id name"));
    assertTrue(provider.containsKey("Signature.MD5andSHA1withRSA"));
    assertTrue(properties.containsKey("jersey.config.apache.client.connectionManager"));
    assertTrue(properties.containsKey("jersey.config.apache.client.connectionManagerShared"));
    assertTrue(properties.containsKey("jersey.config.client.connectTimeout"));
    assertTrue(properties.containsKey("jersey.config.client.readTimeout"));
    assertTrue(configuration.getInstances().isEmpty());
    assertTrue(((JerseyClient) actualHttpClientForContextResult).isDefaultSslContext());
    assertSame(actualHttpClientForContextResult, ((ClientConfig) configuration).getClient());
  }

  /**
   * Test {@link AuthenticationContext#httpClientForContext(ServiceName)}.
   *
   * <ul>
   *   <li>When {@code POD_SESSION_MANAGER}.
   *   <li>Then throw {@link MissingClientException}.
   * </ul>
   *
   * <p>Method under test: {@link AuthenticationContext#httpClientForContext(ServiceName)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Client AuthenticationContext.httpClientForContext(ServiceName)"})
  public void testHttpClientForContext_whenPodSessionManager_thenThrowMissingClientException() {
    // Arrange, Act and Assert
    thrown.expect(MissingClientException.class);
    AuthenticationContextFactory.createAppAuthenticationContext()
        .httpClientForContext(ServiceName.POD_SESSION_MANAGER);
  }
}
