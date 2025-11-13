package org.symphonyoss.integration.pod.api.client;

import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.logging.LogMessageSource;

@ContextConfiguration(classes = {AppEntitlementApiClient.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class BasePodApiClientDiffblueTest {
  @Autowired private BasePodApiClient basePodApiClient;

  @MockBean private HttpApiClient httpApiClient;

  @MockBean private LogMessageSource logMessageSource;

  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link BasePodApiClient#checkAuthToken(String)}.
   *
   * <ul>
   *   <li>When {@code ABC123}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link BasePodApiClient#checkAuthToken(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void BasePodApiClient.checkAuthToken(String)"})
  public void testCheckAuthToken_whenAbc123_thenDoesNotThrow() throws RemoteApiException {
    // Arrange, Act and Assert
    basePodApiClient.checkAuthToken("ABC123");
  }

  /**
   * Test {@link BasePodApiClient#checkAuthToken(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link RemoteApiException}.
   * </ul>
   *
   * <p>Method under test: {@link BasePodApiClient#checkAuthToken(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void BasePodApiClient.checkAuthToken(String)"})
  public void testCheckAuthToken_whenNull_thenThrowRemoteApiException() throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    basePodApiClient.checkAuthToken(null);
  }
}
