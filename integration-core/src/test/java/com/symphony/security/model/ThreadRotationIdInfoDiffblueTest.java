package com.symphony.security.model;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class ThreadRotationIdInfoDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ThreadRotationIdInfo#ThreadRotationIdInfo(String, int, int, int)}
   *   <li>{@link ThreadRotationIdInfo#getAcceptedRotationId()}
   *   <li>{@link ThreadRotationIdInfo#getAcceptedRotationRange()}
   *   <li>{@link ThreadRotationIdInfo#getRetiredRotationId()}
   *   <li>{@link ThreadRotationIdInfo#getStreamId()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ThreadRotationIdInfo.<init>(String, int, int, int)",
    "int ThreadRotationIdInfo.getAcceptedRotationId()",
    "int ThreadRotationIdInfo.getAcceptedRotationRange()",
    "int ThreadRotationIdInfo.getRetiredRotationId()",
    "String ThreadRotationIdInfo.getStreamId()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    ThreadRotationIdInfo actualThreadRotationIdInfo = new ThreadRotationIdInfo("42", 1, 1, 1);
    int actualAcceptedRotationId = actualThreadRotationIdInfo.getAcceptedRotationId();
    int actualAcceptedRotationRange = actualThreadRotationIdInfo.getAcceptedRotationRange();
    int actualRetiredRotationId = actualThreadRotationIdInfo.getRetiredRotationId();

    // Assert
    assertEquals("42", actualThreadRotationIdInfo.getStreamId());
    assertEquals(1, actualAcceptedRotationId);
    assertEquals(1, actualAcceptedRotationRange);
    assertEquals(1, actualRetiredRotationId);
  }
}
