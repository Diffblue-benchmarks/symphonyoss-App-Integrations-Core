package org.symphonyoss.integration.provisioning.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class AppRepositoryClientExceptionDiffblueTest {
  /**
   * Test {@link AppRepositoryClientException#AppRepositoryClientException(String)}.
   *
   * <p>Method under test: {@link AppRepositoryClientException#AppRepositoryClientException(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void AppRepositoryClientException.<init>(String)"})
  public void testNewAppRepositoryClientException() {
    // Arrange and Act
    AppRepositoryClientException actualAppRepositoryClientException =
        new AppRepositoryClientException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualAppRepositoryClientException.getMessage());
    assertNull(actualAppRepositoryClientException.getCause());
    assertEquals(0, actualAppRepositoryClientException.getSuppressed().length);
  }
}
