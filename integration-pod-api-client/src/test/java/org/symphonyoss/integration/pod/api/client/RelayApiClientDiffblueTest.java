package org.symphonyoss.integration.pod.api.client;

import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.symphonyoss.integration.api.client.HttpApiClient;
import org.symphonyoss.integration.exception.RemoteApiException;
import org.symphonyoss.integration.exception.authentication.UnexpectedAuthException;
import org.symphonyoss.integration.logging.LogMessageSource;
import org.symphonyoss.integration.model.UserKeyManagerData;

@ContextConfiguration(classes = {RelayApiClient.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class RelayApiClientDiffblueTest {
  @MockBean
  private HttpApiClient httpApiClient;

  @MockBean
  private LogMessageSource logMessageSource;

  @Autowired
  private RelayApiClient relayApiClient;

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}.
   * <ul>
   *   <li>Then return {@link UserKeyManagerData} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"UserKeyManagerData RelayApiClient.getUserAccountKeyManagerData(String, String)"})
  public void testGetUserAccountKeyManagerData_thenReturnUserKeyManagerData() throws RemoteApiException {
    // Arrange
    UserKeyManagerData userKeyManagerData = new UserKeyManagerData();
    userKeyManagerData.setCertificate("/relay/keys/me");
    userKeyManagerData.setPrivateKey("/relay/keys/me");
    userKeyManagerData.setPrivateKeySignature("/relay/keys/me");
    userKeyManagerData.setPublicKey("/relay/keys/me");
    userKeyManagerData.setPublicKeySignature("/relay/keys/me");
    userKeyManagerData.setStatus("/relay/keys/me");
    userKeyManagerData.setUserId(1L);
    when(httpApiClient.doGet(Mockito.<String>any(), Mockito.<Map<String, String>>any(),
        Mockito.<Map<String, String>>any(), Mockito.<Class<Object>>any())).thenReturn(userKeyManagerData);

    // Act
    UserKeyManagerData actualUserAccountKeyManagerData = relayApiClient.getUserAccountKeyManagerData("ABC123",
        "Km Session");

    // Assert
    verify(httpApiClient).doGet(Mockito.<String>any(), isA(Map.class), isA(Map.class), isA(Class.class));
    assertSame(userKeyManagerData, actualUserAccountKeyManagerData);
  }

  /**
   * Test {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}.
   * <ul>
   *   <li>When {@code ABC123}.</li>
   *   <li>Then throw {@link UnexpectedAuthException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"UserKeyManagerData RelayApiClient.getUserAccountKeyManagerData(String, String)"})
  public void testGetUserAccountKeyManagerData_whenAbc123_thenThrowUnexpectedAuthException() {
    // Arrange, Act and Assert
    thrown.expect(UnexpectedAuthException.class);
    relayApiClient.getUserAccountKeyManagerData("ABC123", null);
  }

  /**
   * Test {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link UnexpectedAuthException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RelayApiClient#getUserAccountKeyManagerData(String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"UserKeyManagerData RelayApiClient.getUserAccountKeyManagerData(String, String)"})
  public void testGetUserAccountKeyManagerData_whenNull_thenThrowUnexpectedAuthException() {
    // Arrange, Act and Assert
    thrown.expect(UnexpectedAuthException.class);
    relayApiClient.getUserAccountKeyManagerData(null, "Km Session");
  }
}
