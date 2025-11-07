package com.symphony.security.model;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class RotationIdInfoListDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link RotationIdInfoList#RotationIdInfoList(List)}
   *   <li>{@link RotationIdInfoList#getList()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    ArrayList<ThreadRotationIdInfo> list = new ArrayList<>();

    // Act
    List<ThreadRotationIdInfo> actualList = (new RotationIdInfoList(list)).getList();

    // Assert
    assertTrue(actualList.isEmpty());
    assertSame(list, actualList);
  }
}
