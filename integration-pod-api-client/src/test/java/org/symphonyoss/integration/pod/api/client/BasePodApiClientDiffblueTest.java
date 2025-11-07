package org.symphonyoss.integration.pod.api.client;

import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
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
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Autowired
  private BasePodApiClient basePodApiClient;

  @MockBean
  private HttpApiClient httpApiClient;

  @MockBean
  private LogMessageSource logMessageSource;

  /**
   * Test {@link BasePodApiClient#checkAuthToken(String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link RemoteApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BasePodApiClient#checkAuthToken(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void BasePodApiClient.checkAuthToken(String)"})
  public void testCheckAuthToken_whenNull_thenThrowRemoteApiException() throws RemoteApiException {
    // Arrange, Act and Assert
    thrown.expect(RemoteApiException.class);
    basePodApiClient.checkAuthToken(null);
  }
}
